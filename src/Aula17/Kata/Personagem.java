package Aula17.Kata;

public class Personagem {
    private int saude;
    private int nivel;
    private boolean vivo;
    private int alcance; 
    private int posicaoX; 
    private int posicaoY; 

    // Construtor
    public Personagem(int saude, int nivel, boolean vivo, int alcance, int posicaoX, int posicaoY) {
        this.saude = saude;
        this.nivel = nivel;
        this.vivo = vivo;
        this.alcance = alcance;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }

    // Método para calcular a distância entre dois personagens
    public int calcularDistancia(Personagem outro) {
        return (int) Math.sqrt(Math.pow(this.posicaoX - outro.posicaoX, 2) + Math.pow(this.posicaoY - outro.posicaoY, 2));
    }
    
    

    // Método para atacar
    public void atacar(Personagem alvo, int dano, int distancia) throws ExcessaoPersonalizada {
    	// Validação 
        if (dano <= 0) {
            throw new ExcessaoPersonalizada("Erro: Dano não pode ser negativo", 12);
        }

        if (this == alvo) {
            System.out.println("Você não pode causar dano a si mesmo.");
            return;
        }
        
        // Valida se o alvo e esta ao alcanse
        if (calcularDistancia(alvo) > this.alcance) {
            System.out.println("O alvo está fora do alcance!");
            return;
        }
        

        if (this.vivo && alvo.getSaude() > 0) {
        	if(alvo.getNivel() - nivel <= 5) {
        		dano = dano / 2;        		
        	}else if(nivel - alvo.getNivel() >= 5){
        		dano = (int) (dano * 1.5);        		
        	}
        	
        	alvo.receberDano(dano);
            
        }
    }

    // Método para receber dano
    private void receberDano(int dano) {
        if (vivo) {
            saude -= dano;
            if (saude <= 0) {
                saude = 0;
                vivo = false;
                System.out.println("Personagem morreu.");
            }
        }
    }

    // Getters
    public int getSaude() {
        return saude;
    }

    public boolean isVivo() {
        return vivo;
    }

    public int getAlcance() {
        return alcance;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    @Override
    public String toString() {
        return "[saude=" + saude + ", nivel=" + nivel + ", vivo=" + vivo + ", alcance=" + alcance + "]";
    }
}
