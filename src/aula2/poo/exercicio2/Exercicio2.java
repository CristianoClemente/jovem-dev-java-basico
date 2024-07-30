package aula2.poo.exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		Exercicio();
	}

	public static void Exercicio() {
		String frase1 = JOptionPane.showInputDialog("Informe a primeira frase:");
		String frase2 = JOptionPane.showInputDialog("Informe a segunda frase:");
		if (frase1.equals(frase2)) {
			JOptionPane.showMessageDialog(null, frase1 + " e " + frase2 + " são iguais\n" + frase1 + " contém "
					+ frase1.replace(" ", "").length() + "\n" + frase2 + " contém " + frase2.replace(" ", "").length());
		} else {
			JOptionPane.showMessageDialog(null, frase1 + " e " + frase2 + " Não são iguais\n" + frase1 + " contém "
					+ frase1.replace(" ", "").length() + "\n" + frase2 + " contém " + frase2.replace(" ", "").length());
		}

	}
}
