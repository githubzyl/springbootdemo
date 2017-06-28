package com.example.demo.controller.fund;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
import com.example.demo.service.fund.ChartViewNewService;

@Controller
public class ChartViewController extends IsmBaseController {
	
	@Autowired
	private ChartViewNewService chartViewNewService;

	private static final String SHOW_REPORT_VIEW = "/im/fund/pro_report";

	@RequestMapping(value = "/w/report/{reportId}", method = { RequestMethod.GET, RequestMethod.POST })
	public String showReport(HttpServletRequest request, HttpServletResponse response, Model model,
			@PathVariable String reportId) {
		model.addAttribute("isNotShowLayout", true);
		PerformanceReportReviseTempBean report = new PerformanceReportReviseTempBean();
		model.addAttribute("fundInfo", new FundCoreBean());
		/*
		 * 1.年度业绩 2.绩效分析 3.风险评估指标 4.相关指数矩阵 其他 图 5.历史业绩 6.历史净值
		 */
		// 年度业绩
		List<Integer> eachYear = new ArrayList<>();
		model.addAttribute("eachYear", eachYear);
		List<PerformanceReportYearPerformanceTempBean> reportYearPerformance = new ArrayList<>();
		model.addAttribute("reportYearPerformance", reportYearPerformance);
		List<PerformanceReportYearPerformanceTempBean> reportYearPerformanceHS300 = new ArrayList<>();
		model.addAttribute("reportYearPerformanceHS300", reportYearPerformanceHS300);

		// 绩效分析
		PerformanceReportAchievementTempBean reportAchievements = new PerformanceReportAchievementTempBean();
		model.addAttribute("reportAchievements", reportAchievements);

		// 增加：回撤分析 回报分析
		PerformanceReportReturnwithdrawTempBean reportReturnwithdraw = new PerformanceReportReturnwithdrawTempBean();
		model.addAttribute("reportReturnwithdraw", reportReturnwithdraw);
		PerformanceReportReturnprofitTempBean reportReturnprofit = new PerformanceReportReturnprofitTempBean();
		model.addAttribute("reportReturnprofit", reportReturnprofit);

		// 风险评估指标
		PerformanceReportRiskTempBean reportRisk = new PerformanceReportRiskTempBean();
		model.addAttribute("reportRisk", reportRisk);

		// 相关指数矩阵
		PerformanceReportMatrixTempBean reportMatrix = new PerformanceReportMatrixTempBean();
		model.addAttribute("reportMatrix", reportMatrix);

		List<Integer> fullYears = new ArrayList<>();
		model.addAttribute("fullYears", fullYears);

		// 图
		String buildFileidList = "chart_vsvsvs;chart_monthreturn;chart_monthnum;chart_up;chart_down";
		if (buildFileidList != null) {
			String[] strs = buildFileidList.split(";");
			int i = 0;
			if (strs.length > i) // 本基金 vs 沪深300 vs 上证指数 vs 深证成指
				model.addAttribute("chart_vsvsvs", strs[i]);
			i++;
			if (strs.length > i) //
				model.addAttribute("chart_monthreturn", strs[i]);
			i++;
			if (strs.length > i) //
				model.addAttribute("chart_monthnum", strs[i]);
			i++;
			if (strs.length > i) // 上浮捕获率对比图
				model.addAttribute("chart_up", strs[i]);
			i++;
			if (strs.length > i) // 下浮捕获率对比图
				model.addAttribute("chart_down", strs[i]);
			i++;
		}
		// 历史业绩
		PerformanceReportHistoryperformanceTempBean reportHistoryPerformance = new PerformanceReportHistoryperformanceTempBean();
		model.addAttribute("reportHistoryPerformance", reportHistoryPerformance);
		// 历史净值
		PerformanceReporthistorynetTempBean reportHistoryNet = new PerformanceReporthistorynetTempBean();
		model.addAttribute("reportHistoryNet", reportHistoryNet);

		model.addAttribute("report", report);

		String sessionId = "";
		model.addAttribute("sessionId", sessionId);

		if (1 == report.getFundNetUpdateRange()) {
			model.addAttribute("tian", "天");
			model.addAttribute("ri", "日");
		} else {
			model.addAttribute("zhou", "周");
		}
		return super.go(SHOW_REPORT_VIEW, model, false, true);

	}

	@RequestMapping(value = "/w/report/pdf/{reportId}", method = { RequestMethod.GET, RequestMethod.POST })
	public String showPDfReport(HttpServletRequest request, HttpServletResponse response, Model model,
			@PathVariable String reportId) {
		model.addAttribute("showDownloadPdf", "no");// 只是多传一个参数用来 打印PDF时不用下载按钮
		return showReport(request, response, model, reportId);
	}

    @RequestMapping(value = "/ism/admin/report/newRebuild", produces = "text/html; charset=utf-8")
    @ResponseBody
    public String rebuild(HttpServletRequest request,
            HttpServletResponse response, Model model)
            throws IOException, ParseException {
    	chartViewNewService.buildPdf();
        return null;
    }

}
