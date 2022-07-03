package br.com.fende.fendesoftware.services;

import br.com.fende.fendesoftware.model.Pessoa;

import java.util.List;
import java.util.UUID;

public interface PessoaService {

    List<Pessoa> consultar();

    Pessoa consultar(UUID id);

    Pessoa cadastrar(Pessoa pessoaModel);

    Pessoa

}
