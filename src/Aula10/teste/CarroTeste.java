package Aula10.teste;

public class CarroTeste {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.montaCarro("Civic", "Honda", 1000);
		Carro c2 = new Carro();
		c2.montaCarro("Ranger", "Ford");
		Carro c3 = new Carro();
		c3.montaCarro("Onix", 1000);
		
		
		c3.montaCarro("Civic", 1000);
		
		c1.montaCarro("Ranger", "Ford");

		c2.montaCarro("Onix", 1000);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
	}

}
