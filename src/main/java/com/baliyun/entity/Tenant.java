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
 * @since 2019-05-16
 */
public class Tenant implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String username;
    private String userPassword;
    /**
     * 身份证
     */
    private Long idCard;
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Long getIdCard() {
        return idCard;
    }

    public void setIdCard(Long idCard) {
        this.idCard = idCard;
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
        ", id=" + id +
        ", username=" + username +
        ", userPassword=" + userPassword +
        ", idCard=" + idCard +
        ", sex=" + sex +
        ", age=" + age +
        ", phone=" + phone +
        ", userStatus=" + userStatus +
        ", addTime=" + addTime +
        ", updateDate=" + updateDate +
        "}";
    }
}
