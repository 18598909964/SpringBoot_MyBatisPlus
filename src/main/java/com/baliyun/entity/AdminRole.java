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
public class AdminRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户角色编号
     */
    @TableId(value = "admin_roole_id", type = IdType.AUTO)
    private Long adminRooleId;
    /**
     * 角色编号
     */
    private Long roleId;
    /**
     * 系统用户编号
     */
    private Long adminId;
    /**
     * 创建时间
     */
    private Date addDate;
    /**
     * 更新时间
     */
    private Date updateDate;


    public Long getAdminRooleId() {
        return adminRooleId;
    }

    public void setAdminRooleId(Long adminRooleId) {
        this.adminRooleId = adminRooleId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "AdminRole{" +
        ", adminRooleId=" + adminRooleId +
        ", roleId=" + roleId +
        ", adminId=" + adminId +
        ", addDate=" + addDate +
        ", updateDate=" + updateDate +
        "}";
    }
}
