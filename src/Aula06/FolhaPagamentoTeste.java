package Aula06;

public class FolhaPagamentoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FolhaDePagamento folha1 = new FolhaDePagamento();
		folha1.setNome1("Joao");
		folha1.setSalario1(1300);
		folha1.setNome2("Pedro");
		folha1.setSalario2(1600);
		
		System.out.println("Trabalhador: "+ folha1.getNome1() + "Salario: " + folha1.getSalario1());
		System.out.println("Trabalhador: "+ folha1.getNome2() + "Salario: " + folha1.getSalario2());
		System.out.println("TOTAL DAS DUAS FOLHAS: "+ folha1.totalFolhaPagamento());
	}

}
