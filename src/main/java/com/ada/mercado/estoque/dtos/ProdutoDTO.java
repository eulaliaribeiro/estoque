package com.ada.mercado.estoque.dtos;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ProdutoDTO {
    private String idProduto;
    private String nome;
    private String marca;
    private Integer quantidade;
    private Double preco;
}
