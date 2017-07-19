package com.example.demo.service.fund.impl;

import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTick;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.axis.DateTickUnitType;
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
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Week;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.RectangleEdge;
import org.jfree.ui.TextAnchor;
import org.junit.Test;
import org.springframework.stereotype.Service;

import com.example.demo.jfreechart.JFreeChartBaseUtil;
import com.example.demo.model.fund.FileIsmBean;
import com.example.demo.model.fund.FundCoreBean;
import com.example.demo.model.fund.FundnetCoreBean;
import com.example.demo.model.fund.PerformanceQuotationBean;
import com.example.demo.model.fund.PerformanceReportAchievementTempBean;
import com.example.demo.model.fund.PerformanceReportFloatTempBean;
import com.example.demo.model.fund.PerformanceReportHalfyearsTempBean;
import com.example.demo.model.fund.PerformanceReportHistoryperformanceTempBean;
import com.example.demo.model.fund.PerformanceReportMatrixTempBean;
import com.example.demo.model.fund.PerformanceReportReturnprofitTempBean;
import com.example.demo.model.fund.PerformanceReportReturnwithdrawTempBean;
import com.example.demo.model.fund.PerformanceReportReviseTempBean;
import com.example.demo.model.fund.PerformanceReportRiskTempBean;
import com.example.demo.model.fund.PerformanceReportWeeknumTempBean;
import com.example.demo.model.fund.PerformanceReportYearPerformanceTempBean;
import com.example.demo.model.fund.PerformanceReporthistorynetTempBean;
import com.example.demo.pdf.CustomXYRenderer;
import com.example.demo.pdf.DateTimeCut;
import com.example.demo.pdf.StreamGobbler;
import com.example.demo.pdf.Util;
import com.example.demo.pdf.Utils;
import com.example.demo.service.fund.BaseService;
import com.example.demo.service.fund.ChartViewNewService;

