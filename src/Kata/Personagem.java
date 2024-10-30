package Kata;

public class Personagem {
	private int saude;
	private int nivel;
	private boolean vivo;

	// Construtor: inicializa com 1000 de saúde, nível 1 e status vivo
	public Personagem() {
		this.saude = 1000;
		this.nivel = 1;
		this.vivo = true;
	}

	// Método para verificar se o personagem está vivo
	public boolean isVivo() {
		return vivo;
	}

	// Método para retornar a saúde atual do personagem
	public int saudeAtual() {
		return saude;
	}

	// Método para causar dano a outro personagem
	public void causarDano(Personagem alvo, int dano) {
		if (this.vivo && alvo.isVivo()) {
			alvo.receberDano(dano);
		}
	}

	// Método para receber dano (chamado pelo método causarDano)
	private void receberDano(int dano) {
		if (vivo) {
			saude -= dano;
			if (saude <= 0) {
				saude = 0;
				vivo = false; // O personagem morre se a saúde chegar a zero
			}
		}
	}

	// Método para curar outro personagem
	public void curar(Personagem alvo, int quantidade) {
		if (this.vivo && alvo.isVivo()) {
			alvo.receberCura(quantidade);
		}
	}

	// Método para receber cura (chamado pelo método curar)
	private void receberCura(int quantidade) {
		if (vivo) {
			saude += quantidade;
			if (saude > 1000) {
				saude = 1000; // Saúde não pode exceder 1000
			}
		}
	}
}
