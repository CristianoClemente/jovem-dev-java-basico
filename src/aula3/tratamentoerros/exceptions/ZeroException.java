package aula3.tratamentoerros.exceptions;

public class ZeroException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZeroException() {
		super("O segundo número não pode ser zero");
	}

	public ZeroException(String mensagem) {
		super(mensagem);
	}

}
