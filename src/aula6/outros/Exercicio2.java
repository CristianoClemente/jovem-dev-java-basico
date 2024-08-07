package aula6.outros;

public class Exercicio2 {
	public static void main(String[] args) {
		new Exercicio2();
	}

	public Exercicio2() {

		int a = 5;
		int b = 10;

		StringBuilder msg = new StringBuilder("Operações:\n\n");

		for (Calculadora1Enum calculo : Calculadora1Enum.values()) {

			msg.append(calculo.getNomeAmigavel())
				.append(" de ")
				.append(a)
				.append(" e ")
				.append(b)
				.append("  é ")
				.append(calculo.calcula(a, b))
				.append("\n");
			
		}

		System.out.println(msg);

	}

}
