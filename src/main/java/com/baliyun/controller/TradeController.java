package com.baliyun.controller;

import com.baliyun.entity.Trade;
import com.baliyun.service.TradeService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/TradeController")
public class TradeController {

    @Autowired
    TradeService tradeService;

    @RequestMapping("/skip")
    public String skip(){
        return "";
    }

    @GetMapping("/select/{id}")
    public String select(@PathVariable Integer id, Model model){
        List<Trade> tradeList = tradeService.selectAllByLandlordId(id);
        model.addAttribute("tradeList",tradeList);
        return "/landlord/user/accounting";
    }
}
