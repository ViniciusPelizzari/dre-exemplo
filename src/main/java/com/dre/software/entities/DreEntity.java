package com.dre.software.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "dre")
public class DreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "receita")
    private Double receita;

    @Column(name = "custo")
    private Double custo;

    @Column(name = "lucro")
    private Double lucro;
}
