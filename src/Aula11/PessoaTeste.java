package Aula11;

public class PessoaTeste {

	public static void main(String[] args) {
		PessoaFisica  willian = new PessoaFisica("Willian", "Rua Bonsai", 545454544, "0312254666", "1154554544" );
		
		PessoaJuridica  jose = new PessoaJuridica("JOSE", "Rua Bonsai", 545454544, "0312254666", "1154554544" );
		System.out.println(willian.toString());
		
		System.out.println(jose.toString());
	}

}
