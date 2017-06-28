package com.example.demo.jfreechart;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;

/**
 * 时序图展示的属性设置
 * 
 * @author: zhaoyl
 * @since: 2017年6月8日 上午10:44:38
 * @history:
 */
public class TimeSeriesChartView extends BaseJFreeChartView implements JFreeChartView {

	private String timeAxisLabel;
	private String valueAxisLabel;

	public String getTimeAxisLabel() {
		return timeAxisLabel;
	}

	public void setTimeAxisLabel(String timeAxisLabel) {
		this.timeAxisLabel = timeAxisLabel;
	}

	public String getValueAxisLabel() {
		return valueAxisLabel;
	}

	public void setValueAxisLabel(String valueAxisLabel) {
		this.valueAxisLabel = valueAxisLabel;
	}

	@Override
	public JFreeChart createJFreeChart() {
		ChartFactory.setChartTheme(this.getTheme());
		final JFreeChart chart = ChartFactory.createTimeSeriesChart(this.getTitle(), this.getTimeAxisLabel(),
				this.getValueAxisLabel(), this.getDataset(), this.isLegend(), this.isTooltips(), this.isUrls());
		refreshXYPlot(chart);
		return chart;
	}

	@Override
	public void refreshXYPlot(JFreeChart chart) {
		
		
	}

}
