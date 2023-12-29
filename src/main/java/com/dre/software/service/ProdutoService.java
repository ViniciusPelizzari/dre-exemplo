package com.dre.software.service;

import com.dre.software.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Double findTotalPreco() {
        return produtoRepository.findTotalPreco();
    }
}
