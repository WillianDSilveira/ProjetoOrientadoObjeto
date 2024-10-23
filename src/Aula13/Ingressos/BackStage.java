package Aula13.Ingressos;

public class BackStage extends Ingresso {
	public BackStage(float valor, String descricao) {
		super(valor, descricao);
	}

	@Override
	public String toString() {
		return "BackStage [valor=" + valor + ", descricao=" + descricao + "]";
	}
	
	
}
