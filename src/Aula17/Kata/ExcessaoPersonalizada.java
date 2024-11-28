package Aula17.Kata;

public class ExcessaoPersonalizada extends Exception{
	
	protected int linhaDoErro;


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
