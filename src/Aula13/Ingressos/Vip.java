package Aula13.Ingressos;

public class Vip extends Ingresso {
	public Vip(float valor, String descricao) {
		super(valor, descricao);
	}

	@Override
	public String toString() {
		return "Vip [valor=" + valor + ", descricao=" + descricao + "]";
	}
	
}
