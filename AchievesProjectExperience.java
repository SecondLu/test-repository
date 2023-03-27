package org.mes.service.model;

/**
 * 《人事档案》模块，《工作履历》部分的项目经验实体类
 *
 * @author hongchuangbin
 * @date 2022-11-30
 */
public class AchievesProjectExperience extends BasePageForLayUI {

    private static final long serialVersionUID = -1L;
    /**
     * ID
     */
    private Integer id;
    /**
     * 员工工号
     */
    private String operCd;
    /**
     * 员工姓名
     */
    private String operNm;
    /**
     * 项目名称/产品名称
     */
    private String projectName;
    /**
     * 项目简介
     */
    private String projectDescription;
    /**
     * 技术点/技术栈
     */
    private String technicalPoints;
    /**
     * 项目人员数量
     */
    private Integer projectPersonNum;
    /**
     * 承担角色
     */
    private String projectRole;
    /**
     * 工作内容
     */
    private String workContent;
    /**
     * 项目阶段——1：进行中；2：已投产
     */
    private Integer projectStage;
    /**
     * 项目成果
     */
    private String projectAchievements;
    /**
     * 所属公司
     */
    private String affiliatedCompany;
    /**
     * 对应的《工作履历》ID
     */
    private Integer workHistoryId;
    /**
     * 创建人工号
     */
    private String createUserCode;
    /**
     * 创建人名称
     */
    private String createUserName;
    /**
     * 创建时间
     */
    private String createDate;
    /**
     * 更新人工号
     */
    private String updateUserCode;
    /**
     * 更新人名称
     */
    private String updateUserName;
    /**
     * 更新时间
     */
    private String updateDate;
    /**
     * 备注
     */
    private String remark;
    /**
     * 删除标志——0：未删除；1：已删除
     */
    private String deleteFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperCd() {
        return operCd;
    }

    public void setOperCd(String operCd) {
        this.operCd = operCd;
    }

    public String getOperNm() {
        return operNm;
    }

    public void setOperNm(String operNm) {
        this.operNm = operNm;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getTechnicalPoints() {
        return technicalPoints;
    }

    public void setTechnicalPoints(String technicalPoints) {
        this.technicalPoints = technicalPoints;
    }

    public Integer getProjectPersonNum() {
        return projectPersonNum;
    }

    public void setProjectPersonNum(Integer projectPersonNum) {
        this.projectPersonNum = projectPersonNum;
    }

    public String getProjectRole() {
        return projectRole;
    }

    public void setProjectRole(String projectRole) {
        this.projectRole = projectRole;
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent;
    }

    public Integer getProjectStage() {
        return projectStage;
    }

    public void setProjectStage(Integer projectStage) {
        this.projectStage = projectStage;
    }

    public String getProjectAchievements() {
        return projectAchievements;
    }

    public void setProjectAchievements(String projectAchievements) {
        this.projectAchievements = projectAchievements;
    }

    public String getAffiliatedCompany() {
        return affiliatedCompany;
    }

    public void setAffiliatedCompany(String affiliatedCompany) {
        this.affiliatedCompany = affiliatedCompany;
    }

    public Integer getWorkHistoryId() {
        return workHistoryId;
    }

    public void setWorkHistoryId(Integer workHistoryId) {
        this.workHistoryId = workHistoryId;
    }

    public String getCreateUserCode() {
        return createUserCode;
    }

    public void setCreateUserCode(String createUserCode) {
        this.createUserCode = createUserCode;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUserCode() {
        return updateUserCode;
    }

    public void setUpdateUserCode(String updateUserCode) {
        this.updateUserCode = updateUserCode;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    public String toString() {
        return "AchievesProjectExperience{" +
                "id=" + id +
                ", operCd='" + operCd + '\'' +
                ", operNm='" + operNm + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", technicalPoints='" + technicalPoints + '\'' +
                ", projectPersonNum=" + projectPersonNum +
                ", projectRole='" + projectRole + '\'' +
                ", workContent='" + workContent + '\'' +
                ", projectStage=" + projectStage +
                ", projectAchievements='" + projectAchievements + '\'' +
                ", affiliatedCompany='" + affiliatedCompany + '\'' +
                ", workHistoryId=" + workHistoryId +
                ", createUserCode='" + createUserCode + '\'' +
                ", createUserName='" + createUserName + '\'' +
                ", createDate='" + createDate + '\'' +
                ", updateUserCode='" + updateUserCode + '\'' +
                ", updateUserName='" + updateUserName + '\'' +
                ", updateDate='" + updateDate + '\'' +
                ", remark='" + remark + '\'' +
                ", deleteFlag='" + deleteFlag + '\'' +
                '}';
    }
}
