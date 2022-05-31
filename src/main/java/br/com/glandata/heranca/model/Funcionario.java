package br.com.glandata.heranca.model;

import lombok.Getter;
import lombok.Setter;

public class Funcionario extends Pessoa {

	public Funcionario(int registro, String nome) {
		this.registro = registro;
		this.nome = nome;
	}

	@Getter
	private int registro;

	@Getter
	private String nome;

	@Getter
	@Setter
	private float salario;

	public void imprimeNomeFuncionario() {
		System.out.println(this.nome);
	}

}
