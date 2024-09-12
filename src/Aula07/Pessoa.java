package Aula07;

public class Pessoa {
	private String nome;
	private Endereco end;
	
	public Pessoa() {}

	public Pessoa(String nome, Endereco end) {
		this.nome = nome;
		this.end = end;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}
	
	
	
	
}
