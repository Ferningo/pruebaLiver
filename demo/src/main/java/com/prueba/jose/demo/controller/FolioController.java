package com.prueba.jose.demo.controller;


import com.prueba.jose.demo.model.Folio;
import com.prueba.jose.demo.service.DateService;

import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@CrossOrigin
public class FolioController {


    private final DateService dateService;

    private static final Logger logger = Logger.getLogger(FolioController.class.getName());

    public FolioController(DateService dateService){
        this.dateService = dateService;
    }


    @GetMapping("folios/{folio}")
    @ResponseBody
    public Folio getFolio(@PathVariable String folio){
        logger.info("GOT FOLIO REQUEST FROM PROXY!");
        return dateService.generateFolio(Integer.parseInt(folio));
    }

}
