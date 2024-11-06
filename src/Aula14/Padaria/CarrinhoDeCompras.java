package Aula14.Padaria;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	private ArrayList<Produto> listaProdutos;
	
	public CarrinhoDeCompras() {
		this.listaProdutos = new ArrayList<Produto>();
	}
	
	public void AdicionarProduto(Produto p) {
		listaProdutos.add(p);
	}
	
	public void MostraItens() {
		for(Produto i : listaProdutos) {
			System.out.println(i);
		}
	}
	public float CalcularTotalDeCompras() {
		//erro
		
		float total = 0;
		for(Produto p : listaProdutos) {
			total = total + p.getPrecoUnidade();
		}
		System.out.println("Total de compras: " + total);
		return total;
	}
	
}
