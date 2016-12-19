package com.libqa.web.controller;

import com.libqa.web.repository.User;
import com.libqa.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/userIdx")
    public String findUserId(@RequestParam(value="idx", required=true) long idx, Model model) {
        System.out.println("# idx : "+ idx);
        User user = userService.findByIdx(idx);
        System.out.println("# user : " + user);
        model.addAttribute("user", user);
        return "user";
    }
}
