package Kata;

import java.util.Objects;

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

	// Método para causar dano a outro personagem
	public void atacar(Personagem alvo, int dano) {

		// Certifica de que o alvo não é o própio personagem
		if (this == alvo) {
			System.out.println("Voce não pode causar dano a si mesmo");
			return;
		}
		// Verifica se o personagem e o alvo estao vivos
		if (this.vivo && alvo.getSaude() >= 1) {
			alvo.receberDano(dano);
		}

	}

	// Método para receber dano
	private void receberDano(int dano) {
		if (vivo) {
			saude -= dano;
			// O personagem morre se a saúde chegar a zero
			if (saude <= 0) {
				saude = 0;
				vivo = false;
			}
		}
	}

	// Método para curar
	public void curar(Personagem alvo, int quantidade) {
		// Certifica que o usuario cura a si mesmo
		if (alvo != this) {
			System.out.println("Voce só pode curar a si mesmo");
			return;
		}
		// Verifica se o Personagem esta vivo
		if (this.vivo && alvo.getSaude() >= 1) {
			alvo.receberCura(quantidade);
		}
	}

	// Método para receber cura
	private void receberCura(int quantidade) {
		if (vivo) {
			saude += quantidade;
		}
	}

	// Gets e Sets
	public int getSaude() {
		return saude;
	}

	public void setSaude(int saude) {
		this.saude = saude;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nivel, saude, vivo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personagem other = (Personagem) obj;
		return nivel == other.nivel && saude == other.saude && vivo == other.vivo;
	}

	@Override
	public String toString() {
		return "Personagem [saude=" + saude + ", nivel=" + nivel + ", vivo=" + vivo + "]";
	}
	
	

	
	
}
