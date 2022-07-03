package br.com.fende.fendesoftware.repositories;

import br.com.fende.fendesoftware.model.Pessoa;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PessoaRepository {

    List<Pessoa> consultar();


    Optional<Pessoa> consultar(UUID id);

    void cadastrar(Pessoa pessoa);

    void excluir(Pessoa pessoa);



}
