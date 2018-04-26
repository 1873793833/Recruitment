package com.zhaopin.model;

import java.util.Date;
import java.util.List;

public class EnterpriseUser {
    private Integer eId;

    private String eAccount;

    private String ePassword;

    private String eCompanyName;

    private String eCorporateSector;

    private String eEnterpriseNature;

    private String eCompanyInfo;

    private String eAddress;

    private String eContacts;

    private String eContactNumber;

    private String ePhoneNumber;

    private String eEmail;

    private Date eRegtime;

    private Date eUpdatatime;

    private String type;

    private Integer accStatus;
    
    private List<RecruitmentInfo> recruitmentInfos;

    public List<RecruitmentInfo> getRecruitmentInfos() {
		return recruitmentInfos;
	}

	public void setRecruitmentInfos(List<RecruitmentInfo> recruitmentInfos) {
		this.recruitmentInfos = recruitmentInfos;
	}

	public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteAccount() {
        return eAccount;
    }

    public void seteAccount(String eAccount) {
        this.eAccount = eAccount == null ? null : eAccount.trim();
    }

    public String getePassword() {
        return ePassword;
    }

    public void setePassword(String ePassword) {
        this.ePassword = ePassword == null ? null : ePassword.trim();
    }

    public String geteCompanyName() {
        return eCompanyName;
    }

    public void seteCompanyName(String eCompanyName) {
        this.eCompanyName = eCompanyName == null ? null : eCompanyName.trim();
    }

    public String geteCorporateSector() {
        return eCorporateSector;
    }

    public void seteCorporateSector(String eCorporateSector) {
        this.eCorporateSector = eCorporateSector == null ? null : eCorporateSector.trim();
    }

    public String geteEnterpriseNature() {
        return eEnterpriseNature;
    }

    public void seteEnterpriseNature(String eEnterpriseNature) {
        this.eEnterpriseNature = eEnterpriseNature == null ? null : eEnterpriseNature.trim();
    }

    public String geteCompanyInfo() {
        return eCompanyInfo;
    }

    public void seteCompanyInfo(String eCompanyInfo) {
        this.eCompanyInfo = eCompanyInfo == null ? null : eCompanyInfo.trim();
    }

    public String geteAddress() {
        return eAddress;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress == null ? null : eAddress.trim();
    }

    public String geteContacts() {
        return eContacts;
    }

    public void seteContacts(String eContacts) {
        this.eContacts = eContacts == null ? null : eContacts.trim();
    }

    public String geteContactNumber() {
        return eContactNumber;
    }

    public void seteContactNumber(String eContactNumber) {
        this.eContactNumber = eContactNumber == null ? null : eContactNumber.trim();
    }

    public String getePhoneNumber() {
        return ePhoneNumber;
    }

    public void setePhoneNumber(String ePhoneNumber) {
        this.ePhoneNumber = ePhoneNumber == null ? null : ePhoneNumber.trim();
    }

    public String geteEmail() {
        return eEmail;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail == null ? null : eEmail.trim();
    }

    public Date geteRegtime() {
        return eRegtime;
    }

    public void seteRegtime(Date eRegtime) {
        this.eRegtime = eRegtime;
    }

    public Date geteUpdatatime() {
        return eUpdatatime;
    }

    public void seteUpdatatime(Date eUpdatatime) {
        this.eUpdatatime = eUpdatatime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(Integer accStatus) {
        this.accStatus = accStatus;
    }
}