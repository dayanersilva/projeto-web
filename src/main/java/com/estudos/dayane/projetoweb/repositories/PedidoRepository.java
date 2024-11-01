package com.estudos.dayane.projetoweb.repositories;

import com.estudos.dayane.projetoweb.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
