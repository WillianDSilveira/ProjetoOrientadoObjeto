package Aula11.Loja;

public class ProdutoTeste {

	public static void main(String[] args) {
		TV philco = new TV("Televisor", 22, "Philco", "22 polegadas", "Led" );		
		System.out.println(philco);
		
		Radio gradient = new Radio("Gradient", 30, "gradient", 300 );
		System.out.println(gradient);
		
		VideoGame ps5 = new VideoGame("Playstation", 5000, "Sony", 2);
		System.out.println(ps5);
	}

}
