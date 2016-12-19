package com.libqa.web.controller;

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

    @RequestMapping("/user")
    public String findUser(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "user";
    }
}
