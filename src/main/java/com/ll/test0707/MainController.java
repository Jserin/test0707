package com.ll.test0707;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/main")
    @ResponseBody
    public String main() {
        return "초기";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/article/list";
    }
}
