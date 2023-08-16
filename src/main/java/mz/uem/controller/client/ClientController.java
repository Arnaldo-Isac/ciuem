package mz.uem.controller.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mz.uem.enums.UserCategory;
import mz.uem.model.client.ClientModel;
import mz.uem.model.client.ClientRepository;

@Controller
@RequestMapping("client")
public class ClientController {
    
    @Autowired
    private ClientRepository clientRepository;

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

    @PostMapping("/cadastrar")
    public String logon(ClientModel user) {
        clientRepository.save(user);
        return "client/index";
    }
}