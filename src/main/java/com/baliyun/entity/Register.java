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
 * @since 2019-05-15
 */
public class Register implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 租客编号
     */
    private Long tenantId;
    /**
     * 房间编号
     */
    private Long roomId;
    /**
     * 登记日期
     */
    private Date registerDate;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 身份证
     */
    private Long idCard;
    /**
     * 电话
     */
    private Long phone;
    /**
     * 年龄
     */
    private Long age;
    /**
     * 创建时间
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

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Long getIdCard() {
        return idCard;
    }

    public void setIdCard(Long idCard) {
        this.idCard = idCard;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
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
        return "Register{" +
        ", id=" + id +
        ", tenantId=" + tenantId +
        ", roomId=" + roomId +
        ", registerDate=" + registerDate +
        ", sex=" + sex +
        ", idCard=" + idCard +
        ", phone=" + phone +
        ", age=" + age +
        ", addTime=" + addTime +
        ", updateDate=" + updateDate +
        "}";
    }
}
