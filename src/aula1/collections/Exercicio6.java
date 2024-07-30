package aula1.collections;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		Exercicio();
	}

	public static void Exercicio() {
		HashMap<String, Double[]> alunos = new HashMap<>();
		String mensagem = "";

		for (int i = 0; i < 5; i++) {
			String nome = JOptionPane.showInputDialog("Nome do aluno:");
			Double[] notas = lerNotas();
			alunos.put(nome, notas);
		}

		for (String nome : alunos.keySet()) {
			Double[] notas = alunos.get(nome);
			double media = calcularMedia(notas);

			mensagem += "\n\nAluno: " + nome + "\nNotas: ";
			for (double nota : notas) {
				mensagem += nota + " ";
			}
			mensagem += "\nMédia: " + media;
		}

		JOptionPane.showMessageDialog(null, mensagem);
	}

	public static Double[] lerNotas() {
		Double[] notas = new Double[3];
		for (int i = 0; i < 3; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota " + (i + 1) + ":"));
		}
		return notas;
	}

	public static double calcularMedia(Double[] notas) {
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma / notas.length;
	}
}
