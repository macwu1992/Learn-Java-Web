package com.macwu.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Tong on 2017/4/28.
 */
@Controller
public class PageController {

    @RequestMapping("/index")
    public String indexPage() {
        return "index";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }
}
