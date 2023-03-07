package com.ada.mercado.estoque.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "Produto")
public class Produto {
    @Id
    @Column(name = "id")
    private Long id;
    private String nome;
    private String marca;
    private String unidade;
    private double quantidadeDaUnidade;

    private String identificador;

    private long unidadeEstoque;
}
