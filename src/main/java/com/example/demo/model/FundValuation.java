package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FundValuation implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_valuation.valuation_id
     *
     * @mbggenerated
     */
    private Integer valuationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_valuation.fund_full_name
     *
     * @mbggenerated
     */
    private String fundFullName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_valuation.valuation_date
     *
     * @mbggenerated
     */
    private Date valuationDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_valuation.revenue_capital
     *
     * @mbggenerated
     */
    private BigDecimal revenueCapital;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fund_valuation.source_file_name
     *
     * @mbggenerated
     */
    private String sourceFileName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_valuation.valuation_id
     *
     * @return the value of t_fund_valuation.valuation_id
     *
     * @mbggenerated
     */
    public Integer getValuationId() {
        return valuationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_valuation.valuation_id
     *
     * @param valuationId the value for t_fund_valuation.valuation_id
     *
     * @mbggenerated
     */
    public void setValuationId(Integer valuationId) {
        this.valuationId = valuationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_valuation.fund_full_name
     *
     * @return the value of t_fund_valuation.fund_full_name
     *
     * @mbggenerated
     */
    public String getFundFullName() {
        return fundFullName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_valuation.fund_full_name
     *
     * @param fundFullName the value for t_fund_valuation.fund_full_name
     *
     * @mbggenerated
     */
    public void setFundFullName(String fundFullName) {
        this.fundFullName = fundFullName == null ? null : fundFullName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_valuation.valuation_date
     *
     * @return the value of t_fund_valuation.valuation_date
     *
     * @mbggenerated
     */
    public Date getValuationDate() {
        return valuationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_valuation.valuation_date
     *
     * @param valuationDate the value for t_fund_valuation.valuation_date
     *
     * @mbggenerated
     */
    public void setValuationDate(Date valuationDate) {
        this.valuationDate = valuationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_valuation.revenue_capital
     *
     * @return the value of t_fund_valuation.revenue_capital
     *
     * @mbggenerated
     */
    public BigDecimal getRevenueCapital() {
        return revenueCapital;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_valuation.revenue_capital
     *
     * @param revenueCapital the value for t_fund_valuation.revenue_capital
     *
     * @mbggenerated
     */
    public void setRevenueCapital(BigDecimal revenueCapital) {
        this.revenueCapital = revenueCapital;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fund_valuation.source_file_name
     *
     * @return the value of t_fund_valuation.source_file_name
     *
     * @mbggenerated
     */
    public String getSourceFileName() {
        return sourceFileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fund_valuation.source_file_name
     *
     * @param sourceFileName the value for t_fund_valuation.source_file_name
     *
     * @mbggenerated
     */
    public void setSourceFileName(String sourceFileName) {
        this.sourceFileName = sourceFileName == null ? null : sourceFileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation
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
        FundValuation other = (FundValuation) that;
        return (this.getValuationId() == null ? other.getValuationId() == null : this.getValuationId().equals(other.getValuationId()))
            && (this.getFundFullName() == null ? other.getFundFullName() == null : this.getFundFullName().equals(other.getFundFullName()))
            && (this.getValuationDate() == null ? other.getValuationDate() == null : this.getValuationDate().equals(other.getValuationDate()))
            && (this.getRevenueCapital() == null ? other.getRevenueCapital() == null : this.getRevenueCapital().equals(other.getRevenueCapital()))
            && (this.getSourceFileName() == null ? other.getSourceFileName() == null : this.getSourceFileName().equals(other.getSourceFileName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getValuationId() == null) ? 0 : getValuationId().hashCode());
        result = prime * result + ((getFundFullName() == null) ? 0 : getFundFullName().hashCode());
        result = prime * result + ((getValuationDate() == null) ? 0 : getValuationDate().hashCode());
        result = prime * result + ((getRevenueCapital() == null) ? 0 : getRevenueCapital().hashCode());
        result = prime * result + ((getSourceFileName() == null) ? 0 : getSourceFileName().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", valuationId=").append(valuationId);
        sb.append(", fundFullName=").append(fundFullName);
        sb.append(", valuationDate=").append(valuationDate);
        sb.append(", revenueCapital=").append(revenueCapital);
        sb.append(", sourceFileName=").append(sourceFileName);
        sb.append("]");
        return sb.toString();
    }
}