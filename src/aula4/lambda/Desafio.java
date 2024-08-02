package aula4.lambda;

import java.util.Arrays;
import java.util.List;

public class Desafio {
	public static void main(String[] args) {
		List<String> lista = Arrays.asList("ana", "josé", "joão", "maria", "cristiano");

		Mostrador mostrador = (palavra) -> System.out.println(palavra.toUpperCase());
		lista.forEach(mostrador::mostra);
	}
}
