package Atividade07T1;

public class FolhaDePagamentoTeste {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario(2000f, "Joao");
		Funcionario func2 = new Funcionario(3000f, "Willian");
		
		FolhaPagamento folha = new FolhaPagamento(func1, func2);
		
		folha.calcularFolhaPagamento(func1.getSalario(), func2.getSalario());
	}

}
