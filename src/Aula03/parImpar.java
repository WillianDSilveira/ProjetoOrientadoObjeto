package Aula03;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada  = new Scanner(System.in);
		for(int i=0; i<=100; i++) {
			parouImpar(i);
		}
		
		
		entrada.close();
	}
	
	public static void parouImpar(int num) {
		if(num%2 == 0) {
			System.out.println(num + " -- PAR");
		}else { 
			System.out.println(num + " -- IMPAR ");
		}
	}

}
