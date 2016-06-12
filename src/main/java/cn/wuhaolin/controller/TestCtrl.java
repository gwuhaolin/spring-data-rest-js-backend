package cn.wuhaolin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestCtrl {

    @RequestMapping("returnString")
    @ResponseBody
    public String returnString() {
        return "string";
    }
}