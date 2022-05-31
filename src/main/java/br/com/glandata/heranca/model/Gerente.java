package br.com.glandata.heranca.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Gerente extends Funcionario {

	public Gerente(int registro, String nome) {
		super(registro, nome);
	}

	@Getter
	@Setter
	private boolean acessoContas;

	@Setter
	private float salario;

	@Override
	public float getSalario() {
		return this.salario * 1.5f;
	}

}
