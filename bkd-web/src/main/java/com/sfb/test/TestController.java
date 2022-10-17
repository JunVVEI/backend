package com.sfb.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TestController
 * @Author JunWEI
 * @Date 2022/10/18
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping(value = "/hello")
    @ResponseBody
    public String login() {
        return "Hello!";
    }
}
