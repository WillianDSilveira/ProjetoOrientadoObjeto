package Aula11.Loja;

public class Radio extends Produto{
	protected int potencia;

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public Radio(String nome, int preco, String marca, int potencia) {
		super(nome, preco, marca);
		this.potencia = potencia;
	}
	
	@Override
	public String toString() {
		return "Radio [potencia=" + potencia + ", nome=" + nome + ", preco=" + preco + ", marca=" + marca + "]";
	}
	
	
	
}
