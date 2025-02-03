package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("home page handler");

        //sending data to view
        model.addAttribute("name", "Substring Technology");
        model.addAttribute("YoutubeChannel", "Code Learn with Durgesh");
        model.addAttribute("GithubRepository", "https://github.com/LearnCodeWithDurgesh/scm2.0");
    
        return "home";
    }
}
