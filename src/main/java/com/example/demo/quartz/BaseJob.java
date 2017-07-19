package com.example.demo.quartz;

import java.text.SimpleDateFormat;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public abstract class BaseJob implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		execJob();
	}

	protected SimpleDateFormat dateFormat() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	}

	// 真正执行任务的方法
	protected abstract void execJob();

}
