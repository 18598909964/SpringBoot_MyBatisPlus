package com.baliyun.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 吾嘉
 * @since 2019-06-04
 */
public class Suite implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "suite_id", type = IdType.AUTO)
    private Long suiteId;
    /**
     * 名称
     */
    private String suiteName;
    /**
     * 地址
     */
    private String suiteSite;
    /**
     * 业主id
     */
    private Long landlordId;
    private Date addTime;
    private Date updateDate;


    public Long getSuiteId() {
        return suiteId;
    }

    public void setSuiteId(Long suiteId) {
        this.suiteId = suiteId;
    }

    public String getSuiteName() {
        return suiteName;
    }

    public void setSuiteName(String suiteName) {
        this.suiteName = suiteName;
    }

    public String getSuiteSite() {
        return suiteSite;
    }

    public void setSuiteSite(String suiteSite) {
        this.suiteSite = suiteSite;
    }

    public Long getLandlordId() {
        return landlordId;
    }

    public void setLandlordId(Long landlordId) {
        this.landlordId = landlordId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Suite{" +
        ", suiteId=" + suiteId +
        ", suiteName=" + suiteName +
        ", suiteSite=" + suiteSite +
        ", landlordId=" + landlordId +
        ", addTime=" + addTime +
        ", updateDate=" + updateDate +
        "}";
    }
}
