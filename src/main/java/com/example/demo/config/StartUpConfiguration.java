package com.example.demo.config;

import java.util.List;

import org.apache.log4j.Logger;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.matchers.GroupMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import com.example.demo.quartz.CustomSchedulerFactoryBean;

@Configuration
public class StartUpConfiguration implements ApplicationListener<ContextRefreshedEvent> {

	private final Logger logger = Logger.getLogger(StartUpConfiguration.class);

	@Autowired
	private CustomSchedulerFactoryBean customSchedulerFactoryBean;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		executeTask();
	}

	// 执行需要立即执行的定时任务
	private void executeTask() {
		List<String> needImmediateRunJobList = customSchedulerFactoryBean.getNeedImmediateRunJobList();
		if (null == needImmediateRunJobList || needImmediateRunJobList.size() == 0) {
			return;
		}
		Scheduler scheduler = customSchedulerFactoryBean.getScheduler();
		String groupName = Scheduler.DEFAULT_GROUP;
		try {
			for (JobKey jobKey : scheduler.getJobKeys(GroupMatcher.jobGroupEquals(groupName))) {
				String jobName = jobKey.getName();
				for (String needRunJobName : needImmediateRunJobList) {
					if (jobName.equals(needRunJobName)) {
						scheduler.triggerJob(jobKey);
					}
				}
			}
		} catch (SchedulerException e) {
			logger.error("项目启动时执行定时任务失败：", e);
		}
	}
}
