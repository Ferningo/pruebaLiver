package com.prueba.jose.demo.service;


import com.prueba.jose.demo.model.Folio;
import org.springframework.stereotype.Service;
import java.util.Random;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class DateService {

    private String getCurrentDate(){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return localDateTime.format(myFormatObj);
    }

    public Folio generateFolio(int folioNumber){
        Folio myFolio = new Folio();
        myFolio.setDate(getCurrentDate());
        myFolio.setFolioNumber(folioNumber);
        myFolio.setConcatValue(myFolio.getDate() + myFolio.getFolioNumber());
        return myFolio;
    }


}
