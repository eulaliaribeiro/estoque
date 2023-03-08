package com.ada.mercado.estoque.entities;

import lombok.*;
import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idProduto;
    private String nome;
    private String marca;
    private Integer quantidade;
    private Double preco;

}
