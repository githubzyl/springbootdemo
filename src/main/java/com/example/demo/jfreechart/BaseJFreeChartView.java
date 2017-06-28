package com.example.demo.jfreechart;

import org.jfree.chart.ChartTheme;
import org.jfree.chart.title.LegendTitle;
import org.jfree.data.xy.XYDataset;

public class BaseJFreeChartView{

	private String title;
	private XYDataset dataset;
	private boolean legend;
	private boolean tooltips;
	private boolean urls;
	private ChartTheme theme;
	private LegendTitle legendTitle;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public XYDataset getDataset() {
		return dataset;
	}
	public void setDataset(XYDataset dataset) {
		this.dataset = dataset;
	}
	public boolean isLegend() {
		return legend;
	}
	public void setLegend(boolean legend) {
		this.legend = legend;
	}
	public boolean isTooltips() {
		return tooltips;
	}
	public void setTooltips(boolean tooltips) {
		this.tooltips = tooltips;
	}
	public boolean isUrls() {
		return urls;
	}
	public void setUrls(boolean urls) {
		this.urls = urls;
	}
	public ChartTheme getTheme() {
		return theme;
	}
	public void setTheme(ChartTheme theme) {
		this.theme = theme;
	}
	public LegendTitle getLegendTitle() {
		return legendTitle;
	}
	public void setLegendTitle(LegendTitle legendTitle) {
		this.legendTitle = legendTitle;
	}
	
}
