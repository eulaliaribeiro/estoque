package com.ada.mercado.estoque.dtos;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class CompraDTO {
    private String idCompra;
    private String cpf;
    private List<String> produtosCompradosList;
}
