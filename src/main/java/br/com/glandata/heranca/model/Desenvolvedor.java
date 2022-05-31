package br.com.glandata.heranca.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Desenvolvedor extends Funcionario {

	public Desenvolvedor(int registro, String nome) {
		super(registro, nome);
	}

	@Getter
	@Setter
	private boolean acessaServidor;
	
	@Setter
	private float salario;

	@Override
	public float getSalario() {
		return this.salario * 1.1f;
	}

}
