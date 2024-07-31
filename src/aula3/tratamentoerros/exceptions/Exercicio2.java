package aula3.tratamentoerros.exceptions;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		LerNumero();
	}

	private static void LerNumero() {
		try {
			int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número 1:"));
			int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número 2:"));
			if (valor2 == 0) {
				throw new ZeroException();
			}
			JOptionPane.showMessageDialog(null, "A divisão de " + valor1 + " por " + valor2 + " é " + valor1 / valor2);
		} catch (ZeroException e) {

			JOptionPane.showMessageDialog(null, e.getMessage());
			throw new ZeroException(e.getMessage());

		}

	}
}
