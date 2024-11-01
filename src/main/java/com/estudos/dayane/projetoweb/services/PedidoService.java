package com.estudos.dayane.projetoweb.services;

import com.estudos.dayane.projetoweb.entities.Pedido;
import com.estudos.dayane.projetoweb.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;
    public List<Pedido> findAll(){
        return repository.findAll();
    }

    public Optional<Pedido> findById(Long id){
        return repository.findById(id);
    }
}
