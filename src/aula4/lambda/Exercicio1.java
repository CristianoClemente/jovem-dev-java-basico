package aula4.lambda;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {

		new Exercicio1();

	}

	public Exercicio1() {

		ArrayList<Integer> numeros = new ArrayList<Integer>(50);
		Random numRandom = new Random();

		for (int i = 0; i < 50; i++) {
			numeros.add(numRandom.nextInt(100));
		}
		numeros.forEach(System.out::println);
	}

}
