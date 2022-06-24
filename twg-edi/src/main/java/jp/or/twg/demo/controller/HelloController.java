package jp.or.twg.demo.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    // (1)
    @Value("${application.name}")
    private String appName;

    // (2)
    @GetMapping({"/", "/hello"})
    public String hello(Model model) {
        model.addAttribute("message", "Hello World");
        model.addAttribute("now", LocalDateTime.now());
        model.addAttribute("appName", appName);
        return "hello";
    }

}
