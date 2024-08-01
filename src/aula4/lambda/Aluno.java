package aula4.lambda;

import java.time.LocalDate;

public class Aluno {

	private int numeroChamada;
	private String nome;
	private LocalDate dataNascimento;

	public Aluno() {
		super();

	}

	public Aluno(int numeroChamada, String nome, LocalDate dataNascimento) {
		super();
		this.numeroChamada = numeroChamada;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public int getNumeroChamada() {
		return numeroChamada;
	}

	public void setNumeroChamada(int numeroChamada) {
		this.numeroChamada = numeroChamada;
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

	public boolean contemLetra(String nome) {

		String nome1 = nome;
		int tamanho = nome.length();

		if (nome.substring(0).equals("T") && nome.substring(tamanho - 1).equals("o")) {
			return true;
		} else {
			return false;
		}

	}

}
