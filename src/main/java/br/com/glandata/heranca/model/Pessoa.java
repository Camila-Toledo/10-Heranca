package br.com.glandata.heranca.model;

import lombok.Getter;
import lombok.Setter;

public class Pessoa {

	public Pessoa() {
		System.out.println("Mensagem vinda da classe Pessoa");
	}

	@Getter
	@Setter
	private int idade;

	@Getter
	@Setter
	private String endereco;

}
