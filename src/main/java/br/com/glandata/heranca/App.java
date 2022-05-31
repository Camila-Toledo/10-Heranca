package br.com.glandata.heranca;

import br.com.glandata.heranca.model.Desenvolvedor;
import br.com.glandata.heranca.model.Gerente;

public class App {

	public static void main(String[] args) {

		float salarioBase = 1500.00f;

		Desenvolvedor desenvolvedor = new Desenvolvedor(789, "Camila");
		desenvolvedor.setIdade(38); // Classe Pessoa
		desenvolvedor.setEndereco("Rua dos bobos, 0"); // Classe Pessoa
		desenvolvedor.setAcessaServidor(true); // Classe Desenvolvedor
		desenvolvedor.setSalario(salarioBase);
		
		desenvolvedor.imprimeNomeFuncionario(); // Classe Funcionario
		
		System.out.println(desenvolvedor);

		Gerente gerente = new Gerente(123, "Nelson");
		gerente.setIdade(70); // Classe Pessoa
		gerente.setEndereco("Não sei"); // Classe Pessoa
		gerente.setAcessoContas(true); // Classe Gerente
		gerente.setSalario(salarioBase);
		
		gerente.imprimeNomeFuncionario(); // Classe Funcionario

		System.out.println(gerente);
	}

}
