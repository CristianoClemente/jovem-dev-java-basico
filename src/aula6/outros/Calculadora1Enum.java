package aula6.outros;

public enum Calculadora1Enum {

	SOMA("Soma", (a, b) -> a + b),
	SUBTRACAO("Subtração", (a, b) -> a - b),
	DIVISAO("Divisão", (a, b) -> a / b),
	MULTIPLICACAO("Multiplicação", (a, b) -> a * b);

	private final String nomeAmigavel;
	private final CalculoInterface calculo;

	private Calculadora1Enum(String nomeAmigavel, CalculoInterface calculo) {
		this.nomeAmigavel = nomeAmigavel;
		this.calculo = calculo;
	}

	public String getNomeAmigavel() {
		return nomeAmigavel;
	}

	public int calcula(int a, int b) {
		return calculo.calcula(a, b);
	}

}
