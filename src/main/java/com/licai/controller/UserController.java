package com.licai.controller;

import com.licai.model.User;
import com.licai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("user/getUsers")
    public ModelAndView UserList(){
        ModelAndView mav = new ModelAndView();
        List<User> userList = userService.list();
        mav.addObject("users",userList);
        mav.setViewName("user/userList");
        return mav;
    }
}
