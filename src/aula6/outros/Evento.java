package aula6.outros;

import java.time.LocalDateTime;

import aula6.outros.EventoEnum;

public class Evento {

	private String descricao;
	private LocalDateTime dataHora;
	private EventoEnum tipoEvento;

	public Evento(String descricao, LocalDateTime dataHora, EventoEnum tipoEvento) {
		this.descricao = descricao;
		this.dataHora = dataHora;
		this.tipoEvento = tipoEvento;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public EventoEnum getTipoEvento() {
		return tipoEvento;
	}

	@Override
	public String toString() {
		return String.format("Descrição: %s, Data e Hora: %s, Tipo: %s", descricao, dataHora, tipoEvento);
	}

}