package com.macwu.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Tong on 2017/4/28.
 */

@SpringBootApplication
@ComponentScan
public class WebApp {
    public static void main(String[] args) {
        SpringApplication.run(WebApp.class);
    }
}
