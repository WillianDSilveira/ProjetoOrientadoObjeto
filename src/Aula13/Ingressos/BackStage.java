package Aula13.Ingressos;

public class BackStage extends Ingresso {
	
	
	
	public BackStage(float valor, String descricao) {
		super(valor, descricao);
		// TODO Auto-generated constructor stub
	}

	public BackStage() {
		super(100f, "Ingresso BackStage");
	}

	@Override
	public String toString() {
		return "BackStage [valor=" + valor + ", descricao=" + descricao + "]";
	}
	
	
}
