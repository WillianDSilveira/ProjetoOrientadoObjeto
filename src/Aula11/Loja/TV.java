package Aula11.Loja;

public class TV extends Produto{
	protected String tamanho;
	protected String tipo;
	
	public TV() {}
	public TV(String nome, int preco, String marca, String tamanho, String tipo) {
		super(nome, preco, marca);
		this.tamanho = tamanho;
		this.tipo = tipo;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	@Override
	public String toString() {
		return "TV [tamanho=" + tamanho + ", tipo=" + tipo + ", nome=" + nome + ", preco=" + preco + ", marca=" + marca
				+ "]";
	}
	
	
	
	
}
