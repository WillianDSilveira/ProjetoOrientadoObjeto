package Aula13.Ingressos;

public class Vip extends Ingresso {
	
	
	public Vip(float valor, String descricao) {
		super(valor, descricao);
		// TODO Auto-generated constructor stub
	}

	public Vip() {
		super(60f, "Ingresso Vip");
	}

	@Override
	public String toString() {
		return "Vip [valor=" + valor + ", descricao=" + descricao + "]";
	}
	
}
