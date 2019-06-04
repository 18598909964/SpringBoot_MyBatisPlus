package com.baliyun.dao;

import com.baliyun.entity.Trade;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 吾嘉
 * @since 2019-05-15
 */
public interface TradeMapper extends BaseMapper<Trade> {

    @Select("SELECT trade.* FROM trade , room , landlord\n" +
            "WHERE trade.room_id = room.id AND room.landlord_id = landlord.id\n" +
            "AND landlord.id = #{id}")
    List<Trade> selectAllByLandlordId(Integer id);

}
