package com.baliyun.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 吾嘉
 * @since 2019-06-04
 */
public class Landlord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "l_id", type = IdType.AUTO)
    private Long lId;
    /**
     * 业主名称
     */
    private String lUsername;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z]\\w{5,17}$",message = "密码不能含有非法字符")
    @Size(min = 6,max = 16,message = "密码长度在6到16位之间")
    private String lPassword;
    /**
     * 业主电话
     */
    @NotNull
    @Pattern(regexp = "^(\\(\\d{3,4}-)|\\d{3,4}-)?\\d{7,8}$",message = "电话格式不对")
    private String lPhone;
    /**
     * 是否封停（0未封停，1封停）
     */
    private Integer lStatus;
    private Long lIdCard;
    /**
     * 注册时间
     */
    private Date registerDate;
    /**
     * 更新时间
     */
    private Date updateDate;


    public Long getlId() {
        return lId;
    }

    public void setlId(Long lId) {
        this.lId = lId;
    }

    public String getlUsername() {
        return lUsername;
    }

    public void setlUsername(String lUsername) {
        this.lUsername = lUsername;
    }

    public String getlPassword() {
        return lPassword;
    }

    public void setlPassword(String lPassword) {
        this.lPassword = lPassword;
    }

    public String getlPhone() {
        return lPhone;
    }

    public void setlPhone(String lPhone) {
        this.lPhone = lPhone;
    }

    public Integer getlStatus() {
        return lStatus;
    }

    public void setlStatus(Integer lStatus) {
        this.lStatus = lStatus;
    }

    public Long getlIdCard() {
        return lIdCard;
    }

    public void setlIdCard(Long lIdCard) {
        this.lIdCard = lIdCard;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Landlord{" +
        ", lId=" + lId +
        ", lUsername=" + lUsername +
        ", lPassword=" + lPassword +
        ", lPhone=" + lPhone +
        ", lStatus=" + lStatus +
        ", lIdCard=" + lIdCard +
        ", registerDate=" + registerDate +
        ", updateDate=" + updateDate +
        "}";
    }
}
