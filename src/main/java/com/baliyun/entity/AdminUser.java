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
public class AdminUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "admin_user_id", type = IdType.AUTO)
    private Long adminUserId;
    /**
     * 系统用户
     */
    private String username;
    /**
     * 系统用户密码
     */
    private String adminPassword;
    /**
     * 系统用户状态
     */
    private Integer adminStatus;
    /**
     * 最后一次登录时间
     */
    private Date lastLoginTime;
    /**
     * 创建时间
     */
    private Date addTime;
    /**
     * 更新时间
     */
    private Date updateDate;


    public Long getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(Long adminUserId) {
        this.adminUserId = adminUserId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Integer getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(Integer adminStatus) {
        this.adminStatus = adminStatus;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
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
        return "AdminUser{" +
        ", adminUserId=" + adminUserId +
        ", username=" + username +
        ", adminPassword=" + adminPassword +
        ", adminStatus=" + adminStatus +
        ", lastLoginTime=" + lastLoginTime +
        ", addTime=" + addTime +
        ", updateDate=" + updateDate +
        "}";
    }
}
