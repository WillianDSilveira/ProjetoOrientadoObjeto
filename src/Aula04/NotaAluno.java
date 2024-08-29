package Aula04;

public class NotaAluno {
	String nome;
	float nota1;
	float nota2;
	
	float media() {
		float media = (nota1+nota2)/2;
		return media;
	}
	
	String statusAluno() {
		
		if(media() >= 7) {
			return "Aprovado";
		}else{
			return "Reprovado";
		}
	}
	
	String mostraNomeAluno() {
		return nome;
		
	}
	
}
