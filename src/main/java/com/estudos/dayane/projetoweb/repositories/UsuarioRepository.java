package com.estudos.dayane.projetoweb.repositories;

import com.estudos.dayane.projetoweb.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
