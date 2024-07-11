package com.ServiceApp.ServiceApp.service;

import com.ServiceApp.ServiceApp.entity.Angajat;
import com.ServiceApp.ServiceApp.entity.Client;
import com.ServiceApp.ServiceApp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;
    public void saveClient(Client client){

        clientRepository.save(client);
    }
    public List<Client> getClienti(){
        return clientRepository.findAll();
    }
    public Client getClientById(UUID id){
        return clientRepository.getReferenceById(id);
    }
}
