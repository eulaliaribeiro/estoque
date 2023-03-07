package com.ada.mercado.estoque.controllers;

import com.ada.mercado.estoque.entities.Produto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/produto")
@RequiredArgsConstructor
public class AdicionarProdutoController {

    @PostMapping(path = "/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void realizarPagamentoFornecedor(){

    }

    @GetMapping(path = "/find/{id}")
    public void getProdutoByIdentificador(@PathVariable("id") String identificador){

    }

    @GetMapping(path = "")
    public void getAllProdutos(){

    }


}
