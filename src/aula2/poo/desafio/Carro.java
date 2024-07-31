package aula2.poo.desafio;

import java.time.LocalDate;

public class Carro {
	private String modelo;
	private LocalDate ano;

	public Carro(String modelo, LocalDate ano) {
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public LocalDate getAno() {
		return ano;
	}

	public void setAno(LocalDate ano) {
		this.ano = ano;
	}
}
