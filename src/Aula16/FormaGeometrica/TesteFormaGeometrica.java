package Aula16.FormaGeometrica;

public class TesteFormaGeometrica {

	public static void main(String[] args) {
		Triangulo f1 = new Triangulo("Teste Triangulo", 10f, 15f);
		Quadrado f2 = new Quadrado("Quad teste", 10f);
		Retangulo f3 = new Retangulo("Retang. teste", 10f, 15f);
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
	}

}