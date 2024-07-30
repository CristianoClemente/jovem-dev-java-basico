package aula1.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JOptionPane;

public class Exercico3 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();

		for (int i = 0; i < 50; i++) {
			Random num = new Random();
			lista.add(num.nextInt(21));
		}
		Set<Integer> numDistintos = new HashSet<>(lista);
		JOptionPane.showMessageDialog(null, "Lista com Números:\n" + lista + "\nNúmeros únicos:\n" + numDistintos);
	}
}
