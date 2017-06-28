package com.example.demo.jfreechart;

import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartTheme;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

public class JFreeChartUtil {

    public static void createTimeSeriesChart(final List<TimeSeries> list, ChartTheme theme, JFreeChartView chartView){
    	if(null == list || list.size() <= 0) return;
    	TimeSeriesCollection dataset = new TimeSeriesCollection();
    	for(TimeSeries series : list){
    		dataset.addSeries(series);
    	}
    	ChartFactory.setChartTheme(theme);
    	final JFreeChart timechart = ChartFactory.createTimeSeriesChart("", "", "", dataset, true, false, false);
    }
    
}
