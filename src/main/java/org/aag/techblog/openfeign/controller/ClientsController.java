package org.aag.techblog.openfeign.controller;

import org.aag.techblog.openfeign.beans.Client;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value ="/clients")
public class ClientsController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/get/all")
    List<Client> returnSintheticCLientList(){
        //As a Dummy controller a simple List is going to be the response
        return  Arrays.stream(new String[]{"Tesla", "Volta", "Trajano"})
                .map(client -> new Client(client))
                .collect(Collectors.toList());
    }
}
