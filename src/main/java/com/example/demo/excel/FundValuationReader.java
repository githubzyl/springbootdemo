package com.example.demo.excel;

import java.math.BigDecimal;
import java.util.Date;

public interface FundValuationReader<T>{

	// 读取基金全称
	String getFundFullName();

	// 获取估值日期
	Date getValuationDate();

	// 获取实收资本
	BigDecimal getRevenueCapital();
	
	T read();

}
