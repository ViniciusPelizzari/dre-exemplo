package com.dre.software.repository;

import com.dre.software.entities.VendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VendaRepository extends JpaRepository<VendaEntity, Long> {

    @Query("SELECT SUM(v.quantidade) FROM VendaEntity v")
    Double findTotalQuantidade();
}
