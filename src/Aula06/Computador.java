package Aula06;

public class Computador {
	private String nome;
	private int clock;
	
	// Constructor
	public Computador(String nome, int clock) {
		super();
		this.nome = nome;
		this.clock = clock;
	}
	
	// Getter e Setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getClock() {
		return clock;
	}

	public void setClock(int clock) {
		this.clock = clock;
	}

	// Metodos
	public String mostraNomeComputador() {
		return nome;
	}
	
	public int mostraClock() {
		return clock;
	}
}
