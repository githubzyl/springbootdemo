package com.example.demo.model.fund;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PerformanceReportAchievementTempBean implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_achievements_temp.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_achievements_temp.report_id
     *
     * @mbggenerated
     */
    private String reportId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_achievements_temp.create_date
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_achievements_temp.create_profit
     *
     * @mbggenerated
     */
    private BigDecimal createProfit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_achievements_temp.plural_profit
     *
     * @mbggenerated
     */
    private BigDecimal pluralProfit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_achievements_temp.mounthavg_profit
     *
     * @mbggenerated
     */
    private BigDecimal mounthavgProfit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_achievements_temp.mounthsd_profit
     *
     * @mbggenerated
     */
    private BigDecimal mounthsdProfit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_achievements_temp.positive_mounth_num
     *
     * @mbggenerated
     */
    private Integer positiveMounthNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_achievements_temp.negative_mounth_num
     *
     * @mbggenerated
     */
    private Integer negativeMounthNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_achievements_temp.avg_positive_profit
     *
     * @mbggenerated
     */
    private BigDecimal avgPositiveProfit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_achievements_temp.avg_negative_profit
     *
     * @mbggenerated
     */
    private BigDecimal avgNegativeProfit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_achievements_temp.weekavg_profit
     *
     * @mbggenerated
     */
    private BigDecimal weekavgProfit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_achievements_temp.weeksd_profit
     *
     * @mbggenerated
     */
    private BigDecimal weeksdProfit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_achievements_temp.positive_week_num
     *
     * @mbggenerated
     */
    private Integer positiveWeekNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_achievements_temp.negative_week_num
     *
     * @mbggenerated
     */
    private Integer negativeWeekNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_report_achievements_temp.week_winrate
     *
     * @mbggenerated
     */
    private BigDecimal weekWinrate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table performance_report_achievements_temp
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_achievements_temp.id
     *
     * @return the value of performance_report_achievements_temp.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_achievements_temp.id
     *
     * @param id the value for performance_report_achievements_temp.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_achievements_temp.report_id
     *
     * @return the value of performance_report_achievements_temp.report_id
     *
     * @mbggenerated
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_achievements_temp.report_id
     *
     * @param reportId the value for performance_report_achievements_temp.report_id
     *
     * @mbggenerated
     */
    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_achievements_temp.create_date
     *
     * @return the value of performance_report_achievements_temp.create_date
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_achievements_temp.create_date
     *
     * @param createDate the value for performance_report_achievements_temp.create_date
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_achievements_temp.create_profit
     *
     * @return the value of performance_report_achievements_temp.create_profit
     *
     * @mbggenerated
     */
    public BigDecimal getCreateProfit() {
        return createProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_achievements_temp.create_profit
     *
     * @param createProfit the value for performance_report_achievements_temp.create_profit
     *
     * @mbggenerated
     */
    public void setCreateProfit(BigDecimal createProfit) {
        this.createProfit = createProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_achievements_temp.plural_profit
     *
     * @return the value of performance_report_achievements_temp.plural_profit
     *
     * @mbggenerated
     */
    public BigDecimal getPluralProfit() {
        return pluralProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_achievements_temp.plural_profit
     *
     * @param pluralProfit the value for performance_report_achievements_temp.plural_profit
     *
     * @mbggenerated
     */
    public void setPluralProfit(BigDecimal pluralProfit) {
        this.pluralProfit = pluralProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_achievements_temp.mounthavg_profit
     *
     * @return the value of performance_report_achievements_temp.mounthavg_profit
     *
     * @mbggenerated
     */
    public BigDecimal getMounthavgProfit() {
        return mounthavgProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_achievements_temp.mounthavg_profit
     *
     * @param mounthavgProfit the value for performance_report_achievements_temp.mounthavg_profit
     *
     * @mbggenerated
     */
    public void setMounthavgProfit(BigDecimal mounthavgProfit) {
        this.mounthavgProfit = mounthavgProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_achievements_temp.mounthsd_profit
     *
     * @return the value of performance_report_achievements_temp.mounthsd_profit
     *
     * @mbggenerated
     */
    public BigDecimal getMounthsdProfit() {
        return mounthsdProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_achievements_temp.mounthsd_profit
     *
     * @param mounthsdProfit the value for performance_report_achievements_temp.mounthsd_profit
     *
     * @mbggenerated
     */
    public void setMounthsdProfit(BigDecimal mounthsdProfit) {
        this.mounthsdProfit = mounthsdProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_achievements_temp.positive_mounth_num
     *
     * @return the value of performance_report_achievements_temp.positive_mounth_num
     *
     * @mbggenerated
     */
    public Integer getPositiveMounthNum() {
        return positiveMounthNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_achievements_temp.positive_mounth_num
     *
     * @param positiveMounthNum the value for performance_report_achievements_temp.positive_mounth_num
     *
     * @mbggenerated
     */
    public void setPositiveMounthNum(Integer positiveMounthNum) {
        this.positiveMounthNum = positiveMounthNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_achievements_temp.negative_mounth_num
     *
     * @return the value of performance_report_achievements_temp.negative_mounth_num
     *
     * @mbggenerated
     */
    public Integer getNegativeMounthNum() {
        return negativeMounthNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_achievements_temp.negative_mounth_num
     *
     * @param negativeMounthNum the value for performance_report_achievements_temp.negative_mounth_num
     *
     * @mbggenerated
     */
    public void setNegativeMounthNum(Integer negativeMounthNum) {
        this.negativeMounthNum = negativeMounthNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_achievements_temp.avg_positive_profit
     *
     * @return the value of performance_report_achievements_temp.avg_positive_profit
     *
     * @mbggenerated
     */
    public BigDecimal getAvgPositiveProfit() {
        return avgPositiveProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_achievements_temp.avg_positive_profit
     *
     * @param avgPositiveProfit the value for performance_report_achievements_temp.avg_positive_profit
     *
     * @mbggenerated
     */
    public void setAvgPositiveProfit(BigDecimal avgPositiveProfit) {
        this.avgPositiveProfit = avgPositiveProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_achievements_temp.avg_negative_profit
     *
     * @return the value of performance_report_achievements_temp.avg_negative_profit
     *
     * @mbggenerated
     */
    public BigDecimal getAvgNegativeProfit() {
        return avgNegativeProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_achievements_temp.avg_negative_profit
     *
     * @param avgNegativeProfit the value for performance_report_achievements_temp.avg_negative_profit
     *
     * @mbggenerated
     */
    public void setAvgNegativeProfit(BigDecimal avgNegativeProfit) {
        this.avgNegativeProfit = avgNegativeProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_achievements_temp.weekavg_profit
     *
     * @return the value of performance_report_achievements_temp.weekavg_profit
     *
     * @mbggenerated
     */
    public BigDecimal getWeekavgProfit() {
        return weekavgProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_achievements_temp.weekavg_profit
     *
     * @param weekavgProfit the value for performance_report_achievements_temp.weekavg_profit
     *
     * @mbggenerated
     */
    public void setWeekavgProfit(BigDecimal weekavgProfit) {
        this.weekavgProfit = weekavgProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_achievements_temp.weeksd_profit
     *
     * @return the value of performance_report_achievements_temp.weeksd_profit
     *
     * @mbggenerated
     */
    public BigDecimal getWeeksdProfit() {
        return weeksdProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_achievements_temp.weeksd_profit
     *
     * @param weeksdProfit the value for performance_report_achievements_temp.weeksd_profit
     *
     * @mbggenerated
     */
    public void setWeeksdProfit(BigDecimal weeksdProfit) {
        this.weeksdProfit = weeksdProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_achievements_temp.positive_week_num
     *
     * @return the value of performance_report_achievements_temp.positive_week_num
     *
     * @mbggenerated
     */
    public Integer getPositiveWeekNum() {
        return positiveWeekNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_achievements_temp.positive_week_num
     *
     * @param positiveWeekNum the value for performance_report_achievements_temp.positive_week_num
     *
     * @mbggenerated
     */
    public void setPositiveWeekNum(Integer positiveWeekNum) {
        this.positiveWeekNum = positiveWeekNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_achievements_temp.negative_week_num
     *
     * @return the value of performance_report_achievements_temp.negative_week_num
     *
     * @mbggenerated
     */
    public Integer getNegativeWeekNum() {
        return negativeWeekNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_achievements_temp.negative_week_num
     *
     * @param negativeWeekNum the value for performance_report_achievements_temp.negative_week_num
     *
     * @mbggenerated
     */
    public void setNegativeWeekNum(Integer negativeWeekNum) {
        this.negativeWeekNum = negativeWeekNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_report_achievements_temp.week_winrate
     *
     * @return the value of performance_report_achievements_temp.week_winrate
     *
     * @mbggenerated
     */
    public BigDecimal getWeekWinrate() {
        return weekWinrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_report_achievements_temp.week_winrate
     *
     * @param weekWinrate the value for performance_report_achievements_temp.week_winrate
     *
     * @mbggenerated
     */
    public void setWeekWinrate(BigDecimal weekWinrate) {
        this.weekWinrate = weekWinrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_report_achievements_temp
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
        PerformanceReportAchievementTempBean other = (PerformanceReportAchievementTempBean) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReportId() == null ? other.getReportId() == null : this.getReportId().equals(other.getReportId()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getCreateProfit() == null ? other.getCreateProfit() == null : this.getCreateProfit().equals(other.getCreateProfit()))
            && (this.getPluralProfit() == null ? other.getPluralProfit() == null : this.getPluralProfit().equals(other.getPluralProfit()))
            && (this.getMounthavgProfit() == null ? other.getMounthavgProfit() == null : this.getMounthavgProfit().equals(other.getMounthavgProfit()))
            && (this.getMounthsdProfit() == null ? other.getMounthsdProfit() == null : this.getMounthsdProfit().equals(other.getMounthsdProfit()))
            && (this.getPositiveMounthNum() == null ? other.getPositiveMounthNum() == null : this.getPositiveMounthNum().equals(other.getPositiveMounthNum()))
            && (this.getNegativeMounthNum() == null ? other.getNegativeMounthNum() == null : this.getNegativeMounthNum().equals(other.getNegativeMounthNum()))
            && (this.getAvgPositiveProfit() == null ? other.getAvgPositiveProfit() == null : this.getAvgPositiveProfit().equals(other.getAvgPositiveProfit()))
            && (this.getAvgNegativeProfit() == null ? other.getAvgNegativeProfit() == null : this.getAvgNegativeProfit().equals(other.getAvgNegativeProfit()))
            && (this.getWeekavgProfit() == null ? other.getWeekavgProfit() == null : this.getWeekavgProfit().equals(other.getWeekavgProfit()))
            && (this.getWeeksdProfit() == null ? other.getWeeksdProfit() == null : this.getWeeksdProfit().equals(other.getWeeksdProfit()))
            && (this.getPositiveWeekNum() == null ? other.getPositiveWeekNum() == null : this.getPositiveWeekNum().equals(other.getPositiveWeekNum()))
            && (this.getNegativeWeekNum() == null ? other.getNegativeWeekNum() == null : this.getNegativeWeekNum().equals(other.getNegativeWeekNum()))
            && (this.getWeekWinrate() == null ? other.getWeekWinrate() == null : this.getWeekWinrate().equals(other.getWeekWinrate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_report_achievements_temp
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReportId() == null) ? 0 : getReportId().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getCreateProfit() == null) ? 0 : getCreateProfit().hashCode());
        result = prime * result + ((getPluralProfit() == null) ? 0 : getPluralProfit().hashCode());
        result = prime * result + ((getMounthavgProfit() == null) ? 0 : getMounthavgProfit().hashCode());
        result = prime * result + ((getMounthsdProfit() == null) ? 0 : getMounthsdProfit().hashCode());
        result = prime * result + ((getPositiveMounthNum() == null) ? 0 : getPositiveMounthNum().hashCode());
        result = prime * result + ((getNegativeMounthNum() == null) ? 0 : getNegativeMounthNum().hashCode());
        result = prime * result + ((getAvgPositiveProfit() == null) ? 0 : getAvgPositiveProfit().hashCode());
        result = prime * result + ((getAvgNegativeProfit() == null) ? 0 : getAvgNegativeProfit().hashCode());
        result = prime * result + ((getWeekavgProfit() == null) ? 0 : getWeekavgProfit().hashCode());
        result = prime * result + ((getWeeksdProfit() == null) ? 0 : getWeeksdProfit().hashCode());
        result = prime * result + ((getPositiveWeekNum() == null) ? 0 : getPositiveWeekNum().hashCode());
        result = prime * result + ((getNegativeWeekNum() == null) ? 0 : getNegativeWeekNum().hashCode());
        result = prime * result + ((getWeekWinrate() == null) ? 0 : getWeekWinrate().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_report_achievements_temp
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
        sb.append(", createDate=").append(createDate);
        sb.append(", createProfit=").append(createProfit);
        sb.append(", pluralProfit=").append(pluralProfit);
        sb.append(", mounthavgProfit=").append(mounthavgProfit);
        sb.append(", mounthsdProfit=").append(mounthsdProfit);
        sb.append(", positiveMounthNum=").append(positiveMounthNum);
        sb.append(", negativeMounthNum=").append(negativeMounthNum);
        sb.append(", avgPositiveProfit=").append(avgPositiveProfit);
        sb.append(", avgNegativeProfit=").append(avgNegativeProfit);
        sb.append(", weekavgProfit=").append(weekavgProfit);
        sb.append(", weeksdProfit=").append(weeksdProfit);
        sb.append(", positiveWeekNum=").append(positiveWeekNum);
        sb.append(", negativeWeekNum=").append(negativeWeekNum);
        sb.append(", weekWinrate=").append(weekWinrate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}