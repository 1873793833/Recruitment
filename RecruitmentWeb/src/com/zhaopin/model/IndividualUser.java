package com.zhaopin.model;

import java.util.Date;
import java.util.List;

public class IndividualUser {
    private Integer iId;

    private String iAccount;

    private String iPassword;

    private String iName;

    private String iSex;

    private String iNation;

    private Date iDataOfBirth;

    private String iTel;

    private Integer iPostCode;

    private String iEmial;

    private String iJobIntension;

    private String iDomicile;

    private String iHobby;

    private String iEducationalBg;

    private String iMajor;

    private String iGraduateSchool;

    private String iExperience;

    private String iEvaluation;

    private String iSkill;

    private Date iRegtime;

    private Date iUpdatatime;

    private String type;

    private Integer accStatus;
    
    private List<ResumeInfo> resumeInfos;
    

    public List<ResumeInfo> getResumeInfos() {
		return resumeInfos;
	}

	public void setResumeInfos(List<ResumeInfo> resumeInfos) {
		this.resumeInfos = resumeInfos;
	}

	public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public String getiAccount() {
        return iAccount;
    }

    public void setiAccount(String iAccount) {
        this.iAccount = iAccount == null ? null : iAccount.trim();
    }

    public String getiPassword() {
        return iPassword;
    }

    public void setiPassword(String iPassword) {
        this.iPassword = iPassword == null ? null : iPassword.trim();
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName == null ? null : iName.trim();
    }

    public String getiSex() {
        return iSex;
    }

    public void setiSex(String iSex) {
        this.iSex = iSex == null ? null : iSex.trim();
    }

    public String getiNation() {
        return iNation;
    }

    public void setiNation(String iNation) {
        this.iNation = iNation == null ? null : iNation.trim();
    }

    public Date getiDataOfBirth() {
        return iDataOfBirth;
    }

    public void setiDataOfBirth(Date iDataOfBirth) {
        this.iDataOfBirth = iDataOfBirth;
    }

    public String getiTel() {
        return iTel;
    }

    public void setiTel(String iTel) {
        this.iTel = iTel == null ? null : iTel.trim();
    }

    public Integer getiPostCode() {
        return iPostCode;
    }

    public void setiPostCode(Integer iPostCode) {
        this.iPostCode = iPostCode;
    }

    public String getiEmial() {
        return iEmial;
    }

    public void setiEmial(String iEmial) {
        this.iEmial = iEmial == null ? null : iEmial.trim();
    }

    public String getiJobIntension() {
        return iJobIntension;
    }

    public void setiJobIntension(String iJobIntension) {
        this.iJobIntension = iJobIntension == null ? null : iJobIntension.trim();
    }

    public String getiDomicile() {
        return iDomicile;
    }

    public void setiDomicile(String iDomicile) {
        this.iDomicile = iDomicile == null ? null : iDomicile.trim();
    }

    public String getiHobby() {
        return iHobby;
    }

    public void setiHobby(String iHobby) {
        this.iHobby = iHobby == null ? null : iHobby.trim();
    }

    public String getiEducationalBg() {
        return iEducationalBg;
    }

    public void setiEducationalBg(String iEducationalBg) {
        this.iEducationalBg = iEducationalBg == null ? null : iEducationalBg.trim();
    }

    public String getiMajor() {
        return iMajor;
    }

    public void setiMajor(String iMajor) {
        this.iMajor = iMajor == null ? null : iMajor.trim();
    }

    public String getiGraduateSchool() {
        return iGraduateSchool;
    }

    public void setiGraduateSchool(String iGraduateSchool) {
        this.iGraduateSchool = iGraduateSchool == null ? null : iGraduateSchool.trim();
    }

    public String getiExperience() {
        return iExperience;
    }

    public void setiExperience(String iExperience) {
        this.iExperience = iExperience == null ? null : iExperience.trim();
    }

    public String getiEvaluation() {
        return iEvaluation;
    }

    public void setiEvaluation(String iEvaluation) {
        this.iEvaluation = iEvaluation == null ? null : iEvaluation.trim();
    }

    public String getiSkill() {
        return iSkill;
    }

    public void setiSkill(String iSkill) {
        this.iSkill = iSkill == null ? null : iSkill.trim();
    }

    public Date getiRegtime() {
        return iRegtime;
    }

    public void setiRegtime(Date iRegtime) {
        this.iRegtime = iRegtime;
    }

    public Date getiUpdatatime() {
        return iUpdatatime;
    }

    public void setiUpdatatime(Date iUpdatatime) {
        this.iUpdatatime = iUpdatatime;
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