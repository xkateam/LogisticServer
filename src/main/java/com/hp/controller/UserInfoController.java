package com.hp.controller;

import com.hp.pojo.UserInfo;
import com.hp.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/user")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping(value = "/selected",method = {RequestMethod.POST})
    public String selectNameAndPwd(String userId, Model model){
        System.out.println("进来了selectNameAndPwd");
        UserInfo userInfo = userInfoService.selectById(userId);
        model.addAttribute("userName",userInfo.getUserName());
        model.addAttribute("userPwd",userInfo.getUserPwd());
        return "info";
    }
}
