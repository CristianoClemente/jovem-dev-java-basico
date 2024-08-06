package aula6.outros;

public enum DiaSemanaEnum {

	DOMINGO("Domingo", true), SEGUNDA_FEIRA("Seguna-Feira", false), TERCA_FEIRA("Terça-Feira", false),
	QUARTA_FEIRA("Quarta-Feira", false), QUINTA_FEIRA("Quinta-Feira", false), SEXTA_FEIRA("Sexta-Feira", false),
	SABADO("Sábado", true);

	DiaSemanaEnum(String nome, boolean b) {
		this.nome = nome;
		this.isFimDeSemana = b;

	}

	private final String nome;
	private final boolean isFimDeSemana;

	public String getNome() {
		return nome;
	}

	public String isFimDeSemana(boolean isFimDeSemana) {
		return null;
	}

}
