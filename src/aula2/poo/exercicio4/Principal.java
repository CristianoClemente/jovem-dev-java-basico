package aula2.poo.exercicio4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		List<Carro> carros = new ArrayList<Carro>();

		Carro c1 = new Carro("Corsa", "1998", "Azul");
		Carro c2 = new Carro("Scenic", "2006", "Cinza");
		Carro c3 = new Carro("Logan", "2018", "Cinza");

		carros.add(c1);
		carros.add(c2);
		carros.add(c3);

		String msg = "";
		for (Carro carro : carros) {

			msg += carro.modelo + " " + carro.ano + " " + carro.cor + "\n";
		}
		
		JOptionPane.showMessageDialog(null, msg);

	}

}
