package com.estudos.dayane.projetoweb.services;

import com.estudos.dayane.projetoweb.entities.Usuario;
import com.estudos.dayane.projetoweb.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;
    public List<Usuario> findAll(){
        return repository.findAll();
    }

    public Optional<Usuario> findById(Long id){
        return repository.findById(id);
    }

    public Usuario insert(Usuario usuario){
        return repository.save(usuario);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}
