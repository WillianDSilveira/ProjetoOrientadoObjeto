package Aula08.Carro;

public class Cambio {
	private String tipo;
	private int marchas;
	
	//Contructors
	public Cambio() {}
	
	public Cambio(String tipo, int marchas) {
		super();
		this.tipo = tipo;
		this.marchas = marchas;
	}
	
	// Getters e Setters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getMarchas() {
		return marchas;
	}
	public void setMarchas(int marchas) {
		this.marchas = marchas;
	}
	
	
}
