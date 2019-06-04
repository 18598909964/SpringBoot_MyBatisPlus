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
public class Repairs implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "repairs_id", type = IdType.AUTO)
    private Long repairsId;
    /**
     * 房间编号
     */
    private Long roomId;
    /**
     * 房客编号
     */
    private Long tenantId;
    /**
     * 故障原因
     */
    private String failureCause;
    /**
     * 是否已处理故障(0-未处理，1已处理)
     */
    private Integer repairsStatus;
    /**
     * 报修时间
     */
    private Date addTime;
    /**
     * 更新时间
     */
    private Date updateDate;


    public Long getRepairsId() {
        return repairsId;
    }

    public void setRepairsId(Long repairsId) {
        this.repairsId = repairsId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getFailureCause() {
        return failureCause;
    }

    public void setFailureCause(String failureCause) {
        this.failureCause = failureCause;
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
        return "Repairs{" +
        ", repairsId=" + repairsId +
        ", roomId=" + roomId +
        ", tenantId=" + tenantId +
        ", failureCause=" + failureCause +
        ", repairsStatus=" + repairsStatus +
        ", addTime=" + addTime +
        ", updateDate=" + updateDate +
        "}";
    }
}
