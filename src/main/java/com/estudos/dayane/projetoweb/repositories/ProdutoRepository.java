package com.estudos.dayane.projetoweb.repositories;

import com.estudos.dayane.projetoweb.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
