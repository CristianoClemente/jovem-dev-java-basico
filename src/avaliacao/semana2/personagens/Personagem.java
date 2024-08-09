package avaliacao.semana2.personagens;

import java.util.Random;

import javax.swing.JOptionPane;

public abstract class Personagem {

	protected String nome;
	protected int maxhp;
	protected int hp;
	protected int ataque;
	protected int defesa;

	public Personagem(String nome, int maxhp, int hp, int ataque, int defesa) {
		super();
		this.nome = nome;
		this.maxhp = maxhp;
		this.hp = hp;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public Personagem batalhar(Personagem inimigo) {
		while (inimigo.hp <= 0) {
			this.atacar(inimigo);
		}

		return inimigo;

	}

	public Personagem atacar(Personagem inimigo) {
		StringBuilder msg = new StringBuilder();
		Random random = new Random();
		int dado = random.nextInt(6);
		int dano = (this.ataque + dado) - inimigo.defesa;

		if (this.ataque + dado > inimigo.defesa) {
			inimigo.hp = inimigo.hp - dano;
			msg.append(this.nome.toUpperCase()).append(" ATAQUE\n ").append(" ATQ: ").append(this.ataque).append("  + ")
					.append(dado).append(" = ").append(this.ataque + dado).append("\n").append(inimigo.nome)
					.append(" DEF: ").append(inimigo.defesa).append("\n").append(inimigo.nome).append(" Dano de ")
					.append(dano).append("\n");

			inimigo.hp = inimigo.hp - dano;

			msg.append("\n ").append(inimigo.nome).append(" HP: ").append(inimigo.hp);

			JOptionPane.showMessageDialog(null, msg);

		} else {
			msg.append("ATAQUE FALHOU");
			JOptionPane.showMessageDialog(null, msg);

			return inimigo;
		}

		return inimigo;
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
