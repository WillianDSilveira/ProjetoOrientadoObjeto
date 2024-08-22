package Aula04;

public class ComputadorTeste {

	public static void main(String[] args) {
		Computador meuComputador = new Computador();
		meuComputador.nome = "Computador do escritorio";
		meuComputador.clock = 1500;
		
		System.out.println(meuComputador.mostraNomeComputador());
		System.out.println(meuComputador.mostraClock());
	}

}