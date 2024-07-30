package aula1.collections;

import java.util.ArrayList;
import java.util.Random;

public class Exercico3 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		ArrayList<Integer> lista2 = new ArrayList<>();
		
		for (int i = 0; i < 50; i++) {
			Random num = new Random();
			lista.add(num.nextInt(20));
		}
		
		lista2.addAll(lista);
		
		
		

		System.out.println(lista2);
	}
}
