package Aula07;

public class NotaAlunoTeste {

	public static void main(String[] args) {
	
		NotaAluno Joao = new NotaAluno();
		Joao.setNomeAluno("Joao");
		Joao.setNota1(5f);
		Joao.setNota2(9f);
		System.out.println("Nome do Aluno: " + Joao.mostraNomeAluno() + " Status do Aluno: " + Joao.statusAluno());
		
		NotaAluno Maria = new NotaAluno("Maria", 7f, 5f);		
		System.out.println("Nome do Aluno: " + Maria.mostraNomeAluno() + " Status do Aluno: " + Maria.statusAluno());
		
		
	}

}
