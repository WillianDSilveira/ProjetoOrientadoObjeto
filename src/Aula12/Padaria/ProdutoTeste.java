package Aula12.Padaria;

public class ProdutoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pao paoFrances = new Pao("Pão Francês", 5.50f, "Padaria Central", "Francês", 10f);
        Leite leiteIntegral = new Leite("Leite Integral", 4.00f, "LeiteBom", "Integral", "A", 5f);
        Queijo queijoMussarela = new Queijo("Queijo Mussarela", 25.00f, "QueijosFinos", "Mussarela", 8f);
        
        System.out.println("Informações dos produtos:");
        paoFrances.descricao();
        leiteIntegral.descricao();
        queijoMussarela.descricao();
        
        System.out.println("\nO pão contém glúten? " + paoFrances.contemGluten());
        System.out.println("O leite contém lactose? " + leiteIntegral.contemLactose());
        System.out.println("O queijo contém lactose? " + queijoMussarela.contemLactose());
        
        paoFrances.setPercentualGluten(0);
        leiteIntegral.setPercentualLactose(0);
        
        System.out.println("\nApós alterações:");
        System.out.println("O pão contém glúten? " + paoFrances.contemGluten());
        System.out.println("O leite contém lactose? " + leiteIntegral.contemLactose());

	}

}
