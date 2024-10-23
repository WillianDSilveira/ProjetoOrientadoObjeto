package Aula12.Padaria;

public class Queijo extends Produto {
    private String tipoQueijo;
    private float percentualLactose;

    public Queijo(String nome, float precoUnidade, String marca, String tipoQueijo, float percentualLactose) {
        super(nome, precoUnidade, marca);
        this.tipoQueijo = tipoQueijo;
        this.percentualLactose = percentualLactose;
    }

    @Override
    public void descricao() {
        System.out.println("Produto: " + nome + ", Preço: " + precoUnidade + 
                           ", Marca: " + marca + ", Tipo: " + tipoQueijo);
    }

    public boolean contemLactose() {
        return percentualLactose > 0;
    }

    public void setPercentualLactose(float percentualLactose) {
        this.percentualLactose = percentualLactose;
    }

	public String getTipoQueijo() {
		return tipoQueijo;
	}

	public void setTipoQueijo(String tipoQueijo) {
		this.tipoQueijo = tipoQueijo;
	}

	public float getPercentualLactose() {
		return percentualLactose;
	}

	@Override
	public String toString() {
		return "Queijo [tipoQueijo=" + tipoQueijo + ", percentualLactose=" + percentualLactose + ", nome=" + nome
				+ ", precoUnidade=" + precoUnidade + ", marca=" + marca + "]";
	}
    
    
}