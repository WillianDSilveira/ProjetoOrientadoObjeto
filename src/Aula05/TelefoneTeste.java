package Aula05;

public class TelefoneTeste {

	public static void main(String[] args) {
		Telefone t1 = new Telefone();
		Telefone t2 = new Telefone();
		t1.setNumero("51 9999961522");
		t1.setOperadora("Claro");
		t2.setNumero("51 9655656552");
		t2.setOperadora("Vivo");
		
		System.out.println(t1.getNumero() +" "+ t1.getOperadora() );
		System.out.println(t2.getNumero() +" "+ t2.getOperadora() );
		
	}

}
