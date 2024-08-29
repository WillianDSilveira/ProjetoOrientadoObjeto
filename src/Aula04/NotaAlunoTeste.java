package Aula04;

public class NotaAlunoTeste {

	public static void main(String[] args) {
		NotaAluno aluno = new NotaAluno();
		aluno.nome = "Junior";
		aluno.nota1 = 7 ;
		aluno.nota2 = 6;
		System.out.println("Nome do Aluno: " + aluno.mostraNomeAluno());
		System.out.println("Status do Aluno: "+ aluno.statusAluno());
	}

}
