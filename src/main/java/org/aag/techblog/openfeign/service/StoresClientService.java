package org.aag.techblog.openfeign.service;

import org.aag.techblog.openfeign.beans.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value="stores-service", url="http://localhost:8080/clients")
public interface StoresClientService {

    @RequestMapping(method = RequestMethod.GET, value = "/get/all")
    List<Client> getAllClients();
}
