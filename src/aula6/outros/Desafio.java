package aula6.outros;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Desafio {
	public static void main(String[] args) {
		new Desafio();
	}

	public Desafio() {

		List<Evento> eventos = new ArrayList<>();

		eventos.add(new Evento("Festa de Aniversário", LocalDateTime.of(2024, 8, 5, 18, 0), EventoEnum.SOCIAL));
		eventos.add(new Evento("Reunião de Trabalho", LocalDateTime.of(2024, 8, 10, 9, 0), EventoEnum.PROFISSIONAL));
		eventos.add(new Evento("Show de Música", LocalDateTime.of(2024, 8, 15, 20, 0), EventoEnum.LAZER));
		eventos.add(new Evento("Café com Amigos", LocalDateTime.of(2024, 7, 25, 15, 0), EventoEnum.SOCIAL));
		eventos.add(new Evento("Curso de Java", LocalDateTime.of(2024, 8, 20, 10, 0), EventoEnum.PROFISSIONAL));
		eventos.add(new Evento("Show", LocalDateTime.of(2024, 8, 10, 16, 45), EventoEnum.LAZER));
		eventos.add(new Evento("Show", LocalDateTime.of(2024, 8, 9, 16, 45), EventoEnum.LAZER));

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tipo de evento (SOCIAL, LAZER, PROFISSIONAL, OUTROS): ");
		String tipoEvento = scanner.nextLine().toUpperCase();

		EventoEnum tipoSelecionado;
		try {
			tipoSelecionado = EventoEnum.valueOf(tipoEvento);
		} catch (IllegalArgumentException e) {
			System.out.println("Tipo de evento inválido!");
			scanner.close();
			return;
		}

		List<Evento> eventosSelecionados = eventos.stream().filter(e -> e.getTipoEvento() == tipoSelecionado)
				.collect(Collectors.toList());

		LocalDateTime agora = LocalDateTime.now();
		List<Evento> eventosPassados = eventosSelecionados.stream().filter(e -> e.getDataHora().isBefore(agora))
				.collect(Collectors.toList());
		List<Evento> eventosFuturos = eventosSelecionados.stream().filter(e -> e.getDataHora().isAfter(agora))
				.collect(Collectors.toList());

		System.out.println("\nEventos " + tipoSelecionado + " que já ocorreram:");
		eventosPassados.forEach(System.out::println);

		System.out.println("\nEventos " + tipoSelecionado + " que ainda não ocorreram:");
		eventosFuturos.forEach(System.out::println);

		scanner.close();
	}

}