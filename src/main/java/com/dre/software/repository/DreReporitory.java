package com.dre.software.repository;

import com.dre.software.entities.DreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DreReporitory extends JpaRepository<DreEntity, Long> {

    @Query("SELECT SUM(d.receita) FROM DreEntity d")
    Double findTotalReceita();

    @Query("SELECT SUM(d.custo) FROM DreEntity d")
    Double findTotalCusto();

    @Query("SELECT SUM(d.lucro) FROM DreEntity d")
    Double findTotalLucro();
}
