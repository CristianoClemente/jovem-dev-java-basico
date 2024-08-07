package aula6.outros;

public class Exercicio3 {
	public static void main(String[] args) {
		new Exercicio3();
	}

	public Exercicio3() {

		int a = 5;
		int b = 10;

		StringBuilder msg = new StringBuilder("Operações:\n");
		for (Calculadora2Enum operacao : Calculadora2Enum.values()) {
			int resultado = operacao.calcula(a, b);
			msg.append("\n")
				.append(operacao.getNomeAmigavel())
				.append(" de ")
				.append(a)
				.append(" e ")
				.append(b)
				.append(" = ")
				.append(resultado);
		}
		
		System.out.println(msg.toString());

	}

}
