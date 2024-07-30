package aula2.poo.exercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		Exercicio();
	}

	public static void Exercicio() {

		LocalDate data = LocalDate.parse(JOptionPane.showInputDialog("Informe uma data no padão:"),
				DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		JOptionPane.showMessageDialog(null, "a data " + data + " caiu na(o) " + data.getDayOfWeek());
	}

}
