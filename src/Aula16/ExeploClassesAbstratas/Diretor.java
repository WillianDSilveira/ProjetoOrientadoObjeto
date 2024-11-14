package Aula16.ExeploClassesAbstratas;

public abstract class Diretor extends Funcionario{
	
	public Diretor(String nome, float salario) {
		super(nome, salario);
		
	}
	
	@Override
	public abstract void calcularSalario();
}
