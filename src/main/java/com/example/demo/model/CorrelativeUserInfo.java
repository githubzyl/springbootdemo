package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CorrelativeUserInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.auth_id
     *
     * @mbggenerated
     */
    private String authId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.login_name
     *
     * @mbggenerated
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.real_name
     *
     * @mbggenerated
     */
    private String realName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.mobile_tel
     *
     * @mbggenerated
     */
    private String mobileTel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.id_kind
     *
     * @mbggenerated
     */
    private Integer idKind;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.id_no
     *
     * @mbggenerated
     */
    private String idNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.auth_user_status
     *
     * @mbggenerated
     */
    private Integer authUserStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.email_active_flag
     *
     * @mbggenerated
     */
    private Integer emailActiveFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.lock_flag
     *
     * @mbggenerated
     */
    private Integer lockFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.realname_flag
     *
     * @mbggenerated
     */
    private Integer realnameFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.reg_source
     *
     * @mbggenerated
     */
    private String regSource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.source
     *
     * @mbggenerated
     */
    private Integer source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.auth_company_id
     *
     * @mbggenerated
     */
    private String authCompanyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.company_id
     *
     * @mbggenerated
     */
    private String companyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.company_type
     *
     * @mbggenerated
     */
    private Integer companyType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.company_status
     *
     * @mbggenerated
     */
    private Integer companyStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.auth_email
     *
     * @mbggenerated
     */
    private String authEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.referee
     *
     * @mbggenerated
     */
    private String referee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.total_management_scale
     *
     * @mbggenerated
     */
    private BigDecimal totalManagementScale;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.current_scale
     *
     * @mbggenerated
     */
    private BigDecimal currentScale;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.current_accont_num
     *
     * @mbggenerated
     */
    private String currentAccontNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.approve_date
     *
     * @mbggenerated
     */
    private Date approveDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.invalid_date
     *
     * @mbggenerated
     */
    private Date invalidDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.verify_status
     *
     * @mbggenerated
     */
    private Integer verifyStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_correlative_user_info.audit_remark
     *
     * @mbggenerated
     */
    private String auditRemark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_correlative_user_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.user_id
     *
     * @return the value of t_correlative_user_info.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.user_id
     *
     * @param userId the value for t_correlative_user_info.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.auth_id
     *
     * @return the value of t_correlative_user_info.auth_id
     *
     * @mbggenerated
     */
    public String getAuthId() {
        return authId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.auth_id
     *
     * @param authId the value for t_correlative_user_info.auth_id
     *
     * @mbggenerated
     */
    public void setAuthId(String authId) {
        this.authId = authId == null ? null : authId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.login_name
     *
     * @return the value of t_correlative_user_info.login_name
     *
     * @mbggenerated
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.login_name
     *
     * @param loginName the value for t_correlative_user_info.login_name
     *
     * @mbggenerated
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.real_name
     *
     * @return the value of t_correlative_user_info.real_name
     *
     * @mbggenerated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.real_name
     *
     * @param realName the value for t_correlative_user_info.real_name
     *
     * @mbggenerated
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.mobile_tel
     *
     * @return the value of t_correlative_user_info.mobile_tel
     *
     * @mbggenerated
     */
    public String getMobileTel() {
        return mobileTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.mobile_tel
     *
     * @param mobileTel the value for t_correlative_user_info.mobile_tel
     *
     * @mbggenerated
     */
    public void setMobileTel(String mobileTel) {
        this.mobileTel = mobileTel == null ? null : mobileTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.email
     *
     * @return the value of t_correlative_user_info.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.email
     *
     * @param email the value for t_correlative_user_info.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.id_kind
     *
     * @return the value of t_correlative_user_info.id_kind
     *
     * @mbggenerated
     */
    public Integer getIdKind() {
        return idKind;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.id_kind
     *
     * @param idKind the value for t_correlative_user_info.id_kind
     *
     * @mbggenerated
     */
    public void setIdKind(Integer idKind) {
        this.idKind = idKind;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.id_no
     *
     * @return the value of t_correlative_user_info.id_no
     *
     * @mbggenerated
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.id_no
     *
     * @param idNo the value for t_correlative_user_info.id_no
     *
     * @mbggenerated
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.auth_user_status
     *
     * @return the value of t_correlative_user_info.auth_user_status
     *
     * @mbggenerated
     */
    public Integer getAuthUserStatus() {
        return authUserStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.auth_user_status
     *
     * @param authUserStatus the value for t_correlative_user_info.auth_user_status
     *
     * @mbggenerated
     */
    public void setAuthUserStatus(Integer authUserStatus) {
        this.authUserStatus = authUserStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.email_active_flag
     *
     * @return the value of t_correlative_user_info.email_active_flag
     *
     * @mbggenerated
     */
    public Integer getEmailActiveFlag() {
        return emailActiveFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.email_active_flag
     *
     * @param emailActiveFlag the value for t_correlative_user_info.email_active_flag
     *
     * @mbggenerated
     */
    public void setEmailActiveFlag(Integer emailActiveFlag) {
        this.emailActiveFlag = emailActiveFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.lock_flag
     *
     * @return the value of t_correlative_user_info.lock_flag
     *
     * @mbggenerated
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.lock_flag
     *
     * @param lockFlag the value for t_correlative_user_info.lock_flag
     *
     * @mbggenerated
     */
    public void setLockFlag(Integer lockFlag) {
        this.lockFlag = lockFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.realname_flag
     *
     * @return the value of t_correlative_user_info.realname_flag
     *
     * @mbggenerated
     */
    public Integer getRealnameFlag() {
        return realnameFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.realname_flag
     *
     * @param realnameFlag the value for t_correlative_user_info.realname_flag
     *
     * @mbggenerated
     */
    public void setRealnameFlag(Integer realnameFlag) {
        this.realnameFlag = realnameFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.reg_source
     *
     * @return the value of t_correlative_user_info.reg_source
     *
     * @mbggenerated
     */
    public String getRegSource() {
        return regSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.reg_source
     *
     * @param regSource the value for t_correlative_user_info.reg_source
     *
     * @mbggenerated
     */
    public void setRegSource(String regSource) {
        this.regSource = regSource == null ? null : regSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.source
     *
     * @return the value of t_correlative_user_info.source
     *
     * @mbggenerated
     */
    public Integer getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.source
     *
     * @param source the value for t_correlative_user_info.source
     *
     * @mbggenerated
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.auth_company_id
     *
     * @return the value of t_correlative_user_info.auth_company_id
     *
     * @mbggenerated
     */
    public String getAuthCompanyId() {
        return authCompanyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.auth_company_id
     *
     * @param authCompanyId the value for t_correlative_user_info.auth_company_id
     *
     * @mbggenerated
     */
    public void setAuthCompanyId(String authCompanyId) {
        this.authCompanyId = authCompanyId == null ? null : authCompanyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.company_id
     *
     * @return the value of t_correlative_user_info.company_id
     *
     * @mbggenerated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.company_id
     *
     * @param companyId the value for t_correlative_user_info.company_id
     *
     * @mbggenerated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.company_type
     *
     * @return the value of t_correlative_user_info.company_type
     *
     * @mbggenerated
     */
    public Integer getCompanyType() {
        return companyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.company_type
     *
     * @param companyType the value for t_correlative_user_info.company_type
     *
     * @mbggenerated
     */
    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.company_status
     *
     * @return the value of t_correlative_user_info.company_status
     *
     * @mbggenerated
     */
    public Integer getCompanyStatus() {
        return companyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.company_status
     *
     * @param companyStatus the value for t_correlative_user_info.company_status
     *
     * @mbggenerated
     */
    public void setCompanyStatus(Integer companyStatus) {
        this.companyStatus = companyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.auth_email
     *
     * @return the value of t_correlative_user_info.auth_email
     *
     * @mbggenerated
     */
    public String getAuthEmail() {
        return authEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.auth_email
     *
     * @param authEmail the value for t_correlative_user_info.auth_email
     *
     * @mbggenerated
     */
    public void setAuthEmail(String authEmail) {
        this.authEmail = authEmail == null ? null : authEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.referee
     *
     * @return the value of t_correlative_user_info.referee
     *
     * @mbggenerated
     */
    public String getReferee() {
        return referee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.referee
     *
     * @param referee the value for t_correlative_user_info.referee
     *
     * @mbggenerated
     */
    public void setReferee(String referee) {
        this.referee = referee == null ? null : referee.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.total_management_scale
     *
     * @return the value of t_correlative_user_info.total_management_scale
     *
     * @mbggenerated
     */
    public BigDecimal getTotalManagementScale() {
        return totalManagementScale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.total_management_scale
     *
     * @param totalManagementScale the value for t_correlative_user_info.total_management_scale
     *
     * @mbggenerated
     */
    public void setTotalManagementScale(BigDecimal totalManagementScale) {
        this.totalManagementScale = totalManagementScale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.current_scale
     *
     * @return the value of t_correlative_user_info.current_scale
     *
     * @mbggenerated
     */
    public BigDecimal getCurrentScale() {
        return currentScale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.current_scale
     *
     * @param currentScale the value for t_correlative_user_info.current_scale
     *
     * @mbggenerated
     */
    public void setCurrentScale(BigDecimal currentScale) {
        this.currentScale = currentScale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.current_accont_num
     *
     * @return the value of t_correlative_user_info.current_accont_num
     *
     * @mbggenerated
     */
    public String getCurrentAccontNum() {
        return currentAccontNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.current_accont_num
     *
     * @param currentAccontNum the value for t_correlative_user_info.current_accont_num
     *
     * @mbggenerated
     */
    public void setCurrentAccontNum(String currentAccontNum) {
        this.currentAccontNum = currentAccontNum == null ? null : currentAccontNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.create_time
     *
     * @return the value of t_correlative_user_info.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.create_time
     *
     * @param createTime the value for t_correlative_user_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.approve_date
     *
     * @return the value of t_correlative_user_info.approve_date
     *
     * @mbggenerated
     */
    public Date getApproveDate() {
        return approveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.approve_date
     *
     * @param approveDate the value for t_correlative_user_info.approve_date
     *
     * @mbggenerated
     */
    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.invalid_date
     *
     * @return the value of t_correlative_user_info.invalid_date
     *
     * @mbggenerated
     */
    public Date getInvalidDate() {
        return invalidDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.invalid_date
     *
     * @param invalidDate the value for t_correlative_user_info.invalid_date
     *
     * @mbggenerated
     */
    public void setInvalidDate(Date invalidDate) {
        this.invalidDate = invalidDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.verify_status
     *
     * @return the value of t_correlative_user_info.verify_status
     *
     * @mbggenerated
     */
    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.verify_status
     *
     * @param verifyStatus the value for t_correlative_user_info.verify_status
     *
     * @mbggenerated
     */
    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_correlative_user_info.audit_remark
     *
     * @return the value of t_correlative_user_info.audit_remark
     *
     * @mbggenerated
     */
    public String getAuditRemark() {
        return auditRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_correlative_user_info.audit_remark
     *
     * @param auditRemark the value for t_correlative_user_info.audit_remark
     *
     * @mbggenerated
     */
    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark == null ? null : auditRemark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_correlative_user_info
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
        CorrelativeUserInfo other = (CorrelativeUserInfo) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getAuthId() == null ? other.getAuthId() == null : this.getAuthId().equals(other.getAuthId()))
            && (this.getLoginName() == null ? other.getLoginName() == null : this.getLoginName().equals(other.getLoginName()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getMobileTel() == null ? other.getMobileTel() == null : this.getMobileTel().equals(other.getMobileTel()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getIdKind() == null ? other.getIdKind() == null : this.getIdKind().equals(other.getIdKind()))
            && (this.getIdNo() == null ? other.getIdNo() == null : this.getIdNo().equals(other.getIdNo()))
            && (this.getAuthUserStatus() == null ? other.getAuthUserStatus() == null : this.getAuthUserStatus().equals(other.getAuthUserStatus()))
            && (this.getEmailActiveFlag() == null ? other.getEmailActiveFlag() == null : this.getEmailActiveFlag().equals(other.getEmailActiveFlag()))
            && (this.getLockFlag() == null ? other.getLockFlag() == null : this.getLockFlag().equals(other.getLockFlag()))
            && (this.getRealnameFlag() == null ? other.getRealnameFlag() == null : this.getRealnameFlag().equals(other.getRealnameFlag()))
            && (this.getRegSource() == null ? other.getRegSource() == null : this.getRegSource().equals(other.getRegSource()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getAuthCompanyId() == null ? other.getAuthCompanyId() == null : this.getAuthCompanyId().equals(other.getAuthCompanyId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getCompanyType() == null ? other.getCompanyType() == null : this.getCompanyType().equals(other.getCompanyType()))
            && (this.getCompanyStatus() == null ? other.getCompanyStatus() == null : this.getCompanyStatus().equals(other.getCompanyStatus()))
            && (this.getAuthEmail() == null ? other.getAuthEmail() == null : this.getAuthEmail().equals(other.getAuthEmail()))
            && (this.getReferee() == null ? other.getReferee() == null : this.getReferee().equals(other.getReferee()))
            && (this.getTotalManagementScale() == null ? other.getTotalManagementScale() == null : this.getTotalManagementScale().equals(other.getTotalManagementScale()))
            && (this.getCurrentScale() == null ? other.getCurrentScale() == null : this.getCurrentScale().equals(other.getCurrentScale()))
            && (this.getCurrentAccontNum() == null ? other.getCurrentAccontNum() == null : this.getCurrentAccontNum().equals(other.getCurrentAccontNum()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getApproveDate() == null ? other.getApproveDate() == null : this.getApproveDate().equals(other.getApproveDate()))
            && (this.getInvalidDate() == null ? other.getInvalidDate() == null : this.getInvalidDate().equals(other.getInvalidDate()))
            && (this.getVerifyStatus() == null ? other.getVerifyStatus() == null : this.getVerifyStatus().equals(other.getVerifyStatus()))
            && (this.getAuditRemark() == null ? other.getAuditRemark() == null : this.getAuditRemark().equals(other.getAuditRemark()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_correlative_user_info
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getAuthId() == null) ? 0 : getAuthId().hashCode());
        result = prime * result + ((getLoginName() == null) ? 0 : getLoginName().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getMobileTel() == null) ? 0 : getMobileTel().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getIdKind() == null) ? 0 : getIdKind().hashCode());
        result = prime * result + ((getIdNo() == null) ? 0 : getIdNo().hashCode());
        result = prime * result + ((getAuthUserStatus() == null) ? 0 : getAuthUserStatus().hashCode());
        result = prime * result + ((getEmailActiveFlag() == null) ? 0 : getEmailActiveFlag().hashCode());
        result = prime * result + ((getLockFlag() == null) ? 0 : getLockFlag().hashCode());
        result = prime * result + ((getRealnameFlag() == null) ? 0 : getRealnameFlag().hashCode());
        result = prime * result + ((getRegSource() == null) ? 0 : getRegSource().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getAuthCompanyId() == null) ? 0 : getAuthCompanyId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getCompanyType() == null) ? 0 : getCompanyType().hashCode());
        result = prime * result + ((getCompanyStatus() == null) ? 0 : getCompanyStatus().hashCode());
        result = prime * result + ((getAuthEmail() == null) ? 0 : getAuthEmail().hashCode());
        result = prime * result + ((getReferee() == null) ? 0 : getReferee().hashCode());
        result = prime * result + ((getTotalManagementScale() == null) ? 0 : getTotalManagementScale().hashCode());
        result = prime * result + ((getCurrentScale() == null) ? 0 : getCurrentScale().hashCode());
        result = prime * result + ((getCurrentAccontNum() == null) ? 0 : getCurrentAccontNum().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getApproveDate() == null) ? 0 : getApproveDate().hashCode());
        result = prime * result + ((getInvalidDate() == null) ? 0 : getInvalidDate().hashCode());
        result = prime * result + ((getVerifyStatus() == null) ? 0 : getVerifyStatus().hashCode());
        result = prime * result + ((getAuditRemark() == null) ? 0 : getAuditRemark().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_correlative_user_info
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", authId=").append(authId);
        sb.append(", loginName=").append(loginName);
        sb.append(", realName=").append(realName);
        sb.append(", mobileTel=").append(mobileTel);
        sb.append(", email=").append(email);
        sb.append(", idKind=").append(idKind);
        sb.append(", idNo=").append(idNo);
        sb.append(", authUserStatus=").append(authUserStatus);
        sb.append(", emailActiveFlag=").append(emailActiveFlag);
        sb.append(", lockFlag=").append(lockFlag);
        sb.append(", realnameFlag=").append(realnameFlag);
        sb.append(", regSource=").append(regSource);
        sb.append(", source=").append(source);
        sb.append(", authCompanyId=").append(authCompanyId);
        sb.append(", companyId=").append(companyId);
        sb.append(", companyType=").append(companyType);
        sb.append(", companyStatus=").append(companyStatus);
        sb.append(", authEmail=").append(authEmail);
        sb.append(", referee=").append(referee);
        sb.append(", totalManagementScale=").append(totalManagementScale);
        sb.append(", currentScale=").append(currentScale);
        sb.append(", currentAccontNum=").append(currentAccontNum);
        sb.append(", createTime=").append(createTime);
        sb.append(", approveDate=").append(approveDate);
        sb.append(", invalidDate=").append(invalidDate);
        sb.append(", verifyStatus=").append(verifyStatus);
        sb.append(", auditRemark=").append(auditRemark);
        sb.append("]");
        return sb.toString();
    }
}