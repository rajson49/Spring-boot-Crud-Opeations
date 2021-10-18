package com.example.spring_backend.model;


import javax.persistence.*;

@Entity
@Table(name = "courses")
public class UniversityCourses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "summary")
    private String summary;
    @Column(name = "overview")
    private String overview;
    @Column(name = "logo")
    private String logo;
    @Column(name = "level")
    private String level;
    @Column(name = "category")
    private String category;
    @Column(name = "degree")
    private String degree;
    @Column(name = "totalCredit")
    private String totalCredit;
    @Column(name = "totalCreditUnit")
    private String totalCreditUnit;
    @Column(name = "tuitionFee")
    private String tuitionFee;
    @Column(name = "tuitionFeeUnit")
    private String tuitionFeeUnit;
    @Column(name = "tuitionFreeCurrency")
    private String tuitionFreeCurrency;
    @Column(name = "outline")
    private String outline;
    @Column(name = "languages")
    private String languages;
    @Column(name = "durationInMonth")
    private String durationInMonth;
    @Column(name = "durationInSemester")
    private String durationInSemester;
    @Column(name = "instituteId")
    private String instituteId;
    @Column(name = "instituteName")
    private String instituteName;
    @Column(name = "institutePriority")
    private String institutePriority;
    @Column(name = "livingCostMin")
    private String livingCostMin;
    @Column(name = "livingCostMax")
    private String livingCostMax;
    @Column(name = "livingCostCurrency")
    private String livingCostCurrency;
    @Column(name = "livingCostDetails")
    private String livingCostDetails;
    @Column(name = "locations__street")
    private String locations__street;
    @Column(name = "locations__city")
    private String locations__city;
    @Column(name = "locations__country")
    private String locations__country;
    @Column(name = "locations__zip")
    private String locations__zip;
    @Column(name = "locations__location")
    private String locations__location;
    @Column(name = "deadlines__dayOfMonth")
    private String deadlines__dayOfMonth;
    @Column(name = "deadlines__semester")
    private String deadlines__semester;
    @Column(name = "deadlines__applicant")
    private String deadlines__applicant;
    @Column(name = "requiredLanguageTests__testName")
    private String requiredLanguageTests__testName;
    @Column(name = "requiredLanguageTests__minScore")
    private String requiredLanguageTests__minScore;
    @Column(name = "requiredLanguageTests__minScoreLabel")
    private String requiredLanguageTests__minScoreLabel;
    @Column(name = "admission_requirement_minimum_level")
    private String admission_requirement_minimum_level;
    @Column(name = "minimum_level_text")
    private String minimum_level_text;
    @Column(name = "admission_exam")
    private String admission_exam;
    @Column(name = "sop")
    private String sop;
    @Column(name = "cv")
    private String cv;
    @Column(name = "other_requirements")
    private String other_requirements;
    @Column(name = "fundingList__by")
    private String fundingList__by;
    @Column(name = "fundingList__requirement")
    private String fundingList__requirement;
    @Column(name = "fundingList__applicationProcess")
    private String fundingList__applicationProcess;
    @Column(name = "fundingList__amountMax")
    private String fundingList__amountMax;
    @Column(name = "fundingList__currency")
    private String fundingList__currency;
    @Column(name = "official")
    private String official;
    @Column(name = "partTime")
    private String partTime;
    @Column(name = "fullTime")
    private String fullTime;
    @Column(name = "faceToFace")
    private String faceToFace;
    @Column(name = "online")
    private String online;
    @Column(name = "blended")
    private String blended;
    @Column(name = "pictures")
    private String pictures;

    public UniversityCourses(long id, String title, String summary, String overview, String logo, String level, String category, String degree, String totalCredit, String totalCreditUnit, String tuitionFee, String tuitionFeeUnit, String tuitionFreeCurrency, String outline, String languages, String durationInMonth, String durationInSemester, String instituteId, String instituteName, String institutePriority, String livingCostMin, String livingCostMax, String livingCostCurrency, String livingCostDetails, String locations__street, String locations__city, String locations__country, String locations__zip, String locations__location, String deadlines__dayOfMonth, String deadlines__semester, String deadlines__applicant, String requiredLanguageTests__testName, String requiredLanguageTests__minScore, String requiredLanguageTests__minScoreLabel, String admission_requirement_minimum_level, String minimum_level_text, String admission_exam, String sop, String cv, String other_requirements, String fundingList__by, String fundingList__requirement, String fundingList__applicationProcess, String fundingList__amountMax, String fundingList__currency, String official, String partTime, String fullTime, String faceToFace, String online, String blended, String pictures) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.overview = overview;
        this.logo = logo;
        this.level = level;
        this.category = category;
        this.degree = degree;
        this.totalCredit = totalCredit;
        this.totalCreditUnit = totalCreditUnit;
        this.tuitionFee = tuitionFee;
        this.tuitionFeeUnit = tuitionFeeUnit;
        this.tuitionFreeCurrency = tuitionFreeCurrency;
        this.outline = outline;
        this.languages = languages;
        this.durationInMonth = durationInMonth;
        this.durationInSemester = durationInSemester;
        this.instituteId = instituteId;
        this.instituteName = instituteName;
        this.institutePriority = institutePriority;
        this.livingCostMin = livingCostMin;
        this.livingCostMax = livingCostMax;
        this.livingCostCurrency = livingCostCurrency;
        this.livingCostDetails = livingCostDetails;
        this.locations__street = locations__street;
        this.locations__city = locations__city;
        this.locations__country = locations__country;
        this.locations__zip = locations__zip;
        this.locations__location = locations__location;
        this.deadlines__dayOfMonth = deadlines__dayOfMonth;
        this.deadlines__semester = deadlines__semester;
        this.deadlines__applicant = deadlines__applicant;
        this.requiredLanguageTests__testName = requiredLanguageTests__testName;
        this.requiredLanguageTests__minScore = requiredLanguageTests__minScore;
        this.requiredLanguageTests__minScoreLabel = requiredLanguageTests__minScoreLabel;
        this.admission_requirement_minimum_level = admission_requirement_minimum_level;
        this.minimum_level_text = minimum_level_text;
        this.admission_exam = admission_exam;
        this.sop = sop;
        this.cv = cv;
        this.other_requirements = other_requirements;
        this.fundingList__by = fundingList__by;
        this.fundingList__requirement = fundingList__requirement;
        this.fundingList__applicationProcess = fundingList__applicationProcess;
        this.fundingList__amountMax = fundingList__amountMax;
        this.fundingList__currency = fundingList__currency;
        this.official = official;
        this.partTime = partTime;
        this.fullTime = fullTime;
        this.faceToFace = faceToFace;
        this.online = online;
        this.blended = blended;
        this.pictures = pictures;
    }

    public UniversityCourses() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(String totalCredit) {
        this.totalCredit = totalCredit;
    }

    public String getTotalCreditUnit() {
        return totalCreditUnit;
    }

    public void setTotalCreditUnit(String totalCreditUnit) {
        this.totalCreditUnit = totalCreditUnit;
    }

    public String getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(String tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public String getTuitionFeeUnit() {
        return tuitionFeeUnit;
    }

    public void setTuitionFeeUnit(String tuitionFeeUnit) {
        this.tuitionFeeUnit = tuitionFeeUnit;
    }

    public String getTuitionFreeCurrency() {
        return tuitionFreeCurrency;
    }

    public void setTuitionFreeCurrency(String tuitionFreeCurrency) {
        this.tuitionFreeCurrency = tuitionFreeCurrency;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getDurationInMonth() {
        return durationInMonth;
    }

    public void setDurationInMonth(String durationInMonth) {
        this.durationInMonth = durationInMonth;
    }

    public String getDurationInSemester() {
        return durationInSemester;
    }

    public void setDurationInSemester(String durationInSemester) {
        this.durationInSemester = durationInSemester;
    }

    public String getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(String instituteId) {
        this.instituteId = instituteId;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getInstitutePriority() {
        return institutePriority;
    }

    public void setInstitutePriority(String institutePriority) {
        this.institutePriority = institutePriority;
    }

    public String getLivingCostMin() {
        return livingCostMin;
    }

    public void setLivingCostMin(String livingCostMin) {
        this.livingCostMin = livingCostMin;
    }

    public String getLivingCostMax() {
        return livingCostMax;
    }

    public void setLivingCostMax(String livingCostMax) {
        this.livingCostMax = livingCostMax;
    }

    public String getLivingCostCurrency() {
        return livingCostCurrency;
    }

    public void setLivingCostCurrency(String livingCostCurrency) {
        this.livingCostCurrency = livingCostCurrency;
    }

    public String getLivingCostDetails() {
        return livingCostDetails;
    }

    public void setLivingCostDetails(String livingCostDetails) {
        this.livingCostDetails = livingCostDetails;
    }

    public String getLocations__street() {
        return locations__street;
    }

    public void setLocations__street(String locations__street) {
        this.locations__street = locations__street;
    }

    public String getLocations__city() {
        return locations__city;
    }

    public void setLocations__city(String locations__city) {
        this.locations__city = locations__city;
    }

    public String getLocations__country() {
        return locations__country;
    }

    public void setLocations__country(String locations__country) {
        this.locations__country = locations__country;
    }

    public String getLocations__zip() {
        return locations__zip;
    }

    public void setLocations__zip(String locations__zip) {
        this.locations__zip = locations__zip;
    }

    public String getLocations__location() {
        return locations__location;
    }

    public void setLocations__location(String locations__location) {
        this.locations__location = locations__location;
    }

    public String getDeadlines__dayOfMonth() {
        return deadlines__dayOfMonth;
    }

    public void setDeadlines__dayOfMonth(String deadlines__dayOfMonth) {
        this.deadlines__dayOfMonth = deadlines__dayOfMonth;
    }

    public String getDeadlines__semester() {
        return deadlines__semester;
    }

    public void setDeadlines__semester(String deadlines__semester) {
        this.deadlines__semester = deadlines__semester;
    }

    public String getDeadlines__applicant() {
        return deadlines__applicant;
    }

    public void setDeadlines__applicant(String deadlines__applicant) {
        this.deadlines__applicant = deadlines__applicant;
    }

    public String getRequiredLanguageTests__testName() {
        return requiredLanguageTests__testName;
    }

    public void setRequiredLanguageTests__testName(String requiredLanguageTests__testName) {
        this.requiredLanguageTests__testName = requiredLanguageTests__testName;
    }

    public String getRequiredLanguageTests__minScore() {
        return requiredLanguageTests__minScore;
    }

    public void setRequiredLanguageTests__minScore(String requiredLanguageTests__minScore) {
        this.requiredLanguageTests__minScore = requiredLanguageTests__minScore;
    }

    public String getRequiredLanguageTests__minScoreLabel() {
        return requiredLanguageTests__minScoreLabel;
    }

    public void setRequiredLanguageTests__minScoreLabel(String requiredLanguageTests__minScoreLabel) {
        this.requiredLanguageTests__minScoreLabel = requiredLanguageTests__minScoreLabel;
    }

    public String getAdmission_requirement_minimum_level() {
        return admission_requirement_minimum_level;
    }

    public void setAdmission_requirement_minimum_level(String admission_requirement_minimum_level) {
        this.admission_requirement_minimum_level = admission_requirement_minimum_level;
    }

    public String getMinimum_level_text() {
        return minimum_level_text;
    }

    public void setMinimum_level_text(String minimum_level_text) {
        this.minimum_level_text = minimum_level_text;
    }

    public String getAdmission_exam() {
        return admission_exam;
    }

    public void setAdmission_exam(String admission_exam) {
        this.admission_exam = admission_exam;
    }

    public String getSop() {
        return sop;
    }

    public void setSop(String sop) {
        this.sop = sop;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getOther_requirements() {
        return other_requirements;
    }

    public void setOther_requirements(String other_requirements) {
        this.other_requirements = other_requirements;
    }

    public String getFundingList__by() {
        return fundingList__by;
    }

    public void setFundingList__by(String fundingList__by) {
        this.fundingList__by = fundingList__by;
    }

    public String getFundingList__requirement() {
        return fundingList__requirement;
    }

    public void setFundingList__requirement(String fundingList__requirement) {
        this.fundingList__requirement = fundingList__requirement;
    }

    public String getFundingList__applicationProcess() {
        return fundingList__applicationProcess;
    }

    public void setFundingList__applicationProcess(String fundingList__applicationProcess) {
        this.fundingList__applicationProcess = fundingList__applicationProcess;
    }

    public String getFundingList__amountMax() {
        return fundingList__amountMax;
    }

    public void setFundingList__amountMax(String fundingList__amountMax) {
        this.fundingList__amountMax = fundingList__amountMax;
    }

    public String getFundingList__currency() {
        return fundingList__currency;
    }

    public void setFundingList__currency(String fundingList__currency) {
        this.fundingList__currency = fundingList__currency;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public String getPartTime() {
        return partTime;
    }

    public void setPartTime(String partTime) {
        this.partTime = partTime;
    }

    public String getFullTime() {
        return fullTime;
    }

    public void setFullTime(String fullTime) {
        this.fullTime = fullTime;
    }

    public String getFaceToFace() {
        return faceToFace;
    }

    public void setFaceToFace(String faceToFace) {
        this.faceToFace = faceToFace;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }

    public String getBlended() {
        return blended;
    }

    public void setBlended(String blended) {
        this.blended = blended;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", summary=" + summary + ", overview=" + overview + ", logo="+logo + " ,level="+"]";
    }

    /*
    title	summary	overview	logo	level	category	degree	totalCredit	totalCreditUnit	tuitionFee	tuitionFeeUnit
    tuitionFeeCurrency	outline	languages	durationInMonth	durationInSemester	instituteId	instituteName	institutePriority
    livingCostMin	livingCostMax	livingCostCurrency	livingCostDetails	locations__street	locations__city	locations__country
    locations__zip	locations__location	deadlines__dayOfMonth	deadlines__semester	deadlines__applicant
    requiredLanguageTests__testName	requiredLanguageTests__minScore	requiredLanguageTests__minScoreLabel
    admission_requirement_minimum_level	minimum_level_text	admission_exam	sop	cv	other_requirements
    fundingList__by	fundingList__requirement	fundingList__applicationProcess	fundingList__amountMax	fundingList__currency
    official	partTime	fullTime	faceToFace	online	blended	pictures*/

}
