package Aula06;

public class ProdutoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p1 = new Produto("Bala", 0.20f);
		Produto p2 = new Produto("Chocolate", 5.00f, "Achocolatado em pó");
		
		System.out.println(p1.getNome() + " " + p1.getPreco() + p1.getDescricao());
		
		System.out.println(p2.getNome() + " " + p2.getPreco() + " " + p2.getDescricao());
	}

}
