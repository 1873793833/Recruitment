package com.zhaopin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResumeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResumeInfoExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_id not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRNameIsNull() {
            addCriterion("r_name is null");
            return (Criteria) this;
        }

        public Criteria andRNameIsNotNull() {
            addCriterion("r_name is not null");
            return (Criteria) this;
        }

        public Criteria andRNameEqualTo(String value) {
            addCriterion("r_name =", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotEqualTo(String value) {
            addCriterion("r_name <>", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameGreaterThan(String value) {
            addCriterion("r_name >", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameGreaterThanOrEqualTo(String value) {
            addCriterion("r_name >=", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLessThan(String value) {
            addCriterion("r_name <", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLessThanOrEqualTo(String value) {
            addCriterion("r_name <=", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLike(String value) {
            addCriterion("r_name like", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotLike(String value) {
            addCriterion("r_name not like", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameIn(List<String> values) {
            addCriterion("r_name in", values, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotIn(List<String> values) {
            addCriterion("r_name not in", values, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameBetween(String value1, String value2) {
            addCriterion("r_name between", value1, value2, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotBetween(String value1, String value2) {
            addCriterion("r_name not between", value1, value2, "rName");
            return (Criteria) this;
        }

        public Criteria andRSexIsNull() {
            addCriterion("r_sex is null");
            return (Criteria) this;
        }

        public Criteria andRSexIsNotNull() {
            addCriterion("r_sex is not null");
            return (Criteria) this;
        }

        public Criteria andRSexEqualTo(String value) {
            addCriterion("r_sex =", value, "rSex");
            return (Criteria) this;
        }

        public Criteria andRSexNotEqualTo(String value) {
            addCriterion("r_sex <>", value, "rSex");
            return (Criteria) this;
        }

        public Criteria andRSexGreaterThan(String value) {
            addCriterion("r_sex >", value, "rSex");
            return (Criteria) this;
        }

        public Criteria andRSexGreaterThanOrEqualTo(String value) {
            addCriterion("r_sex >=", value, "rSex");
            return (Criteria) this;
        }

        public Criteria andRSexLessThan(String value) {
            addCriterion("r_sex <", value, "rSex");
            return (Criteria) this;
        }

        public Criteria andRSexLessThanOrEqualTo(String value) {
            addCriterion("r_sex <=", value, "rSex");
            return (Criteria) this;
        }

        public Criteria andRSexLike(String value) {
            addCriterion("r_sex like", value, "rSex");
            return (Criteria) this;
        }

        public Criteria andRSexNotLike(String value) {
            addCriterion("r_sex not like", value, "rSex");
            return (Criteria) this;
        }

        public Criteria andRSexIn(List<String> values) {
            addCriterion("r_sex in", values, "rSex");
            return (Criteria) this;
        }

        public Criteria andRSexNotIn(List<String> values) {
            addCriterion("r_sex not in", values, "rSex");
            return (Criteria) this;
        }

        public Criteria andRSexBetween(String value1, String value2) {
            addCriterion("r_sex between", value1, value2, "rSex");
            return (Criteria) this;
        }

        public Criteria andRSexNotBetween(String value1, String value2) {
            addCriterion("r_sex not between", value1, value2, "rSex");
            return (Criteria) this;
        }

        public Criteria andRDataOfBirthIsNull() {
            addCriterion("r_data_of_birth is null");
            return (Criteria) this;
        }

        public Criteria andRDataOfBirthIsNotNull() {
            addCriterion("r_data_of_birth is not null");
            return (Criteria) this;
        }

        public Criteria andRDataOfBirthEqualTo(Date value) {
            addCriterion("r_data_of_birth =", value, "rDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andRDataOfBirthNotEqualTo(Date value) {
            addCriterion("r_data_of_birth <>", value, "rDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andRDataOfBirthGreaterThan(Date value) {
            addCriterion("r_data_of_birth >", value, "rDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andRDataOfBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("r_data_of_birth >=", value, "rDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andRDataOfBirthLessThan(Date value) {
            addCriterion("r_data_of_birth <", value, "rDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andRDataOfBirthLessThanOrEqualTo(Date value) {
            addCriterion("r_data_of_birth <=", value, "rDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andRDataOfBirthIn(List<Date> values) {
            addCriterion("r_data_of_birth in", values, "rDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andRDataOfBirthNotIn(List<Date> values) {
            addCriterion("r_data_of_birth not in", values, "rDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andRDataOfBirthBetween(Date value1, Date value2) {
            addCriterion("r_data_of_birth between", value1, value2, "rDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andRDataOfBirthNotBetween(Date value1, Date value2) {
            addCriterion("r_data_of_birth not between", value1, value2, "rDataOfBirth");
            return (Criteria) this;
        }

        public Criteria andRTelIsNull() {
            addCriterion("r_tel is null");
            return (Criteria) this;
        }

        public Criteria andRTelIsNotNull() {
            addCriterion("r_tel is not null");
            return (Criteria) this;
        }

        public Criteria andRTelEqualTo(String value) {
            addCriterion("r_tel =", value, "rTel");
            return (Criteria) this;
        }

        public Criteria andRTelNotEqualTo(String value) {
            addCriterion("r_tel <>", value, "rTel");
            return (Criteria) this;
        }

        public Criteria andRTelGreaterThan(String value) {
            addCriterion("r_tel >", value, "rTel");
            return (Criteria) this;
        }

        public Criteria andRTelGreaterThanOrEqualTo(String value) {
            addCriterion("r_tel >=", value, "rTel");
            return (Criteria) this;
        }

        public Criteria andRTelLessThan(String value) {
            addCriterion("r_tel <", value, "rTel");
            return (Criteria) this;
        }

        public Criteria andRTelLessThanOrEqualTo(String value) {
            addCriterion("r_tel <=", value, "rTel");
            return (Criteria) this;
        }

        public Criteria andRTelLike(String value) {
            addCriterion("r_tel like", value, "rTel");
            return (Criteria) this;
        }

        public Criteria andRTelNotLike(String value) {
            addCriterion("r_tel not like", value, "rTel");
            return (Criteria) this;
        }

        public Criteria andRTelIn(List<String> values) {
            addCriterion("r_tel in", values, "rTel");
            return (Criteria) this;
        }

        public Criteria andRTelNotIn(List<String> values) {
            addCriterion("r_tel not in", values, "rTel");
            return (Criteria) this;
        }

        public Criteria andRTelBetween(String value1, String value2) {
            addCriterion("r_tel between", value1, value2, "rTel");
            return (Criteria) this;
        }

        public Criteria andRTelNotBetween(String value1, String value2) {
            addCriterion("r_tel not between", value1, value2, "rTel");
            return (Criteria) this;
        }

        public Criteria andRNationIsNull() {
            addCriterion("r_nation is null");
            return (Criteria) this;
        }

        public Criteria andRNationIsNotNull() {
            addCriterion("r_nation is not null");
            return (Criteria) this;
        }

        public Criteria andRNationEqualTo(String value) {
            addCriterion("r_nation =", value, "rNation");
            return (Criteria) this;
        }

        public Criteria andRNationNotEqualTo(String value) {
            addCriterion("r_nation <>", value, "rNation");
            return (Criteria) this;
        }

        public Criteria andRNationGreaterThan(String value) {
            addCriterion("r_nation >", value, "rNation");
            return (Criteria) this;
        }

        public Criteria andRNationGreaterThanOrEqualTo(String value) {
            addCriterion("r_nation >=", value, "rNation");
            return (Criteria) this;
        }

        public Criteria andRNationLessThan(String value) {
            addCriterion("r_nation <", value, "rNation");
            return (Criteria) this;
        }

        public Criteria andRNationLessThanOrEqualTo(String value) {
            addCriterion("r_nation <=", value, "rNation");
            return (Criteria) this;
        }

        public Criteria andRNationLike(String value) {
            addCriterion("r_nation like", value, "rNation");
            return (Criteria) this;
        }

        public Criteria andRNationNotLike(String value) {
            addCriterion("r_nation not like", value, "rNation");
            return (Criteria) this;
        }

        public Criteria andRNationIn(List<String> values) {
            addCriterion("r_nation in", values, "rNation");
            return (Criteria) this;
        }

        public Criteria andRNationNotIn(List<String> values) {
            addCriterion("r_nation not in", values, "rNation");
            return (Criteria) this;
        }

        public Criteria andRNationBetween(String value1, String value2) {
            addCriterion("r_nation between", value1, value2, "rNation");
            return (Criteria) this;
        }

        public Criteria andRNationNotBetween(String value1, String value2) {
            addCriterion("r_nation not between", value1, value2, "rNation");
            return (Criteria) this;
        }

        public Criteria andREmailIsNull() {
            addCriterion("r_email is null");
            return (Criteria) this;
        }

        public Criteria andREmailIsNotNull() {
            addCriterion("r_email is not null");
            return (Criteria) this;
        }

        public Criteria andREmailEqualTo(String value) {
            addCriterion("r_email =", value, "rEmail");
            return (Criteria) this;
        }

        public Criteria andREmailNotEqualTo(String value) {
            addCriterion("r_email <>", value, "rEmail");
            return (Criteria) this;
        }

        public Criteria andREmailGreaterThan(String value) {
            addCriterion("r_email >", value, "rEmail");
            return (Criteria) this;
        }

        public Criteria andREmailGreaterThanOrEqualTo(String value) {
            addCriterion("r_email >=", value, "rEmail");
            return (Criteria) this;
        }

        public Criteria andREmailLessThan(String value) {
            addCriterion("r_email <", value, "rEmail");
            return (Criteria) this;
        }

        public Criteria andREmailLessThanOrEqualTo(String value) {
            addCriterion("r_email <=", value, "rEmail");
            return (Criteria) this;
        }

        public Criteria andREmailLike(String value) {
            addCriterion("r_email like", value, "rEmail");
            return (Criteria) this;
        }

        public Criteria andREmailNotLike(String value) {
            addCriterion("r_email not like", value, "rEmail");
            return (Criteria) this;
        }

        public Criteria andREmailIn(List<String> values) {
            addCriterion("r_email in", values, "rEmail");
            return (Criteria) this;
        }

        public Criteria andREmailNotIn(List<String> values) {
            addCriterion("r_email not in", values, "rEmail");
            return (Criteria) this;
        }

        public Criteria andREmailBetween(String value1, String value2) {
            addCriterion("r_email between", value1, value2, "rEmail");
            return (Criteria) this;
        }

        public Criteria andREmailNotBetween(String value1, String value2) {
            addCriterion("r_email not between", value1, value2, "rEmail");
            return (Criteria) this;
        }

        public Criteria andRPostCodeIsNull() {
            addCriterion("r_post_code is null");
            return (Criteria) this;
        }

        public Criteria andRPostCodeIsNotNull() {
            addCriterion("r_post_code is not null");
            return (Criteria) this;
        }

        public Criteria andRPostCodeEqualTo(Integer value) {
            addCriterion("r_post_code =", value, "rPostCode");
            return (Criteria) this;
        }

        public Criteria andRPostCodeNotEqualTo(Integer value) {
            addCriterion("r_post_code <>", value, "rPostCode");
            return (Criteria) this;
        }

        public Criteria andRPostCodeGreaterThan(Integer value) {
            addCriterion("r_post_code >", value, "rPostCode");
            return (Criteria) this;
        }

        public Criteria andRPostCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_post_code >=", value, "rPostCode");
            return (Criteria) this;
        }

        public Criteria andRPostCodeLessThan(Integer value) {
            addCriterion("r_post_code <", value, "rPostCode");
            return (Criteria) this;
        }

        public Criteria andRPostCodeLessThanOrEqualTo(Integer value) {
            addCriterion("r_post_code <=", value, "rPostCode");
            return (Criteria) this;
        }

        public Criteria andRPostCodeIn(List<Integer> values) {
            addCriterion("r_post_code in", values, "rPostCode");
            return (Criteria) this;
        }

        public Criteria andRPostCodeNotIn(List<Integer> values) {
            addCriterion("r_post_code not in", values, "rPostCode");
            return (Criteria) this;
        }

        public Criteria andRPostCodeBetween(Integer value1, Integer value2) {
            addCriterion("r_post_code between", value1, value2, "rPostCode");
            return (Criteria) this;
        }

        public Criteria andRPostCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("r_post_code not between", value1, value2, "rPostCode");
            return (Criteria) this;
        }

        public Criteria andRPositionIsNull() {
            addCriterion("r_position is null");
            return (Criteria) this;
        }

        public Criteria andRPositionIsNotNull() {
            addCriterion("r_position is not null");
            return (Criteria) this;
        }

        public Criteria andRPositionEqualTo(String value) {
            addCriterion("r_position =", value, "rPosition");
            return (Criteria) this;
        }

        public Criteria andRPositionNotEqualTo(String value) {
            addCriterion("r_position <>", value, "rPosition");
            return (Criteria) this;
        }

        public Criteria andRPositionGreaterThan(String value) {
            addCriterion("r_position >", value, "rPosition");
            return (Criteria) this;
        }

        public Criteria andRPositionGreaterThanOrEqualTo(String value) {
            addCriterion("r_position >=", value, "rPosition");
            return (Criteria) this;
        }

        public Criteria andRPositionLessThan(String value) {
            addCriterion("r_position <", value, "rPosition");
            return (Criteria) this;
        }

        public Criteria andRPositionLessThanOrEqualTo(String value) {
            addCriterion("r_position <=", value, "rPosition");
            return (Criteria) this;
        }

        public Criteria andRPositionLike(String value) {
            addCriterion("r_position like", value, "rPosition");
            return (Criteria) this;
        }

        public Criteria andRPositionNotLike(String value) {
            addCriterion("r_position not like", value, "rPosition");
            return (Criteria) this;
        }

        public Criteria andRPositionIn(List<String> values) {
            addCriterion("r_position in", values, "rPosition");
            return (Criteria) this;
        }

        public Criteria andRPositionNotIn(List<String> values) {
            addCriterion("r_position not in", values, "rPosition");
            return (Criteria) this;
        }

        public Criteria andRPositionBetween(String value1, String value2) {
            addCriterion("r_position between", value1, value2, "rPosition");
            return (Criteria) this;
        }

        public Criteria andRPositionNotBetween(String value1, String value2) {
            addCriterion("r_position not between", value1, value2, "rPosition");
            return (Criteria) this;
        }

        public Criteria andRDomicileIsNull() {
            addCriterion("r_domicile is null");
            return (Criteria) this;
        }

        public Criteria andRDomicileIsNotNull() {
            addCriterion("r_domicile is not null");
            return (Criteria) this;
        }

        public Criteria andRDomicileEqualTo(String value) {
            addCriterion("r_domicile =", value, "rDomicile");
            return (Criteria) this;
        }

        public Criteria andRDomicileNotEqualTo(String value) {
            addCriterion("r_domicile <>", value, "rDomicile");
            return (Criteria) this;
        }

        public Criteria andRDomicileGreaterThan(String value) {
            addCriterion("r_domicile >", value, "rDomicile");
            return (Criteria) this;
        }

        public Criteria andRDomicileGreaterThanOrEqualTo(String value) {
            addCriterion("r_domicile >=", value, "rDomicile");
            return (Criteria) this;
        }

        public Criteria andRDomicileLessThan(String value) {
            addCriterion("r_domicile <", value, "rDomicile");
            return (Criteria) this;
        }

        public Criteria andRDomicileLessThanOrEqualTo(String value) {
            addCriterion("r_domicile <=", value, "rDomicile");
            return (Criteria) this;
        }

        public Criteria andRDomicileLike(String value) {
            addCriterion("r_domicile like", value, "rDomicile");
            return (Criteria) this;
        }

        public Criteria andRDomicileNotLike(String value) {
            addCriterion("r_domicile not like", value, "rDomicile");
            return (Criteria) this;
        }

        public Criteria andRDomicileIn(List<String> values) {
            addCriterion("r_domicile in", values, "rDomicile");
            return (Criteria) this;
        }

        public Criteria andRDomicileNotIn(List<String> values) {
            addCriterion("r_domicile not in", values, "rDomicile");
            return (Criteria) this;
        }

        public Criteria andRDomicileBetween(String value1, String value2) {
            addCriterion("r_domicile between", value1, value2, "rDomicile");
            return (Criteria) this;
        }

        public Criteria andRDomicileNotBetween(String value1, String value2) {
            addCriterion("r_domicile not between", value1, value2, "rDomicile");
            return (Criteria) this;
        }

        public Criteria andRSkillSpecialtyIsNull() {
            addCriterion("r_skill_specialty is null");
            return (Criteria) this;
        }

        public Criteria andRSkillSpecialtyIsNotNull() {
            addCriterion("r_skill_specialty is not null");
            return (Criteria) this;
        }

        public Criteria andRSkillSpecialtyEqualTo(String value) {
            addCriterion("r_skill_specialty =", value, "rSkillSpecialty");
            return (Criteria) this;
        }

        public Criteria andRSkillSpecialtyNotEqualTo(String value) {
            addCriterion("r_skill_specialty <>", value, "rSkillSpecialty");
            return (Criteria) this;
        }

        public Criteria andRSkillSpecialtyGreaterThan(String value) {
            addCriterion("r_skill_specialty >", value, "rSkillSpecialty");
            return (Criteria) this;
        }

        public Criteria andRSkillSpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("r_skill_specialty >=", value, "rSkillSpecialty");
            return (Criteria) this;
        }

        public Criteria andRSkillSpecialtyLessThan(String value) {
            addCriterion("r_skill_specialty <", value, "rSkillSpecialty");
            return (Criteria) this;
        }

        public Criteria andRSkillSpecialtyLessThanOrEqualTo(String value) {
            addCriterion("r_skill_specialty <=", value, "rSkillSpecialty");
            return (Criteria) this;
        }

        public Criteria andRSkillSpecialtyLike(String value) {
            addCriterion("r_skill_specialty like", value, "rSkillSpecialty");
            return (Criteria) this;
        }

        public Criteria andRSkillSpecialtyNotLike(String value) {
            addCriterion("r_skill_specialty not like", value, "rSkillSpecialty");
            return (Criteria) this;
        }

        public Criteria andRSkillSpecialtyIn(List<String> values) {
            addCriterion("r_skill_specialty in", values, "rSkillSpecialty");
            return (Criteria) this;
        }

        public Criteria andRSkillSpecialtyNotIn(List<String> values) {
            addCriterion("r_skill_specialty not in", values, "rSkillSpecialty");
            return (Criteria) this;
        }

        public Criteria andRSkillSpecialtyBetween(String value1, String value2) {
            addCriterion("r_skill_specialty between", value1, value2, "rSkillSpecialty");
            return (Criteria) this;
        }

        public Criteria andRSkillSpecialtyNotBetween(String value1, String value2) {
            addCriterion("r_skill_specialty not between", value1, value2, "rSkillSpecialty");
            return (Criteria) this;
        }

        public Criteria andRHobbyIsNull() {
            addCriterion("r_hobby is null");
            return (Criteria) this;
        }

        public Criteria andRHobbyIsNotNull() {
            addCriterion("r_hobby is not null");
            return (Criteria) this;
        }

        public Criteria andRHobbyEqualTo(String value) {
            addCriterion("r_hobby =", value, "rHobby");
            return (Criteria) this;
        }

        public Criteria andRHobbyNotEqualTo(String value) {
            addCriterion("r_hobby <>", value, "rHobby");
            return (Criteria) this;
        }

        public Criteria andRHobbyGreaterThan(String value) {
            addCriterion("r_hobby >", value, "rHobby");
            return (Criteria) this;
        }

        public Criteria andRHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("r_hobby >=", value, "rHobby");
            return (Criteria) this;
        }

        public Criteria andRHobbyLessThan(String value) {
            addCriterion("r_hobby <", value, "rHobby");
            return (Criteria) this;
        }

        public Criteria andRHobbyLessThanOrEqualTo(String value) {
            addCriterion("r_hobby <=", value, "rHobby");
            return (Criteria) this;
        }

        public Criteria andRHobbyLike(String value) {
            addCriterion("r_hobby like", value, "rHobby");
            return (Criteria) this;
        }

        public Criteria andRHobbyNotLike(String value) {
            addCriterion("r_hobby not like", value, "rHobby");
            return (Criteria) this;
        }

        public Criteria andRHobbyIn(List<String> values) {
            addCriterion("r_hobby in", values, "rHobby");
            return (Criteria) this;
        }

        public Criteria andRHobbyNotIn(List<String> values) {
            addCriterion("r_hobby not in", values, "rHobby");
            return (Criteria) this;
        }

        public Criteria andRHobbyBetween(String value1, String value2) {
            addCriterion("r_hobby between", value1, value2, "rHobby");
            return (Criteria) this;
        }

        public Criteria andRHobbyNotBetween(String value1, String value2) {
            addCriterion("r_hobby not between", value1, value2, "rHobby");
            return (Criteria) this;
        }

        public Criteria andREducationBgIsNull() {
            addCriterion("r_education_bg is null");
            return (Criteria) this;
        }

        public Criteria andREducationBgIsNotNull() {
            addCriterion("r_education_bg is not null");
            return (Criteria) this;
        }

        public Criteria andREducationBgEqualTo(String value) {
            addCriterion("r_education_bg =", value, "rEducationBg");
            return (Criteria) this;
        }

        public Criteria andREducationBgNotEqualTo(String value) {
            addCriterion("r_education_bg <>", value, "rEducationBg");
            return (Criteria) this;
        }

        public Criteria andREducationBgGreaterThan(String value) {
            addCriterion("r_education_bg >", value, "rEducationBg");
            return (Criteria) this;
        }

        public Criteria andREducationBgGreaterThanOrEqualTo(String value) {
            addCriterion("r_education_bg >=", value, "rEducationBg");
            return (Criteria) this;
        }

        public Criteria andREducationBgLessThan(String value) {
            addCriterion("r_education_bg <", value, "rEducationBg");
            return (Criteria) this;
        }

        public Criteria andREducationBgLessThanOrEqualTo(String value) {
            addCriterion("r_education_bg <=", value, "rEducationBg");
            return (Criteria) this;
        }

        public Criteria andREducationBgLike(String value) {
            addCriterion("r_education_bg like", value, "rEducationBg");
            return (Criteria) this;
        }

        public Criteria andREducationBgNotLike(String value) {
            addCriterion("r_education_bg not like", value, "rEducationBg");
            return (Criteria) this;
        }

        public Criteria andREducationBgIn(List<String> values) {
            addCriterion("r_education_bg in", values, "rEducationBg");
            return (Criteria) this;
        }

        public Criteria andREducationBgNotIn(List<String> values) {
            addCriterion("r_education_bg not in", values, "rEducationBg");
            return (Criteria) this;
        }

        public Criteria andREducationBgBetween(String value1, String value2) {
            addCriterion("r_education_bg between", value1, value2, "rEducationBg");
            return (Criteria) this;
        }

        public Criteria andREducationBgNotBetween(String value1, String value2) {
            addCriterion("r_education_bg not between", value1, value2, "rEducationBg");
            return (Criteria) this;
        }

        public Criteria andRMajorIsNull() {
            addCriterion("r_major is null");
            return (Criteria) this;
        }

        public Criteria andRMajorIsNotNull() {
            addCriterion("r_major is not null");
            return (Criteria) this;
        }

        public Criteria andRMajorEqualTo(String value) {
            addCriterion("r_major =", value, "rMajor");
            return (Criteria) this;
        }

        public Criteria andRMajorNotEqualTo(String value) {
            addCriterion("r_major <>", value, "rMajor");
            return (Criteria) this;
        }

        public Criteria andRMajorGreaterThan(String value) {
            addCriterion("r_major >", value, "rMajor");
            return (Criteria) this;
        }

        public Criteria andRMajorGreaterThanOrEqualTo(String value) {
            addCriterion("r_major >=", value, "rMajor");
            return (Criteria) this;
        }

        public Criteria andRMajorLessThan(String value) {
            addCriterion("r_major <", value, "rMajor");
            return (Criteria) this;
        }

        public Criteria andRMajorLessThanOrEqualTo(String value) {
            addCriterion("r_major <=", value, "rMajor");
            return (Criteria) this;
        }

        public Criteria andRMajorLike(String value) {
            addCriterion("r_major like", value, "rMajor");
            return (Criteria) this;
        }

        public Criteria andRMajorNotLike(String value) {
            addCriterion("r_major not like", value, "rMajor");
            return (Criteria) this;
        }

        public Criteria andRMajorIn(List<String> values) {
            addCriterion("r_major in", values, "rMajor");
            return (Criteria) this;
        }

        public Criteria andRMajorNotIn(List<String> values) {
            addCriterion("r_major not in", values, "rMajor");
            return (Criteria) this;
        }

        public Criteria andRMajorBetween(String value1, String value2) {
            addCriterion("r_major between", value1, value2, "rMajor");
            return (Criteria) this;
        }

        public Criteria andRMajorNotBetween(String value1, String value2) {
            addCriterion("r_major not between", value1, value2, "rMajor");
            return (Criteria) this;
        }

        public Criteria andRGraduateSchoolIsNull() {
            addCriterion("r_graduate_school is null");
            return (Criteria) this;
        }

        public Criteria andRGraduateSchoolIsNotNull() {
            addCriterion("r_graduate_school is not null");
            return (Criteria) this;
        }

        public Criteria andRGraduateSchoolEqualTo(String value) {
            addCriterion("r_graduate_school =", value, "rGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andRGraduateSchoolNotEqualTo(String value) {
            addCriterion("r_graduate_school <>", value, "rGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andRGraduateSchoolGreaterThan(String value) {
            addCriterion("r_graduate_school >", value, "rGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andRGraduateSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("r_graduate_school >=", value, "rGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andRGraduateSchoolLessThan(String value) {
            addCriterion("r_graduate_school <", value, "rGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andRGraduateSchoolLessThanOrEqualTo(String value) {
            addCriterion("r_graduate_school <=", value, "rGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andRGraduateSchoolLike(String value) {
            addCriterion("r_graduate_school like", value, "rGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andRGraduateSchoolNotLike(String value) {
            addCriterion("r_graduate_school not like", value, "rGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andRGraduateSchoolIn(List<String> values) {
            addCriterion("r_graduate_school in", values, "rGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andRGraduateSchoolNotIn(List<String> values) {
            addCriterion("r_graduate_school not in", values, "rGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andRGraduateSchoolBetween(String value1, String value2) {
            addCriterion("r_graduate_school between", value1, value2, "rGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andRGraduateSchoolNotBetween(String value1, String value2) {
            addCriterion("r_graduate_school not between", value1, value2, "rGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andRExperienceIsNull() {
            addCriterion("r_experience is null");
            return (Criteria) this;
        }

        public Criteria andRExperienceIsNotNull() {
            addCriterion("r_experience is not null");
            return (Criteria) this;
        }

        public Criteria andRExperienceEqualTo(String value) {
            addCriterion("r_experience =", value, "rExperience");
            return (Criteria) this;
        }

        public Criteria andRExperienceNotEqualTo(String value) {
            addCriterion("r_experience <>", value, "rExperience");
            return (Criteria) this;
        }

        public Criteria andRExperienceGreaterThan(String value) {
            addCriterion("r_experience >", value, "rExperience");
            return (Criteria) this;
        }

        public Criteria andRExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("r_experience >=", value, "rExperience");
            return (Criteria) this;
        }

        public Criteria andRExperienceLessThan(String value) {
            addCriterion("r_experience <", value, "rExperience");
            return (Criteria) this;
        }

        public Criteria andRExperienceLessThanOrEqualTo(String value) {
            addCriterion("r_experience <=", value, "rExperience");
            return (Criteria) this;
        }

        public Criteria andRExperienceLike(String value) {
            addCriterion("r_experience like", value, "rExperience");
            return (Criteria) this;
        }

        public Criteria andRExperienceNotLike(String value) {
            addCriterion("r_experience not like", value, "rExperience");
            return (Criteria) this;
        }

        public Criteria andRExperienceIn(List<String> values) {
            addCriterion("r_experience in", values, "rExperience");
            return (Criteria) this;
        }

        public Criteria andRExperienceNotIn(List<String> values) {
            addCriterion("r_experience not in", values, "rExperience");
            return (Criteria) this;
        }

        public Criteria andRExperienceBetween(String value1, String value2) {
            addCriterion("r_experience between", value1, value2, "rExperience");
            return (Criteria) this;
        }

        public Criteria andRExperienceNotBetween(String value1, String value2) {
            addCriterion("r_experience not between", value1, value2, "rExperience");
            return (Criteria) this;
        }

        public Criteria andREvaluationIsNull() {
            addCriterion("r_evaluation is null");
            return (Criteria) this;
        }

        public Criteria andREvaluationIsNotNull() {
            addCriterion("r_evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andREvaluationEqualTo(String value) {
            addCriterion("r_evaluation =", value, "rEvaluation");
            return (Criteria) this;
        }

        public Criteria andREvaluationNotEqualTo(String value) {
            addCriterion("r_evaluation <>", value, "rEvaluation");
            return (Criteria) this;
        }

        public Criteria andREvaluationGreaterThan(String value) {
            addCriterion("r_evaluation >", value, "rEvaluation");
            return (Criteria) this;
        }

        public Criteria andREvaluationGreaterThanOrEqualTo(String value) {
            addCriterion("r_evaluation >=", value, "rEvaluation");
            return (Criteria) this;
        }

        public Criteria andREvaluationLessThan(String value) {
            addCriterion("r_evaluation <", value, "rEvaluation");
            return (Criteria) this;
        }

        public Criteria andREvaluationLessThanOrEqualTo(String value) {
            addCriterion("r_evaluation <=", value, "rEvaluation");
            return (Criteria) this;
        }

        public Criteria andREvaluationLike(String value) {
            addCriterion("r_evaluation like", value, "rEvaluation");
            return (Criteria) this;
        }

        public Criteria andREvaluationNotLike(String value) {
            addCriterion("r_evaluation not like", value, "rEvaluation");
            return (Criteria) this;
        }

        public Criteria andREvaluationIn(List<String> values) {
            addCriterion("r_evaluation in", values, "rEvaluation");
            return (Criteria) this;
        }

        public Criteria andREvaluationNotIn(List<String> values) {
            addCriterion("r_evaluation not in", values, "rEvaluation");
            return (Criteria) this;
        }

        public Criteria andREvaluationBetween(String value1, String value2) {
            addCriterion("r_evaluation between", value1, value2, "rEvaluation");
            return (Criteria) this;
        }

        public Criteria andREvaluationNotBetween(String value1, String value2) {
            addCriterion("r_evaluation not between", value1, value2, "rEvaluation");
            return (Criteria) this;
        }

        public Criteria andSubmissionDateIsNull() {
            addCriterion("submission_date is null");
            return (Criteria) this;
        }

        public Criteria andSubmissionDateIsNotNull() {
            addCriterion("submission_date is not null");
            return (Criteria) this;
        }

        public Criteria andSubmissionDateEqualTo(Date value) {
            addCriterion("submission_date =", value, "submissionDate");
            return (Criteria) this;
        }

        public Criteria andSubmissionDateNotEqualTo(Date value) {
            addCriterion("submission_date <>", value, "submissionDate");
            return (Criteria) this;
        }

        public Criteria andSubmissionDateGreaterThan(Date value) {
            addCriterion("submission_date >", value, "submissionDate");
            return (Criteria) this;
        }

        public Criteria andSubmissionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("submission_date >=", value, "submissionDate");
            return (Criteria) this;
        }

        public Criteria andSubmissionDateLessThan(Date value) {
            addCriterion("submission_date <", value, "submissionDate");
            return (Criteria) this;
        }

        public Criteria andSubmissionDateLessThanOrEqualTo(Date value) {
            addCriterion("submission_date <=", value, "submissionDate");
            return (Criteria) this;
        }

        public Criteria andSubmissionDateIn(List<Date> values) {
            addCriterion("submission_date in", values, "submissionDate");
            return (Criteria) this;
        }

        public Criteria andSubmissionDateNotIn(List<Date> values) {
            addCriterion("submission_date not in", values, "submissionDate");
            return (Criteria) this;
        }

        public Criteria andSubmissionDateBetween(Date value1, Date value2) {
            addCriterion("submission_date between", value1, value2, "submissionDate");
            return (Criteria) this;
        }

        public Criteria andSubmissionDateNotBetween(Date value1, Date value2) {
            addCriterion("submission_date not between", value1, value2, "submissionDate");
            return (Criteria) this;
        }

        public Criteria andDraftsIsNull() {
            addCriterion("drafts is null");
            return (Criteria) this;
        }

        public Criteria andDraftsIsNotNull() {
            addCriterion("drafts is not null");
            return (Criteria) this;
        }

        public Criteria andDraftsEqualTo(String value) {
            addCriterion("drafts =", value, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsNotEqualTo(String value) {
            addCriterion("drafts <>", value, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsGreaterThan(String value) {
            addCriterion("drafts >", value, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsGreaterThanOrEqualTo(String value) {
            addCriterion("drafts >=", value, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsLessThan(String value) {
            addCriterion("drafts <", value, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsLessThanOrEqualTo(String value) {
            addCriterion("drafts <=", value, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsLike(String value) {
            addCriterion("drafts like", value, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsNotLike(String value) {
            addCriterion("drafts not like", value, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsIn(List<String> values) {
            addCriterion("drafts in", values, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsNotIn(List<String> values) {
            addCriterion("drafts not in", values, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsBetween(String value1, String value2) {
            addCriterion("drafts between", value1, value2, "drafts");
            return (Criteria) this;
        }

        public Criteria andDraftsNotBetween(String value1, String value2) {
            addCriterion("drafts not between", value1, value2, "drafts");
            return (Criteria) this;
        }

        public Criteria andRStateIsNull() {
            addCriterion("r_state is null");
            return (Criteria) this;
        }

        public Criteria andRStateIsNotNull() {
            addCriterion("r_state is not null");
            return (Criteria) this;
        }

        public Criteria andRStateEqualTo(Integer value) {
            addCriterion("r_state =", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateNotEqualTo(Integer value) {
            addCriterion("r_state <>", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateGreaterThan(Integer value) {
            addCriterion("r_state >", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_state >=", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateLessThan(Integer value) {
            addCriterion("r_state <", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateLessThanOrEqualTo(Integer value) {
            addCriterion("r_state <=", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateIn(List<Integer> values) {
            addCriterion("r_state in", values, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateNotIn(List<Integer> values) {
            addCriterion("r_state not in", values, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateBetween(Integer value1, Integer value2) {
            addCriterion("r_state between", value1, value2, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateNotBetween(Integer value1, Integer value2) {
            addCriterion("r_state not between", value1, value2, "rState");
            return (Criteria) this;
        }

        public Criteria andIndividualIdIsNull() {
            addCriterion("individual_id is null");
            return (Criteria) this;
        }

        public Criteria andIndividualIdIsNotNull() {
            addCriterion("individual_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndividualIdEqualTo(Integer value) {
            addCriterion("individual_id =", value, "individualId");
            return (Criteria) this;
        }

        public Criteria andIndividualIdNotEqualTo(Integer value) {
            addCriterion("individual_id <>", value, "individualId");
            return (Criteria) this;
        }

        public Criteria andIndividualIdGreaterThan(Integer value) {
            addCriterion("individual_id >", value, "individualId");
            return (Criteria) this;
        }

        public Criteria andIndividualIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("individual_id >=", value, "individualId");
            return (Criteria) this;
        }

        public Criteria andIndividualIdLessThan(Integer value) {
            addCriterion("individual_id <", value, "individualId");
            return (Criteria) this;
        }

        public Criteria andIndividualIdLessThanOrEqualTo(Integer value) {
            addCriterion("individual_id <=", value, "individualId");
            return (Criteria) this;
        }

        public Criteria andIndividualIdIn(List<Integer> values) {
            addCriterion("individual_id in", values, "individualId");
            return (Criteria) this;
        }

        public Criteria andIndividualIdNotIn(List<Integer> values) {
            addCriterion("individual_id not in", values, "individualId");
            return (Criteria) this;
        }

        public Criteria andIndividualIdBetween(Integer value1, Integer value2) {
            addCriterion("individual_id between", value1, value2, "individualId");
            return (Criteria) this;
        }

        public Criteria andIndividualIdNotBetween(Integer value1, Integer value2) {
            addCriterion("individual_id not between", value1, value2, "individualId");
            return (Criteria) this;
        }

        public Criteria andRecruitmentInfoidIsNull() {
            addCriterion("recruitment_infoid is null");
            return (Criteria) this;
        }

        public Criteria andRecruitmentInfoidIsNotNull() {
            addCriterion("recruitment_infoid is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitmentInfoidEqualTo(Integer value) {
            addCriterion("recruitment_infoid =", value, "recruitmentInfoid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentInfoidNotEqualTo(Integer value) {
            addCriterion("recruitment_infoid <>", value, "recruitmentInfoid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentInfoidGreaterThan(Integer value) {
            addCriterion("recruitment_infoid >", value, "recruitmentInfoid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentInfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("recruitment_infoid >=", value, "recruitmentInfoid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentInfoidLessThan(Integer value) {
            addCriterion("recruitment_infoid <", value, "recruitmentInfoid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentInfoidLessThanOrEqualTo(Integer value) {
            addCriterion("recruitment_infoid <=", value, "recruitmentInfoid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentInfoidIn(List<Integer> values) {
            addCriterion("recruitment_infoid in", values, "recruitmentInfoid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentInfoidNotIn(List<Integer> values) {
            addCriterion("recruitment_infoid not in", values, "recruitmentInfoid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentInfoidBetween(Integer value1, Integer value2) {
            addCriterion("recruitment_infoid between", value1, value2, "recruitmentInfoid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentInfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("recruitment_infoid not between", value1, value2, "recruitmentInfoid");
            return (Criteria) this;
        }

        public Criteria andEIdIsNull() {
            addCriterion("e_id is null");
            return (Criteria) this;
        }

        public Criteria andEIdIsNotNull() {
            addCriterion("e_id is not null");
            return (Criteria) this;
        }

        public Criteria andEIdEqualTo(Integer value) {
            addCriterion("e_id =", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotEqualTo(Integer value) {
            addCriterion("e_id <>", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThan(Integer value) {
            addCriterion("e_id >", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_id >=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThan(Integer value) {
            addCriterion("e_id <", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThanOrEqualTo(Integer value) {
            addCriterion("e_id <=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdIn(List<Integer> values) {
            addCriterion("e_id in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotIn(List<Integer> values) {
            addCriterion("e_id not in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdBetween(Integer value1, Integer value2) {
            addCriterion("e_id between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotBetween(Integer value1, Integer value2) {
            addCriterion("e_id not between", value1, value2, "eId");
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