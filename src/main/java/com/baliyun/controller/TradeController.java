package com.baliyun.controller;

import com.baliyun.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


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
        return "/landlord/user/accounting";
    }
}
