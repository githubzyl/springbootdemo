package com.example.demo.model.fund;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PerformanceReportFloatTempBean implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_float_temp.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_float_temp.report_id
     *
     * @mbggenerated
     */
    private String reportId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_float_temp.float_type
     *
     * @mbggenerated
     */
    private Integer floatType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_float_temp.capture_type
     *
     * @mbggenerated
     */
    private Integer captureType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_float_temp.capture_month
     *
     * @mbggenerated
     */
    private Date captureMonth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_float_temp.profit
     *
     * @mbggenerated
     */
    private BigDecimal profit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table performance_report_float_temp
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_float_temp.id
     *
     * @return the value of performance_report_float_temp.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_float_temp.id
     *
     * @param id the value for performance_report_float_temp.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_float_temp.report_id
     *
     * @return the value of performance_report_float_temp.report_id
     *
     * @mbggenerated
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_float_temp.report_id
     *
     * @param reportId the value for performance_report_float_temp.report_id
     *
     * @mbggenerated
     */
    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_float_temp.float_type
     *
     * @return the value of performance_report_float_temp.float_type
     *
     * @mbggenerated
     */
    public Integer getFloatType() {
        return floatType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_float_temp.float_type
     *
     * @param floatType the value for performance_report_float_temp.float_type
     *
     * @mbggenerated
     */
    public void setFloatType(Integer floatType) {
        this.floatType = floatType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_float_temp.capture_type
     *
     * @return the value of performance_report_float_temp.capture_type
     *
     * @mbggenerated
     */
    public Integer getCaptureType() {
        return captureType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_float_temp.capture_type
     *
     * @param captureType the value for performance_report_float_temp.capture_type
     *
     * @mbggenerated
     */
    public void setCaptureType(Integer captureType) {
        this.captureType = captureType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_float_temp.capture_month
     *
     * @return the value of performance_report_float_temp.capture_month
     *
     * @mbggenerated
     */
    public Date getCaptureMonth() {
        return captureMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_float_temp.capture_month
     *
     * @param captureMonth the value for performance_report_float_temp.capture_month
     *
     * @mbggenerated
     */
    public void setCaptureMonth(Date captureMonth) {
        this.captureMonth = captureMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_float_temp.profit
     *
     * @return the value of performance_report_float_temp.profit
     *
     * @mbggenerated
     */
    public BigDecimal getProfit() {
        return profit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_float_temp.profit
     *
     * @param profit the value for performance_report_float_temp.profit
     *
     * @mbggenerated
     */
    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_report_float_temp
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
        PerformanceReportFloatTempBean other = (PerformanceReportFloatTempBean) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReportId() == null ? other.getReportId() == null : this.getReportId().equals(other.getReportId()))
            && (this.getFloatType() == null ? other.getFloatType() == null : this.getFloatType().equals(other.getFloatType()))
            && (this.getCaptureType() == null ? other.getCaptureType() == null : this.getCaptureType().equals(other.getCaptureType()))
            && (this.getCaptureMonth() == null ? other.getCaptureMonth() == null : this.getCaptureMonth().equals(other.getCaptureMonth()))
            && (this.getProfit() == null ? other.getProfit() == null : this.getProfit().equals(other.getProfit()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_report_float_temp
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReportId() == null) ? 0 : getReportId().hashCode());
        result = prime * result + ((getFloatType() == null) ? 0 : getFloatType().hashCode());
        result = prime * result + ((getCaptureType() == null) ? 0 : getCaptureType().hashCode());
        result = prime * result + ((getCaptureMonth() == null) ? 0 : getCaptureMonth().hashCode());
        result = prime * result + ((getProfit() == null) ? 0 : getProfit().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_report_float_temp
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
        sb.append(", floatType=").append(floatType);
        sb.append(", captureType=").append(captureType);
        sb.append(", captureMonth=").append(captureMonth);
        sb.append(", profit=").append(profit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}