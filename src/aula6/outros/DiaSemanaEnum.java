package aula6.outros;

public enum DiaSemanaEnum {

	DOMINGO("Domingo", true) {
		@Override
		public boolean isFimDeSemana() {
			return this.isFimDeSemana;
		}
	},
	SEGUNDA_FEIRA("Seguna-Feira", false) {
		@Override
		public boolean isFimDeSemana() {
			return this.isFimDeSemana;
		}
	},
	TERCA_FEIRA("Terça-Feira", false) {
		@Override
		public boolean isFimDeSemana() {
			return this.isFimDeSemana;
		}
	},
	QUARTA_FEIRA("Quarta-Feira", false) {
		@Override
		public boolean isFimDeSemana() {
			return this.isFimDeSemana;
		}
	},
	QUINTA_FEIRA("Quinta-Feira", false) {
		@Override
		public boolean isFimDeSemana() {
			return this.isFimDeSemana;
		}
	},
	SEXTA_FEIRA("Sexta-Feira", false) {
		@Override
		public boolean isFimDeSemana() {
			return this.isFimDeSemana;
		}
	},
	SABADO("Sábado", true) {
		@Override
		public boolean isFimDeSemana() {
			return this.isFimDeSemana;
		}
	};

	private final String nome;
	protected final boolean isFimDeSemana;

	public abstract boolean isFimDeSemana();

	DiaSemanaEnum(String nome, boolean isFimDeSemana) {
		this.nome = nome;
		this.isFimDeSemana = isFimDeSemana;
	}

	public String getNome() {
		return nome;
	}

}
