package avaliacao.semana2;

import java.util.ArrayList;
import java.util.List;

import avaliacao.semana2.personagens.Arok;
import avaliacao.semana2.personagens.Barbaro;
import avaliacao.semana2.personagens.Mago;
import avaliacao.semana2.personagens.Morcego;
import avaliacao.semana2.personagens.Paladino;
import avaliacao.semana2.personagens.Personagem;
import avaliacao.semana2.personagens.Urso;
import avaliacao.semana2.personagens.Vampiro;
import avaliacao.semana2.personagens.Zumbi;

public class Principal {
	public static void main(String[] args) {

		List<Personagem> herois = new ArrayList<Personagem>();
		List<Personagem> inimigos = new ArrayList<Personagem>();

		herois.add(new Mago("Mago", 30, 30, 18, 23));
		herois.add(new Barbaro("Bárbaro", 100, 100, 20, 18));
		herois.add(new Paladino("Paladino", 50, 50, 20, 19));

		inimigos.add(new Morcego("Morcego", 10, 10, 5, 5));
		inimigos.add(new Zumbi("Zumbi", 22, 22, 6, 6));
		inimigos.add(new Urso("Urso", 30, 30, 8, 9));
		inimigos.add(new Vampiro("Vampiro", 35, 35, 10, 10));
		inimigos.add(new Arok("Arok, Mestre Supremo", 50, 50, 20, 20));

		Mago mago = new Mago("Mago", 10, 30, 18, 23);
		Morcego morcego = new Morcego("Zumbi", 22, 22, 6, 6);

		
		
		
		
		
		
	
		
		
		
		mago.batalhar(morcego);
		
		
		
		
		
		

	}

}
