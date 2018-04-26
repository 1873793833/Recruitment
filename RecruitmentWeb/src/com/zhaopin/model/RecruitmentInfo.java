package com.zhaopin.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class RecruitmentInfo {
    private Integer iId;

    private String position;

    private String place;

    private String corporateName;

    private BigDecimal salary;

    private String corporateSector;

    private String enterpriseNature;

    private String education;

    private Integer numberOfRecruits;

    private String corporateWelfare;

    private String jobInformation;

    private String contactInformation;

    private String companyInformation;

    private Date releaseTime;

    private Date updateTime;

    private Integer enterpriseId;

    private Integer state;

    private EnterpriseUser enterpriseUser;
    
    private List<ResumeInfo> resumeInfos;
    
    
    public List<ResumeInfo> getResumeInfos() {
		return resumeInfos;
	}

	public void setResumeInfos(List<ResumeInfo> resumeInfos) {
		this.resumeInfos = resumeInfos;
	}

	public EnterpriseUser getEnterpriseUser() {
		return enterpriseUser;
	}

	public void setEnterpriseUser(EnterpriseUser enterpriseUser) {
		this.enterpriseUser = enterpriseUser;
	}

	public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName == null ? null : corporateName.trim();
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getCorporateSector() {
        return corporateSector;
    }

    public void setCorporateSector(String corporateSector) {
        this.corporateSector = corporateSector == null ? null : corporateSector.trim();
    }

    public String getEnterpriseNature() {
        return enterpriseNature;
    }

    public void setEnterpriseNature(String enterpriseNature) {
        this.enterpriseNature = enterpriseNature == null ? null : enterpriseNature.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public Integer getNumberOfRecruits() {
        return numberOfRecruits;
    }

    public void setNumberOfRecruits(Integer numberOfRecruits) {
        this.numberOfRecruits = numberOfRecruits;
    }

    public String getCorporateWelfare() {
        return corporateWelfare;
    }

    public void setCorporateWelfare(String corporateWelfare) {
        this.corporateWelfare = corporateWelfare == null ? null : corporateWelfare.trim();
    }

    public String getJobInformation() {
        return jobInformation;
    }

    public void setJobInformation(String jobInformation) {
        this.jobInformation = jobInformation == null ? null : jobInformation.trim();
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation == null ? null : contactInformation.trim();
    }

    public String getCompanyInformation() {
        return companyInformation;
    }

    public void setCompanyInformation(String companyInformation) {
        this.companyInformation = companyInformation == null ? null : companyInformation.trim();
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
  
}