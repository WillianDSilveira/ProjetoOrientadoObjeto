package Aula07;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Endereco e1 = new Endereco();
		e1.setNumero(100);
		e1.setRua("Rua dos Perdidos");
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Joao");
		p1.setEnd(e1);
		
 		System.out.println("Nome: " + p1.getNome());
 		System.out.println("Endereço: " + p1.getEnd().getRua() + ", "+ p1.getEnd().getNumero());
 		
 		Pessoa p2 = new Pessoa();
		p2.setNome("Carlos");
		p2.setEnd(e1);
		
 		System.out.println("Nome: " + p2.getNome());
 		System.out.println("Endereço: " + p2.getEnd().getRua() + ", "+ p2.getEnd().getNumero());
		
		
	}

}
