package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Serve para evitar NullPointerException
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class Exemplo {

	public static void main(String[] args) {
		new Exemplo();
	}

	public Exemplo() {

		List<String> lista = new ArrayList<>();

		lista.add("João");
		lista.add("Ana");
		lista.add("Jose");
		lista.add("Maria");
		lista.add("Pedro");
		lista.add("Carlos");

		List<String> nomesFiltratos = lista.stream()

				.filter(elemento -> elemento.startsWith("J")).map(String::toUpperCase).collect(Collectors.toList());
		// .mapToInt(String::length)
		System.out.println(lista);
		System.out.println(nomesFiltratos);
//				//.limit(1)

//				.average().orElse(0)
//				//.average() MÉDIA
//				
//				

		// .sorted()
//				//.peek(el -> System.out.println("[peek]" + el))

		// .forEach(System.out::println)

		// .count()

//				.findFirst()
//					.orElse("Não encontrado")

	}
	/*
	 * String s = getString(); Optional<String> opt = Optional.ofNullable(s);
	 * 
	 * System.out.println(opt.orElse("Não encontrou"));
	 * System.out.println(opt.orElseGet(() -> "Não encontrou"));
	 * System.out.println(opt.orElseGet(() -> getStringAlternativa()));
	 * System.out.println(opt.orElseThrow(() -> new
	 * IllegalArgumentException("Valor nulo")));
	 * 
	 * if (s != null) { System.out.println("Chamou o metodo"); } else {
	 * System.out.println("Não é uma String"); }
	 * 
	 * }
	 * 
	 * private String getStringAlternativa() { System.out.println(""); return
	 * "String Alternativa";
	 * 
	 * }
	 * 
	 * private String getString() { if (LocalDateTime.now().getSecond() % 2 == 0) {
	 * return "Retornou"; }
	 * 
	 * return null; }
	 */
}
