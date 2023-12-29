package com.dre.software.service;

import com.dre.software.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public Double findTotalQuantidade() {
        return vendaRepository.findTotalQuantidade();
    }
}
