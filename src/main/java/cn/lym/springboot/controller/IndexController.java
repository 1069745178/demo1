package cn.lym.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    //嘻嘻嘻嘻嘻嘻
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello!";
    }
}
