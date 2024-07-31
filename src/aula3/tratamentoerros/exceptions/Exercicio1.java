package aula3.tratamentoerros.exceptions;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		LerNumero();

	}

	private static void LerNumero() {
		try {
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
			System.out.println(valor);
			JOptionPane.showMessageDialog(null, "O número digitado foi " + valor);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Você digitou um valor não reconhecido");
			e.printStackTrace();
			LerNumero();
		}

	}

}
