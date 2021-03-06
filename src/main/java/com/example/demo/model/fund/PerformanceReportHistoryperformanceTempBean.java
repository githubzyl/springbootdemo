package com.example.demo.model.fund;

import java.io.Serializable;
import java.math.BigDecimal;

public class PerformanceReportHistoryperformanceTempBean implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_historyperformance_temp.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_historyperformance_temp.report_id
     *
     * @mbggenerated
     */
    private String reportId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_historyperformance_temp.years
     *
     * @mbggenerated
     */
    private Integer years;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_historyperformance_temp.months
     *
     * @mbggenerated
     */
    private Integer months;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_historyperformance_temp.month_profit
     *
     * @mbggenerated
     */
    private BigDecimal monthProfit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_historyperformance_temp.year_profit
     *
     * @mbggenerated
     */
    private BigDecimal yearProfit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table performance_report_historyperformance_temp
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_historyperformance_temp.id
     *
     * @return the value of performance_report_historyperformance_temp.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_historyperformance_temp.id
     *
     * @param id the value for performance_report_historyperformance_temp.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_historyperformance_temp.report_id
     *
     * @return the value of performance_report_historyperformance_temp.report_id
     *
     * @mbggenerated
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_historyperformance_temp.report_id
     *
     * @param reportId the value for performance_report_historyperformance_temp.report_id
     *
     * @mbggenerated
     */
    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_historyperformance_temp.years
     *
     * @return the value of performance_report_historyperformance_temp.years
     *
     * @mbggenerated
     */
    public Integer getYears() {
        return years;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_historyperformance_temp.years
     *
     * @param years the value for performance_report_historyperformance_temp.years
     *
     * @mbggenerated
     */
    public void setYears(Integer years) {
        this.years = years;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_historyperformance_temp.months
     *
     * @return the value of performance_report_historyperformance_temp.months
     *
     * @mbggenerated
     */
    public Integer getMonths() {
        return months;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_historyperformance_temp.months
     *
     * @param months the value for performance_report_historyperformance_temp.months
     *
     * @mbggenerated
     */
    public void setMonths(Integer months) {
        this.months = months;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_historyperformance_temp.month_profit
     *
     * @return the value of performance_report_historyperformance_temp.month_profit
     *
     * @mbggenerated
     */
    public BigDecimal getMonthProfit() {
        return monthProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_historyperformance_temp.month_profit
     *
     * @param monthProfit the value for performance_report_historyperformance_temp.month_profit
     *
     * @mbggenerated
     */
    public void setMonthProfit(BigDecimal monthProfit) {
        this.monthProfit = monthProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_historyperformance_temp.year_profit
     *
     * @return the value of performance_report_historyperformance_temp.year_profit
     *
     * @mbggenerated
     */
    public BigDecimal getYearProfit() {
        return yearProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_historyperformance_temp.year_profit
     *
     * @param yearProfit the value for performance_report_historyperformance_temp.year_profit
     *
     * @mbggenerated
     */
    public void setYearProfit(BigDecimal yearProfit) {
        this.yearProfit = yearProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_report_historyperformance_temp
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PerformanceReportHistoryperformanceTempBean other = (PerformanceReportHistoryperformanceTempBean) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReportId() == null ? other.getReportId() == null : this.getReportId().equals(other.getReportId()))
            && (this.getYears() == null ? other.getYears() == null : this.getYears().equals(other.getYears()))
            && (this.getMonths() == null ? other.getMonths() == null : this.getMonths().equals(other.getMonths()))
            && (this.getMonthProfit() == null ? other.getMonthProfit() == null : this.getMonthProfit().equals(other.getMonthProfit()))
            && (this.getYearProfit() == null ? other.getYearProfit() == null : this.getYearProfit().equals(other.getYearProfit()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_report_historyperformance_temp
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReportId() == null) ? 0 : getReportId().hashCode());
        result = prime * result + ((getYears() == null) ? 0 : getYears().hashCode());
        result = prime * result + ((getMonths() == null) ? 0 : getMonths().hashCode());
        result = prime * result + ((getMonthProfit() == null) ? 0 : getMonthProfit().hashCode());
        result = prime * result + ((getYearProfit() == null) ? 0 : getYearProfit().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_report_historyperformance_temp
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", reportId=").append(reportId);
        sb.append(", years=").append(years);
        sb.append(", months=").append(months);
        sb.append(", monthProfit=").append(monthProfit);
        sb.append(", yearProfit=").append(yearProfit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}