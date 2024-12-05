package com.estudos.dayane.projetoweb.services;

import com.estudos.dayane.projetoweb.entities.Categoria;
import com.estudos.dayane.projetoweb.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;
    public List<Categoria> findAll(){
        return repository.findAll();
    }

    public Optional<Categoria> findById(Long id){
        return repository.findById(id);
    }
}
