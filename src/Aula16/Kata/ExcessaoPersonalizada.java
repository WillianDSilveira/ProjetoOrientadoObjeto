package Aula16.Kata;

public class ExcessaoPersonalizada extends Exception{
	
	private static final long serialVersionUID = 1L;
	protected int linhaDoErro;

	public ExcessaoPersonalizada(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace, int linhaDoErro) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.linhaDoErro = linhaDoErro;
	}
	
	public ExcessaoPersonalizada(String message, int linhaDoErro) {
		super(message);
		this.linhaDoErro = linhaDoErro;
	}


	public int getLinhaDoErro() {
		return linhaDoErro;
	}

	public void setLinhaDoErro(int linhaDoErro) {
		this.linhaDoErro = linhaDoErro;
	}
}
