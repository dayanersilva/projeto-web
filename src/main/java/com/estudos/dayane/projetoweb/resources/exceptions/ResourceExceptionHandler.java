package com.estudos.dayane.projetoweb.resources.exceptions;

import com.estudos.dayane.projetoweb.services.exceptions.RecursoNaoEncontradoException;

import java.time.Instant;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(RecursoNaoEncontradoException.class)
    public ResponseEntity<MensagemError> recursoNaoEncontrado(RecursoNaoEncontradoException e, HttpServletRequest request){
        String erro = "Recurso não encontrado";
        HttpStatus status = HttpStatus.NOT_FOUND;
        MensagemError mensagemError = new MensagemError(
                Instant.now(),
                status.value(),
                erro,
                e.getMessage(),
                request.getRequestURI()
        );
        return ResponseEntity.status(status).body(mensagemError);
    }
}
