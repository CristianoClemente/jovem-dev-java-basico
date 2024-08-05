package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		new Exercicio2();
	}

	public Exercicio2() {
		List<Integer> numLista = new ArrayList<>();
		Random randon = new Random();

		for (int i = 0; i < 50; i++) {
			int numAleatorio = randon.nextInt(100) + 1;
			numLista.add(numAleatorio);

		}

		System.out.println(numLista.toString());
		System.out.println(numLista.stream().filter(i -> i.intValue() > 50).mapToInt(i -> i).average().orElse(0));

	}

}
