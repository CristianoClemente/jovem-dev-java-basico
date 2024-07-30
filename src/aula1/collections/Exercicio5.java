package aula1.collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {
		Exercicio();
	}

	public static void Exercicio() {
		Set<Integer> numeros1 = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			Random numRandom = new Random();
			numeros1.add(numRandom.nextInt(30));
		}

		Set<Integer> numeros2 = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			Random numRandom = new Random();
			numeros2.add(numRandom.nextInt(30));
		}

		Set<Integer> numerosEmComum = new HashSet<>();

		for (Integer i : numeros1) {
			if (numeros2.contains(i)) {
				numerosEmComum.add(i);
			}
		}

		JOptionPane.showMessageDialog(null,
				"Set 1:\n" + numeros1 + "\nSet 2:\n" + numeros2 + "\nNímeros em comum:\n" + numerosEmComum);

	}
}
