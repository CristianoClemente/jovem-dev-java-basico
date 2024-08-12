package avaliacao.semana2.personagens;

import java.util.Random;

import avaliacao.semana2.PersonagemDerrotadoException;

public abstract class Personagem {

	private String nome;
	private int maxhp;
	private int hp;
	private int ataque;
	private int defesa;

	public Personagem(String nome, int maxhp, int hp, int ataque, int defesa) {

		this.nome = nome;
		this.maxhp = maxhp;
		this.hp = hp;
		this.ataque = ataque;
		this.defesa = defesa;

	}

	public void batalhar(Personagem op) throws PersonagemDerrotadoException {

		int rodada = 0;

		while (this.hp > 0 && op.hp > 0) {
			rodada = rodada + 1;
			System.out.println("Rodada " + rodada + "\n");
			this.atacar(op);

		}
	}

	public void atacar(Personagem op) {
		StringBuilder msg = new StringBuilder();
		int dado = new Random().nextInt(5) + 1;
		int dano = (this.ataque + dado) - op.defesa;

		if (this.ataque + dado > op.defesa) {
			if ((op.hp - dano) < 1) {
				op.hp = 0;
			} else {
				op.hp -= dano;
			}

			msg.append("Ataque de ").append(this.nome.toUpperCase()).append(" ").append(this.ataque).append(" + ")
					.append(dado).append("\n").append(op.nome).append(" dano ").append(dano).append("\n")
					.append(op.nome).append(" ").append(op.hp).append("|").append(op.maxhp).append(" HP\n");

		} else {
			msg.append("O ataque ").append(this.nome).append(" Falhou!!\n");
		}

		System.out.println(msg);

		try {
			if (op.hp > 0) {
				op.atacar(this);
			} else {
				throw new PersonagemDerrotadoException(op, this);
			}

		} catch (PersonagemDerrotadoException e) {

			e.getMessage();
			e.printStackTrace();
		}

	}
	
	public void setRestauraHp() {
		this.hp = maxhp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMaxhp() {
		return maxhp;
	}

	public void setMaxhp(int maxhp) {
		this.maxhp = maxhp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

}
