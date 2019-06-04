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
public class RoomType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "room_type_id", type = IdType.AUTO)
    private Long roomTypeId;
    /**
     * 房间类型
     */
    private String type;
    /**
     * 空调
     */
    private Integer airConditioner;
    /**
     * 洗衣机
     */
    private Integer washingMachine;
    /**
     * 电视
     */
    private Integer tv;
    /**
     * 创建时间
     */
    private Date addTime;
    /**
     * 更新时间
     */
    private Date updateDate;


    public Long getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Long roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(Integer airConditioner) {
        this.airConditioner = airConditioner;
    }

    public Integer getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(Integer washingMachine) {
        this.washingMachine = washingMachine;
    }

    public Integer getTv() {
        return tv;
    }

    public void setTv(Integer tv) {
        this.tv = tv;
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
        return "RoomType{" +
        ", roomTypeId=" + roomTypeId +
        ", type=" + type +
        ", airConditioner=" + airConditioner +
        ", washingMachine=" + washingMachine +
        ", tv=" + tv +
        ", addTime=" + addTime +
        ", updateDate=" + updateDate +
        "}";
    }
}
