package com.zhaopin.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecruitmentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecruitmentInfoExample() {
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

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andCorporateNameIsNull() {
            addCriterion("corporate_name is null");
            return (Criteria) this;
        }

        public Criteria andCorporateNameIsNotNull() {
            addCriterion("corporate_name is not null");
            return (Criteria) this;
        }

        public Criteria andCorporateNameEqualTo(String value) {
            addCriterion("corporate_name =", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotEqualTo(String value) {
            addCriterion("corporate_name <>", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameGreaterThan(String value) {
            addCriterion("corporate_name >", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameGreaterThanOrEqualTo(String value) {
            addCriterion("corporate_name >=", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameLessThan(String value) {
            addCriterion("corporate_name <", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameLessThanOrEqualTo(String value) {
            addCriterion("corporate_name <=", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameLike(String value) {
            addCriterion("corporate_name like", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotLike(String value) {
            addCriterion("corporate_name not like", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameIn(List<String> values) {
            addCriterion("corporate_name in", values, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotIn(List<String> values) {
            addCriterion("corporate_name not in", values, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameBetween(String value1, String value2) {
            addCriterion("corporate_name between", value1, value2, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotBetween(String value1, String value2) {
            addCriterion("corporate_name not between", value1, value2, "corporateName");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(BigDecimal value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(BigDecimal value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(BigDecimal value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(BigDecimal value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<BigDecimal> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<BigDecimal> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andCorporateSectorIsNull() {
            addCriterion("corporate_sector is null");
            return (Criteria) this;
        }

        public Criteria andCorporateSectorIsNotNull() {
            addCriterion("corporate_sector is not null");
            return (Criteria) this;
        }

        public Criteria andCorporateSectorEqualTo(String value) {
            addCriterion("corporate_sector =", value, "corporateSector");
            return (Criteria) this;
        }

        public Criteria andCorporateSectorNotEqualTo(String value) {
            addCriterion("corporate_sector <>", value, "corporateSector");
            return (Criteria) this;
        }

        public Criteria andCorporateSectorGreaterThan(String value) {
            addCriterion("corporate_sector >", value, "corporateSector");
            return (Criteria) this;
        }

        public Criteria andCorporateSectorGreaterThanOrEqualTo(String value) {
            addCriterion("corporate_sector >=", value, "corporateSector");
            return (Criteria) this;
        }

        public Criteria andCorporateSectorLessThan(String value) {
            addCriterion("corporate_sector <", value, "corporateSector");
            return (Criteria) this;
        }

        public Criteria andCorporateSectorLessThanOrEqualTo(String value) {
            addCriterion("corporate_sector <=", value, "corporateSector");
            return (Criteria) this;
        }

        public Criteria andCorporateSectorLike(String value) {
            addCriterion("corporate_sector like", value, "corporateSector");
            return (Criteria) this;
        }

        public Criteria andCorporateSectorNotLike(String value) {
            addCriterion("corporate_sector not like", value, "corporateSector");
            return (Criteria) this;
        }

        public Criteria andCorporateSectorIn(List<String> values) {
            addCriterion("corporate_sector in", values, "corporateSector");
            return (Criteria) this;
        }

        public Criteria andCorporateSectorNotIn(List<String> values) {
            addCriterion("corporate_sector not in", values, "corporateSector");
            return (Criteria) this;
        }

        public Criteria andCorporateSectorBetween(String value1, String value2) {
            addCriterion("corporate_sector between", value1, value2, "corporateSector");
            return (Criteria) this;
        }

        public Criteria andCorporateSectorNotBetween(String value1, String value2) {
            addCriterion("corporate_sector not between", value1, value2, "corporateSector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureIsNull() {
            addCriterion("enterprise_nature is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureIsNotNull() {
            addCriterion("enterprise_nature is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureEqualTo(String value) {
            addCriterion("enterprise_nature =", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureNotEqualTo(String value) {
            addCriterion("enterprise_nature <>", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureGreaterThan(String value) {
            addCriterion("enterprise_nature >", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_nature >=", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureLessThan(String value) {
            addCriterion("enterprise_nature <", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureLessThanOrEqualTo(String value) {
            addCriterion("enterprise_nature <=", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureLike(String value) {
            addCriterion("enterprise_nature like", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureNotLike(String value) {
            addCriterion("enterprise_nature not like", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureIn(List<String> values) {
            addCriterion("enterprise_nature in", values, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureNotIn(List<String> values) {
            addCriterion("enterprise_nature not in", values, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureBetween(String value1, String value2) {
            addCriterion("enterprise_nature between", value1, value2, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureNotBetween(String value1, String value2) {
            addCriterion("enterprise_nature not between", value1, value2, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andNumberOfRecruitsIsNull() {
            addCriterion("number_of_recruits is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfRecruitsIsNotNull() {
            addCriterion("number_of_recruits is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfRecruitsEqualTo(Integer value) {
            addCriterion("number_of_recruits =", value, "numberOfRecruits");
            return (Criteria) this;
        }

        public Criteria andNumberOfRecruitsNotEqualTo(Integer value) {
            addCriterion("number_of_recruits <>", value, "numberOfRecruits");
            return (Criteria) this;
        }

        public Criteria andNumberOfRecruitsGreaterThan(Integer value) {
            addCriterion("number_of_recruits >", value, "numberOfRecruits");
            return (Criteria) this;
        }

        public Criteria andNumberOfRecruitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_of_recruits >=", value, "numberOfRecruits");
            return (Criteria) this;
        }

        public Criteria andNumberOfRecruitsLessThan(Integer value) {
            addCriterion("number_of_recruits <", value, "numberOfRecruits");
            return (Criteria) this;
        }

        public Criteria andNumberOfRecruitsLessThanOrEqualTo(Integer value) {
            addCriterion("number_of_recruits <=", value, "numberOfRecruits");
            return (Criteria) this;
        }

        public Criteria andNumberOfRecruitsIn(List<Integer> values) {
            addCriterion("number_of_recruits in", values, "numberOfRecruits");
            return (Criteria) this;
        }

        public Criteria andNumberOfRecruitsNotIn(List<Integer> values) {
            addCriterion("number_of_recruits not in", values, "numberOfRecruits");
            return (Criteria) this;
        }

        public Criteria andNumberOfRecruitsBetween(Integer value1, Integer value2) {
            addCriterion("number_of_recruits between", value1, value2, "numberOfRecruits");
            return (Criteria) this;
        }

        public Criteria andNumberOfRecruitsNotBetween(Integer value1, Integer value2) {
            addCriterion("number_of_recruits not between", value1, value2, "numberOfRecruits");
            return (Criteria) this;
        }

        public Criteria andCorporateWelfareIsNull() {
            addCriterion("corporate_welfare is null");
            return (Criteria) this;
        }

        public Criteria andCorporateWelfareIsNotNull() {
            addCriterion("corporate_welfare is not null");
            return (Criteria) this;
        }

        public Criteria andCorporateWelfareEqualTo(String value) {
            addCriterion("corporate_welfare =", value, "corporateWelfare");
            return (Criteria) this;
        }

        public Criteria andCorporateWelfareNotEqualTo(String value) {
            addCriterion("corporate_welfare <>", value, "corporateWelfare");
            return (Criteria) this;
        }

        public Criteria andCorporateWelfareGreaterThan(String value) {
            addCriterion("corporate_welfare >", value, "corporateWelfare");
            return (Criteria) this;
        }

        public Criteria andCorporateWelfareGreaterThanOrEqualTo(String value) {
            addCriterion("corporate_welfare >=", value, "corporateWelfare");
            return (Criteria) this;
        }

        public Criteria andCorporateWelfareLessThan(String value) {
            addCriterion("corporate_welfare <", value, "corporateWelfare");
            return (Criteria) this;
        }

        public Criteria andCorporateWelfareLessThanOrEqualTo(String value) {
            addCriterion("corporate_welfare <=", value, "corporateWelfare");
            return (Criteria) this;
        }

        public Criteria andCorporateWelfareLike(String value) {
            addCriterion("corporate_welfare like", value, "corporateWelfare");
            return (Criteria) this;
        }

        public Criteria andCorporateWelfareNotLike(String value) {
            addCriterion("corporate_welfare not like", value, "corporateWelfare");
            return (Criteria) this;
        }

        public Criteria andCorporateWelfareIn(List<String> values) {
            addCriterion("corporate_welfare in", values, "corporateWelfare");
            return (Criteria) this;
        }

        public Criteria andCorporateWelfareNotIn(List<String> values) {
            addCriterion("corporate_welfare not in", values, "corporateWelfare");
            return (Criteria) this;
        }

        public Criteria andCorporateWelfareBetween(String value1, String value2) {
            addCriterion("corporate_welfare between", value1, value2, "corporateWelfare");
            return (Criteria) this;
        }

        public Criteria andCorporateWelfareNotBetween(String value1, String value2) {
            addCriterion("corporate_welfare not between", value1, value2, "corporateWelfare");
            return (Criteria) this;
        }

        public Criteria andJobInformationIsNull() {
            addCriterion("job_information is null");
            return (Criteria) this;
        }

        public Criteria andJobInformationIsNotNull() {
            addCriterion("job_information is not null");
            return (Criteria) this;
        }

        public Criteria andJobInformationEqualTo(String value) {
            addCriterion("job_information =", value, "jobInformation");
            return (Criteria) this;
        }

        public Criteria andJobInformationNotEqualTo(String value) {
            addCriterion("job_information <>", value, "jobInformation");
            return (Criteria) this;
        }

        public Criteria andJobInformationGreaterThan(String value) {
            addCriterion("job_information >", value, "jobInformation");
            return (Criteria) this;
        }

        public Criteria andJobInformationGreaterThanOrEqualTo(String value) {
            addCriterion("job_information >=", value, "jobInformation");
            return (Criteria) this;
        }

        public Criteria andJobInformationLessThan(String value) {
            addCriterion("job_information <", value, "jobInformation");
            return (Criteria) this;
        }

        public Criteria andJobInformationLessThanOrEqualTo(String value) {
            addCriterion("job_information <=", value, "jobInformation");
            return (Criteria) this;
        }

        public Criteria andJobInformationLike(String value) {
            addCriterion("job_information like", value, "jobInformation");
            return (Criteria) this;
        }

        public Criteria andJobInformationNotLike(String value) {
            addCriterion("job_information not like", value, "jobInformation");
            return (Criteria) this;
        }

        public Criteria andJobInformationIn(List<String> values) {
            addCriterion("job_information in", values, "jobInformation");
            return (Criteria) this;
        }

        public Criteria andJobInformationNotIn(List<String> values) {
            addCriterion("job_information not in", values, "jobInformation");
            return (Criteria) this;
        }

        public Criteria andJobInformationBetween(String value1, String value2) {
            addCriterion("job_information between", value1, value2, "jobInformation");
            return (Criteria) this;
        }

        public Criteria andJobInformationNotBetween(String value1, String value2) {
            addCriterion("job_information not between", value1, value2, "jobInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationIsNull() {
            addCriterion("contact_information is null");
            return (Criteria) this;
        }

        public Criteria andContactInformationIsNotNull() {
            addCriterion("contact_information is not null");
            return (Criteria) this;
        }

        public Criteria andContactInformationEqualTo(String value) {
            addCriterion("contact_information =", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationNotEqualTo(String value) {
            addCriterion("contact_information <>", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationGreaterThan(String value) {
            addCriterion("contact_information >", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationGreaterThanOrEqualTo(String value) {
            addCriterion("contact_information >=", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationLessThan(String value) {
            addCriterion("contact_information <", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationLessThanOrEqualTo(String value) {
            addCriterion("contact_information <=", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationLike(String value) {
            addCriterion("contact_information like", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationNotLike(String value) {
            addCriterion("contact_information not like", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationIn(List<String> values) {
            addCriterion("contact_information in", values, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationNotIn(List<String> values) {
            addCriterion("contact_information not in", values, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationBetween(String value1, String value2) {
            addCriterion("contact_information between", value1, value2, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationNotBetween(String value1, String value2) {
            addCriterion("contact_information not between", value1, value2, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyInformationIsNull() {
            addCriterion("company_information is null");
            return (Criteria) this;
        }

        public Criteria andCompanyInformationIsNotNull() {
            addCriterion("company_information is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyInformationEqualTo(String value) {
            addCriterion("company_information =", value, "companyInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyInformationNotEqualTo(String value) {
            addCriterion("company_information <>", value, "companyInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyInformationGreaterThan(String value) {
            addCriterion("company_information >", value, "companyInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyInformationGreaterThanOrEqualTo(String value) {
            addCriterion("company_information >=", value, "companyInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyInformationLessThan(String value) {
            addCriterion("company_information <", value, "companyInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyInformationLessThanOrEqualTo(String value) {
            addCriterion("company_information <=", value, "companyInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyInformationLike(String value) {
            addCriterion("company_information like", value, "companyInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyInformationNotLike(String value) {
            addCriterion("company_information not like", value, "companyInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyInformationIn(List<String> values) {
            addCriterion("company_information in", values, "companyInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyInformationNotIn(List<String> values) {
            addCriterion("company_information not in", values, "companyInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyInformationBetween(String value1, String value2) {
            addCriterion("company_information between", value1, value2, "companyInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyInformationNotBetween(String value1, String value2) {
            addCriterion("company_information not between", value1, value2, "companyInformation");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNull() {
            addCriterion("release_time is null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNotNull() {
            addCriterion("release_time is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeEqualTo(Date value) {
            addCriterion("release_time =", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotEqualTo(Date value) {
            addCriterion("release_time <>", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThan(Date value) {
            addCriterion("release_time >", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("release_time >=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThan(Date value) {
            addCriterion("release_time <", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("release_time <=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIn(List<Date> values) {
            addCriterion("release_time in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotIn(List<Date> values) {
            addCriterion("release_time not in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeBetween(Date value1, Date value2) {
            addCriterion("release_time between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("release_time not between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNull() {
            addCriterion("enterprise_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNotNull() {
            addCriterion("enterprise_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualTo(Integer value) {
            addCriterion("enterprise_id =", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualTo(Integer value) {
            addCriterion("enterprise_id <>", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThan(Integer value) {
            addCriterion("enterprise_id >", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_id >=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThan(Integer value) {
            addCriterion("enterprise_id <", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_id <=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIn(List<Integer> values) {
            addCriterion("enterprise_id in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotIn(List<Integer> values) {
            addCriterion("enterprise_id not in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_id between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_id not between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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