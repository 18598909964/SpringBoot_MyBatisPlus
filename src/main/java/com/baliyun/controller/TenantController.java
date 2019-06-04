package com.baliyun.controller;

import com.baliyun.utility.MD5Utility;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/TenantController")
public class TenantController {

    @RequestMapping("/login")
    public String login(){
        return "/tenant/login";
    }

    @RequestMapping("/toLogin")
    public String toLogin(String phone, String userPassword, Model model){
        //给密码进行加密
        MD5Utility md5Utility = new MD5Utility();
        userPassword = md5Utility.getMD5(userPassword);
        //1.获取Subject
        Subject subject = SecurityUtils.getSubject();
        //2.封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(phone,userPassword);
        //3.执行登录方法
        try {
            //没有异常登录成功
            subject.login(token);
            return "/tenant/index";
        } catch (UnknownAccountException e) {
            //登录失败:用户名不存在
            e.printStackTrace();
            model.addAttribute("msg","用户名不存在");
            return "redirect:login";
        } catch (IncorrectCredentialsException e) {
            //登录失败:用户名不存在
            e.printStackTrace();
            model.addAttribute("msg","密码错误");
            return "redirect:login";
        }
    }
}
