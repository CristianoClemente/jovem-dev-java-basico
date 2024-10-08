package aula6.outros;

import java.util.function.BiFunction;

public enum Calculadora2Enum {

	SOMA("Soma", (a, b) -> a + b), 
	SUBTRACAO("Subtração", (a, b) -> a - b), 
	DIVISAO("Divisão", (a, b) -> a / b),
	MULTIPLICACAO("Multiplicação", (a, b) -> a * b);

	private final String nomeAmigavel;
	private final BiFunction<Integer, Integer, Integer> calculo;

	private Calculadora2Enum(String nomeAmigavel, BiFunction<Integer, Integer, Integer> calculo) {
		this.nomeAmigavel = nomeAmigavel;
		this.calculo = calculo;
	}

	public String getNomeAmigavel() {
		return nomeAmigavel;
	}

	public int calcula(int a, int b) {
		return calculo.apply(a, b);
	}

}
