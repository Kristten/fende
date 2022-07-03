package br.com.fende.fendesoftware.controller;

import br.com.fende.fendesoftware.model.Pessoa;
import br.com.fende.fendesoftware.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/consultar")
    public List<Pessoa> consultar(){
        return  pessoaService.consultar();
    }

    @PostMapping("/cadastrar")
    public Pessoa cadastrar(@RequestBody @Valid Pessoa pessoaModel){
        return pessoaService.cadastrar(pessoaModel);
    }

    @PutMapping("/alterar/{id}")
    public Pessoa editar(@PathVariable UUID id, @RequestBody Pessoa pessoaModel ){
        return pessoaService.editar(id, pessoaModel);
    }

    @DeleteMapping("/remover/{id}")
    public Pessoa remover(@PathVariable UUID id){
        return pessoaService.remover(id);
    }
}

