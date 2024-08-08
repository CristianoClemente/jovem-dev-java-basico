package aula5.stream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Desafio {
	public static void main(String[] args) {
		new Desafio();
	}

	public Desafio() {
		List<Pessoa> pessoas = new ArrayList<>();
		String padraoData = "dd/MM/yyyy";

		pessoas.add(new Pessoa("Alan", LocalDate.parse("28/11/1993", DateTimeFormatter.ofPattern(padraoData))));
		pessoas.add(new Pessoa("João", LocalDate.parse("28/09/1993", DateTimeFormatter.ofPattern(padraoData))));
		pessoas.add(new Pessoa("Ana", LocalDate.parse("28/05/1993", DateTimeFormatter.ofPattern(padraoData))));
		pessoas.add(new Pessoa("Maria", LocalDate.parse("28/11/1992", DateTimeFormatter.ofPattern(padraoData))));
		pessoas.add(new Pessoa("Juca", LocalDate.parse("28/12/1993", DateTimeFormatter.ofPattern(padraoData))));
		pessoas.add(new Pessoa("Julia", LocalDate.parse("28/08/2016", DateTimeFormatter.ofPattern(padraoData))));
		pessoas.add(new Pessoa("Criss", LocalDate.parse("28/05/1992", DateTimeFormatter.ofPattern(padraoData))));
		pessoas.add(new Pessoa("Carol", LocalDate.parse("28/06/1992", DateTimeFormatter.ofPattern(padraoData))));
		pessoas.add(new Pessoa("Alberto", LocalDate.parse("28/01/1993", DateTimeFormatter.ofPattern(padraoData))));
		pessoas.add(new Pessoa("Taty", LocalDate.parse("29/02/2013", DateTimeFormatter.ofPattern(padraoData))));

		System.out.println(filtraNomes(pessoas));
	}

	public List<String> filtraNomes(List<Pessoa> pessoas) {

		List<String> nomes = pessoas.stream()
				.filter(p -> p.getDataNascimento().isLeapYear() || comecaComVogal(p.getNome()))
				.map(Pessoa::getNome)
				.sorted(Comparator.comparing(String::toString)
				.reversed()).collect(Collectors.toList());
		return nomes;
	}

	private static boolean comecaComVogal(String s) {
		s = s.toLowerCase();
		return Stream.of("a", "e", "i", "o", "u").anyMatch(s::startsWith);
	}

}
