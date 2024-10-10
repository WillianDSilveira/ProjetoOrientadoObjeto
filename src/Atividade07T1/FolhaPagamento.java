package Atividade07T1;

public class FolhaPagamento {
	private Funcionario funcionario1;
	private Funcionario funcionario2;
	//Construtores
	public FolhaPagamento(Funcionario funcionario1, Funcionario funcionario2) {
		this.funcionario1 = funcionario1;
		this.funcionario2 = funcionario2;
	}
	
	//Getters e Setters
	public Funcionario getFuncionario1() {
		return funcionario1;
	}	
	public void setFuncionario1(Funcionario funcionario1) {
		this.funcionario1 = funcionario1;
	}
	public Funcionario getFuncionario2() {
		return funcionario2;
	}
	public void setFuncionario2(Funcionario funcionario2) {
		this.funcionario2 = funcionario2;
	}
	// Função
	public void calcularFolhaPagamento(float salario1, float salario2) {
		float soma = salario1 + salario2;
		System.out.println("Soma dos Salarios: " + soma);
	}

}
