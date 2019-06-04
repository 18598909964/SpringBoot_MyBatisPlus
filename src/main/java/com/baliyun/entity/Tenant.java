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
public class Tenant implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "t_id", type = IdType.AUTO)
    private Long tId;
    private String tUsername;
    private String tPassword;
    /**
     * 身份证
     */
    private Long tIdCard;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 年龄
     */
    private Long age;
    /**
     * 电话
     */
    private String phone;
    /**
     * 是否封停（0未封停，1封停）
     */
    private Integer userStatus;
    /**
     * 注册时间
     */
    private Date addTime;
    /**
     * 更新时间
     */
    private Date updateDate;


    public Long gettId() {
        return tId;
    }

    public void settId(Long tId) {
        this.tId = tId;
    }

    public String gettUsername() {
        return tUsername;
    }

    public void settUsername(String tUsername) {
        this.tUsername = tUsername;
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword;
    }

    public Long gettIdCard() {
        return tIdCard;
    }

    public void settIdCard(Long tIdCard) {
        this.tIdCard = tIdCard;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
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
        return "Tenant{" +
        ", tId=" + tId +
        ", tUsername=" + tUsername +
        ", tPassword=" + tPassword +
        ", tIdCard=" + tIdCard +
        ", sex=" + sex +
        ", age=" + age +
        ", phone=" + phone +
        ", userStatus=" + userStatus +
        ", addTime=" + addTime +
        ", updateDate=" + updateDate +
        "}";
    }
}
