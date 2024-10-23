package Aula12.Padaria;

public class Pao extends Produto {
    private String tipoPao;
    private float percentualGluten;

    public Pao(String nome, float precoUnidade, String marca, String tipoPao, float percentualGluten) {
        super(nome, precoUnidade, marca);
        this.tipoPao = tipoPao;
        this.percentualGluten = percentualGluten;
    }

    @Override
    public void descricao() {
        System.out.println("Produto: " + nome + ", Preço: " + precoUnidade + 
                           ", Marca: " + marca + ", Tipo: " + tipoPao);
    }

    public boolean contemGluten() {
        return percentualGluten > 0;
    }
    
    // Get e Set
    public void setPercentualGluten(float percentualGluten) {
        this.percentualGluten = percentualGluten;
    }

	public String getTipoPao() {
		return tipoPao;
	}

	public void setTipoPao(String tipoPao) {
		this.tipoPao = tipoPao;
	}

	public float getPercentualGluten() {
		return percentualGluten;
	}

	@Override
	public String toString() {
		return "Pao [tipoPao=" + tipoPao + ", percentualGluten=" + percentualGluten + ", nome=" + nome
				+ ", precoUnidade=" + precoUnidade + ", marca=" + marca + "]";
	}
    
    
}
