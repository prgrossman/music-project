package org.example.musiccatalogueservice.controller;

import com.prgrossman.music.domain.instrument.InstrumentType;
import listings.InstrumentListing;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/instruments")
public class InstrumentController {

    @PostMapping("/test")
    public InstrumentListing test(@RequestBody InstrumentListing listing){
        return listing;
    }

    @GetMapping("/return1")
    public int return1(){
        return 1;
    }

}
