package Aula11.Loja;

public class Produto {
	protected String nome;
	protected int preco;
	protected String marca;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Produto() {}
	
	public Produto(String nome, int preco, String marca) {
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", marca=" + marca + "]";
	}
	
	
}
