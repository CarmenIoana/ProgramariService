package com.ServiceApp.ServiceApp.service;

import com.ServiceApp.ServiceApp.entity.Client;
import com.ServiceApp.ServiceApp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;
    public void saveClient(Client client){
        clientRepository.save(client);
    }
}
