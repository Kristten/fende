package br.com.fende.fendesoftware.controller;

import br.com.fende.fendesoftware.model.Pessoa;
import br.com.fende.fendesoftware.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    public List<Pessoa> consultar(){
        return  pessoaService.consultar();
    }

}
