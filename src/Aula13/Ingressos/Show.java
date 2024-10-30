package Aula13.Ingressos;

import java.util.Arrays;

public class Show {
	private Ingresso[] ingressos;
	private int count;
	
	public Show() {
	        ingressos = new Ingresso[4];
	        count = 0;
	  }

	public void adicionarIngresso(Ingresso ingresso) {
	        if (count < 4) {
	            ingressos[count] = ingresso;
	            count++;
	        } else {
	            System.out.println("Limite de ingressos alcançado.");
	        }
	 }

	public void mostraIngressos() {
	        for (int i = 0; i < count; i++) {
	            System.out.println(ingressos[i].getDescricao() + " - R$ " + ingressos[i].getValor());
	        }
	  }

	public Ingresso[] getIngressos() {
		return ingressos;
	}

	public void setIngressos(Ingresso[] ingressos) {
		this.ingressos = ingressos;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Show(Ingresso[] ingressos, int count) {
		super();
		this.ingressos = ingressos;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Show [ingressos=" + Arrays.toString(ingressos) + ", count=" + count + "]";
	}	
	 
	 
}
