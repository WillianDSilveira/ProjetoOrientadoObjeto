package Aula08.Aluno;

public class Turma {
	private String nomeTurma;
	private Aluno aluno1;
	private Aluno aluno2;
	
	// Contructors
	public Turma(String nomeTurma, Aluno aluno1, Aluno aluno2) {
		this.nomeTurma = nomeTurma;
		this.aluno1 = aluno1;
		this.aluno2 = aluno2;
	}
	public Turma() {
		super();
	}
	// Getters Setters
	public String getNomeTurma() {
		return nomeTurma;
	}
	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}
	public Aluno getAluno1() {
		return aluno1;
	}
	public void setAluno1(Aluno aluno1) {
		this.aluno1 = aluno1;
	}
	public Aluno getAluno2() {
		return aluno2;
	}
	public void setAluno2(Aluno aluno2) {
		this.aluno2 = aluno2;
	}
	
	
}
