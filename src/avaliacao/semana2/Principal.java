package avaliacao.semana2;

import avaliacao.semana2.personagens.Arok;
import avaliacao.semana2.personagens.Barbaro;
import avaliacao.semana2.personagens.Mago;
import avaliacao.semana2.personagens.Morcego;
import avaliacao.semana2.personagens.Paladino;
import avaliacao.semana2.personagens.Urso;
import avaliacao.semana2.personagens.Vampiro;
import avaliacao.semana2.personagens.Zumbi;

public class Principal {
	public static void main(String[] args) throws PersonagemDerrotadoException {

		Mago mago = new Mago("Mago", 30, 30, 18, 23);
		Barbaro barbaro = new Barbaro("Bárbaro", 100, 100, 20, 18);
		Paladino paladino = new Paladino("Paladino", 50, 50, 20, 19);

		Morcego morcego = new Morcego("Morcego", 20, 10, 5, 8);
		Zumbi zumbi = new Zumbi("Zumbi", 22, 22, 6, 6);
		Urso urso = new Urso("Urso", 30, 30, 8, 9);
		Vampiro vampiro = new Vampiro("Vampiro", 35, 35, 10, 10);
		Arok arok = new Arok("Arok, Mestre Supremo", 50, 50, 20, 20);

		mago.batalhar(morcego);

		if (morcego.getHp() <= 0) {

			mago.batalhar(zumbi);

			if (zumbi.getHp() <= 0) {

				mago.batalhar(urso);
				if (urso.getHp() <= 0) {

					mago.batalhar(vampiro);

					if (vampiro.getHp() <= 0) {
						mago.batalhar(arok);
					}

				} else {

				}
			} else {

			}
		} else {
			morcego.setRestauraHp();
		}

	}

}
