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
 * @since 2019-06-04
 */
public class Trade implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "trade_id", type = IdType.AUTO)
    private Long tradeId;
    /**
     * 交易编号
     */
    private String orderNumber;
    /**
     * 房间编号
     */
    private Long roomId;
    /**
     * 交易方式
     */
    private Integer tradeMeans;
    /**
     * 应缴纳租金
     */
    private BigDecimal rental;
    /**
     * 是否缴费(0未交；1已缴费；2未交清)
     */
    private Integer tradeStatus;
    /**
     * 日常消耗费用
     */
    private BigDecimal runningCost;
    /**
     * 合计
     */
    private BigDecimal total;
    /**
     * 交易类型
     */
    private Integer tradeType;
    /**
     * 欠费
     */
    private BigDecimal arrearage;
    /**
     * 创建时间
     */
    private Date addTime;
    /**
     * 更新时间
     */
    private Date updateDate;


    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Integer getTradeMeans() {
        return tradeMeans;
    }

    public void setTradeMeans(Integer tradeMeans) {
        this.tradeMeans = tradeMeans;
    }

    public BigDecimal getRental() {
        return rental;
    }

    public void setRental(BigDecimal rental) {
        this.rental = rental;
    }

    public Integer getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(Integer tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public BigDecimal getRunningCost() {
        return runningCost;
    }

    public void setRunningCost(BigDecimal runningCost) {
        this.runningCost = runningCost;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public BigDecimal getArrearage() {
        return arrearage;
    }

    public void setArrearage(BigDecimal arrearage) {
        this.arrearage = arrearage;
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
        return "Trade{" +
        ", tradeId=" + tradeId +
        ", orderNumber=" + orderNumber +
        ", roomId=" + roomId +
        ", tradeMeans=" + tradeMeans +
        ", rental=" + rental +
        ", tradeStatus=" + tradeStatus +
        ", runningCost=" + runningCost +
        ", total=" + total +
        ", tradeType=" + tradeType +
        ", arrearage=" + arrearage +
        ", addTime=" + addTime +
        ", updateDate=" + updateDate +
        "}";
    }
}
