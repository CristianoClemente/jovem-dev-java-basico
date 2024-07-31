package aula3.tratamentoerros.exceptions;

public class Exercicio3 {
	public static void main(String[] args) {

		int num2 = 0;
		int num1 = -1;
		String nome1 = "ana";
		String nome2 = null;

		Pessoa pessoa = null;

		try {
			/// pessoa.Idade = pessoa.Soma(num1 );
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		try {
			String nome = pessoa.nome;
		} catch (NullPointerException e) {
			System.out.println("Exceção -NullPointerException-");
			e.printStackTrace();
			System.out.println("\n");
		}

		try {
			num1 = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("Exceção -ArithmeticException-");
			e.printStackTrace();
			System.out.println("\n");
		}

		try {

			nome1.substring(num2, num1);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exceção -StringIndexOutOfBoundsException-");
			e.printStackTrace();
			System.out.println("\n");
		}

	}

}
