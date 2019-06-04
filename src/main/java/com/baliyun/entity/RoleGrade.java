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
public class RoleGrade implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "role_grade_id", type = IdType.AUTO)
    private Long roleGradeId;
    /**
     * 角色编号
     */
    private Long roleId;
    /**
     * 权限编号
     */
    private Long gradeId;
    /**
     * 创建时间
     */
    private Date addDate;
    /**
     * 更新时间
     */
    private Date updateDate;


    public Long getRoleGradeId() {
        return roleGradeId;
    }

    public void setRoleGradeId(Long roleGradeId) {
        this.roleGradeId = roleGradeId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
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
        return "RoleGrade{" +
        ", roleGradeId=" + roleGradeId +
        ", roleId=" + roleId +
        ", gradeId=" + gradeId +
        ", addDate=" + addDate +
        ", updateDate=" + updateDate +
        "}";
    }
}
