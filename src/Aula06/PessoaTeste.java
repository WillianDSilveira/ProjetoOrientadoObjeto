package Aula06;

import java.util.Scanner;

public class PessoaTeste {

	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		
		System.out.printf("Digite seu nome: ");
		p1.setNome(entrada.next());
		
		System.out.println("Digite sua idade: ");
		p1.setIdade(entrada.nextInt());
		
		System.out.println("Digite seu Endereço: ");
		entrada.nextLine(); // Consome o \n do buffer de entrada do next() anterior
		p1.setEndereco(entrada.nextLine());
		
		System.out.println(p1.getNome() + " possui " + p1.getIdade() +
		" anos e mora no endereço ' "  + p1.getEndereco() + " ' ");
		
		entrada.close();
	}

}
