package com.estudos.dayane.projetoweb.services;

import com.estudos.dayane.projetoweb.entities.Produto;
import com.estudos.dayane.projetoweb.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;
    public List<Produto> findAll(){
        return repository.findAll();
    }

    public Optional<Produto> findById(Long id){
        return repository.findById(id);
    }
}
