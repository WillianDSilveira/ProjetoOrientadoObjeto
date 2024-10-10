package Aula11.Loja;

public class VideoGame extends Produto{
	protected int controles;

	public int getControles() {
		return controles;
	}

	public void setControles(int controles) {
		this.controles = controles;
	}

	public VideoGame(String nome, int preco, String marca, int controles) {
		super(nome, preco, marca);
		this.controles = controles;
	}

	@Override
	public String toString() {
		return "VideoGame [controles=" + controles + ", nome=" + nome + ", preco=" + preco + ", marca=" + marca + "]";
	}
	
	
	
}
