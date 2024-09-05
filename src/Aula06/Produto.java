package Aula06;

public class Produto {
	private String nome;
	private float preco;
	private String descricao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	// Construtores
	public Produto(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(String nome, float preco, String descricao) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}
	
	// Metodos
	public String mostraNomeProduto() {
		return getNome();
	}
	
	public float mostraPreco() {
		return getPreco();
	}
	
	public String mostraDescricaoProduto() {
		return getDescricao();
	}
	
}
