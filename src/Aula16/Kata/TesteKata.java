package Aula16.Kata;

public class TesteKata {

	public static void main(String[] args) {
		
		
		try {
			Personagem mario = new Personagem("MARIO", 1000, 5, true);
			Personagem luigi = new Personagem("Luigi", 1000, 1, true);
			Personagem bowser = new Personagem("Bowser", 1000, 10, true);
			
			System.out.println("Luigi " + luigi.toString());
			System.out.println("Bowser " + bowser.toString());
			System.out.println("Mario " + mario.toString());
			System.out.print("\n");
			
			mario.atacar(bowser, 200);
			mario.atacar(luigi, 300);
			
			luigi.atacar(bowser, 200);
			luigi.atacar(mario, 400);
			
			bowser.atacar(mario, 500);
			bowser.atacar(luigi, 400);		
			
			System.out.println("Luigi " + luigi.toString());
			System.out.println("Bowser " + bowser.toString());
			System.out.println("Mario " + mario.toString());
			System.out.print("\n");
			
			mario.atacar(mario, 100);
			
			bowser.curar(bowser, 100);
			luigi.curar(luigi, 100);
			mario.curar(mario, 100);
			
			mario.curar(luigi, 100);
			System.out.println("Luigi " + luigi.toString());
			System.out.println("Bowser " + bowser.toString());
			System.out.println("Mario " + mario.toString());
			System.out.print("\n");
		} catch(ExcessaoPersonalizada e) {
			
			System.out.println("Problema encontrado linha: " + e.getLinhaDoErro());
		} catch(Exception e) {
			System.out.println("Problema encontrado!");
			e.printStackTrace();			
			
	}

}
