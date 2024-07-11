package com.ServiceApp.ServiceApp.service;

import com.ServiceApp.ServiceApp.entity.Programare;
import com.ServiceApp.ServiceApp.repository.ProgramareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramareService {
    @Autowired
    ProgramareRepository programareRepository;
    public void saveProgramare(Programare programare){
        programareRepository.save(programare);

    }
}
