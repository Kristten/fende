package br.com.fende.fendesoftware.services.Impl;

import br.com.fende.fendesoftware.model.Pessoa;
import br.com.fende.fendesoftware.repositories.PessoaRepository;
import br.com.fende.fendesoftware.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;
    @Override
    public List<Pessoa> consultar() {
        return pessoaRepository.consultar();
    }

    @Override
    public Pessoa consultar(UUID id) {
        return pessoaRepository.consultar(id).orElseThrow();
    }

    @Override
    public Pessoa cadastrar(Pessoa pessoaModel) {
        var pessoa = new Pessoa(pessoaModel.getNome(), pessoaModel.getCpf());
        pessoaRepository.cadastrar(pessoa);
        return pessoa;
    }

    @Override
    public Pessoa editar(UUID id, Pessoa alterarPessoaModel) {
        Pessoa pessoa = this.consultar(id);
        pessoa.editar(alterarPessoaModel.getNome(), alterarPessoaModel.getCpf());
        return pessoa;
    }

    @Override
    public Pessoa remover(UUID id) {
        Pessoa pessoa = this.consultar(id);
        pessoaRepository.excluir(pessoa);
        return pessoa;
    }
}
