package com.estudos.dayane.projetoweb.resources;

import com.estudos.dayane.projetoweb.entities.Categoria;
import com.estudos.dayane.projetoweb.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService service;

    @GetMapping
    public ResponseEntity<List<Categoria>> findAll(){
        List<Categoria> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Categoria>> findById(@PathVariable Long id){
        Optional<Categoria> Categoria = service.findById(id);
        return ResponseEntity.ok().body(Categoria);
    }

}
