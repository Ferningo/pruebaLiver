package com.punto.dos.demo_dos.proxy;

import com.punto.dos.demo_dos.model.Folio;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "folios",url = "${name.service.url}")
public interface FolioProxy {

        @GetMapping("folios/{folio}")
        Folio createFolio(@PathVariable int folio);

}


