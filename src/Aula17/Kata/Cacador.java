package Aula17.Kata;

public class Cacador extends Personagem {
    public Cacador(int saude, int nivel, boolean vivo, int posicaoX, int posicaoY) {
        super(saude, nivel, vivo, 20, posicaoX, posicaoY); 
    }

    @Override
    public void atacar(Personagem alvo, int dano, int distancia) throws ExcessaoPersonalizada {
        super.atacar(alvo, dano, distancia);
    }
}
