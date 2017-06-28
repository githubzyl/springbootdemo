package com.example.demo.service;

import com.example.demo.model.FundValuationExtend;

public interface FundValuationService {

	void importData(FundValuationExtend entity, boolean truncateTable);
	
}
