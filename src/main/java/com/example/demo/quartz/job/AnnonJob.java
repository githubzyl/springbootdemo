package com.example.demo.quartz.job;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.demo.quartz.annotation.QuartzCron;
import com.example.demo.quartz.annotation.QuartzJob;

@QuartzJob
public class AnnonJob {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@QuartzCron(cronExpression = "0 0 0/1 * * ?")  
    public void execute() {  
        System.out.println(sdf.format(new Date()) + ":定时任务,每1小时执行一次----------------");  
    }  
  
    @QuartzCron(cronExpression = "0 0/10 * * * ?", immediate=false)  
    public void execute2() {  
        System.out.println(sdf.format(new Date()) + ":定时任务,每10分钟执行一次----------------");  
    }  
    
}
