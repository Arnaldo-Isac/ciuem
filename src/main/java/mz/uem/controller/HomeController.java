package mz.uem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import mz.uem.model.client.ClientModel;
import mz.uem.model.client.ClientRepository;

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

    @GetMapping("/forget")
    public String forget(ModelMap model) {
        model.addAttribute("msg", "Sessão iniciada com sucesso");
        return "auth/signin";
        // return "home/home";
    }


    @GetMapping("/logon")
    public String log(ModelMap model) {
        return "auth/signup";
    }
}