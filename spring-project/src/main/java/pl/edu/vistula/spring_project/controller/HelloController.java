package pl.edu.vistula.spring_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello Vistula, my first Spring controller!";
    }


    @GetMapping("/greeting")
    public String greeting(org.springframework.ui.Model model) {
        model.addAttribute("name", "Student");
        return "greeting";
    }

}
