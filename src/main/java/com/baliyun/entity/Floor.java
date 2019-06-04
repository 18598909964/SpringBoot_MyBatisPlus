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
public class Floor implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "floor_id", type = IdType.AUTO)
    private Long floorId;
    /**
     * 房产id
     */
    private Long suiteId;
    /**
     * 第几楼
     */
    private Long whichFloor;
    /**
     * 房间个数
     */
    private Long roomNumber;
    private Date addTime;
    private Date updateDate;


    public Long getFloorId() {
        return floorId;
    }

    public void setFloorId(Long floorId) {
        this.floorId = floorId;
    }

    public Long getSuiteId() {
        return suiteId;
    }

    public void setSuiteId(Long suiteId) {
        this.suiteId = suiteId;
    }

    public Long getWhichFloor() {
        return whichFloor;
    }

    public void setWhichFloor(Long whichFloor) {
        this.whichFloor = whichFloor;
    }

    public Long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Long roomNumber) {
        this.roomNumber = roomNumber;
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
        return "Floor{" +
        ", floorId=" + floorId +
        ", suiteId=" + suiteId +
        ", whichFloor=" + whichFloor +
        ", roomNumber=" + roomNumber +
        ", addTime=" + addTime +
        ", updateDate=" + updateDate +
        "}";
    }
}
