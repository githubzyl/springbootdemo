package com.example.demo.excel;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;

import com.example.demo.model.FundValuationExtend;
import com.example.demo.model.FundValuationSubject;

public class GDFundValuationReader extends BaseFundValuationReader<FundValuationSubject>
		implements FundValuationReader<FundValuationExtend> {
	
	private final Logger logger = Logger.getLogger(GDFundValuationReader.class);

	public GDFundValuationReader(String filePath, Integer sheetIndex, Integer headerIndex, Integer rows) {
		super(filePath, sheetIndex, headerIndex, rows);
	}

	@Override
	public String getFundFullName() {
		return this.getFundFullName(1, 1);
	}

	@Override
	public Date getValuationDate() {
		return this.getValuationDate(2, 1);
	}

	@Override
	public BigDecimal getRevenueCapital() {
		return this.getRevenueCapital(249, 2);
	}

	@Override
	public FundValuationExtend read() {
		// 读取估值实体
		FundValuationExtend entity = new FundValuationExtend();
		entity.setFundFullName(getFundFullName());
		entity.setValuationDate(getValuationDate());
		entity.setRevenueCapital(getRevenueCapital());
		// 读取科目集合
		entity.setSubjects(getSheetData());
		return entity;
	}
	
	@Override
	protected void setData(FundValuationSubject t, Cell cell, int colIndex) {
		String value = getCellValue(cell, null);
		try{
			switch (colIndex) {
				case 0 : t.setSubjectCode(value); break;
				case 1 : t.setSubjectName(value); break;
				case 2 : t.setQuantity(getIntegerValue(value)); break;
				case 3 : t.setUnitCost(twoScaleFormatDecimal(value)); break;
				case 4 : t.setCost(twoScaleFormatDecimal(value)); break;
				case 5 : t.setCostOfNetvalue(getDoubleValue(value)); break;
				case 6 : t.setMarketPrice(twoScaleFormatDecimal(value)); break;
				case 7 : t.setMarketValue(twoScaleFormatDecimal(value)); break;
				case 8 : t.setMarketOfNetvalue(getDoubleValue(value)); break;
				case 9 : t.setValuationAppreciation(twoScaleFormatDecimal(value)); break;
				case 10 :t.setSuspensionInfo(value); break;
			}
		}catch(Exception e){
			logger.info("第【"+(cell.getRowIndex()+1)+"】行,第1列的值为："+getValueByRowAndCell(currentSheet, cell.getRowIndex()+1, 0, null));
			logger.error("读取第【"+cell.getRowIndex()+"】行,第【"+cell.getColumnIndex()+"】列的值【"+value+"】时出错:",e);
		}
	}

}
