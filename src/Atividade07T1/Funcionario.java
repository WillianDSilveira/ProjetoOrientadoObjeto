package Atividade07T1;

public class Funcionario {
	private float salario;
	private String nome;
	
	
	// Construtores
	public Funcionario() {}
	public Funcionario(float salario, String nome) {
		this.salario = salario;
		this.nome = nome;
	}
	// Getters e Setters
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
