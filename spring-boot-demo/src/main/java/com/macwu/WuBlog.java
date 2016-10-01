package com.macwu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Tong on 2016/9/30.
 */

@SpringBootApplication
@Controller
public class WuBlog extends SpringBootServletInitializer{

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String greeting(){
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(WuBlog.class, args);
    }
}
