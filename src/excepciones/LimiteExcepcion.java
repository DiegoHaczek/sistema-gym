package excepciones;

public class LimiteExcepcion extends Exception {


	private String msj;

	public LimiteExcepcion(String msj) {
		super(msj);
		this.msj = msj;
	}

	public String informa() {
		return msj;
	}
}
