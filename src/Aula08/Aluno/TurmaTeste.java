package Aula08.Aluno;

import java.util.ArrayList;

public class TurmaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> listaDeInteiros = new ArrayList<Integer>();
		listaDeInteiros.add(5);
		listaDeInteiros.add(22);
		listaDeInteiros.add(8);
		
		for (Integer i : listaDeInteiros) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		
		ArrayList<Float> listaDeFloat = new ArrayList<Float>();
		listaDeFloat.add(5.5f);
		listaDeFloat.add(3.6f);
		listaDeFloat.add(7.6f);
		
		for (Float i : listaDeFloat) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		
		Aluno A1 = new Aluno("Willian", 9.9f);
		Aluno A2 = new Aluno("Maria", 9.9f);
		Turma T1 = new Turma("S056-POO", A1, A2);
		
		System.out.println("\n Turma: " + T1.getNomeTurma() + " Alunos: " + 
				T1.getAluno1().getNome() + ", " +
				T1.getAluno2().getNome());
		
	}

}
