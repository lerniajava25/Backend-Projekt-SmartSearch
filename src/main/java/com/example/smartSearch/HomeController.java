package com.example.smartSearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("appName", "SmartSearch");
        return "index"; // Looks for src/main/resources/templates/index.html
    }
}
