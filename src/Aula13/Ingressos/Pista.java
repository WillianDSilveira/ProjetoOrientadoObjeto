package Aula13.Ingressos;

public class Pista extends Ingresso{
	public Pista(float valor, String descricao) {
		super(valor, descricao);
	}

	@Override
	public String toString() {
		return "Pista [valor=" + valor + ", descricao=" + descricao + "]";
	}
	
}
