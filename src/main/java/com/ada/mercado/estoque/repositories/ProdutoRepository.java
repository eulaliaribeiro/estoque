package com.ada.mercado.estoque.repositories;

import com.ada.mercado.estoque.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
    Optional<Produto> findByNome(String nome);
}
