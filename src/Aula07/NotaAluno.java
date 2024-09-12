package Aula07;

public class NotaAluno {
	private String nomeAluno;
	private float nota1;
	private float nota2;
	
	public NotaAluno(String nomeAluno, float nota1, float nota2) {
		this.nomeAluno = nomeAluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public NotaAluno() {
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
	
	
	
	public String mostraNomeAluno() {
		return nomeAluno;
	}
	
	public String statusAluno() {
		float media = (nota1+nota2)/2;
		
		if(media >= 7) {
			return "Aprovado";
		}else{
			return "Reprovado";
		}
	}
	
	
}