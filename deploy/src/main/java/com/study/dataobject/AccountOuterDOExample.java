package com.study.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountOuterDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountOuterDOExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUniqueidIsNull() {
            addCriterion("uniqueId is null");
            return (Criteria) this;
        }

        public Criteria andUniqueidIsNotNull() {
            addCriterion("uniqueId is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueidEqualTo(String value) {
            addCriterion("uniqueId =", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidNotEqualTo(String value) {
            addCriterion("uniqueId <>", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidGreaterThan(String value) {
            addCriterion("uniqueId >", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidGreaterThanOrEqualTo(String value) {
            addCriterion("uniqueId >=", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidLessThan(String value) {
            addCriterion("uniqueId <", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidLessThanOrEqualTo(String value) {
            addCriterion("uniqueId <=", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidLike(String value) {
            addCriterion("uniqueId like", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidNotLike(String value) {
            addCriterion("uniqueId not like", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidIn(List<String> values) {
            addCriterion("uniqueId in", values, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidNotIn(List<String> values) {
            addCriterion("uniqueId not in", values, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidBetween(String value1, String value2) {
            addCriterion("uniqueId between", value1, value2, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidNotBetween(String value1, String value2) {
            addCriterion("uniqueId not between", value1, value2, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLicensetypeIsNull() {
            addCriterion("licenseType is null");
            return (Criteria) this;
        }

        public Criteria andLicensetypeIsNotNull() {
            addCriterion("licenseType is not null");
            return (Criteria) this;
        }

        public Criteria andLicensetypeEqualTo(Byte value) {
            addCriterion("licenseType =", value, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeNotEqualTo(Byte value) {
            addCriterion("licenseType <>", value, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeGreaterThan(Byte value) {
            addCriterion("licenseType >", value, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("licenseType >=", value, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeLessThan(Byte value) {
            addCriterion("licenseType <", value, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeLessThanOrEqualTo(Byte value) {
            addCriterion("licenseType <=", value, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeIn(List<Byte> values) {
            addCriterion("licenseType in", values, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeNotIn(List<Byte> values) {
            addCriterion("licenseType not in", values, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeBetween(Byte value1, Byte value2) {
            addCriterion("licenseType between", value1, value2, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeNotBetween(Byte value1, Byte value2) {
            addCriterion("licenseType not between", value1, value2, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensenumberIsNull() {
            addCriterion("licenseNumber is null");
            return (Criteria) this;
        }

        public Criteria andLicensenumberIsNotNull() {
            addCriterion("licenseNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLicensenumberEqualTo(String value) {
            addCriterion("licenseNumber =", value, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberNotEqualTo(String value) {
            addCriterion("licenseNumber <>", value, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberGreaterThan(String value) {
            addCriterion("licenseNumber >", value, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberGreaterThanOrEqualTo(String value) {
            addCriterion("licenseNumber >=", value, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberLessThan(String value) {
            addCriterion("licenseNumber <", value, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberLessThanOrEqualTo(String value) {
            addCriterion("licenseNumber <=", value, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberLike(String value) {
            addCriterion("licenseNumber like", value, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberNotLike(String value) {
            addCriterion("licenseNumber not like", value, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberIn(List<String> values) {
            addCriterion("licenseNumber in", values, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberNotIn(List<String> values) {
            addCriterion("licenseNumber not in", values, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberBetween(String value1, String value2) {
            addCriterion("licenseNumber between", value1, value2, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andLicensenumberNotBetween(String value1, String value2) {
            addCriterion("licenseNumber not between", value1, value2, "licensenumber");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andOrganizeidIsNull() {
            addCriterion("organizeId is null");
            return (Criteria) this;
        }

        public Criteria andOrganizeidIsNotNull() {
            addCriterion("organizeId is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizeidEqualTo(String value) {
            addCriterion("organizeId =", value, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidNotEqualTo(String value) {
            addCriterion("organizeId <>", value, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidGreaterThan(String value) {
            addCriterion("organizeId >", value, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidGreaterThanOrEqualTo(String value) {
            addCriterion("organizeId >=", value, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidLessThan(String value) {
            addCriterion("organizeId <", value, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidLessThanOrEqualTo(String value) {
            addCriterion("organizeId <=", value, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidLike(String value) {
            addCriterion("organizeId like", value, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidNotLike(String value) {
            addCriterion("organizeId not like", value, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidIn(List<String> values) {
            addCriterion("organizeId in", values, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidNotIn(List<String> values) {
            addCriterion("organizeId not in", values, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidBetween(String value1, String value2) {
            addCriterion("organizeId between", value1, value2, "organizeid");
            return (Criteria) this;
        }

        public Criteria andOrganizeidNotBetween(String value1, String value2) {
            addCriterion("organizeId not between", value1, value2, "organizeid");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPersonidIsNull() {
            addCriterion("personId is null");
            return (Criteria) this;
        }

        public Criteria andPersonidIsNotNull() {
            addCriterion("personId is not null");
            return (Criteria) this;
        }

        public Criteria andPersonidEqualTo(String value) {
            addCriterion("personId =", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotEqualTo(String value) {
            addCriterion("personId <>", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidGreaterThan(String value) {
            addCriterion("personId >", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidGreaterThanOrEqualTo(String value) {
            addCriterion("personId >=", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLessThan(String value) {
            addCriterion("personId <", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLessThanOrEqualTo(String value) {
            addCriterion("personId <=", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLike(String value) {
            addCriterion("personId like", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotLike(String value) {
            addCriterion("personId not like", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidIn(List<String> values) {
            addCriterion("personId in", values, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotIn(List<String> values) {
            addCriterion("personId not in", values, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidBetween(String value1, String value2) {
            addCriterion("personId between", value1, value2, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotBetween(String value1, String value2) {
            addCriterion("personId not between", value1, value2, "personid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("modifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("modifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterion("modifyTime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterion("modifyTime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterion("modifyTime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modifyTime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterion("modifyTime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterion("modifyTime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterion("modifyTime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterion("modifyTime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterion("modifyTime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterion("modifyTime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andOrghashIsNull() {
            addCriterion("orgHash is null");
            return (Criteria) this;
        }

        public Criteria andOrghashIsNotNull() {
            addCriterion("orgHash is not null");
            return (Criteria) this;
        }

        public Criteria andOrghashEqualTo(String value) {
            addCriterion("orgHash =", value, "orghash");
            return (Criteria) this;
        }

        public Criteria andOrghashNotEqualTo(String value) {
            addCriterion("orgHash <>", value, "orghash");
            return (Criteria) this;
        }

        public Criteria andOrghashGreaterThan(String value) {
            addCriterion("orgHash >", value, "orghash");
            return (Criteria) this;
        }

        public Criteria andOrghashGreaterThanOrEqualTo(String value) {
            addCriterion("orgHash >=", value, "orghash");
            return (Criteria) this;
        }

        public Criteria andOrghashLessThan(String value) {
            addCriterion("orgHash <", value, "orghash");
            return (Criteria) this;
        }

        public Criteria andOrghashLessThanOrEqualTo(String value) {
            addCriterion("orgHash <=", value, "orghash");
            return (Criteria) this;
        }

        public Criteria andOrghashLike(String value) {
            addCriterion("orgHash like", value, "orghash");
            return (Criteria) this;
        }

        public Criteria andOrghashNotLike(String value) {
            addCriterion("orgHash not like", value, "orghash");
            return (Criteria) this;
        }

        public Criteria andOrghashIn(List<String> values) {
            addCriterion("orgHash in", values, "orghash");
            return (Criteria) this;
        }

        public Criteria andOrghashNotIn(List<String> values) {
            addCriterion("orgHash not in", values, "orghash");
            return (Criteria) this;
        }

        public Criteria andOrghashBetween(String value1, String value2) {
            addCriterion("orgHash between", value1, value2, "orghash");
            return (Criteria) this;
        }

        public Criteria andOrghashNotBetween(String value1, String value2) {
            addCriterion("orgHash not between", value1, value2, "orghash");
            return (Criteria) this;
        }

        public Criteria andPrivacyIsNull() {
            addCriterion("privacy is null");
            return (Criteria) this;
        }

        public Criteria andPrivacyIsNotNull() {
            addCriterion("privacy is not null");
            return (Criteria) this;
        }

        public Criteria andPrivacyEqualTo(Byte value) {
            addCriterion("privacy =", value, "privacy");
            return (Criteria) this;
        }

        public Criteria andPrivacyNotEqualTo(Byte value) {
            addCriterion("privacy <>", value, "privacy");
            return (Criteria) this;
        }

        public Criteria andPrivacyGreaterThan(Byte value) {
            addCriterion("privacy >", value, "privacy");
            return (Criteria) this;
        }

        public Criteria andPrivacyGreaterThanOrEqualTo(Byte value) {
            addCriterion("privacy >=", value, "privacy");
            return (Criteria) this;
        }

        public Criteria andPrivacyLessThan(Byte value) {
            addCriterion("privacy <", value, "privacy");
            return (Criteria) this;
        }

        public Criteria andPrivacyLessThanOrEqualTo(Byte value) {
            addCriterion("privacy <=", value, "privacy");
            return (Criteria) this;
        }

        public Criteria andPrivacyIn(List<Byte> values) {
            addCriterion("privacy in", values, "privacy");
            return (Criteria) this;
        }

        public Criteria andPrivacyNotIn(List<Byte> values) {
            addCriterion("privacy not in", values, "privacy");
            return (Criteria) this;
        }

        public Criteria andPrivacyBetween(Byte value1, Byte value2) {
            addCriterion("privacy between", value1, value2, "privacy");
            return (Criteria) this;
        }

        public Criteria andPrivacyNotBetween(Byte value1, Byte value2) {
            addCriterion("privacy not between", value1, value2, "privacy");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andEsignaccountidIsNull() {
            addCriterion("esignAccountId is null");
            return (Criteria) this;
        }

        public Criteria andEsignaccountidIsNotNull() {
            addCriterion("esignAccountId is not null");
            return (Criteria) this;
        }

        public Criteria andEsignaccountidEqualTo(String value) {
            addCriterion("esignAccountId =", value, "esignaccountid");
            return (Criteria) this;
        }

        public Criteria andEsignaccountidNotEqualTo(String value) {
            addCriterion("esignAccountId <>", value, "esignaccountid");
            return (Criteria) this;
        }

        public Criteria andEsignaccountidGreaterThan(String value) {
            addCriterion("esignAccountId >", value, "esignaccountid");
            return (Criteria) this;
        }

        public Criteria andEsignaccountidGreaterThanOrEqualTo(String value) {
            addCriterion("esignAccountId >=", value, "esignaccountid");
            return (Criteria) this;
        }

        public Criteria andEsignaccountidLessThan(String value) {
            addCriterion("esignAccountId <", value, "esignaccountid");
            return (Criteria) this;
        }

        public Criteria andEsignaccountidLessThanOrEqualTo(String value) {
            addCriterion("esignAccountId <=", value, "esignaccountid");
            return (Criteria) this;
        }

        public Criteria andEsignaccountidLike(String value) {
            addCriterion("esignAccountId like", value, "esignaccountid");
            return (Criteria) this;
        }

        public Criteria andEsignaccountidNotLike(String value) {
            addCriterion("esignAccountId not like", value, "esignaccountid");
            return (Criteria) this;
        }

        public Criteria andEsignaccountidIn(List<String> values) {
            addCriterion("esignAccountId in", values, "esignaccountid");
            return (Criteria) this;
        }

        public Criteria andEsignaccountidNotIn(List<String> values) {
            addCriterion("esignAccountId not in", values, "esignaccountid");
            return (Criteria) this;
        }

        public Criteria andEsignaccountidBetween(String value1, String value2) {
            addCriterion("esignAccountId between", value1, value2, "esignaccountid");
            return (Criteria) this;
        }

        public Criteria andEsignaccountidNotBetween(String value1, String value2) {
            addCriterion("esignAccountId not between", value1, value2, "esignaccountid");
            return (Criteria) this;
        }

        public Criteria andOauthaccountidIsNull() {
            addCriterion("oauthAccountId is null");
            return (Criteria) this;
        }

        public Criteria andOauthaccountidIsNotNull() {
            addCriterion("oauthAccountId is not null");
            return (Criteria) this;
        }

        public Criteria andOauthaccountidEqualTo(String value) {
            addCriterion("oauthAccountId =", value, "oauthaccountid");
            return (Criteria) this;
        }

        public Criteria andOauthaccountidNotEqualTo(String value) {
            addCriterion("oauthAccountId <>", value, "oauthaccountid");
            return (Criteria) this;
        }

        public Criteria andOauthaccountidGreaterThan(String value) {
            addCriterion("oauthAccountId >", value, "oauthaccountid");
            return (Criteria) this;
        }

        public Criteria andOauthaccountidGreaterThanOrEqualTo(String value) {
            addCriterion("oauthAccountId >=", value, "oauthaccountid");
            return (Criteria) this;
        }

        public Criteria andOauthaccountidLessThan(String value) {
            addCriterion("oauthAccountId <", value, "oauthaccountid");
            return (Criteria) this;
        }

        public Criteria andOauthaccountidLessThanOrEqualTo(String value) {
            addCriterion("oauthAccountId <=", value, "oauthaccountid");
            return (Criteria) this;
        }

        public Criteria andOauthaccountidLike(String value) {
            addCriterion("oauthAccountId like", value, "oauthaccountid");
            return (Criteria) this;
        }

        public Criteria andOauthaccountidNotLike(String value) {
            addCriterion("oauthAccountId not like", value, "oauthaccountid");
            return (Criteria) this;
        }

        public Criteria andOauthaccountidIn(List<String> values) {
            addCriterion("oauthAccountId in", values, "oauthaccountid");
            return (Criteria) this;
        }

        public Criteria andOauthaccountidNotIn(List<String> values) {
            addCriterion("oauthAccountId not in", values, "oauthaccountid");
            return (Criteria) this;
        }

        public Criteria andOauthaccountidBetween(String value1, String value2) {
            addCriterion("oauthAccountId between", value1, value2, "oauthaccountid");
            return (Criteria) this;
        }

        public Criteria andOauthaccountidNotBetween(String value1, String value2) {
            addCriterion("oauthAccountId not between", value1, value2, "oauthaccountid");
            return (Criteria) this;
        }

        public Criteria andEsignorgidIsNull() {
            addCriterion("esignOrgId is null");
            return (Criteria) this;
        }

        public Criteria andEsignorgidIsNotNull() {
            addCriterion("esignOrgId is not null");
            return (Criteria) this;
        }

        public Criteria andEsignorgidEqualTo(String value) {
            addCriterion("esignOrgId =", value, "esignorgid");
            return (Criteria) this;
        }

        public Criteria andEsignorgidNotEqualTo(String value) {
            addCriterion("esignOrgId <>", value, "esignorgid");
            return (Criteria) this;
        }

        public Criteria andEsignorgidGreaterThan(String value) {
            addCriterion("esignOrgId >", value, "esignorgid");
            return (Criteria) this;
        }

        public Criteria andEsignorgidGreaterThanOrEqualTo(String value) {
            addCriterion("esignOrgId >=", value, "esignorgid");
            return (Criteria) this;
        }

        public Criteria andEsignorgidLessThan(String value) {
            addCriterion("esignOrgId <", value, "esignorgid");
            return (Criteria) this;
        }

        public Criteria andEsignorgidLessThanOrEqualTo(String value) {
            addCriterion("esignOrgId <=", value, "esignorgid");
            return (Criteria) this;
        }

        public Criteria andEsignorgidLike(String value) {
            addCriterion("esignOrgId like", value, "esignorgid");
            return (Criteria) this;
        }

        public Criteria andEsignorgidNotLike(String value) {
            addCriterion("esignOrgId not like", value, "esignorgid");
            return (Criteria) this;
        }

        public Criteria andEsignorgidIn(List<String> values) {
            addCriterion("esignOrgId in", values, "esignorgid");
            return (Criteria) this;
        }

        public Criteria andEsignorgidNotIn(List<String> values) {
            addCriterion("esignOrgId not in", values, "esignorgid");
            return (Criteria) this;
        }

        public Criteria andEsignorgidBetween(String value1, String value2) {
            addCriterion("esignOrgId between", value1, value2, "esignorgid");
            return (Criteria) this;
        }

        public Criteria andEsignorgidNotBetween(String value1, String value2) {
            addCriterion("esignOrgId not between", value1, value2, "esignorgid");
            return (Criteria) this;
        }

        public Criteria andEsignrealnameflowidIsNull() {
            addCriterion("esignRealnameFlowId is null");
            return (Criteria) this;
        }

        public Criteria andEsignrealnameflowidIsNotNull() {
            addCriterion("esignRealnameFlowId is not null");
            return (Criteria) this;
        }

        public Criteria andEsignrealnameflowidEqualTo(String value) {
            addCriterion("esignRealnameFlowId =", value, "esignrealnameflowid");
            return (Criteria) this;
        }

        public Criteria andEsignrealnameflowidNotEqualTo(String value) {
            addCriterion("esignRealnameFlowId <>", value, "esignrealnameflowid");
            return (Criteria) this;
        }

        public Criteria andEsignrealnameflowidGreaterThan(String value) {
            addCriterion("esignRealnameFlowId >", value, "esignrealnameflowid");
            return (Criteria) this;
        }

        public Criteria andEsignrealnameflowidGreaterThanOrEqualTo(String value) {
            addCriterion("esignRealnameFlowId >=", value, "esignrealnameflowid");
            return (Criteria) this;
        }

        public Criteria andEsignrealnameflowidLessThan(String value) {
            addCriterion("esignRealnameFlowId <", value, "esignrealnameflowid");
            return (Criteria) this;
        }

        public Criteria andEsignrealnameflowidLessThanOrEqualTo(String value) {
            addCriterion("esignRealnameFlowId <=", value, "esignrealnameflowid");
            return (Criteria) this;
        }

        public Criteria andEsignrealnameflowidLike(String value) {
            addCriterion("esignRealnameFlowId like", value, "esignrealnameflowid");
            return (Criteria) this;
        }

        public Criteria andEsignrealnameflowidNotLike(String value) {
            addCriterion("esignRealnameFlowId not like", value, "esignrealnameflowid");
            return (Criteria) this;
        }

        public Criteria andEsignrealnameflowidIn(List<String> values) {
            addCriterion("esignRealnameFlowId in", values, "esignrealnameflowid");
            return (Criteria) this;
        }

        public Criteria andEsignrealnameflowidNotIn(List<String> values) {
            addCriterion("esignRealnameFlowId not in", values, "esignrealnameflowid");
            return (Criteria) this;
        }

        public Criteria andEsignrealnameflowidBetween(String value1, String value2) {
            addCriterion("esignRealnameFlowId between", value1, value2, "esignrealnameflowid");
            return (Criteria) this;
        }

        public Criteria andEsignrealnameflowidNotBetween(String value1, String value2) {
            addCriterion("esignRealnameFlowId not between", value1, value2, "esignrealnameflowid");
            return (Criteria) this;
        }

        public Criteria andLoginmobileIsNull() {
            addCriterion("loginMobile is null");
            return (Criteria) this;
        }

        public Criteria andLoginmobileIsNotNull() {
            addCriterion("loginMobile is not null");
            return (Criteria) this;
        }

        public Criteria andLoginmobileEqualTo(String value) {
            addCriterion("loginMobile =", value, "loginmobile");
            return (Criteria) this;
        }

        public Criteria andLoginmobileNotEqualTo(String value) {
            addCriterion("loginMobile <>", value, "loginmobile");
            return (Criteria) this;
        }

        public Criteria andLoginmobileGreaterThan(String value) {
            addCriterion("loginMobile >", value, "loginmobile");
            return (Criteria) this;
        }

        public Criteria andLoginmobileGreaterThanOrEqualTo(String value) {
            addCriterion("loginMobile >=", value, "loginmobile");
            return (Criteria) this;
        }

        public Criteria andLoginmobileLessThan(String value) {
            addCriterion("loginMobile <", value, "loginmobile");
            return (Criteria) this;
        }

        public Criteria andLoginmobileLessThanOrEqualTo(String value) {
            addCriterion("loginMobile <=", value, "loginmobile");
            return (Criteria) this;
        }

        public Criteria andLoginmobileLike(String value) {
            addCriterion("loginMobile like", value, "loginmobile");
            return (Criteria) this;
        }

        public Criteria andLoginmobileNotLike(String value) {
            addCriterion("loginMobile not like", value, "loginmobile");
            return (Criteria) this;
        }

        public Criteria andLoginmobileIn(List<String> values) {
            addCriterion("loginMobile in", values, "loginmobile");
            return (Criteria) this;
        }

        public Criteria andLoginmobileNotIn(List<String> values) {
            addCriterion("loginMobile not in", values, "loginmobile");
            return (Criteria) this;
        }

        public Criteria andLoginmobileBetween(String value1, String value2) {
            addCriterion("loginMobile between", value1, value2, "loginmobile");
            return (Criteria) this;
        }

        public Criteria andLoginmobileNotBetween(String value1, String value2) {
            addCriterion("loginMobile not between", value1, value2, "loginmobile");
            return (Criteria) this;
        }

        public Criteria andLoginemailIsNull() {
            addCriterion("loginEmail is null");
            return (Criteria) this;
        }

        public Criteria andLoginemailIsNotNull() {
            addCriterion("loginEmail is not null");
            return (Criteria) this;
        }

        public Criteria andLoginemailEqualTo(String value) {
            addCriterion("loginEmail =", value, "loginemail");
            return (Criteria) this;
        }

        public Criteria andLoginemailNotEqualTo(String value) {
            addCriterion("loginEmail <>", value, "loginemail");
            return (Criteria) this;
        }

        public Criteria andLoginemailGreaterThan(String value) {
            addCriterion("loginEmail >", value, "loginemail");
            return (Criteria) this;
        }

        public Criteria andLoginemailGreaterThanOrEqualTo(String value) {
            addCriterion("loginEmail >=", value, "loginemail");
            return (Criteria) this;
        }

        public Criteria andLoginemailLessThan(String value) {
            addCriterion("loginEmail <", value, "loginemail");
            return (Criteria) this;
        }

        public Criteria andLoginemailLessThanOrEqualTo(String value) {
            addCriterion("loginEmail <=", value, "loginemail");
            return (Criteria) this;
        }

        public Criteria andLoginemailLike(String value) {
            addCriterion("loginEmail like", value, "loginemail");
            return (Criteria) this;
        }

        public Criteria andLoginemailNotLike(String value) {
            addCriterion("loginEmail not like", value, "loginemail");
            return (Criteria) this;
        }

        public Criteria andLoginemailIn(List<String> values) {
            addCriterion("loginEmail in", values, "loginemail");
            return (Criteria) this;
        }

        public Criteria andLoginemailNotIn(List<String> values) {
            addCriterion("loginEmail not in", values, "loginemail");
            return (Criteria) this;
        }

        public Criteria andLoginemailBetween(String value1, String value2) {
            addCriterion("loginEmail between", value1, value2, "loginemail");
            return (Criteria) this;
        }

        public Criteria andLoginemailNotBetween(String value1, String value2) {
            addCriterion("loginEmail not between", value1, value2, "loginemail");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNull() {
            addCriterion("cardNo is null");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNotNull() {
            addCriterion("cardNo is not null");
            return (Criteria) this;
        }

        public Criteria andCardnoEqualTo(String value) {
            addCriterion("cardNo =", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotEqualTo(String value) {
            addCriterion("cardNo <>", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThan(String value) {
            addCriterion("cardNo >", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("cardNo >=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThan(String value) {
            addCriterion("cardNo <", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThanOrEqualTo(String value) {
            addCriterion("cardNo <=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLike(String value) {
            addCriterion("cardNo like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotLike(String value) {
            addCriterion("cardNo not like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoIn(List<String> values) {
            addCriterion("cardNo in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotIn(List<String> values) {
            addCriterion("cardNo not in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoBetween(String value1, String value2) {
            addCriterion("cardNo between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotBetween(String value1, String value2) {
            addCriterion("cardNo not between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andIsguidedIsNull() {
            addCriterion("isGuided is null");
            return (Criteria) this;
        }

        public Criteria andIsguidedIsNotNull() {
            addCriterion("isGuided is not null");
            return (Criteria) this;
        }

        public Criteria andIsguidedEqualTo(Byte value) {
            addCriterion("isGuided =", value, "isguided");
            return (Criteria) this;
        }

        public Criteria andIsguidedNotEqualTo(Byte value) {
            addCriterion("isGuided <>", value, "isguided");
            return (Criteria) this;
        }

        public Criteria andIsguidedGreaterThan(Byte value) {
            addCriterion("isGuided >", value, "isguided");
            return (Criteria) this;
        }

        public Criteria andIsguidedGreaterThanOrEqualTo(Byte value) {
            addCriterion("isGuided >=", value, "isguided");
            return (Criteria) this;
        }

        public Criteria andIsguidedLessThan(Byte value) {
            addCriterion("isGuided <", value, "isguided");
            return (Criteria) this;
        }

        public Criteria andIsguidedLessThanOrEqualTo(Byte value) {
            addCriterion("isGuided <=", value, "isguided");
            return (Criteria) this;
        }

        public Criteria andIsguidedIn(List<Byte> values) {
            addCriterion("isGuided in", values, "isguided");
            return (Criteria) this;
        }

        public Criteria andIsguidedNotIn(List<Byte> values) {
            addCriterion("isGuided not in", values, "isguided");
            return (Criteria) this;
        }

        public Criteria andIsguidedBetween(Byte value1, Byte value2) {
            addCriterion("isGuided between", value1, value2, "isguided");
            return (Criteria) this;
        }

        public Criteria andIsguidedNotBetween(Byte value1, Byte value2) {
            addCriterion("isGuided not between", value1, value2, "isguided");
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