package com.ServiceApp.ServiceApp.controller;


import com.ServiceApp.ServiceApp.entity.Angajat;
import com.ServiceApp.ServiceApp.service.AngajatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AngajatController {

    //o vede automat, un fel de mostenire
    @Autowired
    AngajatService angajatService;
    @GetMapping("/angajatForm")
    public String angajatForm(Model model){
        model.addAttribute("angajat",new Angajat());
        return "angajat-form";
    }
    @PostMapping("/saveAngajat")
    public String saveAngajat(Angajat angajat){
        angajatService.saveAngajat(angajat);
        return "redirect:/angajatForm";
    }
}
