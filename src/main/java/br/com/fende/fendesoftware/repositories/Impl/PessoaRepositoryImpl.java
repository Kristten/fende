package br.com.fende.fendesoftware.repositories.Impl;

import br.com.fende.fendesoftware.model.Pessoa;
import br.com.fende.fendesoftware.repositories.PessoaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public class PessoaRepositoryImpl implements PessoaRepository {
    private static final List<Pessoa> pessoas = new ArrayList<>();
    @Override
    public List<Pessoa> consultar() {
        return pessoas;
    }

    @Override
    public Optional<Pessoa> consultar(UUID id) {
        return pessoas.stream().filter(pessoa -> id.equals(pessoa.getId())).findFirst();
    }

    @Override
    public void cadastrar(Pessoa pessoa) {
        pessoas.add(pessoa);

    }

    @Override
    public void excluir(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }
}
