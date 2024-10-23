package Aula13.Ingressos;

public class Ingresso {
	protected float valor;
	protected String descricao;
	
	// Construtor	
	public Ingresso(float valor, String descricao) {
		super();
		this.valor = valor;
		this.descricao = descricao;
	}
	//Getters e Setters
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Ingresso [valor=" + valor + ", descricao=" + descricao + "]";
	}	
	
}
