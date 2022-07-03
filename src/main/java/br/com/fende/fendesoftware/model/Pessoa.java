package br.com.fende.fendesoftware.model;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Pessoa {

	private UUID id;
	private String nome;
	private String cpf;

	public Pessoa(String nome, String cpf) {
		this.id = UUID.randomUUID();
		this.nome = nome;
		this.cpf = cpf;
	}

}
