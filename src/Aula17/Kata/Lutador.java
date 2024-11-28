package Aula17.Kata;

public class Lutador extends Personagem {
    public Lutador(int saude, int nivel, boolean vivo, int posicaoX, int posicaoY) {
        super(saude, nivel, vivo, 2, posicaoX, posicaoY); // Lutadores têm alcance fixo de 2 metros
    }

    @Override
    public void atacar(Personagem alvo, int dano, int distancia) throws ExcessaoPersonalizada {
        super.atacar(alvo, dano, distancia);
    }
}