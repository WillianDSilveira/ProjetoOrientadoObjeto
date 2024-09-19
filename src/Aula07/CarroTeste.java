package Aula07;

public class CarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor m1 = new Motor(150, 10f, 16);
		
		Carro c1 = new Carro("Corsa", 1994, "Azul", m1);
		
		System.out.println(
				" Carro: " + c1.getNome() +
				"\n Ano: " + c1.getAno() + 
				"\n Cor: " + c1.getCor() +
				"\n Cavalos do Motor: " + c1.getM1().getCavalos() +
				"\n Consumo do Carro: " + c1.getM1().getConsumo() + 
				"\n Valvulas do Motor: " + c1.getM1());
	}

}
