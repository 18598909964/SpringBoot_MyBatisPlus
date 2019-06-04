package com.baliyun.controller;


import com.baliyun.entity.AdminUser;
import com.baliyun.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/AdminController")
public class AdminController {

    @Autowired
    AdminUserService adminUserService;

    @RequestMapping("/login")
    public String login(){
        return "/admin/login";
    }

    @GetMapping("/toLogin")
    public String toLogin(AdminUser adminUser){

        return "/admin/index";
    }
}
