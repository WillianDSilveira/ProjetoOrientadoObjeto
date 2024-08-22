package Aula04;

public class CalculadoraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora c1 = new Calculadora();
		System.out.println("Resultado da soma: "+ c1.somar(4, 5));
		System.out.println("Resultado da subtrair: "+ c1.subtrair(4, 5));
		
		// Posso acessar uma funcao estatica sem criar um objeto.
		System.out.println("Somar estatico: " + Calculadora.somar_estatico(3, 3));
		
		//c1.somar(2, 2);
		System.out.println(c1.ultimoresultado());
		int valor = c1.somar(c1.ultimoresultado(), c1.ultimoresultado());
		System.out.println("valor soma dos resultados:"+ valor);
	}

}
