package com.libqa.web.controller;

import com.libqa.web.entity.User;
import com.libqa.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author : yion
 * @Date : 2016. 12. 19.
 * @Description : 사용자 정보를 조회하는 controller
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String findUser(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "user";
    }

    @RequestMapping("/add")
    @ResponseBody
    public User add(@RequestParam(value="name") String name,
                    @RequestParam(value="userId") String userId) {
        User user = userService.addUser(name, userId);

        return user;
    }


    @RequestMapping("/list")
    @ResponseBody
    public List<User> list(Model model) {
        List<User> users = userService.findAll();
        return users;
    }


    @RequestMapping("/userId")
    public String findUserId(@RequestParam(value="id", required=true) long id, Model model) {
        System.out.println("# id : "+ id);
        User user = userService.findById(id);
        System.out.println("# user : " + user);
        model.addAttribute("user", user);
        return "user";
    }

}
