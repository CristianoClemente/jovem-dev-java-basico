package aula5.stream;

public class ZeroBertoException extends IllegalArgumentException {

	private static final long serialVersionUID = 1L;

	public ZeroBertoException() {
		super("Não encontramos nenhum registro com esse termo!");
	}

	public ZeroBertoException(String msg) {
		super(msg);
	}

}
