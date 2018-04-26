package com.zhaopin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnterpriseUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseUserExample() {
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

        public Criteria andEAccountIsNull() {
            addCriterion("e_account is null");
            return (Criteria) this;
        }

        public Criteria andEAccountIsNotNull() {
            addCriterion("e_account is not null");
            return (Criteria) this;
        }

        public Criteria andEAccountEqualTo(String value) {
            addCriterion("e_account =", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountNotEqualTo(String value) {
            addCriterion("e_account <>", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountGreaterThan(String value) {
            addCriterion("e_account >", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountGreaterThanOrEqualTo(String value) {
            addCriterion("e_account >=", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountLessThan(String value) {
            addCriterion("e_account <", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountLessThanOrEqualTo(String value) {
            addCriterion("e_account <=", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountLike(String value) {
            addCriterion("e_account like", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountNotLike(String value) {
            addCriterion("e_account not like", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountIn(List<String> values) {
            addCriterion("e_account in", values, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountNotIn(List<String> values) {
            addCriterion("e_account not in", values, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountBetween(String value1, String value2) {
            addCriterion("e_account between", value1, value2, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountNotBetween(String value1, String value2) {
            addCriterion("e_account not between", value1, value2, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEPasswordIsNull() {
            addCriterion("e_password is null");
            return (Criteria) this;
        }

        public Criteria andEPasswordIsNotNull() {
            addCriterion("e_password is not null");
            return (Criteria) this;
        }

        public Criteria andEPasswordEqualTo(String value) {
            addCriterion("e_password =", value, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordNotEqualTo(String value) {
            addCriterion("e_password <>", value, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordGreaterThan(String value) {
            addCriterion("e_password >", value, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("e_password >=", value, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordLessThan(String value) {
            addCriterion("e_password <", value, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordLessThanOrEqualTo(String value) {
            addCriterion("e_password <=", value, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordLike(String value) {
            addCriterion("e_password like", value, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordNotLike(String value) {
            addCriterion("e_password not like", value, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordIn(List<String> values) {
            addCriterion("e_password in", values, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordNotIn(List<String> values) {
            addCriterion("e_password not in", values, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordBetween(String value1, String value2) {
            addCriterion("e_password between", value1, value2, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordNotBetween(String value1, String value2) {
            addCriterion("e_password not between", value1, value2, "ePassword");
            return (Criteria) this;
        }

        public Criteria andECompanyNameIsNull() {
            addCriterion("e_company_name is null");
            return (Criteria) this;
        }

        public Criteria andECompanyNameIsNotNull() {
            addCriterion("e_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andECompanyNameEqualTo(String value) {
            addCriterion("e_company_name =", value, "eCompanyName");
            return (Criteria) this;
        }

        public Criteria andECompanyNameNotEqualTo(String value) {
            addCriterion("e_company_name <>", value, "eCompanyName");
            return (Criteria) this;
        }

        public Criteria andECompanyNameGreaterThan(String value) {
            addCriterion("e_company_name >", value, "eCompanyName");
            return (Criteria) this;
        }

        public Criteria andECompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("e_company_name >=", value, "eCompanyName");
            return (Criteria) this;
        }

        public Criteria andECompanyNameLessThan(String value) {
            addCriterion("e_company_name <", value, "eCompanyName");
            return (Criteria) this;
        }

        public Criteria andECompanyNameLessThanOrEqualTo(String value) {
            addCriterion("e_company_name <=", value, "eCompanyName");
            return (Criteria) this;
        }

        public Criteria andECompanyNameLike(String value) {
            addCriterion("e_company_name like", value, "eCompanyName");
            return (Criteria) this;
        }

        public Criteria andECompanyNameNotLike(String value) {
            addCriterion("e_company_name not like", value, "eCompanyName");
            return (Criteria) this;
        }

        public Criteria andECompanyNameIn(List<String> values) {
            addCriterion("e_company_name in", values, "eCompanyName");
            return (Criteria) this;
        }

        public Criteria andECompanyNameNotIn(List<String> values) {
            addCriterion("e_company_name not in", values, "eCompanyName");
            return (Criteria) this;
        }

        public Criteria andECompanyNameBetween(String value1, String value2) {
            addCriterion("e_company_name between", value1, value2, "eCompanyName");
            return (Criteria) this;
        }

        public Criteria andECompanyNameNotBetween(String value1, String value2) {
            addCriterion("e_company_name not between", value1, value2, "eCompanyName");
            return (Criteria) this;
        }

        public Criteria andECorporateSectorIsNull() {
            addCriterion("e_corporate_sector is null");
            return (Criteria) this;
        }

        public Criteria andECorporateSectorIsNotNull() {
            addCriterion("e_corporate_sector is not null");
            return (Criteria) this;
        }

        public Criteria andECorporateSectorEqualTo(String value) {
            addCriterion("e_corporate_sector =", value, "eCorporateSector");
            return (Criteria) this;
        }

        public Criteria andECorporateSectorNotEqualTo(String value) {
            addCriterion("e_corporate_sector <>", value, "eCorporateSector");
            return (Criteria) this;
        }

        public Criteria andECorporateSectorGreaterThan(String value) {
            addCriterion("e_corporate_sector >", value, "eCorporateSector");
            return (Criteria) this;
        }

        public Criteria andECorporateSectorGreaterThanOrEqualTo(String value) {
            addCriterion("e_corporate_sector >=", value, "eCorporateSector");
            return (Criteria) this;
        }

        public Criteria andECorporateSectorLessThan(String value) {
            addCriterion("e_corporate_sector <", value, "eCorporateSector");
            return (Criteria) this;
        }

        public Criteria andECorporateSectorLessThanOrEqualTo(String value) {
            addCriterion("e_corporate_sector <=", value, "eCorporateSector");
            return (Criteria) this;
        }

        public Criteria andECorporateSectorLike(String value) {
            addCriterion("e_corporate_sector like", value, "eCorporateSector");
            return (Criteria) this;
        }

        public Criteria andECorporateSectorNotLike(String value) {
            addCriterion("e_corporate_sector not like", value, "eCorporateSector");
            return (Criteria) this;
        }

        public Criteria andECorporateSectorIn(List<String> values) {
            addCriterion("e_corporate_sector in", values, "eCorporateSector");
            return (Criteria) this;
        }

        public Criteria andECorporateSectorNotIn(List<String> values) {
            addCriterion("e_corporate_sector not in", values, "eCorporateSector");
            return (Criteria) this;
        }

        public Criteria andECorporateSectorBetween(String value1, String value2) {
            addCriterion("e_corporate_sector between", value1, value2, "eCorporateSector");
            return (Criteria) this;
        }

        public Criteria andECorporateSectorNotBetween(String value1, String value2) {
            addCriterion("e_corporate_sector not between", value1, value2, "eCorporateSector");
            return (Criteria) this;
        }

        public Criteria andEEnterpriseNatureIsNull() {
            addCriterion("e_enterprise_nature is null");
            return (Criteria) this;
        }

        public Criteria andEEnterpriseNatureIsNotNull() {
            addCriterion("e_enterprise_nature is not null");
            return (Criteria) this;
        }

        public Criteria andEEnterpriseNatureEqualTo(String value) {
            addCriterion("e_enterprise_nature =", value, "eEnterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEEnterpriseNatureNotEqualTo(String value) {
            addCriterion("e_enterprise_nature <>", value, "eEnterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEEnterpriseNatureGreaterThan(String value) {
            addCriterion("e_enterprise_nature >", value, "eEnterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEEnterpriseNatureGreaterThanOrEqualTo(String value) {
            addCriterion("e_enterprise_nature >=", value, "eEnterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEEnterpriseNatureLessThan(String value) {
            addCriterion("e_enterprise_nature <", value, "eEnterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEEnterpriseNatureLessThanOrEqualTo(String value) {
            addCriterion("e_enterprise_nature <=", value, "eEnterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEEnterpriseNatureLike(String value) {
            addCriterion("e_enterprise_nature like", value, "eEnterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEEnterpriseNatureNotLike(String value) {
            addCriterion("e_enterprise_nature not like", value, "eEnterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEEnterpriseNatureIn(List<String> values) {
            addCriterion("e_enterprise_nature in", values, "eEnterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEEnterpriseNatureNotIn(List<String> values) {
            addCriterion("e_enterprise_nature not in", values, "eEnterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEEnterpriseNatureBetween(String value1, String value2) {
            addCriterion("e_enterprise_nature between", value1, value2, "eEnterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEEnterpriseNatureNotBetween(String value1, String value2) {
            addCriterion("e_enterprise_nature not between", value1, value2, "eEnterpriseNature");
            return (Criteria) this;
        }

        public Criteria andECompanyInfoIsNull() {
            addCriterion("e_company_info is null");
            return (Criteria) this;
        }

        public Criteria andECompanyInfoIsNotNull() {
            addCriterion("e_company_info is not null");
            return (Criteria) this;
        }

        public Criteria andECompanyInfoEqualTo(String value) {
            addCriterion("e_company_info =", value, "eCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andECompanyInfoNotEqualTo(String value) {
            addCriterion("e_company_info <>", value, "eCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andECompanyInfoGreaterThan(String value) {
            addCriterion("e_company_info >", value, "eCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andECompanyInfoGreaterThanOrEqualTo(String value) {
            addCriterion("e_company_info >=", value, "eCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andECompanyInfoLessThan(String value) {
            addCriterion("e_company_info <", value, "eCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andECompanyInfoLessThanOrEqualTo(String value) {
            addCriterion("e_company_info <=", value, "eCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andECompanyInfoLike(String value) {
            addCriterion("e_company_info like", value, "eCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andECompanyInfoNotLike(String value) {
            addCriterion("e_company_info not like", value, "eCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andECompanyInfoIn(List<String> values) {
            addCriterion("e_company_info in", values, "eCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andECompanyInfoNotIn(List<String> values) {
            addCriterion("e_company_info not in", values, "eCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andECompanyInfoBetween(String value1, String value2) {
            addCriterion("e_company_info between", value1, value2, "eCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andECompanyInfoNotBetween(String value1, String value2) {
            addCriterion("e_company_info not between", value1, value2, "eCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andEAddressIsNull() {
            addCriterion("e_address is null");
            return (Criteria) this;
        }

        public Criteria andEAddressIsNotNull() {
            addCriterion("e_address is not null");
            return (Criteria) this;
        }

        public Criteria andEAddressEqualTo(String value) {
            addCriterion("e_address =", value, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressNotEqualTo(String value) {
            addCriterion("e_address <>", value, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressGreaterThan(String value) {
            addCriterion("e_address >", value, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressGreaterThanOrEqualTo(String value) {
            addCriterion("e_address >=", value, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressLessThan(String value) {
            addCriterion("e_address <", value, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressLessThanOrEqualTo(String value) {
            addCriterion("e_address <=", value, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressLike(String value) {
            addCriterion("e_address like", value, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressNotLike(String value) {
            addCriterion("e_address not like", value, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressIn(List<String> values) {
            addCriterion("e_address in", values, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressNotIn(List<String> values) {
            addCriterion("e_address not in", values, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressBetween(String value1, String value2) {
            addCriterion("e_address between", value1, value2, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressNotBetween(String value1, String value2) {
            addCriterion("e_address not between", value1, value2, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEContactsIsNull() {
            addCriterion("e_contacts is null");
            return (Criteria) this;
        }

        public Criteria andEContactsIsNotNull() {
            addCriterion("e_contacts is not null");
            return (Criteria) this;
        }

        public Criteria andEContactsEqualTo(String value) {
            addCriterion("e_contacts =", value, "eContacts");
            return (Criteria) this;
        }

        public Criteria andEContactsNotEqualTo(String value) {
            addCriterion("e_contacts <>", value, "eContacts");
            return (Criteria) this;
        }

        public Criteria andEContactsGreaterThan(String value) {
            addCriterion("e_contacts >", value, "eContacts");
            return (Criteria) this;
        }

        public Criteria andEContactsGreaterThanOrEqualTo(String value) {
            addCriterion("e_contacts >=", value, "eContacts");
            return (Criteria) this;
        }

        public Criteria andEContactsLessThan(String value) {
            addCriterion("e_contacts <", value, "eContacts");
            return (Criteria) this;
        }

        public Criteria andEContactsLessThanOrEqualTo(String value) {
            addCriterion("e_contacts <=", value, "eContacts");
            return (Criteria) this;
        }

        public Criteria andEContactsLike(String value) {
            addCriterion("e_contacts like", value, "eContacts");
            return (Criteria) this;
        }

        public Criteria andEContactsNotLike(String value) {
            addCriterion("e_contacts not like", value, "eContacts");
            return (Criteria) this;
        }

        public Criteria andEContactsIn(List<String> values) {
            addCriterion("e_contacts in", values, "eContacts");
            return (Criteria) this;
        }

        public Criteria andEContactsNotIn(List<String> values) {
            addCriterion("e_contacts not in", values, "eContacts");
            return (Criteria) this;
        }

        public Criteria andEContactsBetween(String value1, String value2) {
            addCriterion("e_contacts between", value1, value2, "eContacts");
            return (Criteria) this;
        }

        public Criteria andEContactsNotBetween(String value1, String value2) {
            addCriterion("e_contacts not between", value1, value2, "eContacts");
            return (Criteria) this;
        }

        public Criteria andEContactNumberIsNull() {
            addCriterion("e_contact_number is null");
            return (Criteria) this;
        }

        public Criteria andEContactNumberIsNotNull() {
            addCriterion("e_contact_number is not null");
            return (Criteria) this;
        }

        public Criteria andEContactNumberEqualTo(String value) {
            addCriterion("e_contact_number =", value, "eContactNumber");
            return (Criteria) this;
        }

        public Criteria andEContactNumberNotEqualTo(String value) {
            addCriterion("e_contact_number <>", value, "eContactNumber");
            return (Criteria) this;
        }

        public Criteria andEContactNumberGreaterThan(String value) {
            addCriterion("e_contact_number >", value, "eContactNumber");
            return (Criteria) this;
        }

        public Criteria andEContactNumberGreaterThanOrEqualTo(String value) {
            addCriterion("e_contact_number >=", value, "eContactNumber");
            return (Criteria) this;
        }

        public Criteria andEContactNumberLessThan(String value) {
            addCriterion("e_contact_number <", value, "eContactNumber");
            return (Criteria) this;
        }

        public Criteria andEContactNumberLessThanOrEqualTo(String value) {
            addCriterion("e_contact_number <=", value, "eContactNumber");
            return (Criteria) this;
        }

        public Criteria andEContactNumberLike(String value) {
            addCriterion("e_contact_number like", value, "eContactNumber");
            return (Criteria) this;
        }

        public Criteria andEContactNumberNotLike(String value) {
            addCriterion("e_contact_number not like", value, "eContactNumber");
            return (Criteria) this;
        }

        public Criteria andEContactNumberIn(List<String> values) {
            addCriterion("e_contact_number in", values, "eContactNumber");
            return (Criteria) this;
        }

        public Criteria andEContactNumberNotIn(List<String> values) {
            addCriterion("e_contact_number not in", values, "eContactNumber");
            return (Criteria) this;
        }

        public Criteria andEContactNumberBetween(String value1, String value2) {
            addCriterion("e_contact_number between", value1, value2, "eContactNumber");
            return (Criteria) this;
        }

        public Criteria andEContactNumberNotBetween(String value1, String value2) {
            addCriterion("e_contact_number not between", value1, value2, "eContactNumber");
            return (Criteria) this;
        }

        public Criteria andEPhoneNumberIsNull() {
            addCriterion("e_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andEPhoneNumberIsNotNull() {
            addCriterion("e_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andEPhoneNumberEqualTo(String value) {
            addCriterion("e_phone_number =", value, "ePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andEPhoneNumberNotEqualTo(String value) {
            addCriterion("e_phone_number <>", value, "ePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andEPhoneNumberGreaterThan(String value) {
            addCriterion("e_phone_number >", value, "ePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andEPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("e_phone_number >=", value, "ePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andEPhoneNumberLessThan(String value) {
            addCriterion("e_phone_number <", value, "ePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andEPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("e_phone_number <=", value, "ePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andEPhoneNumberLike(String value) {
            addCriterion("e_phone_number like", value, "ePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andEPhoneNumberNotLike(String value) {
            addCriterion("e_phone_number not like", value, "ePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andEPhoneNumberIn(List<String> values) {
            addCriterion("e_phone_number in", values, "ePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andEPhoneNumberNotIn(List<String> values) {
            addCriterion("e_phone_number not in", values, "ePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andEPhoneNumberBetween(String value1, String value2) {
            addCriterion("e_phone_number between", value1, value2, "ePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andEPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("e_phone_number not between", value1, value2, "ePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andEEmailIsNull() {
            addCriterion("e_email is null");
            return (Criteria) this;
        }

        public Criteria andEEmailIsNotNull() {
            addCriterion("e_email is not null");
            return (Criteria) this;
        }

        public Criteria andEEmailEqualTo(String value) {
            addCriterion("e_email =", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailNotEqualTo(String value) {
            addCriterion("e_email <>", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailGreaterThan(String value) {
            addCriterion("e_email >", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailGreaterThanOrEqualTo(String value) {
            addCriterion("e_email >=", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailLessThan(String value) {
            addCriterion("e_email <", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailLessThanOrEqualTo(String value) {
            addCriterion("e_email <=", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailLike(String value) {
            addCriterion("e_email like", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailNotLike(String value) {
            addCriterion("e_email not like", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailIn(List<String> values) {
            addCriterion("e_email in", values, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailNotIn(List<String> values) {
            addCriterion("e_email not in", values, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailBetween(String value1, String value2) {
            addCriterion("e_email between", value1, value2, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailNotBetween(String value1, String value2) {
            addCriterion("e_email not between", value1, value2, "eEmail");
            return (Criteria) this;
        }

        public Criteria andERegtimeIsNull() {
            addCriterion("e_regtime is null");
            return (Criteria) this;
        }

        public Criteria andERegtimeIsNotNull() {
            addCriterion("e_regtime is not null");
            return (Criteria) this;
        }

        public Criteria andERegtimeEqualTo(Date value) {
            addCriterion("e_regtime =", value, "eRegtime");
            return (Criteria) this;
        }

        public Criteria andERegtimeNotEqualTo(Date value) {
            addCriterion("e_regtime <>", value, "eRegtime");
            return (Criteria) this;
        }

        public Criteria andERegtimeGreaterThan(Date value) {
            addCriterion("e_regtime >", value, "eRegtime");
            return (Criteria) this;
        }

        public Criteria andERegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("e_regtime >=", value, "eRegtime");
            return (Criteria) this;
        }

        public Criteria andERegtimeLessThan(Date value) {
            addCriterion("e_regtime <", value, "eRegtime");
            return (Criteria) this;
        }

        public Criteria andERegtimeLessThanOrEqualTo(Date value) {
            addCriterion("e_regtime <=", value, "eRegtime");
            return (Criteria) this;
        }

        public Criteria andERegtimeIn(List<Date> values) {
            addCriterion("e_regtime in", values, "eRegtime");
            return (Criteria) this;
        }

        public Criteria andERegtimeNotIn(List<Date> values) {
            addCriterion("e_regtime not in", values, "eRegtime");
            return (Criteria) this;
        }

        public Criteria andERegtimeBetween(Date value1, Date value2) {
            addCriterion("e_regtime between", value1, value2, "eRegtime");
            return (Criteria) this;
        }

        public Criteria andERegtimeNotBetween(Date value1, Date value2) {
            addCriterion("e_regtime not between", value1, value2, "eRegtime");
            return (Criteria) this;
        }

        public Criteria andEUpdatatimeIsNull() {
            addCriterion("e_updatatime is null");
            return (Criteria) this;
        }

        public Criteria andEUpdatatimeIsNotNull() {
            addCriterion("e_updatatime is not null");
            return (Criteria) this;
        }

        public Criteria andEUpdatatimeEqualTo(Date value) {
            addCriterion("e_updatatime =", value, "eUpdatatime");
            return (Criteria) this;
        }

        public Criteria andEUpdatatimeNotEqualTo(Date value) {
            addCriterion("e_updatatime <>", value, "eUpdatatime");
            return (Criteria) this;
        }

        public Criteria andEUpdatatimeGreaterThan(Date value) {
            addCriterion("e_updatatime >", value, "eUpdatatime");
            return (Criteria) this;
        }

        public Criteria andEUpdatatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("e_updatatime >=", value, "eUpdatatime");
            return (Criteria) this;
        }

        public Criteria andEUpdatatimeLessThan(Date value) {
            addCriterion("e_updatatime <", value, "eUpdatatime");
            return (Criteria) this;
        }

        public Criteria andEUpdatatimeLessThanOrEqualTo(Date value) {
            addCriterion("e_updatatime <=", value, "eUpdatatime");
            return (Criteria) this;
        }

        public Criteria andEUpdatatimeIn(List<Date> values) {
            addCriterion("e_updatatime in", values, "eUpdatatime");
            return (Criteria) this;
        }

        public Criteria andEUpdatatimeNotIn(List<Date> values) {
            addCriterion("e_updatatime not in", values, "eUpdatatime");
            return (Criteria) this;
        }

        public Criteria andEUpdatatimeBetween(Date value1, Date value2) {
            addCriterion("e_updatatime between", value1, value2, "eUpdatatime");
            return (Criteria) this;
        }

        public Criteria andEUpdatatimeNotBetween(Date value1, Date value2) {
            addCriterion("e_updatatime not between", value1, value2, "eUpdatatime");
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