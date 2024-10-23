package com.punto.dos.demo_dos.controller;

import com.punto.dos.demo_dos.model.Folio;
import com.punto.dos.demo_dos.model.FolioRequest;
import com.punto.dos.demo_dos.proxy.FolioProxy;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging.Logger;

@RestController
@CrossOrigin
public class puntoDosController {

    private final FolioProxy folioProxy;

    private static final Logger logger = Logger.getLogger(puntoDosController.class.getName());


    public puntoDosController(FolioProxy folioProxy){
        this.folioProxy = folioProxy;
    }

    @PostMapping("/misFolios")
    public Folio generateFolio(@RequestBody FolioRequest request){
        logger.info("REQUEST FROM FRONT END, FORWARDING TO OUTSIDE SERVICE");
        return folioProxy.createFolio(request.getFolioNum());
    }

}
