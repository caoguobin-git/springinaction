/***********************************************
 * File Name: IndexController
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 31 07 2019 下午 5:35
 ***********************************************/

package com.duochuang.controller;

import com.duochuang.common.vo.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/")
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "login-register";
    }

    @RequestMapping("/login")
    @ResponseBody
    public JsonResult login(String username, String password){
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        return  new JsonResult("登录成功");
    }
}
