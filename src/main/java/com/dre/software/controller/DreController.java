package com.dre.software.controller;

import com.dre.software.service.DreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dre")
public class DreController {

    @Autowired
    private DreService dreService;

    @GetMapping("/totalReceita")
    public Double getTotalReceita() {
        return dreService.findTotalReceita();
    }

    @GetMapping("/totalCusto")
    public Double getTotalCusto() {
        return dreService.findTotalCusto();
    }

    @GetMapping("/totalLucro")
    public Double getTotalLucro() {
        return dreService.findTotalLucro();
    }
}
