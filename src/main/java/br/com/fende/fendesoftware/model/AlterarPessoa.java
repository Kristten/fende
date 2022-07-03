package br.com.fende.fendesoftware.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AlterarPessoa {
    @NotBlank
    @NotNull
    private String nome;
    @NotNull
    private String cpf;
}
