package com.example.demo.model.fund;

import java.io.Serializable;
import java.math.BigDecimal;

public class PerformanceReportWeeknumTempBean implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_weeknum_temp.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_weeknum_temp.report_id
     *
     * @mbggenerated
     */
    private String reportId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_weeknum_temp.x_axis
     *
     * @mbggenerated
     */
    private BigDecimal xAxis;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_weeknum_temp.section_min
     *
     * @mbggenerated
     */
    private BigDecimal sectionMin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_weeknum_temp.section_max
     *
     * @mbggenerated
     */
    private BigDecimal sectionMax;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_weeknum_temp.section_min_unit
     *
     * @mbggenerated
     */
    private BigDecimal sectionMinUnit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_weeknum_temp.week_num
     *
     * @mbggenerated
     */
    private Integer weekNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table performance_report_weeknum_temp
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_weeknum_temp.id
     *
     * @return the value of performance_report_weeknum_temp.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_weeknum_temp.id
     *
     * @param id the value for performance_report_weeknum_temp.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_weeknum_temp.report_id
     *
     * @return the value of performance_report_weeknum_temp.report_id
     *
     * @mbggenerated
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_weeknum_temp.report_id
     *
     * @param reportId the value for performance_report_weeknum_temp.report_id
     *
     * @mbggenerated
     */
    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_weeknum_temp.x_axis
     *
     * @return the value of performance_report_weeknum_temp.x_axis
     *
     * @mbggenerated
     */
    public BigDecimal getxAxis() {
        return xAxis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_weeknum_temp.x_axis
     *
     * @param xAxis the value for performance_report_weeknum_temp.x_axis
     *
     * @mbggenerated
     */
    public void setxAxis(BigDecimal xAxis) {
        this.xAxis = xAxis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_weeknum_temp.section_min
     *
     * @return the value of performance_report_weeknum_temp.section_min
     *
     * @mbggenerated
     */
    public BigDecimal getSectionMin() {
        return sectionMin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_weeknum_temp.section_min
     *
     * @param sectionMin the value for performance_report_weeknum_temp.section_min
     *
     * @mbggenerated
     */
    public void setSectionMin(BigDecimal sectionMin) {
        this.sectionMin = sectionMin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_weeknum_temp.section_max
     *
     * @return the value of performance_report_weeknum_temp.section_max
     *
     * @mbggenerated
     */
    public BigDecimal getSectionMax() {
        return sectionMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_weeknum_temp.section_max
     *
     * @param sectionMax the value for performance_report_weeknum_temp.section_max
     *
     * @mbggenerated
     */
    public void setSectionMax(BigDecimal sectionMax) {
        this.sectionMax = sectionMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_weeknum_temp.section_min_unit
     *
     * @return the value of performance_report_weeknum_temp.section_min_unit
     *
     * @mbggenerated
     */
    public BigDecimal getSectionMinUnit() {
        return sectionMinUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_weeknum_temp.section_min_unit
     *
     * @param sectionMinUnit the value for performance_report_weeknum_temp.section_min_unit
     *
     * @mbggenerated
     */
    public void setSectionMinUnit(BigDecimal sectionMinUnit) {
        this.sectionMinUnit = sectionMinUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_weeknum_temp.week_num
     *
     * @return the value of performance_report_weeknum_temp.week_num
     *
     * @mbggenerated
     */
    public Integer getWeekNum() {
        return weekNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_weeknum_temp.week_num
     *
     * @param weekNum the value for performance_report_weeknum_temp.week_num
     *
     * @mbggenerated
     */
    public void setWeekNum(Integer weekNum) {
        this.weekNum = weekNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_report_weeknum_temp
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
        PerformanceReportWeeknumTempBean other = (PerformanceReportWeeknumTempBean) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReportId() == null ? other.getReportId() == null : this.getReportId().equals(other.getReportId()))
            && (this.getxAxis() == null ? other.getxAxis() == null : this.getxAxis().equals(other.getxAxis()))
            && (this.getSectionMin() == null ? other.getSectionMin() == null : this.getSectionMin().equals(other.getSectionMin()))
            && (this.getSectionMax() == null ? other.getSectionMax() == null : this.getSectionMax().equals(other.getSectionMax()))
            && (this.getSectionMinUnit() == null ? other.getSectionMinUnit() == null : this.getSectionMinUnit().equals(other.getSectionMinUnit()))
            && (this.getWeekNum() == null ? other.getWeekNum() == null : this.getWeekNum().equals(other.getWeekNum()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_report_weeknum_temp
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReportId() == null) ? 0 : getReportId().hashCode());
        result = prime * result + ((getxAxis() == null) ? 0 : getxAxis().hashCode());
        result = prime * result + ((getSectionMin() == null) ? 0 : getSectionMin().hashCode());
        result = prime * result + ((getSectionMax() == null) ? 0 : getSectionMax().hashCode());
        result = prime * result + ((getSectionMinUnit() == null) ? 0 : getSectionMinUnit().hashCode());
        result = prime * result + ((getWeekNum() == null) ? 0 : getWeekNum().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_report_weeknum_temp
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
        sb.append(", xAxis=").append(xAxis);
        sb.append(", sectionMin=").append(sectionMin);
        sb.append(", sectionMax=").append(sectionMax);
        sb.append(", sectionMinUnit=").append(sectionMinUnit);
        sb.append(", weekNum=").append(weekNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}