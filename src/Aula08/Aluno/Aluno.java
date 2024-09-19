package Aula08.Aluno;

public class Aluno {
	private String nome;
	private float nota; 
	
	
	// Contructors
	public Aluno() {}
	
	public Aluno(String nome, float nota) {
	
		this.nome = nome;
		this.nota = nota;
	}
	
	
	// Getters Settes
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	

}	
