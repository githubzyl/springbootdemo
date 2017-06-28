package com.example.demo.jfreechart;

import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTick;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.axis.DateTickUnitType;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.chart.renderer.xy.StandardXYBarPainter;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Week;
import org.jfree.ui.RectangleEdge;
import org.jfree.ui.TextAnchor;

import com.example.demo.pdf.CustomXYRenderer;
import com.example.demo.utils.DateUtils;

public class Test {

	private final static String CHART_FILE_PATH = "F:/ismapp/temp/img/";

	public static void main(String[] args) throws Exception {
		createTimeSeriesChart();
		// createXYBarChart();
		//createBarChart();
		//createBarChart2();
	}
	
	//周回报率
	public static void createBarChart2() throws IOException{
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		Random random = new Random();
        for (int i = 0; i < 30; i++) {
            if (i == 0) {
                dataset.addValue(random.nextInt(100), "",
                    "<" + random.nextInt(15) + "%");
            } else if (i == 29) {
                dataset.addValue(random.nextInt(100), "",
                		random.nextInt(14) + "%≦");// ≧
            } else {
                dataset.addValue(random.nextInt(100), "",
                		random.nextInt(13) + "%至"
                            + random.nextInt(12)
                            + "%");
            }
        }
        ChartFactory.setChartTheme(JFreeChartBaseUtil.chartTheme(null));
        JFreeChart pieChart = ChartFactory.createBarChart("", "", "累计周数",
            dataset, PlotOrientation.VERTICAL, true, true, false);
        pieChart.getLegend().setVisible(false);
        CategoryPlot plot = (CategoryPlot) pieChart.getPlot();
        plot.getDomainAxis()
            .setCategoryLabelPositions(CategoryLabelPositions.UP_45);
        plot.getDomainAxis().setLowerMargin(0.01);
        plot.getDomainAxis().setUpperMargin(0.01);
        
		int width = 1020; /* Width of the image */
		int height = 240; /* Height of the image */
		File xyBarChart = new File(CHART_FILE_PATH + "周回报分析Chart.jpeg");
		ChartUtilities.saveChartAsJPEG(xyBarChart, pieChart, width, height);

		System.out.println("周回报分析生成成功");
	}

