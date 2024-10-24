package Aula13.Ingressos;

import java.util.ArrayList;
import java.util.Arrays;

public class Show2 {
	private ArrayList<Ingresso> tickets;
	
	public Show2() {
	        this.tickets = new ArrayList<Ingresso>();
	  }

	public boolean adicionarIngresso(Ingresso t) {
		if(tickets.size() < 4) {
			tickets.add(t);
			return true;
		}        
	     return false;   
	 }

	public void mostraIngressos() {
	        for (Ingresso i : tickets) {
	        	System.out.println(i);
	        }

	}

	
	 
	 
}
