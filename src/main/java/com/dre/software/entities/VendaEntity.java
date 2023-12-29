package com.dre.software.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "venda")
public class VendaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "produto_id")
    private Long produto_id;

    @Column(name = "dre_id")
    private Long dre_id;

    @Column(name = "quantidade")
    private Double quantidade;
}
