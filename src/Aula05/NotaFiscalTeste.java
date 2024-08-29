package Aula05;

public class NotaFiscalTeste {

	public static void main(String[] args) {
		NotaFiscal nota = new NotaFiscal();
		nota.nomeItem1 = "Coca-Cola ";
		nota.precoItem1 = 10.5f;
		nota.nomeItem2 = "Farinha ";
		nota.precoItem2 = 5.5f;
		System.out.printf(nota.mostraNomeItem1() +"\n"+ nota.mostraNomeItem2() +"\n"+ nota.calculaNotaFiscal() +"\n");
		
		NotaFiscal nota2 = new NotaFiscal();
		nota2.nomeItem1 = "Agua ";
		nota2.precoItem1 = 20.5f;
		nota2.nomeItem2 = "Cafe ";
		nota2.precoItem2 = 20.5f;
		System.out.printf(nota2.mostraNomeItem1() +"\n"+ nota2.mostraNomeItem2() +"\n"+ nota2.calculaNotaFiscal() +"\n");
		
		NotaFiscal nota3 = new NotaFiscal();
		nota3.nomeItem1 = "Computador ";
		nota3.precoItem1 = 3000.5f;
		nota3.nomeItem2 = "Notebook ";
		nota3.precoItem2 = 4000.5f;
		System.out.printf(nota3.mostraNomeItem1() +"\n"+ nota3.mostraNomeItem2() +"\n"+ nota3.calculaNotaFiscal() );
	}

}
