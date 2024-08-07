package Aula02;

import java.util.Scanner;

public class teste03 {

	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);
		int numero1, numero2;
		
		System.out.print("Digite um numero: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite outro numero: ");
		numero2 = entrada.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("Dentre os numeros digitados o maior é o:  " + numero1 );
		}else {
			
			System.out.println("Dentre os numeros digitados o maior é o: " + numero2 );
		}		
		
		entrada.close();
	}


}
