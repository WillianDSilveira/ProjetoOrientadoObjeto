package Aula08.Carro;

public class Carro {
	private String nome;
	private int ano;
	private String cor;
	private Motor m1;
	private Cambio c1;
	
	//Construtores
	public Carro() {}
	
	
	public Carro(String nome, int ano, String cor, Motor m1, Cambio c1) {
		this.nome = nome;
		this.ano = ano;
		this.cor = cor;
		this.m1 = m1;
		this.setC1(c1);
	}
	//Getters e Setters
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Motor getM1() {
		return m1;
	}
	public void setM1(Motor m1) {
		this.m1 = m1;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cambio getC1() {
		return c1;
	}


	public void setC1(Cambio c1) {
		this.c1 = c1;
	}
	
	
	
}
