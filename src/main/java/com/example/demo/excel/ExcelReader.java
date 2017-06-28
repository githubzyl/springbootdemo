package com.example.demo.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 导入excel数据基类
 * 
 * @author zhaoyl 2016-8-11 下午12:38:34
 */
public abstract class ExcelReader {

	protected String filePath;// 文件路径
	protected Integer sheetIndex;// 读取第几个工作表
	protected Integer headerIndex;// 表头的索引
	protected Integer rows;// 读取的行数

	protected Sheet currentSheet;// 正在读取的工作表
	protected Integer columnNum;// 总的列数

	public ExcelReader(String filePath, Integer sheetIndex, Integer headerIndex, Integer rows) {
		this.filePath = filePath;
		this.sheetIndex = (null == sheetIndex ? 0 : sheetIndex);
		this.headerIndex = (null == headerIndex ? 0 : headerIndex);
		this.rows = (null == rows) ? 0 : rows;
		this.init();
	}

	protected void init() {
		// 得到工作簿
		Workbook workbook = getWorkbookInstance(filePath);
		// 得到工作表
		currentSheet = getSheet(workbook, sheetIndex);
		// 得到列数
		columnNum = getTotalCellNum(currentSheet, headerIndex);
	}

	/**
	 * 得到工作簿
	 * 
	 * @param filePath
	 * @return
	 */
	protected Workbook getWorkbookInstance(String filePath) {
		FileInputStream fis = null;
		Workbook workbook = null;
		try {
			// 获取一个绝对地址的流
			fis = new FileInputStream(filePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (filePath.endsWith(".xls")) {// 2003版本的excel，用.xls结尾
				workbook = new HSSFWorkbook(fis);
			} else if (filePath.endsWith(".xlsx")) {// 2007版本的excel，用.xlsx结尾
				workbook = new XSSFWorkbook(fis);
			} else {// 如果都不是，默认用.xlsx
				workbook = new XSSFWorkbook(fis);
			}
		} catch (Exception ex) {
			try {
				// 2007版本的excel，用.xlsx结尾
				workbook = new XSSFWorkbook(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return workbook;
	}

	/**
	 * 从工作簿中根据索引得到工作表
	 * 
	 * @param index
	 * @return
	 */
	protected Sheet getSheet(Workbook workbook, int index) {
		return workbook.getSheetAt(index);
	}

	/**
	 * 获取工作表的总行数（总行数减去表头数量）
	 * 
	 * @param sheet
	 * @param headerNum
	 *            : 表头的数量
	 * @return
	 */
	protected int getDataTotalRowNum(Sheet sheet, int headerNum) {
		return sheet.getLastRowNum() - headerNum;
	}

	/**
	 * 
	 * @param sheet
	 * @param num
	 *            : 导入文件的表头数量(列数)
	 * @return
	 */
	protected boolean checkRowHeaderNum(Sheet sheet, int rowIndex, int num) {
		return getTotalCellNum(sheet, rowIndex) == num ? true : false;
	}

	/**
	 * 获取列数
	 * 
	 * @param sheet
	 * @param rowIndex
	 *            从第几行开始获取表头的列数
	 * @return
	 * @create: 2017年6月15日 下午1:37:10 zhaoyl
	 * @history:
	 */
	protected int getTotalCellNum(Sheet sheet, int rowIndex) {
		// 获得表头
		Row rowHead = sheet.getRow(rowIndex);
		if (null == rowHead) {
			return 0;
		} else {
			return rowHead.getPhysicalNumberOfCells();
		}
	}

	/**
	 * 校验文件类型
	 * 
	 * @param filePath
	 * @return
	 */
	protected boolean checkFileType(String filePath) {
		boolean flag = true;
		// 判断是否为excel类型文件
		if (!filePath.endsWith(".xls") && !filePath.endsWith(".xlsx")) {
			flag = false;
		}
		return flag;
	}

	/**
	 * 判断cell类型并将值转换为string返回
	 * 
	 * @param cell
	 * @return
	 */
	protected String getCellValue(Cell cell, String pattern) {
		if (null != cell) {
			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_STRING:
				return cell.getStringCellValue();
			case Cell.CELL_TYPE_NUMERIC:// 数值
				if (!DateUtil.isCellDateFormatted(cell)) {// 日期
					try {
						Date date = DateUtil.getJavaDate(cell.getNumericCellValue());
						SimpleDateFormat sdf = new SimpleDateFormat(pattern);
						return sdf.format(date);
					} catch (Exception e) {
						return String.valueOf(cell.getNumericCellValue());
					}
				} else {// 纯数值
					return String.valueOf(cell.getNumericCellValue());
				}
			case Cell.CELL_TYPE_BOOLEAN: // Boolean
				return String.valueOf(cell.getBooleanCellValue());
			case Cell.CELL_TYPE_FORMULA: // 公式
				return cell.getCellFormula();
			case Cell.CELL_TYPE_BLANK: // 空值
				return null;
			case Cell.CELL_TYPE_ERROR: // 故障
				return null;
			default:
				return null;
			}
		}
		return null;
	}

	/**
	 * 读取某个sheet中第几行第几列的值
	 * 
	 * @param sheet
	 * @param rowNum
	 *            第几行
	 * @param cellNum
	 *            第几列
	 * @return
	 * @create: 2017年6月15日 上午10:38:13 zhaoyl
	 * @history:
	 */
	protected String getValueByRowAndCell(Sheet sheet, int rowNum, int cellNum, String pattern) {
		Row row = sheet.getRow(rowNum); // 获得工作薄的第rowNum行
		if(null != row){
			Cell cell = row.getCell(cellNum);// 获得第rowNum行的第cellNum个单元格
			if(null != cell){
				return getCellValue(cell, pattern);
			}
		}
		return null;
	}

	/**
	 * 判断指定的单元格是否是合并单元格
	 * 
	 * @param sheet
	 * @param row
	 * @param column
	 * @return
	 * @create: 2017年6月15日 上午11:01:40 zhaoyl
	 * @history:
	 */
	protected boolean isMergedRegion(Sheet sheet, int row, int column) {
		int sheetMergeCount = sheet.getNumMergedRegions();
		for (int i = 0; i < sheetMergeCount; i++) {
			CellRangeAddress ca = sheet.getMergedRegion(i);
			int firstColumn = ca.getFirstColumn();
			int lastColumn = ca.getLastColumn();
			int firstRow = ca.getFirstRow();
			int lastRow = ca.getLastRow();

			if (row >= firstRow && row <= lastRow) {
				if (column >= firstColumn && column <= lastColumn) {

					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 获取合并单元格的值
	 * 
	 * @param sheet
	 * @param row
	 * @param column
	 * @return
	 * @create: 2017年6月15日 上午11:03:06 zhaoyl
	 * @history:
	 */
	protected String getMergedRegionValue(Sheet sheet, int row, int column, String pattern) {
		int sheetMergeCount = sheet.getNumMergedRegions();
		for (int i = 0; i < sheetMergeCount; i++) {
			CellRangeAddress ca = sheet.getMergedRegion(i);
			int firstColumn = ca.getFirstColumn();
			int lastColumn = ca.getLastColumn();
			int firstRow = ca.getFirstRow();
			int lastRow = ca.getLastRow();
			if (row >= firstRow && row <= lastRow) {
				if (column >= firstColumn && column <= lastColumn) {
					Row fRow = sheet.getRow(firstRow);
					Cell fCell = fRow.getCell(firstColumn);
					return getCellValue(fCell, pattern);
				}
			}
		}
		return null;
	}

}
