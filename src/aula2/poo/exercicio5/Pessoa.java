package aula2.poo.exercicio5;

import java.time.LocalDate;

public class Pessoa {

	public String nome;
	public LocalDate dataNascimento;

	public Pessoa(String nome, LocalDate dataNascimento) {

		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
