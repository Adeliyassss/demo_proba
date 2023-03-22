package com.example.demo_proba.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

        @GetMapping("/home")
        public String greeting(Model model) {
            model.addAttribute("title"," its home");
            return "home";
        }


}
