package Kata;

public class TesteKata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personagem mario = new Personagem();
		Personagem luigi = new Personagem();
		Personagem bowser = new Personagem();
		
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
	}

}