@Service
public class ChartViewNewServiceImpl extends BaseService
        implements ChartViewNewService {
    private Logger logger = Logger.getLogger(ChartViewNewServiceImpl.class);
    
    private final static String WINDOWS_WKHTMLTOPDF_PATH = "D:\\soft\\wkhtmltopdf\\bin\\wkhtmltopdf.exe ";
    private final static String LINUX_OR_MAC_WKHTMLTOPDF_PATH = "/usr/local/bin/wkhtmltopdf ";

    @Override
    public void buildPdf() throws ParseException {
        // performance_report_revise_temp 增加 字段 :
        // build_report_status integer 0未生成 1已生成
        // build_report_date datetime
        // build_report_path varchar(400)
        // build_fileid_list varchar(400)
        // 格式: 本基金VS沪深300VS上证指数VS深证成指;每26周(半年)回报分析;周回报率分布图;上浮捕获率对比图;下浮捕获率对比
        // 1.有多少个报告要生成 performance_report_revise_temp
        List<PerformanceReportReviseTempBean> reports = new ArrayList<>();
        if (reports != null && reports.size() > 0) {
            Date oldEastDate = null, curDate = null;
            Map<String, Map<String, String>> maps = null;
            for (PerformanceReportReviseTempBean f : reports) {
                maps = new HashMap<String, Map<String, String>>();
                // ***2.年度业绩
                // ***3.绩效分析
                // ***4.回撤分析
                // ***5.回报分析
                // ***6.风险评估指标
                // ***7.相关系数矩阵
                curDate = f.getReportTime();
                // 8.本基金VS沪深300VS上证指数VS深证成指
                maps.putAll(chart_ism_fundnet_temp_log_AND_ism_quotation(f,
                    curDate, oldEastDate));
                // 9.每26周(半年)回报分析
                maps.putAll(chart_ism_report_halfyear(f, curDate, oldEastDate));
                // 10.周回报率分布图
                maps.putAll(chart_ism_report_weeknum(f));
                // 11.上浮捕获率对比图
                // 12.下浮捕获率对比
                maps.putAll(
                    chart_ism_report_float_temp(f, curDate, oldEastDate));
                // ***13.历史收益
                // ***14.历史净值
                // 15.修改 performance_report_revise_temp 状态
                updateFundReportAppWebFileIds(f, maps);
                // 保存PDF
                savePdf(f.getReportId());
            }
        }
    }

    /**
     * **************************本基金VS沪深300VS上证指数VS深证成指**************************
     * @param f
     * @param curDate
     * @param oldEastDate
     * @return
     * @throws ParseException 
     * @create: Jul 13, 2016 2:13:49 PM lyuanx
     * @history:
     */
    private Map<String, Map<String, String>> chart_ism_fundnet_temp_log_AND_ism_quotation(
            PerformanceReportReviseTempBean f, Date curDate, Date oldEastDate)
            throws ParseException {
        XYDataset dataset = null;
        Map<String, Map<String, String>> maps = new HashMap<String, Map<String, String>>();
        Map<String, String> webAppIds = null;
        // 3年前的时间点
        oldEastDate = DateTimeCut.getYearMonthDay(curDate, -3, null, null);
        dataset = fundVShs300VSszzsVSszcz(f.getFundTempId(), curDate,
            oldEastDate);
        logger.info("开始生成图....");
        ChartFactory.setChartTheme(JFreeChartBaseUtil.chartTheme(null));
        JFreeChart chart = ChartFactory.createTimeSeriesChart("", "", "",
            dataset, true, true, false);
        chart = changeShowTheme(chart, dataset.getItemCount(0));
        chart.getLegend().setBorder(BlockBorder.NONE);
        logger.info("图已生成,将图保存到 文档中心");
        webAppIds = saveChartToFilesaveSystem(chart, 1020, 240);
        maps.put(f.getReportId() + "_vsvsvs", webAppIds);
        return maps;
    }

    private JFreeChart changeShowTheme(JFreeChart chart, Integer fundCount) {
        XYPlot xyplot = (XYPlot) chart.getPlot();
        DateAxis dateAxis = new DateAxis(" ");
        if (fundCount > 800) {
            dateAxis.setTickUnit(new DateTickUnit(DateTickUnitType.MONTH, 4,
                new SimpleDateFormat("yyyy/MM")));
        } else if (fundCount > 400) {
            dateAxis.setTickUnit(new DateTickUnit(DateTickUnitType.MONTH, 3,
                new SimpleDateFormat("yyyy/MM")));
        } else if (fundCount > 100) {
            dateAxis.setTickUnit(new DateTickUnit(DateTickUnitType.MONTH, 2,
                new SimpleDateFormat("yyyy/MM")));
        } else {
            dateAxis.setTickUnit(new DateTickUnit(DateTickUnitType.DAY, 90,
                new SimpleDateFormat("yyyy/MM/dd")));
        }
        xyplot.getDomainAxis().setLowerMargin(0.01);
        xyplot.getDomainAxis().setUpperMargin(0.01);
        xyplot.setDomainAxis(dateAxis);
        return chart;
    }

    private XYDataset fundVShs300VSszzsVSszcz(String fundId, Date curDate,
            Date oldEastDate) throws ParseException {
        List<FundnetCoreBean> listFundnetCore = null;
        List<PerformanceQuotationBean> hs300List = null, szzsList = null,
                szczList = null;
        TimeSeriesCollection dataset = new TimeSeriesCollection();
        TimeSeries s1 = new TimeSeries("本基金", Day.class);
        TimeSeries s2 = new TimeSeries("沪深300", Day.class);
        TimeSeries s3 = new TimeSeries("上证指数", Day.class);
        TimeSeries s4 = new TimeSeries("深证成指", Day.class);
        // 本基金
        // oldEastDate = DateTimeCut.cut36MonthBefore(curDate, oldEastDate);
        logger.info("最早日期:" + oldEastDate);
        listFundnetCore = new ArrayList<>();
        // FundNetTempLogIsmBean fundNetTempLog = null, baseNetTempLog = null;
        FundnetCoreBean fundnetCore = null, baseFundnetCore = null;
        if (listFundnetCore.size() > 0) {
            // 这个baseNetTempLog是给 HS300 SZCZ SZZS 用的作为基值
            baseFundnetCore = listFundnetCore.get(listFundnetCore.size() - 1);

            // 下面所有图的 终止日期为 本基金的最后一天净值日
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
            curDate = sdf2
                .parse(sdf.format(listFundnetCore.get(0).getFundnetDate())
                        + " 23:59:59");
            for (int i = 0; i < listFundnetCore.size(); i++) {
                fundnetCore = listFundnetCore.get(i);
                s1.addOrUpdate(new Day(fundnetCore.getFundnetDate()),
                    fundnetCore.getCumulativeFundnet() == null
                            ? new BigDecimal(0.00)
                            : fundnetCore.getCumulativeFundnet());
            }
        }
        logger.info("本基金的最近时间:" + curDate);
        logger.info("本基金一共有:" + listFundnetCore.size() + "个点");

        Double baseNetValue = null;
        PerformanceQuotationBean temp = null, baseQuotation = null;
        // 1、沪深300 HS300
        // oldEastHS300 = productService.queryQuotationOldestByType(
        // Constant.QUOTATION_TYPE_1, fundNetTempLogTemp == null ? oldEastDate
        // : fundNetTempLogTemp.getCreateTime());
        hs300List = new ArrayList<>();
        // hs300List = productService.queryQuotationByType(fundId,
        // Constant.QUOTATION_TYPE_1, curDate, oldEastDate, null);
        if (baseFundnetCore != null && hs300List.size() > 0) {
            baseQuotation = hs300List.get(0);
            baseNetValue = Utils.getFundNetBaseValue(
                baseQuotation.getQuotationValue(),
                baseFundnetCore.getCumulativeFundnet());
            for (int i = 0; i < hs300List.size(); i++) {
                temp = hs300List.get(i);
                s2.addOrUpdate(new Day(temp.getCreatDate()), Utils
                    .getEachQuotValue(temp.getQuotationValue(), baseNetValue));
            }
        }
        baseQuotation = null;
        baseNetValue = null;
        temp = null;
        logger.info("HS300一共有:" + hs300List.size() + "个点");

        temp = null;
        // 3、深证指数 SZCZ
        // oldEastSZCZ = productService.queryQuotationOldestByType(
        // Constant.QUOTATION_TYPE_3, fundNetTempLogTemp == null ?
        // oldEastDate
        // : fundNetTempLogTemp.getCreateTime());
        szczList = new ArrayList<>();
        if (baseFundnetCore != null && szczList.size() > 0) {
            baseQuotation = szczList.get(0);
            baseNetValue = Utils.getFundNetBaseValue(
                baseQuotation.getQuotationValue(),
                baseFundnetCore.getCumulativeFundnet());
            for (int i = 0; i < szczList.size(); i++) {
                temp = szczList.get(i);
                s4.addOrUpdate(new Day(temp.getCreatDate()), Utils
                    .getEachQuotValue(temp.getQuotationValue(), baseNetValue));
            }
        }
        logger.info("深证指数一共有:" + szczList.size() + "个点");
        // 2、上证指数 SZZS
        // oldEastSZZS = chartViewDBService.queryQuotationOldestByType(
        // Constant.QUOTATION_TYPE_2, fundNetTempLogTemp == null ? oldEastDate
        // : fundNetTempLogTemp.getCreateTime());
        szzsList = new ArrayList<>();
        if (baseFundnetCore != null && szzsList.size() > 0) {
            baseQuotation = szzsList.get(0);
            baseNetValue = Utils.getFundNetBaseValue(
                baseQuotation.getQuotationValue(),
                baseFundnetCore.getCumulativeFundnet());
            for (int i = 0; i < szzsList.size(); i++) {
                temp = szzsList.get(i);
                s3.addOrUpdate(new Day(temp.getCreatDate()), Utils
                    .getEachQuotValue(temp.getQuotationValue(), baseNetValue));
            }
        }
        logger.info("上证指数一共有:" + szzsList.size() + "个点");
        baseQuotation = null;
        baseNetValue = null;
        dataset.addSeries(s1);
        dataset.addSeries(s2);
        dataset.addSeries(s3);
        dataset.addSeries(s4);
        return dataset;
    }

    /**
     * ---------------------------------new 26周---------------------------------
     * @param f
     * @param curDate
     * @param oldEastDate
     * @return 
     * @create: 2015年12月22日 上午11:07:37 lyuanx
     * @history:
     */
    private Map<String, Map<String, String>> chart_ism_report_halfyear(
            PerformanceReportReviseTempBean f, Date curDate, Date oldEastDate) {
        // 1年半到curDate
        Map<String, Map<String, String>> maps = new HashMap<String, Map<String, String>>();
        BigDecimal bigDecTemp = null, bigDecFlag = new BigDecimal("0.00");
        // DefaultCategoryDataset dataset = null;
        TimeSeries timeseries = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        JFreeChart pieChart = null;
        XYPlot plot = null;
        Map<String, String> webAppIds = null;
        Map<Integer, Paint> colorMap = null;
        // oldEastDate = DateTimeCut.getYearMonthDay(curDate, -1, -6, null);
        // modify by lyuanx since 2016-10-12
        // oldEastDate = DateUtils.addMonths(curDate, -18);
        List<PerformanceReportHalfyearsTempBean> listResult = null;
        int stepLen = 0;
        if (1 == f.getFundNetUpdateRange()) {//净值更新周期：日
            // 日报告取所有的每隔4天取一个值，如：当前25号下一个取20号，中间放过4天的值
            listResult = qureyListReportHalfYearsIsm(f.getReportId(), curDate,
                oldEastDate, "month_time desc limit 365");
            stepLen = 7;
        } else {
            listResult = qureyListReportHalfYearsIsm(f.getReportId(), curDate,
                oldEastDate, "month_time desc limit 53");
            stepLen = 1;
        }
        if (listResult.size() > 0) {
            // dataset = new DefaultCategoryDataset();
            timeseries = new TimeSeries("", "", "");
            int tempId = 0;
            colorMap = new HashMap<Integer, Paint>();
            PerformanceReportHalfyearsTempBean fmonths = null;
            for (int i = listResult.size() - 1; i >= 0;) {
                fmonths = listResult.get(i);
                bigDecTemp = formatBigDecimal(fmonths.getProfitRate());
                // if (Constant.FUND_NET_UPDATE_RANGE_DAY == f
                // .getFundNetUpdateRange()) {
                // timeseries.addOrUpdate(new Day(fmonths.getMonthTime()),
                // bigDecTemp.doubleValue());
                // } else {
                // timeseries.addOrUpdate(new Week(fmonths.getMonthTime()),
                // bigDecTemp.doubleValue());
                // }
                timeseries.addOrUpdate(new Week(fmonths.getMonthTime()),
                    bigDecTemp.doubleValue());
                if (bigDecFlag.compareTo(bigDecTemp) != 1) {
                    colorMap.put(tempId, JFreeChartBaseUtil.COLOR_1);
                } else {
                    colorMap.put(tempId, JFreeChartBaseUtil.COLOR_5);
                }
                tempId++;
                i = i - stepLen;
            }

            ChartFactory.setChartTheme(JFreeChartBaseUtil.chartTheme(null));
            pieChart = ChartFactory.createXYBarChart("", "", true, "",
                new TimeSeriesCollection(timeseries), PlotOrientation.VERTICAL,
                true, false, false);
            // ChartFactory.createXYBarChart("", xAxisLabel, dateAxis,
            // yAxisLabel, dataset)
            // pieChart = ChartFactory.createBarChart("", "", "回报率(%)", dataset,
            // PlotOrientation.VERTICAL, true, true, false);
            pieChart.getLegend().setVisible(false);
            plot = (XYPlot) pieChart.getPlot();
            CustomXYRenderer renderer = new CustomXYRenderer(colorMap);
            renderer.setMargin(0.3);
            renderer.setShadowVisible(false);
            renderer
                .setBaseItemLabelGenerator(new StandardXYItemLabelGenerator());
            renderer.setBarPainter(new StandardXYBarPainter());
            plot.setRenderer(renderer);
            // DateAxis dateaxis = (DateAxis) plot.getDomainAxis();
            // dateaxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
            DateAxis dateAxis = new DateAxis(" ") {
                @SuppressWarnings("unchecked")
                protected List<DateTick> refreshTicksHorizontal(Graphics2D g2,
                        Rectangle2D dataArea, RectangleEdge edge) {
                    List ticks = super.refreshTicksHorizontal(g2, dataArea,
                        edge);
                    List<DateTick> newTicks = new ArrayList<DateTick>();
                    for (Iterator it = ticks.iterator(); it.hasNext();) {
                        DateTick tick = (DateTick) it.next();
                        newTicks
                            .add(new DateTick(tick.getDate(), tick.getText(),
                                TextAnchor.TOP_RIGHT, TextAnchor.TOP_RIGHT, 0));
                        // -Math.PI / 8
                    }
                    return newTicks;
                }
            };
            dateAxis.setTickUnit(new DateTickUnit(DateTickUnitType.MONTH, 1,
                new SimpleDateFormat("yyyy/MM/dd")));
            dateAxis.setLowerMargin(0.01);
            dateAxis.setUpperMargin(0.01);
            plot.setDomainAxis(dateAxis);
            logger.info("开始生成图");
            webAppIds = saveChartToFilesaveSystem(pieChart, 1020, 240);
            maps.put(f.getReportId() + "_halfyears", webAppIds);
        }
        return maps;
    }

    private List<PerformanceReportHalfyearsTempBean> qureyListReportHalfYearsIsm(
            String reportId, Date curDate, Date oldEastDate, String orderBy) {
    	
        // ReportHalfYearsTempIsmBeanCriteria example = new
        // ReportHalfYearsTempIsmBeanCriteria();
        // ReportHalfYearsTempIsmBeanCriteria.Criteria c = example
        // .createCriteria();
        // c.andReportIdEqualTo(reportId);
        // if (curDate != null && oldEastDate != null) {
        // c.andMonthTimeLessThan(curDate)
        // .andMonthTimeGreaterThanOrEqualTo(oldEastDate);
        // }
        // if (StringUtils.isNotEmpty(orderBy))
        // example.setOrderByClause(orderBy);
        // return reportHalfYearsTempIsmBeanMapper.selectByExample(example);
    	List<PerformanceReportHalfyearsTempBean> list = new ArrayList<>();
        return list;
    }

    private BigDecimal formatBigDecimal(BigDecimal input) {
        return input != null ? new BigDecimal(input.doubleValue() * 100)
            .setScale(2, BigDecimal.ROUND_HALF_UP) : new BigDecimal(0.00);
    }

    /**
     * ---------------------------------new 周回报率分布图---------------------------------
     * @param f
     * @return 
     * @create: 2015年12月22日 下午2:52:43 lyuanx
     * @history:
     */
    private Map<String, Map<String, String>> chart_ism_report_weeknum(
            PerformanceReportReviseTempBean f) {
        DefaultCategoryDataset dataset = null;
        PerformanceReportWeeknumTempBean r = null, r2 = null;
        Map<String, Map<String, String>> maps = new HashMap<String, Map<String, String>>();

        List<PerformanceReportWeeknumTempBean> listResult = new ArrayList<>();
        if (listResult.size() > 0) {
            dataset = new DefaultCategoryDataset();
            for (int i = 0; i < listResult.size(); i++) {
                r = listResult.get(i);
                if (i == 0) {
                    dataset.addValue(r.getWeekNum(), "",
                        "<" + formatBigDecimal_0_5(r.getxAxis(),
                            r.getSectionMinUnit()) + "%");
                } else if (i == listResult.size() - 1) {
                    dataset.addValue(r.getWeekNum(), "",
                        formatBigDecimal_0_5(r.getxAxis(),
                            new BigDecimal("0.00")) + "%≦");// ≧
                } else {
                    r2 = listResult.get(i - 1);
                    dataset.addValue(r.getWeekNum(), "",
                        formatBigDecimal_0_5(r2.getxAxis(),
                            r.getSectionMinUnit()) + "%至"
                                + formatBigDecimal_0_5(r.getxAxis(),
                                    r.getSectionMinUnit())
                                + "%");
                }
            }
            logger.info("一共有:" + listResult.size() + "个点");
            ChartFactory.setChartTheme(JFreeChartBaseUtil.chartTheme(null));
            String str = "累计%s";
            //净值更新周期：日
            if (1 == f.getFundNetUpdateRange())
                str = String.format(str, "天数");
            else
                str = String.format(str, "周数");
            JFreeChart pieChart = ChartFactory.createBarChart("", "", str,
                dataset, PlotOrientation.VERTICAL, true, true, false);
            pieChart.getLegend().setVisible(false);
            CategoryPlot plot = (CategoryPlot) pieChart.getPlot();
            plot.getDomainAxis()
                .setCategoryLabelPositions(CategoryLabelPositions.UP_45);
            plot.getDomainAxis().setLowerMargin(0.01);
            plot.getDomainAxis().setUpperMargin(0.01);
            logger.info("开始生成图");
            maps.put(f.getReportId() + "_monthnum",
                saveChartToFilesaveSystem(pieChart, 1020, 240));
        }
        return maps;
    }

    private BigDecimal formatBigDecimal_0_5(BigDecimal input,
            BigDecimal offest) {
        return input != null
                ? new BigDecimal(
                    (input.doubleValue() + offest.doubleValue()) * 100)
                        .setScale(0, BigDecimal.ROUND_HALF_UP)
                : new BigDecimal(0.00);
    }

    /**
     * ---------------------------------上下浮捕获率对比图---------------------------------
     */
    private Map<String, Map<String, String>> chart_ism_report_float_temp(
            PerformanceReportReviseTempBean f, Date curDate, Date oldEastDate) {
        Map<String, String> webAppIds = null, webAppIds2 = null;
        Map<String, Map<String, String>> maps = new HashMap<String, Map<String, String>>();
        logger.info("上浮...");
        //float_type 1、上浮 
        webAppIds = queryIsmReportFloatTemp(f.getReportId(), f.getFundTempId(),
            1, curDate, oldEastDate);
        logger.info("下浮");
        //float_type 2、下浮
        webAppIds2 = queryIsmReportFloatTemp(f.getReportId(), f.getFundTempId(),
            2, curDate, oldEastDate);
        maps.put(f.getReportId() + "_up", webAppIds);
        maps.put(f.getReportId() + "_down", webAppIds2);
        return maps;
    }

    private Map<String, String> queryIsmReportFloatTemp(String reportId,
            String fundTempId, Integer floatType, Date curDate,
            Date oldEastDate) {
        List<PerformanceReportFloatTempBean> upFloat;
        DefaultCategoryDataset dataset = null;
        FundCoreBean fund = null;
        String chartShowFundName = "本基金";
        String chartShowHS300Name = "沪深300";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        JFreeChart pieChart = null;
        CategoryPlot plot = null;
        BarRenderer renderer = null;

        upFloat = new ArrayList<>();
        if (upFloat.size() > 0) {
            // 显示基金的名称
            fund = new FundCoreBean();
            // if (fund != null)
            // chartShowFundName = fund.getFundSimpleName();
            dataset = new DefaultCategoryDataset();
            for (PerformanceReportFloatTempBean rf : upFloat) {
            	//capture_type 2、本基金的
                if ("2".equals(rf.getCaptureType())) {
                    dataset.addValue(formatBigDecimal(rf.getProfit()),
                        chartShowFundName, sdf.format(rf.getCaptureMonth()));
                } else if ("1".equals(rf.getCaptureType())) {//capture_type 1、沪深300
                    dataset.addValue(formatBigDecimal(rf.getProfit()),
                        chartShowHS300Name, sdf.format(rf.getCaptureMonth()));
                }
            }
            logger.info("一共有:" + upFloat.size() + "个点");
            logger.info("开始生成图");
            ChartFactory.setChartTheme(JFreeChartBaseUtil.chartTheme(true));
            pieChart = ChartFactory.createBarChart("", "", "", dataset,
                PlotOrientation.VERTICAL, true, true, false);
            plot = (CategoryPlot) pieChart.getPlot();
            plot.getDomainAxis()
                .setCategoryLabelPositions(CategoryLabelPositions.UP_45);
            plot.getDomainAxis().setLowerMargin(0.01);
            plot.getDomainAxis().setUpperMargin(0.01);
            renderer = (BarRenderer) plot.getRenderer();
            renderer.setBarPainter(new StandardBarPainter());
            renderer.setItemMargin(-0.1);
            plot.setRenderer(renderer);// 使用我们设计的效果
            pieChart.getLegend().setBorder(BlockBorder.NONE);
            return saveChartToFilesaveSystem(pieChart, 1020, 240);
        }
        return null;
    }

    private Integer updateFundReportAppWebFileIds(
            PerformanceReportReviseTempBean f,
            Map<String, Map<String, String>> map) {
        // 1. mapsKey : reportId+"_vsvsvs" 内部:map key:web或app
        // 2. mapsKey : reportId+"_monthreturn" 内部:map key:web或app
        // 3. mapsKey : reportId+"_monthnum"内部:map key:web或app
        // 4. 5. mapsKey : reportId+"_up" 和 reportId+"_down"内部:map key:web或app
        Map<String, String> m = null;
        StringBuffer sbweb = null;
        // String newSql = "update ism_fundreport set
        // app_fileid_list='%s',web_fileid_list='%s' where report_id='%s'";
        Integer count = 0;
        PerformanceReportReviseTempBean record = null;
        sbweb = new StringBuffer();
        m = map.get(f.getReportId() + "_vsvsvs");
        if (m != null) {
            sbweb.append(m.get("web"));
        }
        sbweb.append(";");
        // m = map.get(f.getReportId() + "_monthreturn");
        m = map.get(f.getReportId() + "_halfyears");
        if (m != null) {
            sbweb.append(m.get("web"));
        }
        sbweb.append(";");
        m = map.get(f.getReportId() + "_monthnum");
        if (m != null) {
            sbweb.append(m.get("web"));
        }
        sbweb.append(";");
        m = map.get(f.getReportId() + "_up");
        if (m != null) {
            sbweb.append(m.get("web"));
        }
        sbweb.append(";");
        m = map.get(f.getReportId() + "_down");
        if (m != null) {
            sbweb.append(m.get("web"));
        }
        /*
         * String sql = String.format(newSql,
         * sbapp.toString(),sbweb.toString(),f.getReportId());
         * System.err.println(sql); count += jfreeChartExtendDaoMapper.
         * insertOrUpdateBatchFundreportTempToFundreport(sql);
         */
        record = new PerformanceReportReviseTempBean();
        record.setBuildFileidList(sbweb.toString());
        record.setReportId(f.getReportId());
        count += 1;
        return count;
    }

    /**
     * ----------------------------- 生成 文件 ----------------------------- 
     * @param chart
     * @param width
     * @param height
     * @return 
     * @create: Jul 14, 2016 4:55:34 PM lyuanx
     * @history:
     */
    private Map<String, String> saveChartToFilesaveSystem(JFreeChart chart,
            int width, int height) {
        File file;
        Long pre = System.currentTimeMillis();
        List<FileIsmBean> fileList = null;
        Random r = new Random(pre);
        String srcFileName = pre + r.nextInt(10) + "";
        Map<String, String> map = new HashMap<String, String>();
        try {
            file = File.createTempFile(srcFileName, ".png");
            logger.info("chart生成图....");
            ChartUtilities.saveChartAsJPEG(file, chart, width, height);
            logger.info("开始保存图");
            System.out.println(file.getAbsolutePath());
            // 这里的文件中心 文件存磁盘上，而ism_file表不写内容
            fileList = new ArrayList<>();
            for (FileIsmBean fpng : fileList) {
                map.put("web", fpng.getFileId());
            }
            // 不生成 缩略图
            // File fileThumb = File.createTempFile(srcFileName + "_thumbn",
            // ".png");
            // logger.info("保存缩略图");
            // Thumbnails.of(file).size(1158, 320).keepAspectRatio(false)
            // .toFile(fileThumb);
            // fileList = fileService.save(new File[] { fileThumb }, null);
            // for (FileIsmBean fpng : fileList) {
            // map.put("app", fpng.getFileId());
            // }
            return map;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void savePdf(String reportId) {
        String buildReportPath = null;
        PerformanceReportReviseTempBean record = null;
        try {
            // 这个调了 太牛B的东西 出错可能性极高
            buildReportPath = htmlConvertToPdf(reportId);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (buildReportPath != null) {
            record = new PerformanceReportReviseTempBean();
            record.setReportId(reportId);
            record.setBuildReportStatus(1);//基金评价报告 -> 报告状态report_status 1、可见 
            record.setBuildReportDate(new Date());
            record.setBuildReportPath(buildReportPath);
            //数据库保存
        }
    }

    /**
     * ---------------------------------年度业绩 ---------------------------------
     * @param reportId
     * @param performanceType
     * @return 
     * @create: Jul 15, 2016 8:10:28 AM lyuanx
     * @history:
     */
    public List<PerformanceReportYearPerformanceTempBean> queryIsmReportYearPerformance(
            String reportId, Integer performanceType) {
        PerformanceReportReviseTempBean fundReport = queryPerformanceReportByReportId(
            reportId);
        if (fundReport == null) return null;
        return new ArrayList<>();
    }

    /**
     * ---------------------------------绩效分析 ---------------------------------
     * @param reportId
     * @return com.hundsun.internet.ism.model.ReportAchievementsIsmBean 对象   或 null
     */
    public PerformanceReportAchievementTempBean queryReportAchievementsIsmBeanByFundId(
            String reportId) {
        PerformanceReportReviseTempBean fundReport = queryPerformanceReportByReportId(
            reportId);
        if (fundReport == null)
            return null;
        return new PerformanceReportAchievementTempBean();
    }

    public List<Integer> getYears(Integer reportYear) {
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        // Integer curYear = Integer.parseInt(sdf.format(new Date()));
        List<Integer> sectionYears = new ArrayList<Integer>();
        // 以下 顺序不能换!!!!
        sectionYears.add(1);
        sectionYears.add(reportYear - 1);
        sectionYears.add(reportYear - 2);
        sectionYears.add(reportYear - 3);
        sectionYears.add(reportYear - 4);
        return sectionYears;
    }

    /**
     * ---------------------------------风险评估指标 ---------------------------------
     * @param reportId
     * @return 
     * @create: Jul 15, 2016 8:42:16 AM lyuanx
     * @history:
     */
    public List<PerformanceReportRiskTempBean> queryIsmReportRiskByFundId(
            String reportId) {
        PerformanceReportReviseTempBean fundReport = queryPerformanceReportByReportId(
            reportId);
        if (fundReport == null)
            return null;
        return new ArrayList<>();

    }

    /**
     * ---------------------------------回报分析---------------------------------
     * @param reportId
     * @return 
     * @create: 2015年12月22日 上午9:48:27 lyuanx
     * @history:
     */
    public List<PerformanceReportReturnprofitTempBean> queryIsmReportReturnProfit(
            String reportId) {
        PerformanceReportReviseTempBean fundReport = queryPerformanceReportByReportId(
            reportId);
        if (fundReport == null)
            return null;
        return new ArrayList<>();
    }

    /**
     * ---------------------------------回撤分析---------------------------------
     * @param reportId
     * @return 
     * @create: 2015年12月22日 上午9:50:25 lyuanx
     * @history:
     */
    public List<PerformanceReportReturnwithdrawTempBean> queryIsmReportReturnWithdraw(
            String reportId) {
        PerformanceReportReviseTempBean fundReport = queryPerformanceReportByReportId(
            reportId);
        if (fundReport == null)
            return null;
        return new ArrayList<>();
    }

    /**
     * ---------------------------------相关指数矩阵---------------------------------
     * @param fundId
     * @return 
     * 
     *  如果 没有 或 基金ID查询不到报告 则返回null
     */
    public List<PerformanceReportMatrixTempBean> queryReportMatrixByFundId(
            String reportId) {
        PerformanceReportReviseTempBean fundReport = queryPerformanceReportByReportId(
            reportId);
        if (fundReport == null)
            return null;
        return new ArrayList<>();
    }

    public List<Integer> getFullYears(Integer reportYear) {
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        // Integer curYear = Integer.parseInt(sdf.format(new Date()));
        List<Integer> sectionYears = new ArrayList<Integer>();
        // 以下 顺序不能换!!!!
        sectionYears.add(reportYear);
        sectionYears.add(reportYear - 1);
        sectionYears.add(reportYear - 2);
        sectionYears.add(reportYear - 3);
        return sectionYears;
    }

    /**
     * ---------------------------------历史业绩---------------------------------
     */
    public List<PerformanceReportHistoryperformanceTempBean> queryIsmReportHistoryperformanceByFundId(
            String reportId) {
        PerformanceReportReviseTempBean fundReport = queryPerformanceReportByReportId(
            reportId);
        if (fundReport == null)
            return null;
        return new ArrayList<>();
    }

    /**
     * ---------------------------------历史净值报告---------------------------------
     */
    public List<PerformanceReporthistorynetTempBean> queryIsmReportHistorynet(
            String reportId) {
        PerformanceReportReviseTempBean fundReport = queryPerformanceReportByReportId(
            reportId);
        if (fundReport == null)
            return null;
        return new ArrayList<>();
    }

    //////////////////////////////////////// 华丽的分界线//////////////////////////////////////

    /**
     * 
     * @throws IOException 
     * @throws InterruptedException 
     * @see com.hundsun.internet.ism.service.jfreechart.ChartViewService#htmlConvertToPdf(java.lang.String)
     */
    public String htmlConvertToPdf(String reportId)
            throws IOException, InterruptedException {
        // html to pdf :http://wkhtmltopdf.org/
        // 调用 报表服务页 转化成 PDF 保存到 文件中心 web :/w/report/{reportId}
        String result = null;
        String url = "http://127.0.0.1:8080/w/report/pdf/" + reportId;
        url = "E:/hswork/i私募项目相关/reportpdf/product_report.html";
        //url = "http://127.0.0.1:9710/m/report/pdf";
        PerformanceReportReviseTempBean report = new PerformanceReportReviseTempBean();
        report.setFundTempId(UUID.randomUUID().toString());
        report.setReportTime(new Date());
        // 下面拼接成如：/data/documents/documentationCenter/pdf/报告对应的基金ID_报告日期.pdf
        // File fileDir = new File(FileServiceImpl.getRootPath() + "pdf/");
        // if (!fileDir.exists())
        // fileDir.mkdirs();
        // File file = File.createTempFile(
        // report.getFundTempId() + "_" + new SimpleDateFormat("yyyyMMdd")
        // .format(report.getReportTime()),
        // ".pdf", fileDir);
        File file = File.createTempFile(
            report.getFundTempId() + "_" + new SimpleDateFormat("yyyyMMdd")
                .format(report.getReportTime()),
            ".pdf");
        String[] command = getCommand(url, file.getAbsolutePath());
        logger.info("html convert to pdf command:" + command);
        if (command != null) {
            Process pre = Runtime.getRuntime().exec(command);
            StreamGobbler errorGobbler = new StreamGobbler(pre.getErrorStream(),
                "ERROR");
            errorGobbler.start();
            StreamGobbler outGobbler = new StreamGobbler(pre.getInputStream(),
                "STDOUT");
            outGobbler.start();
            int exit = pre.waitFor();
            // if (exit == 0) {// 正常终止
            if (exit == 0 || file.exists()) {
                FileIsmBean bf = new FileIsmBean();
                String fileName = file.getName();
                String fileId = java.util.UUID.randomUUID().toString();
                String filePath = Util.getDateString(new Date()) + "/";
                // 报告
                // FundReportTempIsmBean fundReport = queryFundReportIsmTemp(
                // reportId);
                PerformanceReportReviseTempBean fundReport = queryPerformanceReportByReportId(
                    reportId);
                fundReport.setLastNetTime(new Date());
                // 基金
                FundCoreBean fund = new FundCoreBean();
                fund.setFundName("测试报告");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月业绩分析报告");
                bf.setAliasName(fund.getFundName()
                        + sdf.format(fundReport.getLastNetTime()) + ".pdf");// 文档的下载名
                bf.setCreatDate(Calendar.getInstance().getTime());
                bf.setExtendName("pdf");
                bf.setFileId(fileId);
                bf.setFileName(fileName);
                bf.setFilePath(filePath);
                bf.setFileSize(file.length());
                bf.setSecurityClass("LoginPermision");
                fileId = this.saveFile(file, bf);// 文件存入
                // 文件中心
                if (StringUtils.isNotBlank(fileId)) {
                    result = fileId;
                }
            } else {
                logger.info("htmlConvertToPdf方法中：reportId为" + reportId
                        + ",exit为" + exit + ",时间在" + new Date() + "时存入文件中心失败");
            }
        }
        return result;
    }
    
    public String saveFile(File file, FileIsmBean bf) {
        // 写文件到目的
        try {
            // 创建文件及目录
            String tempFilePath = "F:/pdffiles/" + bf.getFilePath()
                    + bf.getFileId() + ".pdf";
            tempFilePath = "F:/pdffiles/20170605/中信信托－汇利优选证券投资集合资金信托计划2017年6月业绩分析报告.pdf";
            File tempFile = new File(tempFilePath);
            File parentFile = tempFile.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            tempFile.createNewFile();

            FileInputStream fis = new FileInputStream(file);
            this.inputstreamtofile(fis, new File(tempFilePath));
        } catch (IOException e) {
            logger.error("将文件写入磁盘失败", e);
            return null;
        }
        return UUID.randomUUID().toString();
    }
    
    public void inputstreamtofile(InputStream ins, File file) {
        OutputStream os = null;
        try {
            os = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int bytesRead = 0;
        byte[] buffer = new byte[8192];
        try {
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
                buffer = new byte[8192];
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            os.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            ins.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private String[] getCommand(String htmlName, String pdfName) {
        String system = System.getProperty("os.name");
        String[] cmd = null;
        if (system.toLowerCase().indexOf("windows") > -1) { // windows系统
            cmd = new String[] { "cmd.exe", "/C",
                    WINDOWS_WKHTMLTOPDF_PATH + htmlName + " "
                            + pdfName + "" };
            return cmd;
        } else if (system.toLowerCase().indexOf("linux") > -1
                || system.toLowerCase().indexOf("mac") > -1) { // linux 系统 Mac
                                                               // OS X
            cmd = new String[] { "/bin/sh", "-c", LINUX_OR_MAC_WKHTMLTOPDF_PATH
                    + htmlName + " " + pdfName + "" };
            return cmd;
        }
        return cmd;
    }

    public PerformanceReportReviseTempBean queryPerformanceReportByReportId(
            String reportId) {
        return new PerformanceReportReviseTempBean();
    }

	@Override
	public FundCoreBean queryFundCoreByFundId(String fundId) {
		return new FundCoreBean();
	}
	
	@Test
	public void testPdf() {
		ChartViewNewServiceImpl impl = new ChartViewNewServiceImpl();
		try {
			String str = impl.htmlConvertToPdf(null);
			System.out.println(str);
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
