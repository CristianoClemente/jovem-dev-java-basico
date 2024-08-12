package avaliacao.semana2;

import avaliacao.semana2.personagens.Personagem;

public class PersonagemDerrotadoException extends Exception {

	private static final long serialVersionUID = 1L;

	public PersonagemDerrotadoException(Personagem derrotado, Personagem atacante) {
		super(derrotado.getNome() + " foi derrotado por " + atacante.getNome());
		
	}

}
