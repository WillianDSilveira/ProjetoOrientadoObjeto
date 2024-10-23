package Aula13.Ingressos;

public class TesteShow {

	public static void main(String[] args) {
		
		Show show = new Show();

		BackStage ingressoBackstage = new BackStage(300.0f, "BackStage");
        Vip ingressoVIP = new Vip(150.0f, "Vip");
        Pista ingressoPista = new Pista(75.0f, "Pista");

        show.adicionarIngresso(ingressoBackstage);
        show.adicionarIngresso(ingressoVIP);
        show.adicionarIngresso(ingressoPista);
        show.adicionarIngresso(ingressoVIP);
        show.adicionarIngresso(ingressoBackstage);
        

        show.mostraIngressos();

	}

}
