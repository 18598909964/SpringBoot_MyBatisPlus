package com.baliyun.controller;


import com.baliyun.entity.Room;
import com.baliyun.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/RoomController")
public class RoomController {

    @Autowired
    RoomService roomService;

    @RequestMapping("/skip")
    public String skip(String skip){
        if (skip.equals("insert")){
            return "/landlord/user/insertRoom";
        }else if (skip.equals("index")){
            return "/landlord/user/index";
        }else if (skip.equals("update")){
            return "/landlord/user/updateRoom";
        }
        return "";
    }

    @PostMapping("/inser")
    public String insert(Room room){
        Date date = new Date();
        room.setCheckInDate(date);
        room.setUpdateDate(date);
        room.setAddTime(date);
        roomService.insert(room);
        return "/landlord/user/index";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        roomService.deleteById(id);
        return "/landlord/user/index";
    }

    @PutMapping("/update")
    public String update(Room room){
        roomService.updateById(room);
        return "/landlord/user/index";
    }

    @GetMapping("/select/{id}")
    public String select(@PathVariable("id") Long id, Model model){
        Room room = roomService.selectById(id);
        model.addAttribute("room",room);
        return "/landlord/user/selectRoom";
    }
}
