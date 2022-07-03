package br.com.fende.fendesoftware.model;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Getter
@Entity
public class Pessoa {
	@Id
	private UUID id;
	private String nome;
	private String cpf;

	public Pessoa(String nome, String cpf) {
		this.id = UUID.randomUUID();
		this.nome = nome;
		this.cpf = cpf;
	}

	public Pessoa() {

	}

	public Pessoa editar(final String nome, final String cpf){
		this.nome = nome;
		this.cpf = cpf;
		return this;
	}

}
