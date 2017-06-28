package com.example.demo.jfreechart;

import org.jfree.chart.JFreeChart;

/**
 * jfreechart展示的属性的接口
 * @author: zhaoyl
 * @since: 2017年6月8日  上午10:37:18
 * @history:
 */
public interface JFreeChartView {
	
	JFreeChart createJFreeChart();
	
	void refreshXYPlot(JFreeChart chart);

}
