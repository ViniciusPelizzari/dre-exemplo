package com.dre.software.controller;

import com.dre.software.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sale")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @GetMapping("/totalQuantidade")
    public Double getTotalQuantidade() {
        return vendaService.findTotalQuantidade();
    }
}
