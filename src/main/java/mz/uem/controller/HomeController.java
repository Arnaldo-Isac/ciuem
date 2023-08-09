package mz.uem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String welcome(ModelMap model) {
        return "home";
    }

    @GetMapping("/tb")
    public String home(ModelMap model) {
        return "table";
    }

    @GetMapping("/login")
    public String login(ModelMap model) {
        // model.addAttribute("msg", "Sessão iniciada com sucesso");
        return "auth/signin";
        // return "home/home";
    }

    @GetMapping("/logon")
    public String logon(ModelMap model) {
        // model.addAttribute("msg", "Sessão terminada");
        return "auth/signup";
    }
}