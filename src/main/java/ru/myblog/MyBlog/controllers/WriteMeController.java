package ru.myblog.MyBlog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WriteMeController {
    @GetMapping("/writeme")
    public String writeMe(Model model) {
        return "writeme";
    }
}
