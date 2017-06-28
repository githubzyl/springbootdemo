package com.example.demo.mapper;

import java.util.List;

import com.example.demo.model.FundValuationSubject;

public interface FundValuationSubjectExtendMapper {
	
	void truncateTable();

	void batchInsert(List<FundValuationSubject> list);
}
