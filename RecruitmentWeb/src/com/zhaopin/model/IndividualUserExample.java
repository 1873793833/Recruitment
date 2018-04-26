package com.zhaopin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndividualUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndividualUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIIdIsNull() {
            addCriterion("i_id is null");
            return (Criteria) this;
        }

        public Criteria andIIdIsNotNull() {
            addCriterion("i_id is not null");
            return (Criteria) this;
        }

        public Criteria andIIdEqualTo(Integer value) {
            addCriterion("i_id =", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotEqualTo(Integer value) {
            addCriterion("i_id <>", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThan(Integer value) {
            addCriterion("i_id >", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_id >=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThan(Integer value) {
            addCriterion("i_id <", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThanOrEqualTo(Integer value) {
            addCriterion("i_id <=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdIn(List<Integer> values) {
            addCriterion("i_id in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotIn(List<Integer> values) {
            addCriterion("i_id not in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdBetween(Integer value1, Integer value2) {
            addCriterion("i_id between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotBetween(Integer value1, Integer value2) {
            addCriterion("i_id not between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andIAccountIsNull() {
            addCriterion("i_account is null");
            return (Criteria) this;
        }

        public Criteria andIAccountIsNotNull() {
            addCriterion("i_account is not null");
            return (Criteria) this;
        }

        public Criteria andIAccountEqualTo(String value) {
            addCriterion("i_account =", value, "iAccount");
            return (Criteria) this;
        }

        public Criteria andIAccountNotEqualTo(String value) {
            addCriterion("i_account <>", value, "iAccount");
            return (Criteria) this;
        }

        public Criteria andIAccountGreaterThan(String value) {
            addCriterion("i_account >", value, "iAccount");
            return (Criteria) this;
        }

        public Criteria andIAccountGreaterThanOrEqualTo(String value) {
            addCriterion("i_account >=", value, "iAccount");
            return (Criteria) this;
        }

        public Criteria andIAccountLessThan(String value) {
            addCriterion("i_account <", value, "iAccount");
            return (Criteria) this;
        }

        public Criteria andIAccountLessThanOrEqualTo(String value) {
            addCriterion("i_account <=", value, "iAccount");
            return (Criteria) this;
        }

        public Criteria andIAccountLike(String value) {
            addCriterion("i_account like", value, "iAccount");
            return (Criteria) this;
        }

        public Criteria andIAccountNotLike(String value) {
            addCriterion("i_account not like", value, "iAccount");
            return (Criteria) this;
        }

        public Criteria andIAccountIn(List<String> values) {
            addCriterion("i_account in", values, "iAccount");
            return (Criteria) this;
        }

        public Criteria andIAccountNotIn(List<String> values) {
            addCriterion("i_account not in", values, "iAccount");
            return (Criteria) this;
        }

        public Criteria andIAccountBetween(String value1, String value2) {
            addCriterion("i_account between", value1, value2, "iAccount");
            return (Criteria) this;
        }

        public Criteria andIAccountNotBetween(String value1, String value2) {
            addCriterion("i_account not between", value1, value2, "iAccount");
            return (Criteria) this;
        }

        public Criteria andIPasswordIsNull() {
            addCriterion("i_password is null");
            return (Criteria) this;
        }

        public Criteria andIPasswordIsNotNull() {
            addCriterion("i_password is not null");
            return (Criteria) this;
        }

        public Criteria andIPasswordEqualTo(String value) {
            addCriterion("i_password =", value, "iPassword");
            return (Criteria) this;
        }

        public Criteria andIPasswordNotEqualTo(String value) {
            addCriterion("i_password <>", value, "iPassword");
            return (Criteria) this;
        }

        public Criteria andIPasswordGreaterThan(String value) {
            addCriterion("i_password >", value, "iPassword");
            return (Criteria) this;
        }

        public Criteria andIPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("i_password >=", value, "iPassword");
            return (Criteria) this;
        }

        public Criteria andIPasswordLessThan(String value) {
            addCriterion("i_password <", value, "iPassword");
            return (Criteria) this;
        }

        public Criteria andIPasswordLessThanOrEqualTo(String value) {
            addCriterion("i_password <=", value, "iPassword");
            return (Criteria) this;
        }

        public Criteria andIPasswordLike(String value) {
            addCriterion("i_password like", value, "iPassword");
            return (Criteria) this;
        }

        public Criteria andIPasswordNotLike(String value) {
            addCriterion("i_password not like", value, "iPassword");
            return (Criteria) this;
        }

        public Criteria andIPasswordIn(List<String> values) {
            addCriterion("i_password in", values, "iPassword");
            return (Criteria) this;
        }

        public Criteria andIPasswordNotIn(List<String> values) {
            addCriterion("i_password not in", values, "iPassword");
            return (Criteria) this;
        }

        public Criteria andIPasswordBetween(String value1, String value2) {
            addCriterion("i_password between", value1, value2, "iPassword");
            return (Criteria) this;
        }

        public Criteria andIPasswordNotBetween(String value1, String value2) {
            addCriterion("i_password not between", value1, value2, "iPassword");
            return (Criteria) this;
        }

        public Criteria andINameIsNull() {
            addCriterion("i_name is null");
            return (Criteria) this;
        }

        public Criteria andINameIsNotNull() {
            addCriterion("i_name is not null");
            return (Criteria) this;
        }

        public Criteria andINameEqualTo(String value) {
            addCriterion("i_name =", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameNotEqualTo(String value) {
            addCriterion("i_name <>", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameGreaterThan(String value) {
            addCriterion("i_name >", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameGreaterThanOrEqualTo(String value) {
            addCriterion("i_name >=", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameLessThan(String value) {
            addCriterion("i_name <", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameLessThanOrEqualTo(String value) {
            addCriterion("i_name <=", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameLike(String value) {
            addCriterion("i_name like", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameNotLike(String value) {
            addCriterion("i_name not like", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameIn(List<String> values) {
            addCriterion("i_name in", values, "iName");
            return (Criteria) this;
        }

        public Criteria andINameNotIn(List<String> values) {
            addCriterion("i_name not in", values, "iName");
            return (Criteria) this;
        }

        public Criteria andINameBetween(String value1, String value2) {
            addCriterion("i_name between", value1, value2, "iName");
            return (Criteria) this;
        }

        public Criteria andINameNotBetween(String value1, String value2) {
            addCriterion("i_name not between", value1, value2, "iName");
            return (Criteria) this;
        }

        public Criteria andISexIsNull() {
            addCriterion("i_sex is null");
            return (Criteria) this;
        }

        public Criteria andISexIsNotNull() {
            addCriterion("i_sex is not null");
            return (Criteria) this;
        }

        public Criteria andISexEqualTo(String value) {
            addCriterion("i_sex =", value, "iSex");
            return (Criteria) this;
        }

        public Criteria andISexNotEqualTo(String value) {
            addCriterion("i_sex <>", value, "iSex");
            return (Criteria) this;
        }

        public Criteria andISexGreaterThan(String value) {
            addCriterion("i_sex >", value, "iSex");
            return (Criteria) this;
        }

        public Criteria andISexGreaterThanOrEqualTo(String value) {
            addCriterion("i_sex >=", value, "iSex");
            return (Criteria) this;
        }

        public Criteria andISexLessThan(String value) {
            addCriterion("i_sex <", value, "iSex");
            return (Criteria) this;
        }

        public Criteria andISexLessThanOrEqualTo(String value) {
            addCriterion("i_sex <=", value, "iSex");
            return (Criteria) this;
        }

        public Criteria andISexLike(String value) {
            addCriterion("i_sex like", value, "iSex");
            return (Criteria) this;
        }

        public Criteria andISexNotLike(String value) {
            addCriterion("i_sex not like", value, "iSex");
            return (Criteria) this;
        }

        public Criteria andISexIn(List<String> values) {
            addCriterion("i_sex in", values, "iSex");
            return (Criteria) this;
        }

        public Criteria andISexNotIn(List<String> values) {
            addCriterion("i_sex not in", values, "iSex");
            return (Criteria) this;
        }

        public Criteria andISexBetween(String value1, String value2) {
            addCriterion("i_sex between", value1, value2, "iSex");
            return (Criteria) this;
        }

        public Criteria andISexNotBetween(String value1, String value2) {
            addCriterion("i_sex not between", value1, value2, "iSex");
            return (Criteria) this;
        }

        public Criteria andINationIsNull() {
            addCriterion("i_nation is null");
            return (Criteria) this;
        }

        public Criteria andINationIsNotNull() {
            addCriterion("i_nation is not null");
            return (Criteria) this;
        }

        public Criteria andINationEqualTo(String value) {
            addCriterion("i_nation =", value, "iNation");
            return (Criteria) this;
        }

        public Criteria andINationNotEqualTo(String value) {
            addCriterion("i_nation <>", value, "iNation");
            return (Criteria) this;
        }

        public Criteria andINationGreaterThan(String value) {
            addCriterion("i_nation >", value, "iNation");
            return (Criteria) this;
        }

        public Criteria andINationGreaterThanOrEqualTo(String value) {
            addCriterion("i_nation >=", value, "iNation");
            return (Criteria) this;
        }

        public Criteria andINationLessThan(String value) {
            addCriterion("i_nation <", value, "iNation");
            return (Criteria) this;
        }

        public Criteria andINationLessThanOrEqualTo(String value) {
            addCriterion("i_nation <=", value, "iNation");
            return (Criteria) this;
        }

        public Criteria andINationLike(String value) {
            addCriterion("i_nation like", value, "iNation");
            return (Criteria) this;
        }

        public Criteria andINationNotLike(String value) {
            addCriterion("i_nation not like", value, "iNation");
            return (Criteria) this;
        }

        public Criteria andINationIn(List<String> values) {
            addCriterion("i_nation in", values, "iNation");
            return (Criteria) this;
        }

        public Criteria andINationNotIn(List<String> values) {
            addCriterion("i_nation not in", values, "iNation");
            return (Criteria) this;
        }

        public Criteria andINationBetween(String value1, String value2) {
            addCriterion("i_nation between", value1, value2, "iNation");
            return (Criteria) this;
        }

        public Criteria andINationNotBetween(String value1, String value2) {
            addCriterion("i_nation not between", value1, value2, "iNation");
            return (Criteria) this;
        }

        public Criteria andIDataOfBirthIsNull() {
            addCriterion("i_data_of_birth is null");
            return (Criteria) this;
        }

        public Criteria andIDataOfBirthIsNotNull() {
            addCriterion("i_data_of_birth is not null");
            return (Criteria) this;
        }

        public Criteria andIDataOfBirthEqualTo(Date value) {
            addCriterion("i_data_of_birth =", value, "iDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andIDataOfBirthNotEqualTo(Date value) {
            addCriterion("i_data_of_birth <>", value, "iDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andIDataOfBirthGreaterThan(Date value) {
            addCriterion("i_data_of_birth >", value, "iDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andIDataOfBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("i_data_of_birth >=", value, "iDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andIDataOfBirthLessThan(Date value) {
            addCriterion("i_data_of_birth <", value, "iDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andIDataOfBirthLessThanOrEqualTo(Date value) {
            addCriterion("i_data_of_birth <=", value, "iDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andIDataOfBirthIn(List<Date> values) {
            addCriterion("i_data_of_birth in", values, "iDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andIDataOfBirthNotIn(List<Date> values) {
            addCriterion("i_data_of_birth not in", values, "iDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andIDataOfBirthBetween(Date value1, Date value2) {
            addCriterion("i_data_of_birth between", value1, value2, "iDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andIDataOfBirthNotBetween(Date value1, Date value2) {
            addCriterion("i_data_of_birth not between", value1, value2, "iDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andITelIsNull() {
            addCriterion("i_tel is null");
            return (Criteria) this;
        }

        public Criteria andITelIsNotNull() {
            addCriterion("i_tel is not null");
            return (Criteria) this;
        }

        public Criteria andITelEqualTo(String value) {
            addCriterion("i_tel =", value, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelNotEqualTo(String value) {
            addCriterion("i_tel <>", value, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelGreaterThan(String value) {
            addCriterion("i_tel >", value, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelGreaterThanOrEqualTo(String value) {
            addCriterion("i_tel >=", value, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelLessThan(String value) {
            addCriterion("i_tel <", value, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelLessThanOrEqualTo(String value) {
            addCriterion("i_tel <=", value, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelLike(String value) {
            addCriterion("i_tel like", value, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelNotLike(String value) {
            addCriterion("i_tel not like", value, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelIn(List<String> values) {
            addCriterion("i_tel in", values, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelNotIn(List<String> values) {
            addCriterion("i_tel not in", values, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelBetween(String value1, String value2) {
            addCriterion("i_tel between", value1, value2, "iTel");
            return (Criteria) this;
        }

        public Criteria andITelNotBetween(String value1, String value2) {
            addCriterion("i_tel not between", value1, value2, "iTel");
            return (Criteria) this;
        }

        public Criteria andIPostCodeIsNull() {
            addCriterion("i_post_code is null");
            return (Criteria) this;
        }

        public Criteria andIPostCodeIsNotNull() {
            addCriterion("i_post_code is not null");
            return (Criteria) this;
        }

        public Criteria andIPostCodeEqualTo(Integer value) {
            addCriterion("i_post_code =", value, "iPostCode");
            return (Criteria) this;
        }

        public Criteria andIPostCodeNotEqualTo(Integer value) {
            addCriterion("i_post_code <>", value, "iPostCode");
            return (Criteria) this;
        }

        public Criteria andIPostCodeGreaterThan(Integer value) {
            addCriterion("i_post_code >", value, "iPostCode");
            return (Criteria) this;
        }

        public Criteria andIPostCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_post_code >=", value, "iPostCode");
            return (Criteria) this;
        }

        public Criteria andIPostCodeLessThan(Integer value) {
            addCriterion("i_post_code <", value, "iPostCode");
            return (Criteria) this;
        }

        public Criteria andIPostCodeLessThanOrEqualTo(Integer value) {
            addCriterion("i_post_code <=", value, "iPostCode");
            return (Criteria) this;
        }

        public Criteria andIPostCodeIn(List<Integer> values) {
            addCriterion("i_post_code in", values, "iPostCode");
            return (Criteria) this;
        }

        public Criteria andIPostCodeNotIn(List<Integer> values) {
            addCriterion("i_post_code not in", values, "iPostCode");
            return (Criteria) this;
        }

        public Criteria andIPostCodeBetween(Integer value1, Integer value2) {
            addCriterion("i_post_code between", value1, value2, "iPostCode");
            return (Criteria) this;
        }

        public Criteria andIPostCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("i_post_code not between", value1, value2, "iPostCode");
            return (Criteria) this;
        }

        public Criteria andIEmialIsNull() {
            addCriterion("i_emial is null");
            return (Criteria) this;
        }

        public Criteria andIEmialIsNotNull() {
            addCriterion("i_emial is not null");
            return (Criteria) this;
        }

        public Criteria andIEmialEqualTo(String value) {
            addCriterion("i_emial =", value, "iEmial");
            return (Criteria) this;
        }

        public Criteria andIEmialNotEqualTo(String value) {
            addCriterion("i_emial <>", value, "iEmial");
            return (Criteria) this;
        }

        public Criteria andIEmialGreaterThan(String value) {
            addCriterion("i_emial >", value, "iEmial");
            return (Criteria) this;
        }

        public Criteria andIEmialGreaterThanOrEqualTo(String value) {
            addCriterion("i_emial >=", value, "iEmial");
            return (Criteria) this;
        }

        public Criteria andIEmialLessThan(String value) {
            addCriterion("i_emial <", value, "iEmial");
            return (Criteria) this;
        }

        public Criteria andIEmialLessThanOrEqualTo(String value) {
            addCriterion("i_emial <=", value, "iEmial");
            return (Criteria) this;
        }

        public Criteria andIEmialLike(String value) {
            addCriterion("i_emial like", value, "iEmial");
            return (Criteria) this;
        }

        public Criteria andIEmialNotLike(String value) {
            addCriterion("i_emial not like", value, "iEmial");
            return (Criteria) this;
        }

        public Criteria andIEmialIn(List<String> values) {
            addCriterion("i_emial in", values, "iEmial");
            return (Criteria) this;
        }

        public Criteria andIEmialNotIn(List<String> values) {
            addCriterion("i_emial not in", values, "iEmial");
            return (Criteria) this;
        }

        public Criteria andIEmialBetween(String value1, String value2) {
            addCriterion("i_emial between", value1, value2, "iEmial");
            return (Criteria) this;
        }

        public Criteria andIEmialNotBetween(String value1, String value2) {
            addCriterion("i_emial not between", value1, value2, "iEmial");
            return (Criteria) this;
        }

        public Criteria andIJobIntensionIsNull() {
            addCriterion("i_job_intension is null");
            return (Criteria) this;
        }

        public Criteria andIJobIntensionIsNotNull() {
            addCriterion("i_job_intension is not null");
            return (Criteria) this;
        }

        public Criteria andIJobIntensionEqualTo(String value) {
            addCriterion("i_job_intension =", value, "iJobIntension");
            return (Criteria) this;
        }

        public Criteria andIJobIntensionNotEqualTo(String value) {
            addCriterion("i_job_intension <>", value, "iJobIntension");
            return (Criteria) this;
        }

        public Criteria andIJobIntensionGreaterThan(String value) {
            addCriterion("i_job_intension >", value, "iJobIntension");
            return (Criteria) this;
        }

        public Criteria andIJobIntensionGreaterThanOrEqualTo(String value) {
            addCriterion("i_job_intension >=", value, "iJobIntension");
            return (Criteria) this;
        }

        public Criteria andIJobIntensionLessThan(String value) {
            addCriterion("i_job_intension <", value, "iJobIntension");
            return (Criteria) this;
        }

        public Criteria andIJobIntensionLessThanOrEqualTo(String value) {
            addCriterion("i_job_intension <=", value, "iJobIntension");
            return (Criteria) this;
        }

        public Criteria andIJobIntensionLike(String value) {
            addCriterion("i_job_intension like", value, "iJobIntension");
            return (Criteria) this;
        }

        public Criteria andIJobIntensionNotLike(String value) {
            addCriterion("i_job_intension not like", value, "iJobIntension");
            return (Criteria) this;
        }

        public Criteria andIJobIntensionIn(List<String> values) {
            addCriterion("i_job_intension in", values, "iJobIntension");
            return (Criteria) this;
        }

        public Criteria andIJobIntensionNotIn(List<String> values) {
            addCriterion("i_job_intension not in", values, "iJobIntension");
            return (Criteria) this;
        }

        public Criteria andIJobIntensionBetween(String value1, String value2) {
            addCriterion("i_job_intension between", value1, value2, "iJobIntension");
            return (Criteria) this;
        }

        public Criteria andIJobIntensionNotBetween(String value1, String value2) {
            addCriterion("i_job_intension not between", value1, value2, "iJobIntension");
            return (Criteria) this;
        }

        public Criteria andIDomicileIsNull() {
            addCriterion("i_domicile is null");
            return (Criteria) this;
        }

        public Criteria andIDomicileIsNotNull() {
            addCriterion("i_domicile is not null");
            return (Criteria) this;
        }

        public Criteria andIDomicileEqualTo(String value) {
            addCriterion("i_domicile =", value, "iDomicile");
            return (Criteria) this;
        }

        public Criteria andIDomicileNotEqualTo(String value) {
            addCriterion("i_domicile <>", value, "iDomicile");
            return (Criteria) this;
        }

        public Criteria andIDomicileGreaterThan(String value) {
            addCriterion("i_domicile >", value, "iDomicile");
            return (Criteria) this;
        }

        public Criteria andIDomicileGreaterThanOrEqualTo(String value) {
            addCriterion("i_domicile >=", value, "iDomicile");
            return (Criteria) this;
        }

        public Criteria andIDomicileLessThan(String value) {
            addCriterion("i_domicile <", value, "iDomicile");
            return (Criteria) this;
        }

        public Criteria andIDomicileLessThanOrEqualTo(String value) {
            addCriterion("i_domicile <=", value, "iDomicile");
            return (Criteria) this;
        }

        public Criteria andIDomicileLike(String value) {
            addCriterion("i_domicile like", value, "iDomicile");
            return (Criteria) this;
        }

        public Criteria andIDomicileNotLike(String value) {
            addCriterion("i_domicile not like", value, "iDomicile");
            return (Criteria) this;
        }

        public Criteria andIDomicileIn(List<String> values) {
            addCriterion("i_domicile in", values, "iDomicile");
            return (Criteria) this;
        }

        public Criteria andIDomicileNotIn(List<String> values) {
            addCriterion("i_domicile not in", values, "iDomicile");
            return (Criteria) this;
        }

        public Criteria andIDomicileBetween(String value1, String value2) {
            addCriterion("i_domicile between", value1, value2, "iDomicile");
            return (Criteria) this;
        }

        public Criteria andIDomicileNotBetween(String value1, String value2) {
            addCriterion("i_domicile not between", value1, value2, "iDomicile");
            return (Criteria) this;
        }

        public Criteria andIHobbyIsNull() {
            addCriterion("i_hobby is null");
            return (Criteria) this;
        }

        public Criteria andIHobbyIsNotNull() {
            addCriterion("i_hobby is not null");
            return (Criteria) this;
        }

        public Criteria andIHobbyEqualTo(String value) {
            addCriterion("i_hobby =", value, "iHobby");
            return (Criteria) this;
        }

        public Criteria andIHobbyNotEqualTo(String value) {
            addCriterion("i_hobby <>", value, "iHobby");
            return (Criteria) this;
        }

        public Criteria andIHobbyGreaterThan(String value) {
            addCriterion("i_hobby >", value, "iHobby");
            return (Criteria) this;
        }

        public Criteria andIHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("i_hobby >=", value, "iHobby");
            return (Criteria) this;
        }

        public Criteria andIHobbyLessThan(String value) {
            addCriterion("i_hobby <", value, "iHobby");
            return (Criteria) this;
        }

        public Criteria andIHobbyLessThanOrEqualTo(String value) {
            addCriterion("i_hobby <=", value, "iHobby");
            return (Criteria) this;
        }

        public Criteria andIHobbyLike(String value) {
            addCriterion("i_hobby like", value, "iHobby");
            return (Criteria) this;
        }

        public Criteria andIHobbyNotLike(String value) {
            addCriterion("i_hobby not like", value, "iHobby");
            return (Criteria) this;
        }

        public Criteria andIHobbyIn(List<String> values) {
            addCriterion("i_hobby in", values, "iHobby");
            return (Criteria) this;
        }

        public Criteria andIHobbyNotIn(List<String> values) {
            addCriterion("i_hobby not in", values, "iHobby");
            return (Criteria) this;
        }

        public Criteria andIHobbyBetween(String value1, String value2) {
            addCriterion("i_hobby between", value1, value2, "iHobby");
            return (Criteria) this;
        }

        public Criteria andIHobbyNotBetween(String value1, String value2) {
            addCriterion("i_hobby not between", value1, value2, "iHobby");
            return (Criteria) this;
        }

        public Criteria andIEducationalBgIsNull() {
            addCriterion("i_educational_bg is null");
            return (Criteria) this;
        }

        public Criteria andIEducationalBgIsNotNull() {
            addCriterion("i_educational_bg is not null");
            return (Criteria) this;
        }

        public Criteria andIEducationalBgEqualTo(String value) {
            addCriterion("i_educational_bg =", value, "iEducationalBg");
            return (Criteria) this;
        }

        public Criteria andIEducationalBgNotEqualTo(String value) {
            addCriterion("i_educational_bg <>", value, "iEducationalBg");
            return (Criteria) this;
        }

        public Criteria andIEducationalBgGreaterThan(String value) {
            addCriterion("i_educational_bg >", value, "iEducationalBg");
            return (Criteria) this;
        }

        public Criteria andIEducationalBgGreaterThanOrEqualTo(String value) {
            addCriterion("i_educational_bg >=", value, "iEducationalBg");
            return (Criteria) this;
        }

        public Criteria andIEducationalBgLessThan(String value) {
            addCriterion("i_educational_bg <", value, "iEducationalBg");
            return (Criteria) this;
        }

        public Criteria andIEducationalBgLessThanOrEqualTo(String value) {
            addCriterion("i_educational_bg <=", value, "iEducationalBg");
            return (Criteria) this;
        }

        public Criteria andIEducationalBgLike(String value) {
            addCriterion("i_educational_bg like", value, "iEducationalBg");
            return (Criteria) this;
        }

        public Criteria andIEducationalBgNotLike(String value) {
            addCriterion("i_educational_bg not like", value, "iEducationalBg");
            return (Criteria) this;
        }

        public Criteria andIEducationalBgIn(List<String> values) {
            addCriterion("i_educational_bg in", values, "iEducationalBg");
            return (Criteria) this;
        }

        public Criteria andIEducationalBgNotIn(List<String> values) {
            addCriterion("i_educational_bg not in", values, "iEducationalBg");
            return (Criteria) this;
        }

        public Criteria andIEducationalBgBetween(String value1, String value2) {
            addCriterion("i_educational_bg between", value1, value2, "iEducationalBg");
            return (Criteria) this;
        }

        public Criteria andIEducationalBgNotBetween(String value1, String value2) {
            addCriterion("i_educational_bg not between", value1, value2, "iEducationalBg");
            return (Criteria) this;
        }

        public Criteria andIMajorIsNull() {
            addCriterion("i_major is null");
            return (Criteria) this;
        }

        public Criteria andIMajorIsNotNull() {
            addCriterion("i_major is not null");
            return (Criteria) this;
        }

        public Criteria andIMajorEqualTo(String value) {
            addCriterion("i_major =", value, "iMajor");
            return (Criteria) this;
        }

        public Criteria andIMajorNotEqualTo(String value) {
            addCriterion("i_major <>", value, "iMajor");
            return (Criteria) this;
        }

        public Criteria andIMajorGreaterThan(String value) {
            addCriterion("i_major >", value, "iMajor");
            return (Criteria) this;
        }

        public Criteria andIMajorGreaterThanOrEqualTo(String value) {
            addCriterion("i_major >=", value, "iMajor");
            return (Criteria) this;
        }

        public Criteria andIMajorLessThan(String value) {
            addCriterion("i_major <", value, "iMajor");
            return (Criteria) this;
        }

        public Criteria andIMajorLessThanOrEqualTo(String value) {
            addCriterion("i_major <=", value, "iMajor");
            return (Criteria) this;
        }

        public Criteria andIMajorLike(String value) {
            addCriterion("i_major like", value, "iMajor");
            return (Criteria) this;
        }

        public Criteria andIMajorNotLike(String value) {
            addCriterion("i_major not like", value, "iMajor");
            return (Criteria) this;
        }

        public Criteria andIMajorIn(List<String> values) {
            addCriterion("i_major in", values, "iMajor");
            return (Criteria) this;
        }

        public Criteria andIMajorNotIn(List<String> values) {
            addCriterion("i_major not in", values, "iMajor");
            return (Criteria) this;
        }

        public Criteria andIMajorBetween(String value1, String value2) {
            addCriterion("i_major between", value1, value2, "iMajor");
            return (Criteria) this;
        }

        public Criteria andIMajorNotBetween(String value1, String value2) {
            addCriterion("i_major not between", value1, value2, "iMajor");
            return (Criteria) this;
        }

        public Criteria andIGraduateSchoolIsNull() {
            addCriterion("i_graduate_school is null");
            return (Criteria) this;
        }

        public Criteria andIGraduateSchoolIsNotNull() {
            addCriterion("i_graduate_school is not null");
            return (Criteria) this;
        }

        public Criteria andIGraduateSchoolEqualTo(String value) {
            addCriterion("i_graduate_school =", value, "iGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIGraduateSchoolNotEqualTo(String value) {
            addCriterion("i_graduate_school <>", value, "iGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIGraduateSchoolGreaterThan(String value) {
            addCriterion("i_graduate_school >", value, "iGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIGraduateSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("i_graduate_school >=", value, "iGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIGraduateSchoolLessThan(String value) {
            addCriterion("i_graduate_school <", value, "iGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIGraduateSchoolLessThanOrEqualTo(String value) {
            addCriterion("i_graduate_school <=", value, "iGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIGraduateSchoolLike(String value) {
            addCriterion("i_graduate_school like", value, "iGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIGraduateSchoolNotLike(String value) {
            addCriterion("i_graduate_school not like", value, "iGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIGraduateSchoolIn(List<String> values) {
            addCriterion("i_graduate_school in", values, "iGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIGraduateSchoolNotIn(List<String> values) {
            addCriterion("i_graduate_school not in", values, "iGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIGraduateSchoolBetween(String value1, String value2) {
            addCriterion("i_graduate_school between", value1, value2, "iGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIGraduateSchoolNotBetween(String value1, String value2) {
            addCriterion("i_graduate_school not between", value1, value2, "iGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andIExperienceIsNull() {
            addCriterion("i_experience is null");
            return (Criteria) this;
        }

        public Criteria andIExperienceIsNotNull() {
            addCriterion("i_experience is not null");
            return (Criteria) this;
        }

        public Criteria andIExperienceEqualTo(String value) {
            addCriterion("i_experience =", value, "iExperience");
            return (Criteria) this;
        }

        public Criteria andIExperienceNotEqualTo(String value) {
            addCriterion("i_experience <>", value, "iExperience");
            return (Criteria) this;
        }

        public Criteria andIExperienceGreaterThan(String value) {
            addCriterion("i_experience >", value, "iExperience");
            return (Criteria) this;
        }

        public Criteria andIExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("i_experience >=", value, "iExperience");
            return (Criteria) this;
        }

        public Criteria andIExperienceLessThan(String value) {
            addCriterion("i_experience <", value, "iExperience");
            return (Criteria) this;
        }

        public Criteria andIExperienceLessThanOrEqualTo(String value) {
            addCriterion("i_experience <=", value, "iExperience");
            return (Criteria) this;
        }

        public Criteria andIExperienceLike(String value) {
            addCriterion("i_experience like", value, "iExperience");
            return (Criteria) this;
        }

        public Criteria andIExperienceNotLike(String value) {
            addCriterion("i_experience not like", value, "iExperience");
            return (Criteria) this;
        }

        public Criteria andIExperienceIn(List<String> values) {
            addCriterion("i_experience in", values, "iExperience");
            return (Criteria) this;
        }

        public Criteria andIExperienceNotIn(List<String> values) {
            addCriterion("i_experience not in", values, "iExperience");
            return (Criteria) this;
        }

        public Criteria andIExperienceBetween(String value1, String value2) {
            addCriterion("i_experience between", value1, value2, "iExperience");
            return (Criteria) this;
        }

        public Criteria andIExperienceNotBetween(String value1, String value2) {
            addCriterion("i_experience not between", value1, value2, "iExperience");
            return (Criteria) this;
        }

        public Criteria andIEvaluationIsNull() {
            addCriterion("i_evaluation is null");
            return (Criteria) this;
        }

        public Criteria andIEvaluationIsNotNull() {
            addCriterion("i_evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andIEvaluationEqualTo(String value) {
            addCriterion("i_evaluation =", value, "iEvaluation");
            return (Criteria) this;
        }

        public Criteria andIEvaluationNotEqualTo(String value) {
            addCriterion("i_evaluation <>", value, "iEvaluation");
            return (Criteria) this;
        }

        public Criteria andIEvaluationGreaterThan(String value) {
            addCriterion("i_evaluation >", value, "iEvaluation");
            return (Criteria) this;
        }

        public Criteria andIEvaluationGreaterThanOrEqualTo(String value) {
            addCriterion("i_evaluation >=", value, "iEvaluation");
            return (Criteria) this;
        }

        public Criteria andIEvaluationLessThan(String value) {
            addCriterion("i_evaluation <", value, "iEvaluation");
            return (Criteria) this;
        }

        public Criteria andIEvaluationLessThanOrEqualTo(String value) {
            addCriterion("i_evaluation <=", value, "iEvaluation");
            return (Criteria) this;
        }

        public Criteria andIEvaluationLike(String value) {
            addCriterion("i_evaluation like", value, "iEvaluation");
            return (Criteria) this;
        }

        public Criteria andIEvaluationNotLike(String value) {
            addCriterion("i_evaluation not like", value, "iEvaluation");
            return (Criteria) this;
        }

        public Criteria andIEvaluationIn(List<String> values) {
            addCriterion("i_evaluation in", values, "iEvaluation");
            return (Criteria) this;
        }

        public Criteria andIEvaluationNotIn(List<String> values) {
            addCriterion("i_evaluation not in", values, "iEvaluation");
            return (Criteria) this;
        }

        public Criteria andIEvaluationBetween(String value1, String value2) {
            addCriterion("i_evaluation between", value1, value2, "iEvaluation");
            return (Criteria) this;
        }

        public Criteria andIEvaluationNotBetween(String value1, String value2) {
            addCriterion("i_evaluation not between", value1, value2, "iEvaluation");
            return (Criteria) this;
        }

        public Criteria andISkillIsNull() {
            addCriterion("i_skill is null");
            return (Criteria) this;
        }

        public Criteria andISkillIsNotNull() {
            addCriterion("i_skill is not null");
            return (Criteria) this;
        }

        public Criteria andISkillEqualTo(String value) {
            addCriterion("i_skill =", value, "iSkill");
            return (Criteria) this;
        }

        public Criteria andISkillNotEqualTo(String value) {
            addCriterion("i_skill <>", value, "iSkill");
            return (Criteria) this;
        }

        public Criteria andISkillGreaterThan(String value) {
            addCriterion("i_skill >", value, "iSkill");
            return (Criteria) this;
        }

        public Criteria andISkillGreaterThanOrEqualTo(String value) {
            addCriterion("i_skill >=", value, "iSkill");
            return (Criteria) this;
        }

        public Criteria andISkillLessThan(String value) {
            addCriterion("i_skill <", value, "iSkill");
            return (Criteria) this;
        }

        public Criteria andISkillLessThanOrEqualTo(String value) {
            addCriterion("i_skill <=", value, "iSkill");
            return (Criteria) this;
        }

        public Criteria andISkillLike(String value) {
            addCriterion("i_skill like", value, "iSkill");
            return (Criteria) this;
        }

        public Criteria andISkillNotLike(String value) {
            addCriterion("i_skill not like", value, "iSkill");
            return (Criteria) this;
        }

        public Criteria andISkillIn(List<String> values) {
            addCriterion("i_skill in", values, "iSkill");
            return (Criteria) this;
        }

        public Criteria andISkillNotIn(List<String> values) {
            addCriterion("i_skill not in", values, "iSkill");
            return (Criteria) this;
        }

        public Criteria andISkillBetween(String value1, String value2) {
            addCriterion("i_skill between", value1, value2, "iSkill");
            return (Criteria) this;
        }

        public Criteria andISkillNotBetween(String value1, String value2) {
            addCriterion("i_skill not between", value1, value2, "iSkill");
            return (Criteria) this;
        }

        public Criteria andIRegtimeIsNull() {
            addCriterion("i_regtime is null");
            return (Criteria) this;
        }

        public Criteria andIRegtimeIsNotNull() {
            addCriterion("i_regtime is not null");
            return (Criteria) this;
        }

        public Criteria andIRegtimeEqualTo(Date value) {
            addCriterion("i_regtime =", value, "iRegtime");
            return (Criteria) this;
        }

        public Criteria andIRegtimeNotEqualTo(Date value) {
            addCriterion("i_regtime <>", value, "iRegtime");
            return (Criteria) this;
        }

        public Criteria andIRegtimeGreaterThan(Date value) {
            addCriterion("i_regtime >", value, "iRegtime");
            return (Criteria) this;
        }

        public Criteria andIRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("i_regtime >=", value, "iRegtime");
            return (Criteria) this;
        }

        public Criteria andIRegtimeLessThan(Date value) {
            addCriterion("i_regtime <", value, "iRegtime");
            return (Criteria) this;
        }

        public Criteria andIRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("i_regtime <=", value, "iRegtime");
            return (Criteria) this;
        }

        public Criteria andIRegtimeIn(List<Date> values) {
            addCriterion("i_regtime in", values, "iRegtime");
            return (Criteria) this;
        }

        public Criteria andIRegtimeNotIn(List<Date> values) {
            addCriterion("i_regtime not in", values, "iRegtime");
            return (Criteria) this;
        }

        public Criteria andIRegtimeBetween(Date value1, Date value2) {
            addCriterion("i_regtime between", value1, value2, "iRegtime");
            return (Criteria) this;
        }

        public Criteria andIRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("i_regtime not between", value1, value2, "iRegtime");
            return (Criteria) this;
        }

        public Criteria andIUpdatatimeIsNull() {
            addCriterion("i_updatatime is null");
            return (Criteria) this;
        }

        public Criteria andIUpdatatimeIsNotNull() {
            addCriterion("i_updatatime is not null");
            return (Criteria) this;
        }

        public Criteria andIUpdatatimeEqualTo(Date value) {
            addCriterion("i_updatatime =", value, "iUpdatatime");
            return (Criteria) this;
        }

        public Criteria andIUpdatatimeNotEqualTo(Date value) {
            addCriterion("i_updatatime <>", value, "iUpdatatime");
            return (Criteria) this;
        }

        public Criteria andIUpdatatimeGreaterThan(Date value) {
            addCriterion("i_updatatime >", value, "iUpdatatime");
            return (Criteria) this;
        }

        public Criteria andIUpdatatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("i_updatatime >=", value, "iUpdatatime");
            return (Criteria) this;
        }

        public Criteria andIUpdatatimeLessThan(Date value) {
            addCriterion("i_updatatime <", value, "iUpdatatime");
            return (Criteria) this;
        }

        public Criteria andIUpdatatimeLessThanOrEqualTo(Date value) {
            addCriterion("i_updatatime <=", value, "iUpdatatime");
            return (Criteria) this;
        }

        public Criteria andIUpdatatimeIn(List<Date> values) {
            addCriterion("i_updatatime in", values, "iUpdatatime");
            return (Criteria) this;
        }

        public Criteria andIUpdatatimeNotIn(List<Date> values) {
            addCriterion("i_updatatime not in", values, "iUpdatatime");
            return (Criteria) this;
        }

        public Criteria andIUpdatatimeBetween(Date value1, Date value2) {
            addCriterion("i_updatatime between", value1, value2, "iUpdatatime");
            return (Criteria) this;
        }

        public Criteria andIUpdatatimeNotBetween(Date value1, Date value2) {
            addCriterion("i_updatatime not between", value1, value2, "iUpdatatime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAccStatusIsNull() {
            addCriterion("acc_status is null");
            return (Criteria) this;
        }

        public Criteria andAccStatusIsNotNull() {
            addCriterion("acc_status is not null");
            return (Criteria) this;
        }

        public Criteria andAccStatusEqualTo(Integer value) {
            addCriterion("acc_status =", value, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusNotEqualTo(Integer value) {
            addCriterion("acc_status <>", value, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusGreaterThan(Integer value) {
            addCriterion("acc_status >", value, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("acc_status >=", value, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusLessThan(Integer value) {
            addCriterion("acc_status <", value, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusLessThanOrEqualTo(Integer value) {
            addCriterion("acc_status <=", value, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusIn(List<Integer> values) {
            addCriterion("acc_status in", values, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusNotIn(List<Integer> values) {
            addCriterion("acc_status not in", values, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusBetween(Integer value1, Integer value2) {
            addCriterion("acc_status between", value1, value2, "accStatus");
            return (Criteria) this;
        }

        public Criteria andAccStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("acc_status not between", value1, value2, "accStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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