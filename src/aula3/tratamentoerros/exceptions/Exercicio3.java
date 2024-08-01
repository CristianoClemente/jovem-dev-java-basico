package aula3.tratamentoerros.exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio3 {

	private static Pessoa pessoa;

	public static void main(String[] args) {

		int num2 = 0;
		int num1 = -1;
		String nome1 = "ana";
		pessoa = null;
		List<String> lista = new ArrayList<>();
		Iterator<String> iterator = lista.iterator();

		try {
			iterator.remove();

		} catch (IllegalStateException e) {
			System.out.println("Exceção -IllegalStateException-");
			e.printStackTrace();
		}

		try {
			String nome = pessoa.nome;
			System.out.println(nome);
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
