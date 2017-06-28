package com.example.demo.model.fund;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FundnetCoreBean implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_fundnet.fundnet_id
     *
     * @mbggenerated
     */
    private String fundnetId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_fundnet.polymerization_fund_id
     *
     * @mbggenerated
     */
    private String polymerizationFundId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_fundnet.polymerization_data_ver
     *
     * @mbggenerated
     */
    private Integer polymerizationDataVer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_fundnet.polymerization_data_source
     *
     * @mbggenerated
     */
    private String polymerizationDataSource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_fundnet.fund_id
     *
     * @mbggenerated
     */
    private String fundId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_fundnet.current_fundnet
     *
     * @mbggenerated
     */
    private BigDecimal currentFundnet;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_fundnet.cumulative_fundnet
     *
     * @mbggenerated
     */
    private BigDecimal cumulativeFundnet;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_fundnet.fundnet_date
     *
     * @mbggenerated
     */
    private Date fundnetDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_fundnet.xb_remark
     *
     * @mbggenerated
     */
    private String xbRemark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_fundnet.update_soruce
     *
     * @mbggenerated
     */
    private Integer updateSoruce;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_fundnet.is_modifiy
     *
     * @mbggenerated
     */
    private Integer isModifiy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_fundnet.creator
     *
     * @mbggenerated
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_fundnet.modify_date
     *
     * @mbggenerated
     */
    private Date modifyDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_fundnet.modifier
     *
     * @mbggenerated
     */
    private String modifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_fundnet.create_date
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table core_fundnet
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_fundnet.fundnet_id
     *
     * @return the value of core_fundnet.fundnet_id
     *
     * @mbggenerated
     */
    public String getFundnetId() {
        return fundnetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_fundnet.fundnet_id
     *
     * @param fundnetId the value for core_fundnet.fundnet_id
     *
     * @mbggenerated
     */
    public void setFundnetId(String fundnetId) {
        this.fundnetId = fundnetId == null ? null : fundnetId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_fundnet.polymerization_fund_id
     *
     * @return the value of core_fundnet.polymerization_fund_id
     *
     * @mbggenerated
     */
    public String getPolymerizationFundId() {
        return polymerizationFundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_fundnet.polymerization_fund_id
     *
     * @param polymerizationFundId the value for core_fundnet.polymerization_fund_id
     *
     * @mbggenerated
     */
    public void setPolymerizationFundId(String polymerizationFundId) {
        this.polymerizationFundId = polymerizationFundId == null ? null : polymerizationFundId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_fundnet.polymerization_data_ver
     *
     * @return the value of core_fundnet.polymerization_data_ver
     *
     * @mbggenerated
     */
    public Integer getPolymerizationDataVer() {
        return polymerizationDataVer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_fundnet.polymerization_data_ver
     *
     * @param polymerizationDataVer the value for core_fundnet.polymerization_data_ver
     *
     * @mbggenerated
     */
    public void setPolymerizationDataVer(Integer polymerizationDataVer) {
        this.polymerizationDataVer = polymerizationDataVer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_fundnet.polymerization_data_source
     *
     * @return the value of core_fundnet.polymerization_data_source
     *
     * @mbggenerated
     */
    public String getPolymerizationDataSource() {
        return polymerizationDataSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_fundnet.polymerization_data_source
     *
     * @param polymerizationDataSource the value for core_fundnet.polymerization_data_source
     *
     * @mbggenerated
     */
    public void setPolymerizationDataSource(String polymerizationDataSource) {
        this.polymerizationDataSource = polymerizationDataSource == null ? null : polymerizationDataSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_fundnet.fund_id
     *
     * @return the value of core_fundnet.fund_id
     *
     * @mbggenerated
     */
    public String getFundId() {
        return fundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_fundnet.fund_id
     *
     * @param fundId the value for core_fundnet.fund_id
     *
     * @mbggenerated
     */
    public void setFundId(String fundId) {
        this.fundId = fundId == null ? null : fundId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_fundnet.current_fundnet
     *
     * @return the value of core_fundnet.current_fundnet
     *
     * @mbggenerated
     */
    public BigDecimal getCurrentFundnet() {
        return currentFundnet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_fundnet.current_fundnet
     *
     * @param currentFundnet the value for core_fundnet.current_fundnet
     *
     * @mbggenerated
     */
    public void setCurrentFundnet(BigDecimal currentFundnet) {
        this.currentFundnet = currentFundnet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_fundnet.cumulative_fundnet
     *
     * @return the value of core_fundnet.cumulative_fundnet
     *
     * @mbggenerated
     */
    public BigDecimal getCumulativeFundnet() {
        return cumulativeFundnet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_fundnet.cumulative_fundnet
     *
     * @param cumulativeFundnet the value for core_fundnet.cumulative_fundnet
     *
     * @mbggenerated
     */
    public void setCumulativeFundnet(BigDecimal cumulativeFundnet) {
        this.cumulativeFundnet = cumulativeFundnet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_fundnet.fundnet_date
     *
     * @return the value of core_fundnet.fundnet_date
     *
     * @mbggenerated
     */
    public Date getFundnetDate() {
        return fundnetDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_fundnet.fundnet_date
     *
     * @param fundnetDate the value for core_fundnet.fundnet_date
     *
     * @mbggenerated
     */
    public void setFundnetDate(Date fundnetDate) {
        this.fundnetDate = fundnetDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_fundnet.xb_remark
     *
     * @return the value of core_fundnet.xb_remark
     *
     * @mbggenerated
     */
    public String getXbRemark() {
        return xbRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_fundnet.xb_remark
     *
     * @param xbRemark the value for core_fundnet.xb_remark
     *
     * @mbggenerated
     */
    public void setXbRemark(String xbRemark) {
        this.xbRemark = xbRemark == null ? null : xbRemark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_fundnet.update_soruce
     *
     * @return the value of core_fundnet.update_soruce
     *
     * @mbggenerated
     */
    public Integer getUpdateSoruce() {
        return updateSoruce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_fundnet.update_soruce
     *
     * @param updateSoruce the value for core_fundnet.update_soruce
     *
     * @mbggenerated
     */
    public void setUpdateSoruce(Integer updateSoruce) {
        this.updateSoruce = updateSoruce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_fundnet.is_modifiy
     *
     * @return the value of core_fundnet.is_modifiy
     *
     * @mbggenerated
     */
    public Integer getIsModifiy() {
        return isModifiy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_fundnet.is_modifiy
     *
     * @param isModifiy the value for core_fundnet.is_modifiy
     *
     * @mbggenerated
     */
    public void setIsModifiy(Integer isModifiy) {
        this.isModifiy = isModifiy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_fundnet.creator
     *
     * @return the value of core_fundnet.creator
     *
     * @mbggenerated
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_fundnet.creator
     *
     * @param creator the value for core_fundnet.creator
     *
     * @mbggenerated
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_fundnet.modify_date
     *
     * @return the value of core_fundnet.modify_date
     *
     * @mbggenerated
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_fundnet.modify_date
     *
     * @param modifyDate the value for core_fundnet.modify_date
     *
     * @mbggenerated
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_fundnet.modifier
     *
     * @return the value of core_fundnet.modifier
     *
     * @mbggenerated
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_fundnet.modifier
     *
     * @param modifier the value for core_fundnet.modifier
     *
     * @mbggenerated
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_fundnet.create_date
     *
     * @return the value of core_fundnet.create_date
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_fundnet.create_date
     *
     * @param createDate the value for core_fundnet.create_date
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_fundnet
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
        FundnetCoreBean other = (FundnetCoreBean) that;
        return (this.getFundnetId() == null ? other.getFundnetId() == null : this.getFundnetId().equals(other.getFundnetId()))
            && (this.getPolymerizationFundId() == null ? other.getPolymerizationFundId() == null : this.getPolymerizationFundId().equals(other.getPolymerizationFundId()))
            && (this.getPolymerizationDataVer() == null ? other.getPolymerizationDataVer() == null : this.getPolymerizationDataVer().equals(other.getPolymerizationDataVer()))
            && (this.getPolymerizationDataSource() == null ? other.getPolymerizationDataSource() == null : this.getPolymerizationDataSource().equals(other.getPolymerizationDataSource()))
            && (this.getFundId() == null ? other.getFundId() == null : this.getFundId().equals(other.getFundId()))
            && (this.getCurrentFundnet() == null ? other.getCurrentFundnet() == null : this.getCurrentFundnet().equals(other.getCurrentFundnet()))
            && (this.getCumulativeFundnet() == null ? other.getCumulativeFundnet() == null : this.getCumulativeFundnet().equals(other.getCumulativeFundnet()))
            && (this.getFundnetDate() == null ? other.getFundnetDate() == null : this.getFundnetDate().equals(other.getFundnetDate()))
            && (this.getXbRemark() == null ? other.getXbRemark() == null : this.getXbRemark().equals(other.getXbRemark()))
            && (this.getUpdateSoruce() == null ? other.getUpdateSoruce() == null : this.getUpdateSoruce().equals(other.getUpdateSoruce()))
            && (this.getIsModifiy() == null ? other.getIsModifiy() == null : this.getIsModifiy().equals(other.getIsModifiy()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_fundnet
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFundnetId() == null) ? 0 : getFundnetId().hashCode());
        result = prime * result + ((getPolymerizationFundId() == null) ? 0 : getPolymerizationFundId().hashCode());
        result = prime * result + ((getPolymerizationDataVer() == null) ? 0 : getPolymerizationDataVer().hashCode());
        result = prime * result + ((getPolymerizationDataSource() == null) ? 0 : getPolymerizationDataSource().hashCode());
        result = prime * result + ((getFundId() == null) ? 0 : getFundId().hashCode());
        result = prime * result + ((getCurrentFundnet() == null) ? 0 : getCurrentFundnet().hashCode());
        result = prime * result + ((getCumulativeFundnet() == null) ? 0 : getCumulativeFundnet().hashCode());
        result = prime * result + ((getFundnetDate() == null) ? 0 : getFundnetDate().hashCode());
        result = prime * result + ((getXbRemark() == null) ? 0 : getXbRemark().hashCode());
        result = prime * result + ((getUpdateSoruce() == null) ? 0 : getUpdateSoruce().hashCode());
        result = prime * result + ((getIsModifiy() == null) ? 0 : getIsModifiy().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getModifyDate() == null) ? 0 : getModifyDate().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_fundnet
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fundnetId=").append(fundnetId);
        sb.append(", polymerizationFundId=").append(polymerizationFundId);
        sb.append(", polymerizationDataVer=").append(polymerizationDataVer);
        sb.append(", polymerizationDataSource=").append(polymerizationDataSource);
        sb.append(", fundId=").append(fundId);
        sb.append(", currentFundnet=").append(currentFundnet);
        sb.append(", cumulativeFundnet=").append(cumulativeFundnet);
        sb.append(", fundnetDate=").append(fundnetDate);
        sb.append(", xbRemark=").append(xbRemark);
        sb.append(", updateSoruce=").append(updateSoruce);
        sb.append(", isModifiy=").append(isModifiy);
        sb.append(", creator=").append(creator);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", modifier=").append(modifier);
        sb.append(", createDate=").append(createDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}