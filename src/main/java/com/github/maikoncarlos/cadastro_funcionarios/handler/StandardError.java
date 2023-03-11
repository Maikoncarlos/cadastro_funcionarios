package com.github.maikoncarlos.cadastro_funcionarios.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StandardError{

    private LocalDateTime timestamp;
    private String status;
    private String error;
    private String path;

}