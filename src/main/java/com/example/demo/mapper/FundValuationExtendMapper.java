package com.example.demo.mapper;

import com.example.demo.model.FundValuation;

public interface FundValuationExtendMapper {
	
	void truncateTable();
   
	int insertAndGetId(FundValuation entity);
}