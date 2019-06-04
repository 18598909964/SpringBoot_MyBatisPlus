package com.baliyun.service;

import com.baliyun.entity.Trade;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 吾嘉
 * @since 2019-05-15
 */
public interface TradeService extends IService<Trade> {
    List<Trade> selectAllByLandlordId(Integer id);
}
