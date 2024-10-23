package com.punto.dos.demo_dos.controller;

import com.punto.dos.demo_dos.model.Folio;
import com.punto.dos.demo_dos.model.FolioRequest;
import com.punto.dos.demo_dos.proxy.FolioProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class puntoDosController {

    private final FolioProxy folioProxy;


    public puntoDosController(FolioProxy folioProxy){
        this.folioProxy = folioProxy;
    }

    @PostMapping("/misFolios")
    public Folio generateFolio(@RequestBody FolioRequest request){
        return folioProxy.createFolio(request.getFolioNum());
    }

}
