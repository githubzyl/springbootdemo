package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.excel.GDFundValuationReader;
import com.example.demo.mapper.FundValuationMapper;
import com.example.demo.mapper.FundValuationSubjectMapper;
import com.example.demo.model.FundValuationExtend;
import com.example.demo.service.FundValuationService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FundValuationServiceTest {
	
	@Autowired
	private FundValuationMapper fundValuationMapper;
	
	@Autowired
	private FundValuationSubjectMapper fundValuationSubjectMapper;
	
	@Autowired
	private FundValuationService fundValuationService;

	@Test
	public void test() {
		String filePath = "E:/hswork/i私募项目相关/估值表/";
		String sourceFileName = "20161209东方汇 智-光大银行-阿巴马1号 特定客户资产管理计划委 托资产资产估值表.xls";
		filePath += sourceFileName;
		Integer sheetIndex = 0;//工作表索引
		Integer rowIndex = 4;//第几行是表头
		Integer rows = 75;//需要读取的行数
		GDFundValuationReader reader = new GDFundValuationReader(filePath, sheetIndex, rowIndex, rows);
		FundValuationExtend entity = reader.read();
		entity.setSourceFileName(sourceFileName);
		fundValuationService.importData(entity,false);
	}
	
//	@Test
//	public void test2(){
//		String filePath = "E:/hswork/i私募项目相关/估值表/";
//		filePath += "资产估值表_特定信托收益_外 贸信托汇富（3号）阳光私募基 金宝证券投资集合资金信托计划_2016-12-09.xls";
//		Integer sheetIndex = 0;//工作表索引
//		Integer rowIndex = 7;//第几行是表头
//		Integer rows = 38;//需要读取的行数
//		ZCFundValuationReader reader = new ZCFundValuationReader(filePath, sheetIndex, rowIndex, rows);
//		FundValuationExtend entity = reader.read();
//		//fundValuationService.importData(entity,true);
//	}

}
