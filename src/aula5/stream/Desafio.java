package aula5.stream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Desafio {
	public static void main(String[] args) {
		new Desafio();
	}

	public Desafio() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		Pessoa p1 = new Pessoa("Alan", LocalDate.parse("28/11/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Pessoa p2 = new Pessoa("João", LocalDate.parse("28/09/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Pessoa p3 = new Pessoa("Ana", LocalDate.parse("28/05/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Pessoa p4 = new Pessoa("Maria", LocalDate.parse("28/11/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Pessoa p5 = new Pessoa("Juca", LocalDate.parse("28/12/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Pessoa p6 = new Pessoa("Julia", LocalDate.parse("28/08/2016", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Pessoa p7 = new Pessoa("Criss", LocalDate.parse("28/05/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Pessoa p8 = new Pessoa("Carol", LocalDate.parse("28/06/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Pessoa p9 = new Pessoa("Alberto", LocalDate.parse("28/01/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Pessoa p10 = new Pessoa("Taty", LocalDate.parse("29/02/2016", DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		pessoas.add(p5);
		pessoas.add(p6);
		pessoas.add(p7);
		pessoas.add(p8);
		pessoas.add(p9);
		pessoas.add(p10);

		/*
		 * System.out.println(pessoas.stream() .filter(t ->
		 * t.getNome().toUpperCase().startsWith("A") ||
		 * t.getNome().toUpperCase().startsWith("E") ||
		 * t.getNome().toUpperCase().startsWith("I") ||
		 * t.getNome().toUpperCase().startsWith("O") ||
		 * t.getNome().toUpperCase().startsWith("U") ||
		 * t.getDataNascimento().isLeapYear()) .map(Pessoa::getNome).sorted((a, b) ->
		 * b.compareTo(a)).collect(Collectors.joining(" , ")));
		 */

		String resultado = pessoas.stream().filter(p -> {
			String nomeMaiusculo = p.getNome().toUpperCase();
			boolean comecaComVogal = nomeMaiusculo.startsWith("A") || nomeMaiusculo.startsWith("E")
					|| nomeMaiusculo.startsWith("I") || nomeMaiusculo.startsWith("O") || nomeMaiusculo.startsWith("U");

			boolean anoBissexto = p.getDataNascimento().isLeapYear();

			return comecaComVogal && anoBissexto;
		}).map(Pessoa::getNome).sorted((a, b) -> b.compareTo(a)).collect(Collectors.joining(" , "));

		System.out.println(resultado);
	}

}
