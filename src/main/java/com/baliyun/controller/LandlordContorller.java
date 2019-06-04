package com.baliyun.controller;

import com.baliyun.entity.Landlord;
import com.baliyun.entity.Room;
import com.baliyun.service.LandlordService;
import com.baliyun.service.RoomService;
import com.baliyun.utility.MD5Utility;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/LandlordContorller")
public class LandlordContorller {

    @Autowired
    LandlordService landlordService;
    @Autowired
    RoomService roomService;

    @RequestMapping("/login")
    public String login(){
        return "/landlord/login";
    }

    @PostMapping("/toLogin")
    public String toLogin(String phone, String userPassword, Model model, HttpSession httpSession){
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
            List<Landlord> landlordList = landlordService.selectList(new EntityWrapper<Landlord>()
                    .eq("phone",phone));
            landlordService.
            model.addAttribute("landlordName",landlordList.get(0).getUsername());
            httpSession.setAttribute("landlordId",landlordList.get(0).getId());
            httpSession.setAttribute("landlordName",landlordList.get(0).getUsername());
            return "/landlord/index";
        } catch (UnknownAccountException e) {
            //登录失败:用户名不存在
            e.printStackTrace();
            return "redirect:login";
        } catch (IncorrectCredentialsException e) {
            //登录失败:密码错误
            e.printStackTrace();
            return "redirect:login";
        }
    }

    @RequestMapping("/index")
    public String index(ModelMap modelMap, Integer pageNum, Room room){
        if (pageNum==null||pageNum==0){
            pageNum=1;
        }
        PageHelper.startPage(pageNum,10);
        List<Room> rooms = roomService.selectList(new EntityWrapper<Room>()
                .eq("landlord_id",room.getLandlordId())
        );
        System.out.println("所有数据？\n"+rooms.toString());
        PageInfo<Room> pageInfo = new PageInfo<>(rooms);
        List<Room> roomList = pageInfo.getList();
        System.out.println("分页数据？\n"+roomList.toString());
        System.out.println("分页插件"+pageInfo.getPageSize()+"++"+pageInfo.getPages()+"++"+pageInfo.getTotal());
        modelMap.put("pageNum",pageInfo.getPageNum());
        modelMap.put("pages",pageInfo.getPages());
        modelMap.put("total",pageInfo.getTotal());
        modelMap.put("roomList",roomList);
        return "/landlord/user/indexAjax";
    }



    @RequestMapping("/internalPages")   //显示内部页面
    public String internalPages(){
        return "/landlord/user/index";
    }

}
