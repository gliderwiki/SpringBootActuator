package com.libqa.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : yion
 * @Date : 2016. 9. 26.
 * @Description :
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!!";
    }

    @RequestMapping("/tests")
    public String test() {
        return "tests";
    }
}

