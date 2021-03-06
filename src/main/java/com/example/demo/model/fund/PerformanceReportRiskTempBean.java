package com.example.demo.model.fund;

import java.io.Serializable;
import java.math.BigDecimal;

public class PerformanceReportRiskTempBean implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_risk_temp.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_risk_temp.report_id
     *
     * @mbggenerated
     */
    private String reportId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_risk_temp.sharp_ratio
     *
     * @mbggenerated
     */
    private BigDecimal sharpRatio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_risk_temp.atinuo_ratio
     *
     * @mbggenerated
     */
    private BigDecimal atinuoRatio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_risk_temp.treynor_ratio
     *
     * @mbggenerated
     */
    private BigDecimal treynorRatio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_risk_temp.sterling_ratio
     *
     * @mbggenerated
     */
    private BigDecimal sterlingRatio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_risk_temp.benefit_index
     *
     * @mbggenerated
     */
    private BigDecimal benefitIndex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_risk_temp.section_type
     *
     * @mbggenerated
     */
    private Integer sectionType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_risk_temp.beta_radio
     *
     * @mbggenerated
     */
    private BigDecimal betaRadio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_risk_temp.alpha_radio
     *
     * @mbggenerated
     */
    private BigDecimal alphaRadio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table performance_report_risk_temp
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_risk_temp.id
     *
     * @return the value of performance_report_risk_temp.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_risk_temp.id
     *
     * @param id the value for performance_report_risk_temp.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_risk_temp.report_id
     *
     * @return the value of performance_report_risk_temp.report_id
     *
     * @mbggenerated
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_risk_temp.report_id
     *
     * @param reportId the value for performance_report_risk_temp.report_id
     *
     * @mbggenerated
     */
    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_risk_temp.sharp_ratio
     *
     * @return the value of performance_report_risk_temp.sharp_ratio
     *
     * @mbggenerated
     */
    public BigDecimal getSharpRatio() {
        return sharpRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_risk_temp.sharp_ratio
     *
     * @param sharpRatio the value for performance_report_risk_temp.sharp_ratio
     *
     * @mbggenerated
     */
    public void setSharpRatio(BigDecimal sharpRatio) {
        this.sharpRatio = sharpRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_risk_temp.atinuo_ratio
     *
     * @return the value of performance_report_risk_temp.atinuo_ratio
     *
     * @mbggenerated
     */
    public BigDecimal getAtinuoRatio() {
        return atinuoRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_risk_temp.atinuo_ratio
     *
     * @param atinuoRatio the value for performance_report_risk_temp.atinuo_ratio
     *
     * @mbggenerated
     */
    public void setAtinuoRatio(BigDecimal atinuoRatio) {
        this.atinuoRatio = atinuoRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_risk_temp.treynor_ratio
     *
     * @return the value of performance_report_risk_temp.treynor_ratio
     *
     * @mbggenerated
     */
    public BigDecimal getTreynorRatio() {
        return treynorRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_risk_temp.treynor_ratio
     *
     * @param treynorRatio the value for performance_report_risk_temp.treynor_ratio
     *
     * @mbggenerated
     */
    public void setTreynorRatio(BigDecimal treynorRatio) {
        this.treynorRatio = treynorRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_risk_temp.sterling_ratio
     *
     * @return the value of performance_report_risk_temp.sterling_ratio
     *
     * @mbggenerated
     */
    public BigDecimal getSterlingRatio() {
        return sterlingRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_risk_temp.sterling_ratio
     *
     * @param sterlingRatio the value for performance_report_risk_temp.sterling_ratio
     *
     * @mbggenerated
     */
    public void setSterlingRatio(BigDecimal sterlingRatio) {
        this.sterlingRatio = sterlingRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_risk_temp.benefit_index
     *
     * @return the value of performance_report_risk_temp.benefit_index
     *
     * @mbggenerated
     */
    public BigDecimal getBenefitIndex() {
        return benefitIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_risk_temp.benefit_index
     *
     * @param benefitIndex the value for performance_report_risk_temp.benefit_index
     *
     * @mbggenerated
     */
    public void setBenefitIndex(BigDecimal benefitIndex) {
        this.benefitIndex = benefitIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_risk_temp.section_type
     *
     * @return the value of performance_report_risk_temp.section_type
     *
     * @mbggenerated
     */
    public Integer getSectionType() {
        return sectionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_risk_temp.section_type
     *
     * @param sectionType the value for performance_report_risk_temp.section_type
     *
     * @mbggenerated
     */
    public void setSectionType(Integer sectionType) {
        this.sectionType = sectionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_risk_temp.beta_radio
     *
     * @return the value of performance_report_risk_temp.beta_radio
     *
     * @mbggenerated
     */
    public BigDecimal getBetaRadio() {
        return betaRadio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_risk_temp.beta_radio
     *
     * @param betaRadio the value for performance_report_risk_temp.beta_radio
     *
     * @mbggenerated
     */
    public void setBetaRadio(BigDecimal betaRadio) {
        this.betaRadio = betaRadio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_risk_temp.alpha_radio
     *
     * @return the value of performance_report_risk_temp.alpha_radio
     *
     * @mbggenerated
     */
    public BigDecimal getAlphaRadio() {
        return alphaRadio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_risk_temp.alpha_radio
     *
     * @param alphaRadio the value for performance_report_risk_temp.alpha_radio
     *
     * @mbggenerated
     */
    public void setAlphaRadio(BigDecimal alphaRadio) {
        this.alphaRadio = alphaRadio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_report_risk_temp
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
        PerformanceReportRiskTempBean other = (PerformanceReportRiskTempBean) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReportId() == null ? other.getReportId() == null : this.getReportId().equals(other.getReportId()))
            && (this.getSharpRatio() == null ? other.getSharpRatio() == null : this.getSharpRatio().equals(other.getSharpRatio()))
            && (this.getAtinuoRatio() == null ? other.getAtinuoRatio() == null : this.getAtinuoRatio().equals(other.getAtinuoRatio()))
            && (this.getTreynorRatio() == null ? other.getTreynorRatio() == null : this.getTreynorRatio().equals(other.getTreynorRatio()))
            && (this.getSterlingRatio() == null ? other.getSterlingRatio() == null : this.getSterlingRatio().equals(other.getSterlingRatio()))
            && (this.getBenefitIndex() == null ? other.getBenefitIndex() == null : this.getBenefitIndex().equals(other.getBenefitIndex()))
            && (this.getSectionType() == null ? other.getSectionType() == null : this.getSectionType().equals(other.getSectionType()))
            && (this.getBetaRadio() == null ? other.getBetaRadio() == null : this.getBetaRadio().equals(other.getBetaRadio()))
            && (this.getAlphaRadio() == null ? other.getAlphaRadio() == null : this.getAlphaRadio().equals(other.getAlphaRadio()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_report_risk_temp
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReportId() == null) ? 0 : getReportId().hashCode());
        result = prime * result + ((getSharpRatio() == null) ? 0 : getSharpRatio().hashCode());
        result = prime * result + ((getAtinuoRatio() == null) ? 0 : getAtinuoRatio().hashCode());
        result = prime * result + ((getTreynorRatio() == null) ? 0 : getTreynorRatio().hashCode());
        result = prime * result + ((getSterlingRatio() == null) ? 0 : getSterlingRatio().hashCode());
        result = prime * result + ((getBenefitIndex() == null) ? 0 : getBenefitIndex().hashCode());
        result = prime * result + ((getSectionType() == null) ? 0 : getSectionType().hashCode());
        result = prime * result + ((getBetaRadio() == null) ? 0 : getBetaRadio().hashCode());
        result = prime * result + ((getAlphaRadio() == null) ? 0 : getAlphaRadio().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_report_risk_temp
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
        sb.append(", sharpRatio=").append(sharpRatio);
        sb.append(", atinuoRatio=").append(atinuoRatio);
        sb.append(", treynorRatio=").append(treynorRatio);
        sb.append(", sterlingRatio=").append(sterlingRatio);
        sb.append(", benefitIndex=").append(benefitIndex);
        sb.append(", sectionType=").append(sectionType);
        sb.append(", betaRadio=").append(betaRadio);
        sb.append(", alphaRadio=").append(alphaRadio);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}