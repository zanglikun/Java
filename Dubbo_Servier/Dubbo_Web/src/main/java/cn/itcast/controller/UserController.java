package cn.itcast.controller;

import cn.itcast.service.UserService;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll(){
        System.out.println("111");
        userService.findAll();
        System.out.println("111");
        return "liunx";
    }
}
