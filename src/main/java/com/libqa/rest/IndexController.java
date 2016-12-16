package com.libqa.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : yion
 * @Date : 2016. 9. 26.
 * @Description :
 */
@RestController
public class IndexController {

    @RequestMapping("/aaa")
    public String aaa() {
        return "aaa";
    }
}
