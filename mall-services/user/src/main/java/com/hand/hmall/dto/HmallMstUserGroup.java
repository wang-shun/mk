package com.hand.hmall.dto;

import javax.persistence.*;
import java.util.Date;
/**
 * @author 阳赳
 * @name:HmallMstUserGroup
 * @Description:表HMALL_MST_USERGROUP对应实体类
 * @date 2017/6/1 16:11
 */
@Entity
@Table(name = "HMALL_MST_USERGROUP")
public class HmallMstUserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select HMALL_MST_USERGROUP_S.nextval from dual")
    /**
     * 主键
     */
    private Long usergroupId;

    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 接口传输标示
     */
    private String syncflag;

    /**
     * 版本号
     */
    private Short objectVersionNumber;

    /**
     * null
     */
    private Date creationDate;

    /**
     * null
     */
    private Short createdBy;

    /**
     * null
     */
    private Short lastUpdatedBy;

    /**
     * null
     */
    private Date lastUpdateDate;

    /**
     * null
     */
    private Short lastUpdateLogin;

    /**
     * null
     */
    private Short programApplicationId;

    /**
     * null
     */
    private Short programId;

    /**
     * null
     */
    private Date programUpdateDate;

    /**
     * null
     */
    private Short requestId;

    /**
     * null
     */
    private String attributeCategory;

    /**
     * null
     */
    private String attribute1;

    /**
     * null
     */
    private String attribute2;

    /**
     * null
     */
    private String attribute3;

    /**
     * null
     */
    private String attribute4;

    /**
     * null
     */
    private String attribute5;

    /**
     * null
     */
    private String attribute6;

    /**
     * null
     */
    private String attribute7;

    /**
     * null
     */
    private String attribute8;

    /**
     * null
     */
    private String attribute9;

    /**
     * null
     */
    private String attribute10;

    /**
     * null
     */
    private String attribute11;

    /**
     * null
     */
    private String attribute12;

    /**
     * null
     */
    private String attribute13;

    /**
     * null
     */
    private String attribute14;

    /**
     * null
     */
    private String attribute15;

    /**
     * 主键
     * @return USERGROUP_ID 主键
     */
    public Long getUsergroupId() {
        return usergroupId;
    }

    /**
     * 主键
     * @param usergroupId 主键
     */
    public void setUsergroupId(Long usergroupId) {
        this.usergroupId = usergroupId;
    }

    /**
     * 编码
     * @return CODE 编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 编码
     * @param code 编码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 名称
     * @return NAME 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 接口传输标示
     * @return SYNCFLAG 接口传输标示
     */
    public String getSyncflag() {
        return syncflag;
    }

    /**
     * 接口传输标示
     * @param syncflag 接口传输标示
     */
    public void setSyncflag(String syncflag) {
        this.syncflag = syncflag == null ? null : syncflag.trim();
    }

    /**
     * 版本号
     * @return OBJECT_VERSION_NUMBER 版本号
     */
    public Short getObjectVersionNumber() {
        return objectVersionNumber;
    }

    /**
     * 版本号
     * @param objectVersionNumber 版本号
     */
    public void setObjectVersionNumber(Short objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }

    /**
     * null
     * @return CREATION_DATE null
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * null
     * @param creationDate null
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * null
     * @return CREATED_BY null
     */
    public Short getCreatedBy() {
        return createdBy;
    }

    /**
     * null
     * @param createdBy null
     */
    public void setCreatedBy(Short createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * null
     * @return LAST_UPDATED_BY null
     */
    public Short getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * null
     * @param lastUpdatedBy null
     */
    public void setLastUpdatedBy(Short lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * null
     * @return LAST_UPDATE_DATE null
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * null
     * @param lastUpdateDate null
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * null
     * @return LAST_UPDATE_LOGIN null
     */
    public Short getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    /**
     * null
     * @param lastUpdateLogin null
     */
    public void setLastUpdateLogin(Short lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    /**
     * null
     * @return PROGRAM_APPLICATION_ID null
     */
    public Short getProgramApplicationId() {
        return programApplicationId;
    }

    /**
     * null
     * @param programApplicationId null
     */
    public void setProgramApplicationId(Short programApplicationId) {
        this.programApplicationId = programApplicationId;
    }

    /**
     * null
     * @return PROGRAM_ID null
     */
    public Short getProgramId() {
        return programId;
    }

    /**
     * null
     * @param programId null
     */
    public void setProgramId(Short programId) {
        this.programId = programId;
    }

    /**
     * null
     * @return PROGRAM_UPDATE_DATE null
     */
    public Date getProgramUpdateDate() {
        return programUpdateDate;
    }

    /**
     * null
     * @param programUpdateDate null
     */
    public void setProgramUpdateDate(Date programUpdateDate) {
        this.programUpdateDate = programUpdateDate;
    }

    /**
     * null
     * @return REQUEST_ID null
     */
    public Short getRequestId() {
        return requestId;
    }

    /**
     * null
     * @param requestId null
     */
    public void setRequestId(Short requestId) {
        this.requestId = requestId;
    }

    /**
     * null
     * @return ATTRIBUTE_CATEGORY null
     */
    public String getAttributeCategory() {
        return attributeCategory;
    }

    /**
     * null
     * @param attributeCategory null
     */
    public void setAttributeCategory(String attributeCategory) {
        this.attributeCategory = attributeCategory == null ? null : attributeCategory.trim();
    }

    /**
     * null
     * @return ATTRIBUTE1 null
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
     * null
     * @param attribute1 null
     */
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1 == null ? null : attribute1.trim();
    }

    /**
     * null
     * @return ATTRIBUTE2 null
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     * null
     * @param attribute2 null
     */
    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2 == null ? null : attribute2.trim();
    }

    /**
     * null
     * @return ATTRIBUTE3 null
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
     * null
     * @param attribute3 null
     */
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3 == null ? null : attribute3.trim();
    }

    /**
     * null
     * @return ATTRIBUTE4 null
     */
    public String getAttribute4() {
        return attribute4;
    }

    /**
     * null
     * @param attribute4 null
     */
    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4 == null ? null : attribute4.trim();
    }

    /**
     * null
     * @return ATTRIBUTE5 null
     */
    public String getAttribute5() {
        return attribute5;
    }

    /**
     * null
     * @param attribute5 null
     */
    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5 == null ? null : attribute5.trim();
    }

    /**
     * null
     * @return ATTRIBUTE6 null
     */
    public String getAttribute6() {
        return attribute6;
    }

    /**
     * null
     * @param attribute6 null
     */
    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6 == null ? null : attribute6.trim();
    }

    /**
     * null
     * @return ATTRIBUTE7 null
     */
    public String getAttribute7() {
        return attribute7;
    }

    /**
     * null
     * @param attribute7 null
     */
    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7 == null ? null : attribute7.trim();
    }

    /**
     * null
     * @return ATTRIBUTE8 null
     */
    public String getAttribute8() {
        return attribute8;
    }

    /**
     * null
     * @param attribute8 null
     */
    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8 == null ? null : attribute8.trim();
    }

    /**
     * null
     * @return ATTRIBUTE9 null
     */
    public String getAttribute9() {
        return attribute9;
    }

    /**
     * null
     * @param attribute9 null
     */
    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9 == null ? null : attribute9.trim();
    }

    /**
     * null
     * @return ATTRIBUTE10 null
     */
    public String getAttribute10() {
        return attribute10;
    }

    /**
     * null
     * @param attribute10 null
     */
    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10 == null ? null : attribute10.trim();
    }

    /**
     * null
     * @return ATTRIBUTE11 null
     */
    public String getAttribute11() {
        return attribute11;
    }

    /**
     * null
     * @param attribute11 null
     */
    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11 == null ? null : attribute11.trim();
    }

    /**
     * null
     * @return ATTRIBUTE12 null
     */
    public String getAttribute12() {
        return attribute12;
    }

    /**
     * null
     * @param attribute12 null
     */
    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12 == null ? null : attribute12.trim();
    }

    /**
     * null
     * @return ATTRIBUTE13 null
     */
    public String getAttribute13() {
        return attribute13;
    }

    /**
     * null
     * @param attribute13 null
     */
    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13 == null ? null : attribute13.trim();
    }

    /**
     * null
     * @return ATTRIBUTE14 null
     */
    public String getAttribute14() {
        return attribute14;
    }

    /**
     * null
     * @param attribute14 null
     */
    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14 == null ? null : attribute14.trim();
    }

    /**
     * null
     * @return ATTRIBUTE15 null
     */
    public String getAttribute15() {
        return attribute15;
    }

    /**
     * null
     * @param attribute15 null
     */
    public void setAttribute15(String attribute15) {
        this.attribute15 = attribute15 == null ? null : attribute15.trim();
    }
}