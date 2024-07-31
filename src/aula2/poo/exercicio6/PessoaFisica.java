package aula2.poo.exercicio6;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {

	public String cpf;

	public PessoaFisica(String nome, LocalDate dataNascimento, String cpf) {
		super(nome, dataNascimento);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}