package com.example.demo.model.fund;

import java.io.Serializable;
import java.math.BigDecimal;

public class PerformanceReportMatrixTempBean implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_matrix_temp.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_matrix_temp.report_id
     *
     * @mbggenerated
     */
    private String reportId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_matrix_temp.matrix_id
     *
     * @mbggenerated
     */
    private String matrixId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_matrix_temp.matrix_type
     *
     * @mbggenerated
     */
    private Integer matrixType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_matrix_temp.matrix_result
     *
     * @mbggenerated
     */
    private BigDecimal matrixResult;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_matrix_temp.week_num
     *
     * @mbggenerated
     */
    private Integer weekNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table performance_report_matrix_temp
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_matrix_temp.id
     *
     * @return the value of performance_report_matrix_temp.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_matrix_temp.id
     *
     * @param id the value for performance_report_matrix_temp.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_matrix_temp.report_id
     *
     * @return the value of performance_report_matrix_temp.report_id
     *
     * @mbggenerated
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_matrix_temp.report_id
     *
     * @param reportId the value for performance_report_matrix_temp.report_id
     *
     * @mbggenerated
     */
    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_matrix_temp.matrix_id
     *
     * @return the value of performance_report_matrix_temp.matrix_id
     *
     * @mbggenerated
     */
    public String getMatrixId() {
        return matrixId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_matrix_temp.matrix_id
     *
     * @param matrixId the value for performance_report_matrix_temp.matrix_id
     *
     * @mbggenerated
     */
    public void setMatrixId(String matrixId) {
        this.matrixId = matrixId == null ? null : matrixId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_matrix_temp.matrix_type
     *
     * @return the value of performance_report_matrix_temp.matrix_type
     *
     * @mbggenerated
     */
    public Integer getMatrixType() {
        return matrixType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_matrix_temp.matrix_type
     *
     * @param matrixType the value for performance_report_matrix_temp.matrix_type
     *
     * @mbggenerated
     */
    public void setMatrixType(Integer matrixType) {
        this.matrixType = matrixType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_matrix_temp.matrix_result
     *
     * @return the value of performance_report_matrix_temp.matrix_result
     *
     * @mbggenerated
     */
    public BigDecimal getMatrixResult() {
        return matrixResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_matrix_temp.matrix_result
     *
     * @param matrixResult the value for performance_report_matrix_temp.matrix_result
     *
     * @mbggenerated
     */
    public void setMatrixResult(BigDecimal matrixResult) {
        this.matrixResult = matrixResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_matrix_temp.week_num
     *
     * @return the value of performance_report_matrix_temp.week_num
     *
     * @mbggenerated
     */
    public Integer getWeekNum() {
        return weekNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_matrix_temp.week_num
     *
     * @param weekNum the value for performance_report_matrix_temp.week_num
     *
     * @mbggenerated
     */
    public void setWeekNum(Integer weekNum) {
        this.weekNum = weekNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_report_matrix_temp
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
        PerformanceReportMatrixTempBean other = (PerformanceReportMatrixTempBean) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReportId() == null ? other.getReportId() == null : this.getReportId().equals(other.getReportId()))
            && (this.getMatrixId() == null ? other.getMatrixId() == null : this.getMatrixId().equals(other.getMatrixId()))
            && (this.getMatrixType() == null ? other.getMatrixType() == null : this.getMatrixType().equals(other.getMatrixType()))
            && (this.getMatrixResult() == null ? other.getMatrixResult() == null : this.getMatrixResult().equals(other.getMatrixResult()))
            && (this.getWeekNum() == null ? other.getWeekNum() == null : this.getWeekNum().equals(other.getWeekNum()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_report_matrix_temp
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReportId() == null) ? 0 : getReportId().hashCode());
        result = prime * result + ((getMatrixId() == null) ? 0 : getMatrixId().hashCode());
        result = prime * result + ((getMatrixType() == null) ? 0 : getMatrixType().hashCode());
        result = prime * result + ((getMatrixResult() == null) ? 0 : getMatrixResult().hashCode());
        result = prime * result + ((getWeekNum() == null) ? 0 : getWeekNum().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_report_matrix_temp
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
        sb.append(", matrixId=").append(matrixId);
        sb.append(", matrixType=").append(matrixType);
        sb.append(", matrixResult=").append(matrixResult);
        sb.append(", weekNum=").append(weekNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}