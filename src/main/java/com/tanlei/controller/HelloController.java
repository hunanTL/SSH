package com.tanlei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-12-12 22:58
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public  String hello(){
        return "success";
    }
}
