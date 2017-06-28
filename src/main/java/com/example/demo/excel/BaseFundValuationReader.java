package com.example.demo.excel;

import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 * 估值表读取基类
 * @author: zhaoyl
 * @since: 2017年6月15日  上午11:08:13
 * @history:
 */
public abstract class BaseFundValuationReader<T> extends ExcelReader{
	
	public BaseFundValuationReader(String filePath, Integer sheetIndex, Integer headerIndex, Integer rows) {
		super(filePath, sheetIndex, headerIndex, rows);
	}
	
	// 小数点后保留两位小数
	public static String twoScaleFormatStr(String value){
		BigDecimal decimal = new BigDecimal(value);
		double d = decimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		value = String.format("%.2f", d);
		return value;
	}
	
	public static BigDecimal twoScaleFormatDecimal(String value){
		if(StringUtils.isBlank(value)){
			return null;
		}
		return new BigDecimal(twoScaleFormatStr(value));
	}
	
	public static Double getDoubleValue(String value){
		Double v = null;
		try{
			v = Double.parseDouble(value);
			BigDecimal decimal = new BigDecimal(v);
			return decimal.doubleValue();
		}catch(Exception e){
			v = null;
		}
		return v;
	}
	
	public static Integer getIntegerValue(String value){
		if(StringUtils.isNotBlank(value)){
			try{
				BigDecimal decimal = new BigDecimal(value);
				return decimal.intValue();
			}catch(Exception e){
				return null;
			}
		}
		return null;
	}
	
	public String getFundFullName(int rowNum, int cellNum) {
		String fundName = getMergedRegionValue(currentSheet, rowNum, cellNum, null);
		if(StringUtils.isNotBlank(fundName)){
			int index = -1;
			if(fundName.contains("___")){
				index = fundName.lastIndexOf("___");
			}else if(fundName.contains("_")){
				index = fundName.lastIndexOf("__");
			}
			if(index != -1){
				fundName = fundName.substring(0, index);
			}
		}
		return fundName;
	}

	public Date getValuationDate(int rowNum, int cellNum) {
		String str = getMergedRegionValue(currentSheet, rowNum, cellNum, null);
		str = str.substring(5);
		if(str.contains("年") && str.contains("月") && str.contains("日")){
			str = str.replace("年", "-").replace(" 月", "").replace("日", "");
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try{
			Date date = sdf.parse(str);
			return date;
		}catch (Exception e) {
			return null;
		}
	}

	public BigDecimal getRevenueCapital(int rowNum, int cellNum) {
		String val = getValueByRowAndCell(currentSheet, rowNum, cellNum, null);
		if(StringUtils.isNotBlank(val)){
			val = twoScaleFormatStr(val);
			return twoScaleFormatDecimal(val);
		}
		return null;
	}
	
	protected List<T> getSheetData() {
		if (rows <= 0){
			return null;
		}
		List<T> list = new ArrayList<>();
		int startRow = headerIndex + 1;
		int endRow = headerIndex + rows + 1;
		for (int i = startRow; i < endRow; i++) {
			// 获得第i行对象
			Row row = currentSheet.getRow(i);
			if (null != row) {
				Cell cell = null;
				T t = getInstance();
				for(int j = 0 ; j < columnNum ; j++){
					cell = row.getCell((short)j);
					setData(t, cell, j);
				}
				list.add(t);
			}
		}
		return list;
	}
	
	@SuppressWarnings("unchecked")
	protected T getInstance() {
		try {
			// 通过反射获取model的真实类型
			ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
			Class<T> clazz = (Class<T>) pt.getActualTypeArguments()[0];
			// 通过反射创建model的实例
			return clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	//为传入的对象设置属性值
	protected abstract void setData(T t, Cell cell, int colIndex);
	
}
