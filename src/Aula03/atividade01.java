package Aula03;

import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {

		float nota1, nota2, nota3;

		nota1 = adicionaNota();
		validaNota(nota1);

		nota2 = adicionaNota();
		validaNota(nota2);

		nota3 = adicionaNota();
		validaNota(nota3);

		// Chamando a função calculaMedia
		float media = calculaMedia(nota1, nota2, nota3);

		// Chamando a função status
		status(media);

	}

	// Funcao adiciona nota
	public static float adicionaNota() {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Digite uma nota: ");
			float nota = entrada.nextFloat();

			
			return nota;
		}

	}

	// Funcao valida nota
	public static void validaNota(float nota) {
		if (nota > 10) {
			System.out.println("Nota deve ser entre 0 e 10");
		} else if (nota < 0) {
			System.out.println("Nota não pode ser negativa");
		} else {
			System.out.println("PROXIMA NOTA");
		}
	}

	// Criação da função
	public static void status(float media) {

		if (media >= 7f) {
			System.out.println("APROVADO " + media);

		} else if (media >= 5f) {
			System.out.println("RECUPERAÇÃO " + media);
		} else {
			System.out.println("REPROVADO " + media);
		}

	}

	// Criação Função calculaMedia
	public static float calculaMedia(float val1, float val2, float val3) {
		return (val1 + val2 + val3) / 3f;
	}

}
