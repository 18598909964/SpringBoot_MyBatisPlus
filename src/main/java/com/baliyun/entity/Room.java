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
public class Room implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 房间名称
     */
    private String roomName;
    /**
     * 房间地址
     */
    private String roomSite;
    /**
     * 状态(闲置:0、已租:1、预定:2、收租:3、逾期:4、租约到期:5)
     */
    private Integer roomDwell;
    /**
     * 租金（天）
     */
    private BigDecimal roomMoney;
    /**
     * 房间类型
     */
    private Long roomTypeId;
    /**
     * 房东编号
     */
    private Long landlordId;
    /**
     * 入住时间
     */
    private Date checkInDate;
    /**
     * 租期（天）
     */
    private Long tenancyTerm;
    /**
     * 租客编号
     */
    private Long tenantId;
    /**
     * 押金
     */
    private BigDecimal cashPledge;
    /**
     * 入住人数
     */
    private Long personNumber;
    /**
     * 日常消耗ID
     */
    private Long runningCostId;
    /**
     * 预约编号
     */
    private Long reserveId;
    /**
     * 押金状态
     */
    private Integer cashPledgeStatus;
    /**
     * 报修编号
     */
    private Long repairsId;
    /**
     * 报修状态
     */
    private Integer repairsStatus;
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

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomSite() {
        return roomSite;
    }

    public void setRoomSite(String roomSite) {
        this.roomSite = roomSite;
    }

    public Integer getRoomDwell() {
        return roomDwell;
    }

    public void setRoomDwell(Integer roomDwell) {
        this.roomDwell = roomDwell;
    }

    public BigDecimal getRoomMoney() {
        return roomMoney;
    }

    public void setRoomMoney(BigDecimal roomMoney) {
        this.roomMoney = roomMoney;
    }

    public Long getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Long roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public Long getLandlordId() {
        return landlordId;
    }

    public void setLandlordId(Long landlordId) {
        this.landlordId = landlordId;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Long getTenancyTerm() {
        return tenancyTerm;
    }

    public void setTenancyTerm(Long tenancyTerm) {
        this.tenancyTerm = tenancyTerm;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public BigDecimal getCashPledge() {
        return cashPledge;
    }

    public void setCashPledge(BigDecimal cashPledge) {
        this.cashPledge = cashPledge;
    }

    public Long getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(Long personNumber) {
        this.personNumber = personNumber;
    }

    public Long getRunningCostId() {
        return runningCostId;
    }

    public void setRunningCostId(Long runningCostId) {
        this.runningCostId = runningCostId;
    }

    public Long getReserveId() {
        return reserveId;
    }

    public void setReserveId(Long reserveId) {
        this.reserveId = reserveId;
    }

    public Integer getCashPledgeStatus() {
        return cashPledgeStatus;
    }

    public void setCashPledgeStatus(Integer cashPledgeStatus) {
        this.cashPledgeStatus = cashPledgeStatus;
    }

    public Long getRepairsId() {
        return repairsId;
    }

    public void setRepairsId(Long repairsId) {
        this.repairsId = repairsId;
    }

    public Integer getRepairsStatus() {
        return repairsStatus;
    }

    public void setRepairsStatus(Integer repairsStatus) {
        this.repairsStatus = repairsStatus;
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
        return "Room{" +
        ", id=" + id +
        ", roomName=" + roomName +
        ", roomSite=" + roomSite +
        ", roomDwell=" + roomDwell +
        ", roomMoney=" + roomMoney +
        ", roomTypeId=" + roomTypeId +
        ", landlordId=" + landlordId +
        ", checkInDate=" + checkInDate +
        ", tenancyTerm=" + tenancyTerm +
        ", tenantId=" + tenantId +
        ", cashPledge=" + cashPledge +
        ", personNumber=" + personNumber +
        ", runningCostId=" + runningCostId +
        ", reserveId=" + reserveId +
        ", cashPledgeStatus=" + cashPledgeStatus +
        ", repairsId=" + repairsId +
        ", repairsStatus=" + repairsStatus +
        ", addTime=" + addTime +
        ", updateDate=" + updateDate +
        "}";
    }
}
