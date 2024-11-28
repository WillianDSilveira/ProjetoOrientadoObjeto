package Aula17.Kata;

public class TesteKata {
    public static void main(String[] args) {
        try {
            // Criando personagens com posições no mapa
            Lutador mario = new Lutador(1000, 5, true, 0, 0);
            Cacador luigi = new Cacador(1000, 1, true, 10, 10);
            Lutador bowser = new Lutador(1000, 10, true, 1, 1);

            // Calculando distâncias e atacando
            int distanciaMarioLuigi = mario.calcularDistancia(luigi);
            int distanciaMarioBowser = mario.calcularDistancia(bowser);

            System.out.println("Mario ataca Luigi (Distância: " + distanciaMarioLuigi + ")");
            mario.atacar(luigi, 200, distanciaMarioLuigi);

            System.out.println("Mario ataca Bowser (Distância: " + distanciaMarioBowser + ")");
            mario.atacar(bowser, 300, distanciaMarioBowser);

            System.out.println("Estado de Mario: " + mario.toString());
            System.out.println("Estado de Luigi: " + luigi.toString());
            System.out.println("Estado de Bowser: " + bowser.toString());

        } catch (ExcessaoPersonalizada e) {
        	System.out.println(e.getMessage() + e.getLinhaDoErro());
        } 
        catch (Exception e) {
            System.out.println("Problema encontrado!");
            e.printStackTrace();
        }
    }
}
