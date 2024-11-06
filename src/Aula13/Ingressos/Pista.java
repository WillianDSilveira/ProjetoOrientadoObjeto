package Aula13.Ingressos;

public class Pista extends Ingresso{
	
	
	public Pista(float valor, String descricao) {
		super(valor, descricao);
		// TODO Auto-generated constructor stub
	}

	public Pista() {
		super(40f, "Ingresso Pista");
	}

	@Override
	public String toString() {
		return "Pista [valor=" + valor + ", descricao=" + descricao + "]";
	}
	
}
