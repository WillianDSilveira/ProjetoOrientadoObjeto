package Aula02;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);
		float nota1, nota2, nota3;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = entrada.nextFloat();
		System.out.print("Digite a segunda nota: ");
		nota2 = entrada.nextFloat();
		System.out.print("Digite a terceira nota: ");
		nota3 = entrada.nextFloat();
		
		float media;
		
		media = (nota1 + nota2 + nota3)/ 3;
		
		if(media >= 7f) {
			System.out.println("APROVADO " + media);
			
		}else if(media >= 5f) {
			System.out.println("RECUPERAÇÃO " + media);
		}else {
			System.out.println("REPROVADO " + media);
		}
		
		entrada.close();

	}

}
