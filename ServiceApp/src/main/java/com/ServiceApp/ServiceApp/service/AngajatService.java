package com.ServiceApp.ServiceApp.service;

import com.ServiceApp.ServiceApp.entity.Angajat;
import com.ServiceApp.ServiceApp.repository.AngajatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AngajatService {
    @Autowired
    AngajatRepository angajatRepository;

    public void saveAngajat(Angajat angajat){
        angajatRepository.save(angajat);
    }
}
