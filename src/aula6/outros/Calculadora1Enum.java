package aula6.outros;

import java.util.function.Function;

public enum Calculadora1Enum {

	SOMA("Soma", vb -> vb),
	SUBTRACAO("Subtração", vb -> vb),
	DIVISAO("Divisão", vb -> vb),
	MULTIPLICACAO("Multiplicação", vb -> vb);

	private final String nomeAmigavel;
	private final Function<Double, Double> calcula;



	




	private Calculadora1Enum(String nomeAmigavel, Function<Double, Double> calcula) {
		this.nomeAmigavel = nomeAmigavel;
		this.calcula = calcula;
	}








	public String getNomeAmigavel() {
		return nomeAmigavel;
	}

}
