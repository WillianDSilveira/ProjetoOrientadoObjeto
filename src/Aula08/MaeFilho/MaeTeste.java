package Aula08.MaeFilho;

import java.util.ArrayList;

public class MaeTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Filho filho1 = new Filho("Joao");
		Filho filho2 = new Filho("Pedro");
		Mae mae = new Mae("Maria", filho1, filho2);
		Mae joana = new Mae();
		ArrayList<Mae> listaDeMaes = new ArrayList<Mae>();
		listaDeMaes.add(joana);
		System.out.print(mae.getNomeMae()+
				", ");
		System.out.print(mae.getFilho1().getNome()+
				", ");
		System.out.print(mae.getFilho2().getNome());
		
	}

}
