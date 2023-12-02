package com.ll.demo2312021;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    String start(){
        return "안녕하세요";
    }

    @GetMapping("/about")
    @ResponseBody
    String startAAbout(){
        return "개발자 커뮤니티!";
    }

}
