package com.zhaopin.model;

import java.util.Date;

public class ResumeInfo {
    private Integer rId;

    private String rName;

    private String rSex;

    private Date rDataOfBirth;

    private String rTel;

    private String rNation;

    private String rEmail;

    private Integer rPostCode;

    private String rPosition;

    private String rDomicile;

    private String rSkillSpecialty;

    private String rHobby;

    private String rEducationBg;

    private String rMajor;

    private String rGraduateSchool;

    private String rExperience;

    private String rEvaluation;

    private Date submissionDate;

    private String drafts;

    private Integer rState;

    private Integer individualId;

    private Integer recruitmentInfoid;

    private Integer eId;
    
    private RecruitmentInfo recruitmentInfo;
    
    private IndividualUser individualUser;
    
    private EnterpriseUser enterpriseUser;
    
    public RecruitmentInfo getRecruitmentInfo() {
		return recruitmentInfo;
	}

	public void setRecruitmentInfo(RecruitmentInfo recruitmentInfo) {
		this.recruitmentInfo = recruitmentInfo;
	}

	public IndividualUser getIndividualUser() {
		return individualUser;
	}

	public void setIndividualUser(IndividualUser individualUser) {
		this.individualUser = individualUser;
	}

	public EnterpriseUser getEnterpriseUser() {
		return enterpriseUser;
	}

	public void setEnterpriseUser(EnterpriseUser enterpriseUser) {
		this.enterpriseUser = enterpriseUser;
	}

	public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public String getrSex() {
        return rSex;
    }

    public void setrSex(String rSex) {
        this.rSex = rSex == null ? null : rSex.trim();
    }

    public Date getrDataOfBirth() {
        return rDataOfBirth;
    }

    public void setrDataOfBirth(Date rDataOfBirth) {
        this.rDataOfBirth = rDataOfBirth;
    }

    public String getrTel() {
        return rTel;
    }

    public void setrTel(String rTel) {
        this.rTel = rTel == null ? null : rTel.trim();
    }

    public String getrNation() {
        return rNation;
    }

    public void setrNation(String rNation) {
        this.rNation = rNation == null ? null : rNation.trim();
    }

    public String getrEmail() {
        return rEmail;
    }

    public void setrEmail(String rEmail) {
        this.rEmail = rEmail == null ? null : rEmail.trim();
    }

    public Integer getrPostCode() {
        return rPostCode;
    }

    public void setrPostCode(Integer rPostCode) {
        this.rPostCode = rPostCode;
    }

    public String getrPosition() {
        return rPosition;
    }

    public void setrPosition(String rPosition) {
        this.rPosition = rPosition == null ? null : rPosition.trim();
    }

    public String getrDomicile() {
        return rDomicile;
    }

    public void setrDomicile(String rDomicile) {
        this.rDomicile = rDomicile == null ? null : rDomicile.trim();
    }

    public String getrSkillSpecialty() {
        return rSkillSpecialty;
    }

    public void setrSkillSpecialty(String rSkillSpecialty) {
        this.rSkillSpecialty = rSkillSpecialty == null ? null : rSkillSpecialty.trim();
    }

    public String getrHobby() {
        return rHobby;
    }

    public void setrHobby(String rHobby) {
        this.rHobby = rHobby == null ? null : rHobby.trim();
    }

    public String getrEducationBg() {
        return rEducationBg;
    }

    public void setrEducationBg(String rEducationBg) {
        this.rEducationBg = rEducationBg == null ? null : rEducationBg.trim();
    }

    public String getrMajor() {
        return rMajor;
    }

    public void setrMajor(String rMajor) {
        this.rMajor = rMajor == null ? null : rMajor.trim();
    }

    public String getrGraduateSchool() {
        return rGraduateSchool;
    }

    public void setrGraduateSchool(String rGraduateSchool) {
        this.rGraduateSchool = rGraduateSchool == null ? null : rGraduateSchool.trim();
    }

    public String getrExperience() {
        return rExperience;
    }

    public void setrExperience(String rExperience) {
        this.rExperience = rExperience == null ? null : rExperience.trim();
    }

    public String getrEvaluation() {
        return rEvaluation;
    }

    public void setrEvaluation(String rEvaluation) {
        this.rEvaluation = rEvaluation == null ? null : rEvaluation.trim();
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getDrafts() {
        return drafts;
    }

    public void setDrafts(String drafts) {
        this.drafts = drafts == null ? null : drafts.trim();
    }

    public Integer getrState() {
        return rState;
    }

    public void setrState(Integer rState) {
        this.rState = rState;
    }

    public Integer getIndividualId() {
        return individualId;
    }

    public void setIndividualId(Integer individualId) {
        this.individualId = individualId;
    }

    public Integer getRecruitmentInfoid() {
        return recruitmentInfoid;
    }

    public void setRecruitmentInfoid(Integer recruitmentInfoid) {
        this.recruitmentInfoid = recruitmentInfoid;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }
}