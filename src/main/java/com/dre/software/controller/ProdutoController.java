package com.dre.software.controller;

import com.dre.software.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/totalPreco")
    public Double getTotalPreco() {
        return produtoService.findTotalPreco();
    }
}
