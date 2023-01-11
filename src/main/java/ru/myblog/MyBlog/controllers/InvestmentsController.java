package ru.myblog.MyBlog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvestmentsController {

    @GetMapping("/investments")
    public String investments(Model model) {
        return "investments";
    }
}
