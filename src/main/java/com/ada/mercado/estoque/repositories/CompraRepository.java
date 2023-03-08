package com.ada.mercado.estoque.repositories;

import com.ada.mercado.estoque.entities.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<Compra, Long> {
}
