package com.ServiceApp.ServiceApp.controller;

import com.ServiceApp.ServiceApp.entity.Client;
import com.ServiceApp.ServiceApp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {
    @Autowired
    ClientService clientService;
    @GetMapping("/clientForm")
    public String clientForm(Model model){
        model.addAttribute("client",new Client());
        return "client-form";
    }

    @PostMapping("/saveClient")
    public String saveClient(Client client){
        clientService.saveClient(client);
        return "redirect:/clientForm";
    }

}
