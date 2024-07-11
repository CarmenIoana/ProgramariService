package com.ServiceApp.ServiceApp.controller;

import com.ServiceApp.ServiceApp.dto.ProgramareDto;
import com.ServiceApp.ServiceApp.entity.Angajat;
import com.ServiceApp.ServiceApp.entity.Client;
import com.ServiceApp.ServiceApp.entity.Programare;
import com.ServiceApp.ServiceApp.service.AngajatService;
import com.ServiceApp.ServiceApp.service.ClientService;
import com.ServiceApp.ServiceApp.service.ProgramareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.UUID;

@Controller
public class ProgramareController {
    @Autowired
    ProgramareService programareService;
    @Autowired
    AngajatService angajatService;
    @Autowired
    ClientService clientService;

    @GetMapping("/programare")
    public String programare(Model model, @ModelAttribute("programare")Programare programare){
        List<Angajat> angajati = angajatService.getAngajati();
        List<Client> clienti=clientService.getClienti();
        model.addAttribute("angajati",angajati);
        model.addAttribute("clienti",clienti);

        return ("programare-form");
    }
    @PostMapping("/save_programare")
    public String saveProgramare(ProgramareDto programare, RedirectAttributes redirectAttributes){
        Programare programareToBeAdded= Programare.builder().client(clientService.getClientById(UUID.fromString(programare.getClient_id())))
                .angajat(angajatService.getAngajatById(UUID.fromString(programare.getAngajat_id())))
                .dataSiOra(programare.getDataSiOra())
                .build();
        programareService.saveProgramare(programareToBeAdded);
        return ("redirect:/programare");
    }
}
