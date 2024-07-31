package aula2.poo.desafio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Carro> carros = new ArrayList<Carro>();

		String modelo;
		LocalDate ano;

		while (true) {
			modelo = JOptionPane.showInputDialog("Informe o modelo ou digite 'FIM' para sair:");
			if (modelo.equalsIgnoreCase("fim")) {
				break;
			}
			ano = LocalDate.of(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano (formato: yyyy):")), 1, 1);
			Carro carro = new Carro(modelo, ano);
			carros.add(carro);
		}

		Collections.sort(carros, new Comparator<Carro>() {
			@Override
			public int compare(Carro c1, Carro c2) {
				return c1.getAno().compareTo(c2.getAno());
			}
		});

		String resultado = "Carros\\:\n";
		for (Carro carro : carros) {
			resultado += "Modelo: " + carro.getModelo() + ", Ano: " + carro.getAno().getYear() + "\n";
		}

		JOptionPane.showMessageDialog(null, resultado);

	}
}
