package aula3.tratamentoerros;

public class NotaMaiorQue10Exception extends IllegalArgumentException {

	public NotaMaiorQue10Exception() {
		super("A nota não pode ser maior que 10");
	}

	public NotaMaiorQue10Exception(String mensagem) {
		super(mensagem);
	}

}