	//择时能力、避险能力
	public static void createBarChart() throws IOException {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		String chartShowFundName = "证大稳健增长";
        String chartShowHS300Name = "沪深300";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        
        Date startDate = DateUtils.addMonth(new Date(), -12);
        int count = 0;
        Random random = new Random();
		int n = random.nextInt(20);
        while(!sdf.format(startDate).equals(sdf.format(new Date()))){
        	if (n % 2 == 0) {
        		dataset.addValue(new BigDecimal(random.nextInt()),
                        chartShowFundName, sdf.format(startDate));
        		dataset.addValue(new BigDecimal(random.nextInt()-100),
        				chartShowHS300Name, sdf.format(startDate));
        	}else{
        		dataset.addValue(new BigDecimal(random.nextInt()+100),
                        chartShowFundName, sdf.format(startDate));
        		dataset.addValue(new BigDecimal(random.nextInt()),
        				chartShowHS300Name, sdf.format(startDate));
        	}
        	startDate = DateUtils.addMonth(startDate, 1);
        	count++;
        	n++;
        }
        
        System.out.println(count);
        
        ChartFactory.setChartTheme(JFreeChartTheme.getStandardChartTheme(true));
        JFreeChart pieChart = ChartFactory.createBarChart("", "", "", dataset,
            PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = (CategoryPlot) pieChart.getPlot();
        plot.getDomainAxis()
            .setCategoryLabelPositions(CategoryLabelPositions.UP_45);
        plot.getDomainAxis().setLowerMargin(0.01);
        plot.getDomainAxis().setUpperMargin(0.01);
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setBarPainter(new StandardBarPainter());
        renderer.setItemMargin(-0.1);
        plot.setRenderer(renderer);// 使用我们设计的效果
        pieChart.getLegend().setBorder(0, 0, 0, 0);
        
        
		int width = 1020; /* Width of the image */
		int height = 240; /* Height of the image */
		File xyBarChart = new File(CHART_FILE_PATH + "浮动Chart.jpeg");
		ChartUtilities.saveChartAsJPEG(xyBarChart, pieChart, width, height);

		System.out.println("浮动图生成成功");
        
	}

	//每26周
	public static void createXYBarChart() throws IOException {
		Random random = new Random();
		int n = random.nextInt(20);
		TimeSeries timeseries = new TimeSeries("", "", "");
		Week week = new Week();
		Date startDate = DateUtils.addMonth(new Date(), -13);
		week = new Week(startDate);
		int count = 0;
		int number = 0;
		Map<Integer, Paint> colorMap = new HashMap<>();
		while (!new Week(new Date()).equals(week)) {
			if (n % 2 == 0) {
				number = Integer.parseInt("-" + Math.abs(random.nextInt()));
				colorMap.put(count, JFreeChartBaseUtil.COLOR_1);
			} else {
				number = random.nextInt();
				colorMap.put(count, JFreeChartBaseUtil.COLOR_5);
			}
			timeseries.addOrUpdate(week, number);
			week = (Week) week.next();
			count++;
			n++;
		}

		System.out.println(count);

		ChartFactory.setChartTheme(JFreeChartTheme.getStandardChartTheme(false));
		JFreeChart chart = ChartFactory.createXYBarChart("", "", false, "", new TimeSeriesCollection(timeseries),
				PlotOrientation.VERTICAL, true, false, false);
		chart.getLegend().setVisible(false);

		XYPlot plot = (XYPlot) chart.getPlot();
		CustomXYRenderer renderer = new CustomXYRenderer(colorMap);
		renderer.setMargin(0.3);
		renderer.setShadowVisible(false);
		renderer.setBaseItemLabelGenerator(new StandardXYItemLabelGenerator());
		renderer.setBarPainter(new StandardXYBarPainter());
		plot.setRenderer(renderer);

		DateAxis dateAxis = new DateAxis(" ") {
			@SuppressWarnings("unchecked")
			protected List<DateTick> refreshTicksHorizontal(Graphics2D g2, Rectangle2D dataArea, RectangleEdge edge) {
				List ticks = super.refreshTicksHorizontal(g2, dataArea, edge);
				List<DateTick> newTicks = new ArrayList<DateTick>();
				for (Iterator it = ticks.iterator(); it.hasNext();) {
					DateTick tick = (DateTick) it.next();
					newTicks.add(new DateTick(tick.getDate(), tick.getText(), TextAnchor.TOP_RIGHT,
							TextAnchor.TOP_RIGHT, 0));
					// -Math.PI / 8
				}
				return newTicks;
			}
		};
		dateAxis.setTickUnit(new DateTickUnit(DateTickUnitType.MONTH, 1, new SimpleDateFormat("yyyy/MM/dd")));
		dateAxis.setLowerMargin(0.01);
		dateAxis.setUpperMargin(0.01);
		plot.setDomainAxis(dateAxis);

		int width = 1020; /* Width of the image */
		int height = 240; /* Height of the image */
		File xyBarChart = new File(CHART_FILE_PATH + "xyBarChart.jpeg");
		ChartUtilities.saveChartAsJPEG(xyBarChart, chart, width, height);

		System.out.println("xybar图生成成功");
	}

	//本基金 vs 沪深300 vs 上证指数 vs 深证成指
	public static void createTimeSeriesChart() throws IOException {
		final TimeSeries s1 = new TimeSeries("本基金");
		final TimeSeries s2 = new TimeSeries("沪深300");
		final TimeSeries s3 = new TimeSeries("上证指数");
		final TimeSeries s4 = new TimeSeries("深证成指");
		
		Day day = new Day();
		Date startDate = DateUtils.addDay(new Date(), -1200);
		day = new Day(startDate);
		System.out.println("开始的日期：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(startDate));

		int count = 0;

		System.out.println(day);
		System.out.println(new Day(new Date()));

		while (!new Day(new Date()).equals(day)) {
			s1.addOrUpdate(day, 1.2 + Math.random());
			s2.addOrUpdate(day, 3.4 + Math.random());
			s3.addOrUpdate(day, 2.3 + Math.random());
			s4.addOrUpdate(day, 4.1 + Math.random());
			day = (Day) day.next();
			count++;
		}
		
		TimeSeriesCollection dataset = new TimeSeriesCollection();
		dataset.addSeries(s1);
		dataset.addSeries(s2);
		dataset.addSeries(s3);
		dataset.addSeries(s4);
		
		TimeSeriesChartView chartView = new TimeSeriesChartView();
		chartView.setDataset(dataset);
		chartView.setTheme(JFreeChartTheme.getStandardChartTheme(false));
		chartView.setLegend(true);
		chartView.setTooltips(false);
		chartView.setUrls(false);
		
		System.out.println(count);

		final JFreeChart timechart = chartView.createJFreeChart();
		timechart.getLegend().setBorder(0, 0, 0, 0);

		XYPlot xyplot = (XYPlot) timechart.getPlot();
		// 设置legend没有边框
		xyplot.setOutlineVisible(false);
		// 格式化x轴
		DateAxis dateAxis = new DateAxis(" ");
		int dateUnit = 2;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM");
		DateTickUnit dateTickUnit = new DateTickUnit(DateTickUnitType.MONTH, dateUnit, dateFormat);
		dateAxis.setTickUnit(dateTickUnit);
		xyplot.getDomainAxis().setLowerMargin(0.01);
		xyplot.getDomainAxis().setUpperMargin(0.01);
		xyplot.setDomainAxis(dateAxis);
		// 格式化y轴
		NumberAxis numberAxis = (NumberAxis) xyplot.getRangeAxis();
		// 是否由系统定义数据轴
		numberAxis.setAutoTickUnitSelection(false);
		// 数据轴数值单位大小
		double unit = 1d;
		DecimalFormat formatter = new DecimalFormat("####.0");
		// 一个数值单位
		NumberTickUnit numberTickUnit = new NumberTickUnit(unit, formatter);
		// 设置轴的数值单位并发送一个AxisChangeEvent所有注册的侦听器
		numberAxis.setTickUnit(numberTickUnit);

		int width = 1020; /* Width of the image */
		int height = 240; /* Height of the image */
		File timeChart = new File(CHART_FILE_PATH + "timeChart.jpeg");
		ChartUtilities.saveChartAsJPEG(timeChart, timechart, width, height);

		// try {
		// OutputStream out = response.getOutputStream();
		// ChartUtilities.writeChartAsJPEG(out, timechart, width, height);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		System.out.println("时序图生成成功");
	}

}
