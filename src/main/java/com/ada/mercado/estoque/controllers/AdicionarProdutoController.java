package com.ada.mercado.estoque.controllers;

import com.ada.mercado.estoque.dtos.ProdutoDTO;
import com.ada.mercado.estoque.producers.ProdutoProducer;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/produto")
@RequiredArgsConstructor
public class AdicionarProdutoController {

    private final ProdutoProducer produtoProducer;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> sendMessage(@RequestBody ProdutoDTO produtoDTO){
        var id = UUID.randomUUID().toString();

        var message = com.ada.mercado.Produto.newBuilder()

                .setIdProduto(id)
                .setNome(produtoDTO.getNome())
                .setQuantidade(produtoDTO.getQuantidade())
                .setPreco(produtoDTO.getPreco())
                .build();
        produtoProducer.sendMessage(message);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
