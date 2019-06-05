package com.baliyun.controller;

import com.baliyun.entity.Landlord;
import com.baliyun.entity.Tenant;
import com.baliyun.service.LandlordService;
import com.baliyun.service.TenantService;
import com.baliyun.utility.MD5Utility;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/LoginAndRegister")
public class LoginAndRegister {

    @Autowired
    LandlordService landlordService;
    @Autowired
    TenantService tenantService;


    @RequestMapping("/login")   //登录页
    public String login(){
        return "login";
    }

    @PostMapping("/toLogin")   //登录方法
    public String toLogin(@RequestParam(value = "condition",required = true,defaultValue = "非法用户") String condition){
        System.out.println("身份："+condition);
        if(condition.equals("业主")){
            return "redirect:/LoginAndRegister/landlordLogin";
        }else if (condition.equals("租客")){
            return "redirect:/TenantController/login";
        }else {
            return "redirect:/login";
        }
    }

    @RequestMapping("/landlordLogin")   //业主登录页面
    public String landlordLogin(){
        return "/landlord/login";
    }

    @RequestMapping("/addUser")
    public String addUser(Landlord landlord, Tenant tenant, @RequestParam(value = "condition",required = true,defaultValue = "注册失败") String condition){
        //给密码进行加密
        MD5Utility md5Utility = new MD5Utility();
        String str = md5Utility.getMD5(landlord.getlPassword());
        landlord.setlPassword(str);
        tenant.settPassword(str);
        System.out.println("业主密文"+landlord.getlPassword()+"\n租客密文"+tenant.gettPassword());

        if (condition.equals("业主")){
            List<Landlord> landlordList = landlordService.selectList(new EntityWrapper<Landlord>()
                    .eq("phone",landlord.getlPhone())
            );
            System.out.println(landlordList.toString());
            if(landlordList.size()==0){
                landlord.setRegisterDate(new Date());
                landlord.setUpdateDate(new Date());

                landlordService.insert(landlord);
                return "redirect:login";
            }else {
                return "redirect:login";
            }
        }else if (condition.equals("租客")){
            List<Tenant> tenant1 = tenantService.selectList(new EntityWrapper<Tenant>()
                .eq("phone",tenant.getPhone())
            );
            System.out.println(tenant1.toString());
            if (tenant1.size() != 0){
                return "redirect:login";
            }
            tenant.setAddTime(new Date());
            tenant.setUpdateDate(new Date());
            tenantService.insert(tenant);
            return "redirect:login";
        }else {
            return "redirect:login";
        }
    }


}
