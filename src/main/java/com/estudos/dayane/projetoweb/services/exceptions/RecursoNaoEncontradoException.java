package com.estudos.dayane.projetoweb.services.exceptions;

public class RecursoNaoEncontradoException extends RuntimeException{

    public RecursoNaoEncontradoException(Object id){
        super("Recurso não encontrado. Id " + id);
    }

}
