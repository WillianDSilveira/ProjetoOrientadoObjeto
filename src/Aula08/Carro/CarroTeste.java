package Aula08.Carro;

public class CarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor m1 = new Motor(150, 10f, 16);
		Cambio c1 = new Cambio("Automatico", 6);
		Carro Car = new Carro("Corsa", 1994, "Azul", m1, c1);
		
		System.out.println(
				" Carro: " + Car.getNome() +
				"\n Ano: " + Car.getAno() + 
				"\n Cor: " + Car.getCor() +
				"\n Cavalos do Motor: " + Car.getM1().getCavalos() +
				"\n Consumo do Carro: " + Car.getM1().getConsumo() + 
				"\n Valvulas do Motor: " + Car.getM1().getValvulas() +
				"\n Tipo de Cabio: " + Car.getC1().getTipo() +
				"\n Quantidade de Marchas: " + Car.getC1().getMarchas());
	}

}
