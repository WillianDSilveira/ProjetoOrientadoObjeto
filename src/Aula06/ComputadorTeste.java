package Aula06;

public class ComputadorTeste {

	public static void main(String[] args) {
		Computador c1 = new Computador("HP", 1200);
		
		System.out.println("Computador: " + c1.getNome() + " Clock: " + c1.getClock() );
		
		c1.setNome("DELL");
		c1.setClock(1500);
		
		System.out.println("Computador: " + c1.getNome() + " Clock: " + c1.getClock() );
		
	}

}
