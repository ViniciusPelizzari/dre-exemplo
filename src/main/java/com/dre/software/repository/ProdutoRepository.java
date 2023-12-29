package com.dre.software.repository;

import com.dre.software.entities.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {

    @Query("SELECT SUM(p.preco) FROM ProdutoEntity p")
    Double findTotalPreco();
}
