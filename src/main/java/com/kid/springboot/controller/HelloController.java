package com.kid.springboot.controller;

/**
 * Created by Administrator on 2017/6/9.
 */
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    private Logger logger = Logger.getLogger(HelloController.class);

    /*
    *   http://localhost:8080/hello?name=shixj
     */

    @RequestMapping("/hello")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        logger.info("hello");
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping("/test")
    public String greeting_view(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        logger.info("test");
        model.addAttribute("name", name);
        return "test";
    }
}