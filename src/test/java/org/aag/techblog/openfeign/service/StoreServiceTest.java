package org.aag.techblog.openfeign.service;

import org.aag.techblog.openfeign.beans.Client;
import org.aag.techblog.openfeign.controller.ClientsController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.DEFINED_PORT)
class StoreServiceTest {
    @Autowired
    private StoreService testSubject;

    @Test
    public void testStoreService(){
        List<String> response = testSubject.getAllStoreClients();
        response.forEach(System.out::println);
        assertEquals(3, response.size());
    }
}