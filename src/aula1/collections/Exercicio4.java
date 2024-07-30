package aula1.collections;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		Exercico();
	}

	private static void Exercico() {
		String frase = JOptionPane.showInputDialog("Digite uma Frase:");
		String msg = "";
		Map<Character, Integer> mapa = new HashMap<>();

		for (char i : frase.toCharArray()) {
			if (mapa.containsKey(i)) {
				mapa.put(i, mapa.getOrDefault(i, 0) + 1);
			} else {
				mapa.put(i, mapa.getOrDefault(i, 1));
			}
		}

		for (Map.Entry<Character, Integer> entry : mapa.entrySet()) {
			msg += entry.getKey() + " - " + entry.getValue() + "\n";
		}

		JOptionPane.showMessageDialog(null,
				"Frase:\n" + frase + "\ncaracteres:\n" + frase.length() + "\nLista:\n" + msg);

	}

}
