package com.example.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FundValuationSubjectCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_fund_valuation_subject
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_fund_valuation_subject
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_fund_valuation_subject
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation_subject
     *
     * @mbggenerated
     */
    public FundValuationSubjectCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation_subject
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation_subject
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation_subject
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation_subject
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation_subject
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation_subject
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation_subject
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
     * This method corresponds to the database table t_fund_valuation_subject
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
     * This method corresponds to the database table t_fund_valuation_subject
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_valuation_subject
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
     * This class corresponds to the database table t_fund_valuation_subject
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

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
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

        public Criteria andSubjectCodeIsNull() {
            addCriterion("subject_code is null");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeIsNotNull() {
            addCriterion("subject_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeEqualTo(String value) {
            addCriterion("subject_code =", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeNotEqualTo(String value) {
            addCriterion("subject_code <>", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeGreaterThan(String value) {
            addCriterion("subject_code >", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("subject_code >=", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeLessThan(String value) {
            addCriterion("subject_code <", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeLessThanOrEqualTo(String value) {
            addCriterion("subject_code <=", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeLike(String value) {
            addCriterion("subject_code like", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeNotLike(String value) {
            addCriterion("subject_code not like", value, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeIn(List<String> values) {
            addCriterion("subject_code in", values, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeNotIn(List<String> values) {
            addCriterion("subject_code not in", values, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeBetween(String value1, String value2) {
            addCriterion("subject_code between", value1, value2, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeNotBetween(String value1, String value2) {
            addCriterion("subject_code not between", value1, value2, "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNull() {
            addCriterion("subject_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNotNull() {
            addCriterion("subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameEqualTo(String value) {
            addCriterion("subject_name =", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotEqualTo(String value) {
            addCriterion("subject_name <>", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThan(String value) {
            addCriterion("subject_name >", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_name >=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThan(String value) {
            addCriterion("subject_name <", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("subject_name <=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLike(String value) {
            addCriterion("subject_name like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotLike(String value) {
            addCriterion("subject_name not like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIn(List<String> values) {
            addCriterion("subject_name in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotIn(List<String> values) {
            addCriterion("subject_name not in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameBetween(String value1, String value2) {
            addCriterion("subject_name between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotBetween(String value1, String value2) {
            addCriterion("subject_name not between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andUnitCostIsNull() {
            addCriterion("unit_cost is null");
            return (Criteria) this;
        }

        public Criteria andUnitCostIsNotNull() {
            addCriterion("unit_cost is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCostEqualTo(BigDecimal value) {
            addCriterion("unit_cost =", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotEqualTo(BigDecimal value) {
            addCriterion("unit_cost <>", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostGreaterThan(BigDecimal value) {
            addCriterion("unit_cost >", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_cost >=", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostLessThan(BigDecimal value) {
            addCriterion("unit_cost <", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_cost <=", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostIn(List<BigDecimal> values) {
            addCriterion("unit_cost in", values, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotIn(List<BigDecimal> values) {
            addCriterion("unit_cost not in", values, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_cost between", value1, value2, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_cost not between", value1, value2, "unitCost");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(BigDecimal value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(BigDecimal value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(BigDecimal value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(BigDecimal value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<BigDecimal> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<BigDecimal> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostOfNetvalueIsNull() {
            addCriterion("cost_of_netvalue is null");
            return (Criteria) this;
        }

        public Criteria andCostOfNetvalueIsNotNull() {
            addCriterion("cost_of_netvalue is not null");
            return (Criteria) this;
        }

        public Criteria andCostOfNetvalueEqualTo(Double value) {
            addCriterion("cost_of_netvalue =", value, "costOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andCostOfNetvalueNotEqualTo(Double value) {
            addCriterion("cost_of_netvalue <>", value, "costOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andCostOfNetvalueGreaterThan(Double value) {
            addCriterion("cost_of_netvalue >", value, "costOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andCostOfNetvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("cost_of_netvalue >=", value, "costOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andCostOfNetvalueLessThan(Double value) {
            addCriterion("cost_of_netvalue <", value, "costOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andCostOfNetvalueLessThanOrEqualTo(Double value) {
            addCriterion("cost_of_netvalue <=", value, "costOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andCostOfNetvalueIn(List<Double> values) {
            addCriterion("cost_of_netvalue in", values, "costOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andCostOfNetvalueNotIn(List<Double> values) {
            addCriterion("cost_of_netvalue not in", values, "costOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andCostOfNetvalueBetween(Double value1, Double value2) {
            addCriterion("cost_of_netvalue between", value1, value2, "costOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andCostOfNetvalueNotBetween(Double value1, Double value2) {
            addCriterion("cost_of_netvalue not between", value1, value2, "costOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(BigDecimal value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(BigDecimal value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<BigDecimal> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketValueIsNull() {
            addCriterion("market_value is null");
            return (Criteria) this;
        }

        public Criteria andMarketValueIsNotNull() {
            addCriterion("market_value is not null");
            return (Criteria) this;
        }

        public Criteria andMarketValueEqualTo(BigDecimal value) {
            addCriterion("market_value =", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueNotEqualTo(BigDecimal value) {
            addCriterion("market_value <>", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueGreaterThan(BigDecimal value) {
            addCriterion("market_value >", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_value >=", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueLessThan(BigDecimal value) {
            addCriterion("market_value <", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_value <=", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueIn(List<BigDecimal> values) {
            addCriterion("market_value in", values, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueNotIn(List<BigDecimal> values) {
            addCriterion("market_value not in", values, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_value between", value1, value2, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_value not between", value1, value2, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketOfNetvalueIsNull() {
            addCriterion("market_of_netvalue is null");
            return (Criteria) this;
        }

        public Criteria andMarketOfNetvalueIsNotNull() {
            addCriterion("market_of_netvalue is not null");
            return (Criteria) this;
        }

        public Criteria andMarketOfNetvalueEqualTo(Double value) {
            addCriterion("market_of_netvalue =", value, "marketOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andMarketOfNetvalueNotEqualTo(Double value) {
            addCriterion("market_of_netvalue <>", value, "marketOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andMarketOfNetvalueGreaterThan(Double value) {
            addCriterion("market_of_netvalue >", value, "marketOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andMarketOfNetvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("market_of_netvalue >=", value, "marketOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andMarketOfNetvalueLessThan(Double value) {
            addCriterion("market_of_netvalue <", value, "marketOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andMarketOfNetvalueLessThanOrEqualTo(Double value) {
            addCriterion("market_of_netvalue <=", value, "marketOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andMarketOfNetvalueIn(List<Double> values) {
            addCriterion("market_of_netvalue in", values, "marketOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andMarketOfNetvalueNotIn(List<Double> values) {
            addCriterion("market_of_netvalue not in", values, "marketOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andMarketOfNetvalueBetween(Double value1, Double value2) {
            addCriterion("market_of_netvalue between", value1, value2, "marketOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andMarketOfNetvalueNotBetween(Double value1, Double value2) {
            addCriterion("market_of_netvalue not between", value1, value2, "marketOfNetvalue");
            return (Criteria) this;
        }

        public Criteria andValuationAppreciationIsNull() {
            addCriterion("valuation_appreciation is null");
            return (Criteria) this;
        }

        public Criteria andValuationAppreciationIsNotNull() {
            addCriterion("valuation_appreciation is not null");
            return (Criteria) this;
        }

        public Criteria andValuationAppreciationEqualTo(BigDecimal value) {
            addCriterion("valuation_appreciation =", value, "valuationAppreciation");
            return (Criteria) this;
        }

        public Criteria andValuationAppreciationNotEqualTo(BigDecimal value) {
            addCriterion("valuation_appreciation <>", value, "valuationAppreciation");
            return (Criteria) this;
        }

        public Criteria andValuationAppreciationGreaterThan(BigDecimal value) {
            addCriterion("valuation_appreciation >", value, "valuationAppreciation");
            return (Criteria) this;
        }

        public Criteria andValuationAppreciationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_appreciation >=", value, "valuationAppreciation");
            return (Criteria) this;
        }

        public Criteria andValuationAppreciationLessThan(BigDecimal value) {
            addCriterion("valuation_appreciation <", value, "valuationAppreciation");
            return (Criteria) this;
        }

        public Criteria andValuationAppreciationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valuation_appreciation <=", value, "valuationAppreciation");
            return (Criteria) this;
        }

        public Criteria andValuationAppreciationIn(List<BigDecimal> values) {
            addCriterion("valuation_appreciation in", values, "valuationAppreciation");
            return (Criteria) this;
        }

        public Criteria andValuationAppreciationNotIn(List<BigDecimal> values) {
            addCriterion("valuation_appreciation not in", values, "valuationAppreciation");
            return (Criteria) this;
        }

        public Criteria andValuationAppreciationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_appreciation between", value1, value2, "valuationAppreciation");
            return (Criteria) this;
        }

        public Criteria andValuationAppreciationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valuation_appreciation not between", value1, value2, "valuationAppreciation");
            return (Criteria) this;
        }

        public Criteria andSuspensionInfoIsNull() {
            addCriterion("suspension_info is null");
            return (Criteria) this;
        }

        public Criteria andSuspensionInfoIsNotNull() {
            addCriterion("suspension_info is not null");
            return (Criteria) this;
        }

        public Criteria andSuspensionInfoEqualTo(String value) {
            addCriterion("suspension_info =", value, "suspensionInfo");
            return (Criteria) this;
        }

        public Criteria andSuspensionInfoNotEqualTo(String value) {
            addCriterion("suspension_info <>", value, "suspensionInfo");
            return (Criteria) this;
        }

        public Criteria andSuspensionInfoGreaterThan(String value) {
            addCriterion("suspension_info >", value, "suspensionInfo");
            return (Criteria) this;
        }

        public Criteria andSuspensionInfoGreaterThanOrEqualTo(String value) {
            addCriterion("suspension_info >=", value, "suspensionInfo");
            return (Criteria) this;
        }

        public Criteria andSuspensionInfoLessThan(String value) {
            addCriterion("suspension_info <", value, "suspensionInfo");
            return (Criteria) this;
        }

        public Criteria andSuspensionInfoLessThanOrEqualTo(String value) {
            addCriterion("suspension_info <=", value, "suspensionInfo");
            return (Criteria) this;
        }

        public Criteria andSuspensionInfoLike(String value) {
            addCriterion("suspension_info like", value, "suspensionInfo");
            return (Criteria) this;
        }

        public Criteria andSuspensionInfoNotLike(String value) {
            addCriterion("suspension_info not like", value, "suspensionInfo");
            return (Criteria) this;
        }

        public Criteria andSuspensionInfoIn(List<String> values) {
            addCriterion("suspension_info in", values, "suspensionInfo");
            return (Criteria) this;
        }

        public Criteria andSuspensionInfoNotIn(List<String> values) {
            addCriterion("suspension_info not in", values, "suspensionInfo");
            return (Criteria) this;
        }

        public Criteria andSuspensionInfoBetween(String value1, String value2) {
            addCriterion("suspension_info between", value1, value2, "suspensionInfo");
            return (Criteria) this;
        }

        public Criteria andSuspensionInfoNotBetween(String value1, String value2) {
            addCriterion("suspension_info not between", value1, value2, "suspensionInfo");
            return (Criteria) this;
        }

        public Criteria andSubjectCodeLikeInsensitive(String value) {
            addCriterion("upper(subject_code) like", value.toUpperCase(), "subjectCode");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLikeInsensitive(String value) {
            addCriterion("upper(subject_name) like", value.toUpperCase(), "subjectName");
            return (Criteria) this;
        }

        public Criteria andSuspensionInfoLikeInsensitive(String value) {
            addCriterion("upper(suspension_info) like", value.toUpperCase(), "suspensionInfo");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_fund_valuation_subject
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
     * This class corresponds to the database table t_fund_valuation_subject
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