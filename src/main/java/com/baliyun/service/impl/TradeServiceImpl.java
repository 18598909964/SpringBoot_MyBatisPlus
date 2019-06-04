package com.baliyun.service.impl;

import com.baliyun.entity.Trade;
import com.baliyun.dao.TradeMapper;
import com.baliyun.service.TradeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 吾嘉
 * @since 2019-05-15
 */
@Service
public class TradeServiceImpl extends ServiceImpl<TradeMapper, Trade> implements TradeService {

    @Autowired
    TradeMapper tradeMapper;

    @Override
    public List<Trade> selectAllByLandlordId(Integer id) {
        return tradeMapper.selectAllByLandlordId(id);
    }
}
