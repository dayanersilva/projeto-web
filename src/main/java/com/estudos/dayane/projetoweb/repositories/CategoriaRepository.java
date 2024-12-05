package com.estudos.dayane.projetoweb.repositories;

import com.estudos.dayane.projetoweb.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
