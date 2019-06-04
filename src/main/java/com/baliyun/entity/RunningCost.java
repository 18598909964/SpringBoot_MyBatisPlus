package com.baliyun.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
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
public class RunningCost implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 房间id
     */
    private Long roomId;
    /**
     * 燃气费
     */
    private BigDecimal gasFee;
    /**
     * 水费
     */
    private BigDecimal waterRate;
    /**
     * 电费
     */
    private BigDecimal electricCharge;
    /**
     * 物业费
     */
    private BigDecimal propertyFee;
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

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public BigDecimal getGasFee() {
        return gasFee;
    }

    public void setGasFee(BigDecimal gasFee) {
        this.gasFee = gasFee;
    }

    public BigDecimal getWaterRate() {
        return waterRate;
    }

    public void setWaterRate(BigDecimal waterRate) {
        this.waterRate = waterRate;
    }

    public BigDecimal getElectricCharge() {
        return electricCharge;
    }

    public void setElectricCharge(BigDecimal electricCharge) {
        this.electricCharge = electricCharge;
    }

    public BigDecimal getPropertyFee() {
        return propertyFee;
    }

    public void setPropertyFee(BigDecimal propertyFee) {
        this.propertyFee = propertyFee;
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
        return "RunningCost{" +
        ", id=" + id +
        ", roomId=" + roomId +
        ", gasFee=" + gasFee +
        ", waterRate=" + waterRate +
        ", electricCharge=" + electricCharge +
        ", propertyFee=" + propertyFee +
        ", addTime=" + addTime +
        ", updateDate=" + updateDate +
        "}";
    }
}
