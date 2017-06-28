package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.mapper.FundValuationExtendMapper;
import com.example.demo.mapper.FundValuationSubjectExtendMapper;
import com.example.demo.model.FundValuation;
import com.example.demo.model.FundValuationExtend;
import com.example.demo.model.FundValuationSubject;
import com.example.demo.service.FundValuationService;
import com.example.demo.utils.BeanUtilEx;

@Service
@Transactional
public class FundValuationServiceImpl implements FundValuationService{
	
	@Autowired
	private FundValuationExtendMapper fundValuationExtendDao;
	
	@Autowired
	private FundValuationSubjectExtendMapper fundValuationSubjectExtendDao;

	@Override
	public void importData(FundValuationExtend entity, boolean truncateTable) {
		if(null == entity){
			return;
		}
		if(truncateTable){
			//先删除原来数据
			truncateTable();
		}
		//新增记录
		FundValuation valuation = new FundValuation();
		BeanUtilEx.copyProperties(valuation, entity);
		fundValuationExtendDao.insertAndGetId(valuation);
		int valuationId = valuation.getValuationId();
		System.out.println(valuationId);
		List<FundValuationSubject> subjects = entity.getSubjects();
		if(null == subjects || subjects.size() == 0){
			return;
		}
		for(FundValuationSubject subject : subjects){
			subject.setValuationId(valuationId);
		}
		fundValuationSubjectExtendDao.batchInsert(subjects);
	}
	
	public void truncateTable(){
		fundValuationExtendDao.truncateTable();
		fundValuationSubjectExtendDao.truncateTable();
	}

}
