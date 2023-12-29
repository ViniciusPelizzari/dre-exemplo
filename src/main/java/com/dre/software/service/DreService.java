package com.dre.software.service;

import com.dre.software.repository.DreReporitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DreService {

    @Autowired
    private DreReporitory dreReporitory;

    public Double findTotalReceita() {
        return dreReporitory.findTotalReceita();
    }

    public Double findTotalCusto() {
        return dreReporitory.findTotalCusto();
    }

    public Double findTotalLucro() {
        return dreReporitory.findTotalLucro();
    }
}
