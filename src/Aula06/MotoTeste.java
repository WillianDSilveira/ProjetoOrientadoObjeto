package Aula06;

public class MotoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moto honda = new Moto();
		honda.setNome("CB");
		honda.setMarca("Honda");
		honda.setPotencia(300);
		honda.setPeso(250);
		
		System.out.println("Nome: " + honda.getNome());
		System.out.println("Marca: " + honda.getMarca());
		System.out.println("Potencia: " + honda.getPotencia());
		System.out.println("Peso: " + honda.getPeso());
		
	}

}
