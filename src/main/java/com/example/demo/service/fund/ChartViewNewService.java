package com.example.demo.service.fund;

import java.text.ParseException;
import java.util.List;

import com.example.demo.model.fund.FundCoreBean;
import com.example.demo.model.fund.PerformanceReportAchievementTempBean;
import com.example.demo.model.fund.PerformanceReportHistoryperformanceTempBean;
import com.example.demo.model.fund.PerformanceReportMatrixTempBean;
import com.example.demo.model.fund.PerformanceReportReturnprofitTempBean;
import com.example.demo.model.fund.PerformanceReportReturnwithdrawTempBean;
import com.example.demo.model.fund.PerformanceReportReviseTempBean;
import com.example.demo.model.fund.PerformanceReportRiskTempBean;
import com.example.demo.model.fund.PerformanceReportYearPerformanceTempBean;
import com.example.demo.model.fund.PerformanceReporthistorynetTempBean;

public interface ChartViewNewService {
    void buildPdf() throws ParseException;

    PerformanceReportReviseTempBean queryPerformanceReportByReportId(
            String reportId);

    FundCoreBean queryFundCoreByFundId(String fundId);

    List<Integer> getYears(Integer reportYear);

    List<PerformanceReportYearPerformanceTempBean> queryIsmReportYearPerformance(
            String reportId, Integer performanceType);

    PerformanceReportAchievementTempBean queryReportAchievementsIsmBeanByFundId(
            String reportId);

    List<PerformanceReportRiskTempBean> queryIsmReportRiskByFundId(
            String reportId);

    List<PerformanceReportReturnprofitTempBean> queryIsmReportReturnProfit(
            String reportId);

    List<PerformanceReportReturnwithdrawTempBean> queryIsmReportReturnWithdraw(
            String reportId);

    List<PerformanceReportMatrixTempBean> queryReportMatrixByFundId(
            String reportId);

    List<Integer> getFullYears(Integer reportYear);

    List<PerformanceReportHistoryperformanceTempBean> queryIsmReportHistoryperformanceByFundId(
            String reportId);

    List<PerformanceReporthistorynetTempBean> queryIsmReportHistorynet(
            String reportId);
}
