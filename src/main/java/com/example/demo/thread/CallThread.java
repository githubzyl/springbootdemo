package com.example.demo.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import org.junit.Test;

public class CallThread implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		String str = "aaaa";
		return str;
	}
	
	@Test
	public void testCall() throws Exception{
		CallThread callThread = new CallThread();
		FutureTask<Object> task = new FutureTask<>(callThread);
		new Thread(task, "线程1").start();
		try {
			 // 获取线程返回值
            System.out.println("子线程的返回值：" + task.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
