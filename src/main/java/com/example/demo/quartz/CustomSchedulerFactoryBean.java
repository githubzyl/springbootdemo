package com.example.demo.quartz;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import com.example.demo.quartz.annotation.QuartzCron;
import com.example.demo.quartz.annotation.QuartzJob;

/**
 * 自定义SchedulerFactoryBean
 * 
 * @author: zhaoyl
 * @since: 2017年7月18日 下午3:51:41
 * @history:
 */
public class CustomSchedulerFactoryBean extends SchedulerFactoryBean {

	private final Logger logger = Logger.getLogger(CustomSchedulerFactoryBean.class);

	/** Spring 上下文 */
	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}
	
	/**
	 * 需要在项目启动之后立即执行的job的key集合
	 */
	private List<String> needImmediateRunJobList = new ArrayList<>();

	/**
	 * 注册jobji定时器，重写父类的方法
	 */
	@Override
	public void registerJobsAndTriggers() throws SchedulerException {
		try {
			// 获取所有bean name
			String[] beanNames = applicationContext.getBeanNamesForType(Object.class);
			for (String beanName : beanNames) {
				Class<?> targetClass = applicationContext.getType(beanName);
				// 循环判断是否标记了QuartzJob注解
				if (targetClass.isAnnotationPresent(QuartzJob.class)) {
					Object targetObject = applicationContext.getBean(beanName);
					// 获取时间表达式
					String cronExpression = "";
					String targetMethod = "";
					boolean immediate = false;//是否立即执行
					boolean concurrent = false;//是否并行执行
					QuartzCron triggerMethod = null;
					// 确定标记了QuartzCron注解的方法名
					Method[] methods = targetClass.getDeclaredMethods();
					for (Method method : methods) {
						if (method.isAnnotationPresent(QuartzCron.class)) {
							targetMethod = method.getName();
							triggerMethod = (QuartzCron) method.getAnnotation(QuartzCron.class);
							cronExpression = triggerMethod.cronExpression();
							immediate = triggerMethod.immediate();
							// 注册定时器业务类
							registerJobs(targetObject, targetMethod, beanName, cronExpression, immediate, concurrent);
						}
					}
				}
			}
		} catch (Exception e) {
			logger.error(e);
		}
	}

	/**
	 * 注册定时器
	 * @param targetObject
	 * @param targetMethod
	 * @param beanName
	 * @param cronExpression cron表达式
	 * @param immediate 是否立即执行，true表示立即执行
	 * @param concurrent 是否并行执行，false表示不并行执行
	 * @throws Exception
	 * @create: 2017年7月18日 下午5:03:23 zhaoyl
	 * @history:
	 */
	private void registerJobs(Object targetObject, String targetMethod, String beanName, String cronExpression, boolean immediate, boolean concurrent)
			throws Exception {
		//为了区分job中的name，如果是同一个job中需要执行多个定时方法，那么如果都设置成立即启动，将互不影响，否则随机启动一个
		String prefix = UUID.randomUUID().toString().replaceAll("-", "");
		String jobName = prefix + "_" + beanName + "_" + targetMethod + "_Task";
		String triggerName = prefix + "_" + beanName + "_" + targetMethod + "_Trigger";
		
		// 声明包装业务类
		MethodInvokingJobDetailFactoryBean jobDetailFactoryBean = new MethodInvokingJobDetailFactoryBean();
		jobDetailFactoryBean.setTargetObject(targetObject);
		jobDetailFactoryBean.setTargetMethod(targetMethod);
		jobDetailFactoryBean.setBeanName(jobName);
		jobDetailFactoryBean.setName(jobName);
		jobDetailFactoryBean.setConcurrent(concurrent);//并行执行
		jobDetailFactoryBean.afterPropertiesSet();

		// 获取JobDetail
		JobDetail jobDetail = jobDetailFactoryBean.getObject();
		
		// 声明定时器
		CronTriggerFactoryBean cronTriggerBean = new CronTriggerFactoryBean();
		cronTriggerBean.setJobDetail(jobDetail);
		cronTriggerBean.setCronExpression(cronExpression);
		cronTriggerBean.setName(triggerName);
		cronTriggerBean.setBeanName(triggerName);
		cronTriggerBean.afterPropertiesSet();
		
		CronTrigger trigger = cronTriggerBean.getObject();
		
		// 将定时器注册到factroy
		List<Trigger> triggerList = new ArrayList<Trigger>();
		triggerList.add(trigger);
		Trigger[] triggers = (Trigger[]) triggerList.toArray(new Trigger[triggerList.size()]);
		setTriggers(triggers);
		super.registerJobsAndTriggers();
		
		//如果需要立即执行（项目启动之后立即执行）
		if(immediate){
			needImmediateRunJobList.add(jobName);
		}
		
	}
	
	public List<String> getNeedImmediateRunJobList(){
		return this.needImmediateRunJobList;
	}
	
}
