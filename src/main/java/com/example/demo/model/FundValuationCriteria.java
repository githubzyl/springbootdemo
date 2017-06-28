package com.example.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FundValuationCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    public FundValuationCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andValuationIdIsNull() {
            addCriterion("valuation_id is null");
            return (Criteria) this;
        }

        public Criteria andValuationIdIsNotNull() {
            addCriterion("valuation_id is not null");
            return (Criteria) this;
        }

        public Criteria andValuationIdEqualTo(Integer value) {
            addCriterion("valuation_id =", value, "valuationId");
            return (Criteria) this;
        }

        public Criteria andValuationIdNotEqualTo(Integer value) {
            addCriterion("valuation_id <>", value, "valuationId");
            return (Criteria) this;
        }

        public Criteria andValuationIdGreaterThan(Integer value) {
            addCriterion("valuation_id >", value, "valuationId");
            return (Criteria) this;
        }

        public Criteria andValuationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("valuation_id >=", value, "valuationId");
            return (Criteria) this;
        }

        public Criteria andValuationIdLessThan(Integer value) {
            addCriterion("valuation_id <", value, "valuationId");
            return (Criteria) this;
        }

        public Criteria andValuationIdLessThanOrEqualTo(Integer value) {
            addCriterion("valuation_id <=", value, "valuationId");
            return (Criteria) this;
        }

        public Criteria andValuationIdIn(List<Integer> values) {
            addCriterion("valuation_id in", values, "valuationId");
            return (Criteria) this;
        }

        public Criteria andValuationIdNotIn(List<Integer> values) {
            addCriterion("valuation_id not in", values, "valuationId");
            return (Criteria) this;
        }

        public Criteria andValuationIdBetween(Integer value1, Integer value2) {
            addCriterion("valuation_id between", value1, value2, "valuationId");
            return (Criteria) this;
        }

        public Criteria andValuationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("valuation_id not between", value1, value2, "valuationId");
            return (Criteria) this;
        }

        public Criteria andFundFullNameIsNull() {
            addCriterion("fund_full_name is null");
            return (Criteria) this;
        }

        public Criteria andFundFullNameIsNotNull() {
            addCriterion("fund_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andFundFullNameEqualTo(String value) {
            addCriterion("fund_full_name =", value, "fundFullName");
            return (Criteria) this;
        }

        public Criteria andFundFullNameNotEqualTo(String value) {
            addCriterion("fund_full_name <>", value, "fundFullName");
            return (Criteria) this;
        }

        public Criteria andFundFullNameGreaterThan(String value) {
            addCriterion("fund_full_name >", value, "fundFullName");
            return (Criteria) this;
        }

        public Criteria andFundFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("fund_full_name >=", value, "fundFullName");
            return (Criteria) this;
        }

        public Criteria andFundFullNameLessThan(String value) {
            addCriterion("fund_full_name <", value, "fundFullName");
            return (Criteria) this;
        }

        public Criteria andFundFullNameLessThanOrEqualTo(String value) {
            addCriterion("fund_full_name <=", value, "fundFullName");
            return (Criteria) this;
        }

        public Criteria andFundFullNameLike(String value) {
            addCriterion("fund_full_name like", value, "fundFullName");
            return (Criteria) this;
        }

        public Criteria andFundFullNameNotLike(String value) {
            addCriterion("fund_full_name not like", value, "fundFullName");
            return (Criteria) this;
        }

        public Criteria andFundFullNameIn(List<String> values) {
            addCriterion("fund_full_name in", values, "fundFullName");
            return (Criteria) this;
        }

        public Criteria andFundFullNameNotIn(List<String> values) {
            addCriterion("fund_full_name not in", values, "fundFullName");
            return (Criteria) this;
        }

        public Criteria andFundFullNameBetween(String value1, String value2) {
            addCriterion("fund_full_name between", value1, value2, "fundFullName");
            return (Criteria) this;
        }

        public Criteria andFundFullNameNotBetween(String value1, String value2) {
            addCriterion("fund_full_name not between", value1, value2, "fundFullName");
            return (Criteria) this;
        }

        public Criteria andValuationDateIsNull() {
            addCriterion("valuation_date is null");
            return (Criteria) this;
        }

        public Criteria andValuationDateIsNotNull() {
            addCriterion("valuation_date is not null");
            return (Criteria) this;
        }

        public Criteria andValuationDateEqualTo(Date value) {
            addCriterionForJDBCDate("valuation_date =", value, "valuationDate");
            return (Criteria) this;
        }

        public Criteria andValuationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("valuation_date <>", value, "valuationDate");
            return (Criteria) this;
        }

        public Criteria andValuationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("valuation_date >", value, "valuationDate");
            return (Criteria) this;
        }

        public Criteria andValuationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("valuation_date >=", value, "valuationDate");
            return (Criteria) this;
        }

        public Criteria andValuationDateLessThan(Date value) {
            addCriterionForJDBCDate("valuation_date <", value, "valuationDate");
            return (Criteria) this;
        }

        public Criteria andValuationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("valuation_date <=", value, "valuationDate");
            return (Criteria) this;
        }

        public Criteria andValuationDateIn(List<Date> values) {
            addCriterionForJDBCDate("valuation_date in", values, "valuationDate");
            return (Criteria) this;
        }

        public Criteria andValuationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("valuation_date not in", values, "valuationDate");
            return (Criteria) this;
        }

        public Criteria andValuationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("valuation_date between", value1, value2, "valuationDate");
            return (Criteria) this;
        }

        public Criteria andValuationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("valuation_date not between", value1, value2, "valuationDate");
            return (Criteria) this;
        }

        public Criteria andRevenueCapitalIsNull() {
            addCriterion("revenue_capital is null");
            return (Criteria) this;
        }

        public Criteria andRevenueCapitalIsNotNull() {
            addCriterion("revenue_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRevenueCapitalEqualTo(BigDecimal value) {
            addCriterion("revenue_capital =", value, "revenueCapital");
            return (Criteria) this;
        }

        public Criteria andRevenueCapitalNotEqualTo(BigDecimal value) {
            addCriterion("revenue_capital <>", value, "revenueCapital");
            return (Criteria) this;
        }

        public Criteria andRevenueCapitalGreaterThan(BigDecimal value) {
            addCriterion("revenue_capital >", value, "revenueCapital");
            return (Criteria) this;
        }

        public Criteria andRevenueCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("revenue_capital >=", value, "revenueCapital");
            return (Criteria) this;
        }

        public Criteria andRevenueCapitalLessThan(BigDecimal value) {
            addCriterion("revenue_capital <", value, "revenueCapital");
            return (Criteria) this;
        }

        public Criteria andRevenueCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("revenue_capital <=", value, "revenueCapital");
            return (Criteria) this;
        }

        public Criteria andRevenueCapitalIn(List<BigDecimal> values) {
            addCriterion("revenue_capital in", values, "revenueCapital");
            return (Criteria) this;
        }

        public Criteria andRevenueCapitalNotIn(List<BigDecimal> values) {
            addCriterion("revenue_capital not in", values, "revenueCapital");
            return (Criteria) this;
        }

        public Criteria andRevenueCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("revenue_capital between", value1, value2, "revenueCapital");
            return (Criteria) this;
        }

        public Criteria andRevenueCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("revenue_capital not between", value1, value2, "revenueCapital");
            return (Criteria) this;
        }

        public Criteria andSourceFileNameIsNull() {
            addCriterion("source_file_name is null");
            return (Criteria) this;
        }

        public Criteria andSourceFileNameIsNotNull() {
            addCriterion("source_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andSourceFileNameEqualTo(String value) {
            addCriterion("source_file_name =", value, "sourceFileName");
            return (Criteria) this;
        }

        public Criteria andSourceFileNameNotEqualTo(String value) {
            addCriterion("source_file_name <>", value, "sourceFileName");
            return (Criteria) this;
        }

        public Criteria andSourceFileNameGreaterThan(String value) {
            addCriterion("source_file_name >", value, "sourceFileName");
            return (Criteria) this;
        }

        public Criteria andSourceFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("source_file_name >=", value, "sourceFileName");
            return (Criteria) this;
        }

        public Criteria andSourceFileNameLessThan(String value) {
            addCriterion("source_file_name <", value, "sourceFileName");
            return (Criteria) this;
        }

        public Criteria andSourceFileNameLessThanOrEqualTo(String value) {
            addCriterion("source_file_name <=", value, "sourceFileName");
            return (Criteria) this;
        }

        public Criteria andSourceFileNameLike(String value) {
            addCriterion("source_file_name like", value, "sourceFileName");
            return (Criteria) this;
        }

        public Criteria andSourceFileNameNotLike(String value) {
            addCriterion("source_file_name not like", value, "sourceFileName");
            return (Criteria) this;
        }

        public Criteria andSourceFileNameIn(List<String> values) {
            addCriterion("source_file_name in", values, "sourceFileName");
            return (Criteria) this;
        }

        public Criteria andSourceFileNameNotIn(List<String> values) {
            addCriterion("source_file_name not in", values, "sourceFileName");
            return (Criteria) this;
        }

        public Criteria andSourceFileNameBetween(String value1, String value2) {
            addCriterion("source_file_name between", value1, value2, "sourceFileName");
            return (Criteria) this;
        }

        public Criteria andSourceFileNameNotBetween(String value1, String value2) {
            addCriterion("source_file_name not between", value1, value2, "sourceFileName");
            return (Criteria) this;
        }

        public Criteria andFundFullNameLikeInsensitive(String value) {
            addCriterion("upper(fund_full_name) like", value.toUpperCase(), "fundFullName");
            return (Criteria) this;
        }

        public Criteria andSourceFileNameLikeInsensitive(String value) {
            addCriterion("upper(source_file_name) like", value.toUpperCase(), "sourceFileName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_fund_valuation
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_fund_valuation
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}