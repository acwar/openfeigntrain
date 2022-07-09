package org.aag.techblog.openfeign.service;

import org.aag.techblog.openfeign.beans.Client;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StoreService {

    private StoresClientService clientService;

    StoreService(StoresClientService feignClient){
        this.clientService = feignClient;
    }

    public List<String> getAllStoreClients(){
        return clientService.getAllClients()
                .stream()
                .map(Client::getName)
                .collect(Collectors.toList());
    }
}
