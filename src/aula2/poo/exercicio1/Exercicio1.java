package aula2.poo.exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor:"));
		int numInt = (int) num;
		JOptionPane.showMessageDialog(null, numInt);
	}
}
