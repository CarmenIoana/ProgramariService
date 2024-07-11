package com.ServiceApp.ServiceApp.service;

import com.ServiceApp.ServiceApp.entity.Angajat;
import com.ServiceApp.ServiceApp.repository.AngajatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AngajatService {
    @Autowired
    AngajatRepository angajatRepository;

    public void saveAngajat(Angajat angajat){
        angajatRepository.save(angajat);
    }

    public List<Angajat> getAngajati(){
        return angajatRepository.findAll();
    }
    public Angajat getAngajatById(UUID id){
        return angajatRepository.getReferenceById(id);

    }
}
