package Aula16.Kata;

import java.util.Objects;

public class Personagem {
	private String nome;
	private int saude;
	private int nivel;
	private boolean vivo;

	// Método para causar dano a outro personagem
	public void atacar(Personagem alvo, int dano) {
		
		if (dano < 0) {
			throw new ExceptionInInitializerError("Error Dano nao pode ser negativo");
		}
		
		// Certifica de que o alvo não é o própio personagem
		if (this == alvo) {
			System.out.println("Voce não pode causar dano a si mesmo");
			return;
		}
		// Verifica se o personagem e o alvo estao vivos
		if (this.vivo && alvo.getSaude() >= 1) {
			alvo.receberDano(alvo, dano);
			return;
		}

	}

	// Método para receber dano
	private void receberDano(Personagem alvo, int dano) {		
		if (vivo) {
			
			int novoDano = dano;
			if((alvo.getNivel() - nivel) >= 5 ) {
				novoDano = novoDano / 2;
				System.out.println("DANO REDUZIDO EM " + dano + " NO " + alvo.getNome()  );
			}
			
			if(( nivel - alvo.getNivel()) >= 5 ) {
				novoDano = (int) (novoDano * 1.5);
				System.out.println("DANO AUMENTADO EM " + dano + " NO " + alvo.getNome()  );
			}
			
			saude -= dano;
			// O personagem morre se a saúde chegar a zero
			if (saude <= 0) {
				saude = 0;
				vivo = false;
				System.out.println("Personagem Morreu");
			}
		}
	}

	// Método para curar
	public void curar(Personagem alvo, int quantidade) {
		
		if (quantidade < 0) {
			throw new ExceptionInInitializerError("Error Cura nao pode ser negativo");
		}
		
		// Certifica que o usuario cura a si mesmo
		if (alvo != this) {
			System.out.println("Voce só pode curar a si mesmo");
			return;
		}
		// Verifica se o Personagem esta vivo
		if (this.vivo && alvo.getSaude() >= 1) {
			alvo.receberCura(quantidade);
			return;
		}
		// Certica que o personagem esta com vida maxima
		if (alvo.getSaude() >= 1000) {
			System.out.println("Vida maxima atingida");
			return;
		}
	}

	// Método para receber cura
	private void receberCura(int quantidade) {
		if (vivo) {
			saude += quantidade;
		}
	}

	
	
	
	
	
	// Construtor: inicializa com 1000 de saúde, nível 1 e status vivo
	public Personagem() {}
	
	public Personagem(String nome) {
		this.nome = nome;
	}
	
	public Personagem(String nome, int saude, int nivel, boolean vivo) {
		this.nome = nome;
		this.saude = saude;
		this.nivel = nivel;
		this.vivo = vivo;
	}	
	
	// Gets e Sets	
	
	public int getSaude() {
		return saude;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isVivo() {
		return vivo;
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
		return this.nome + " [saude=" + saude + ", nivel=" + nivel + ", vivo=" + vivo + "]";
	}

}
