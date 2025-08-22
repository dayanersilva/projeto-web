package com.estudos.dayane.projetoweb.services;

import com.estudos.dayane.projetoweb.entities.Usuario;
import com.estudos.dayane.projetoweb.repositories.UsuarioRepository;
import com.estudos.dayane.projetoweb.services.exceptions.RecursoNaoEncontradoException;

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
        return Optional.ofNullable(repository.findById(id).orElseThrow(() -> new RecursoNaoEncontradoException(id)));
    }

    public Usuario insert(Usuario usuario){
        return repository.save(usuario);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Usuario update(Long id, Usuario usuario) {
        Usuario obj = repository.getReferenceById(id);
        updateUsuarioDados(obj, usuario);
        return repository.save(obj);
    }

    private void updateUsuarioDados(Usuario obj, Usuario usuario) {
        obj.setNome(usuario.getNome());
        obj.setEmail(usuario.getEmail());
        obj.setEmail(usuario.getEmail());
    }
}
