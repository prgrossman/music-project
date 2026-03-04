package org.example.musiccatalogueservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/return1")
    public int return1(){
        return 1;
    }

}
