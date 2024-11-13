package com.primeFaces.Estudando.modelo;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

public record CadastroAluno(String nome, Long matricula, String telefone, String email,@DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate dataCadastro) {
}
