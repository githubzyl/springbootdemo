package com.example.demo.quartz.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface QuartzCron {

	//定义触发的cron表达式
	String cronExpression() default "";
	
	//是否立即执行，默认是true，立即执行
	boolean immediate() default true;
	
	//是否并行执行，默认是false，不并行执行
	boolean concurrent() default false;
	
}
