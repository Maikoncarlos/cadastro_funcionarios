package com.github.maikoncarlos.cadastro_funcionarios.handler;


import com.github.maikoncarlos.cadastro_funcionarios.service.exception.FuncionarioException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@ControllerAdvice
public class ResponseExceptionsHandler {

    @ExceptionHandler(FuncionarioException.class)
    public ResponseEntity<StandardError> funcionarioNaoCadastrado(FuncionarioException ex,
                                                                HttpServletRequest request){
        StandardError error = new StandardError(
                LocalDateTime.now(),
                HttpStatus.BAD_REQUEST.toString(),
                ex.getMessage(),
                request.getRequestURI()
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
}
