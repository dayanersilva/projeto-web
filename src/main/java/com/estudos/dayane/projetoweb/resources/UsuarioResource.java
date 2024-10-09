package com.estudos.dayane.projetoweb.resources;

import com.estudos.dayane.projetoweb.entities.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

    @GetMapping
    public ResponseEntity<Usuario> findAll(){
        Usuario usuario = new Usuario(1L, "Dayane", "dayane@gmail.com","22222222", "123456");
        return ResponseEntity.ok().body(usuario);
    }

}
