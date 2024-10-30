package Aula12.Padaria;

public class Leite extends Produto {
    private String tipoLeite;
    private String classificacao;
    private float percentualLactose;

    public Leite(String nome, float precoUnidade, String marca, String tipoLeite, String classificacao, float percentualLactose) {
        super(nome, precoUnidade, marca);
        this.tipoLeite = tipoLeite;
        this.classificacao = classificacao;
        this.percentualLactose = percentualLactose;
    }

    @Override
    public void descricao() {
        System.out.println("Produto: " + nome + ", Preço: " + precoUnidade + 
                           ", Marca: " + marca + ", Tipo: " + tipoLeite + 
                           ", Classificação: " + classificacao);
    }

    public boolean contemLactose() {
        return percentualLactose > 0;
    }
    
    // Get e Set
    public void setPercentualLactose(float percentualLactose) {
        this.percentualLactose = percentualLactose;
    }

	public String getTipoLeite() {
		return tipoLeite;
	}

	public void setTipoLeite(String tipoLeite) {
		this.tipoLeite = tipoLeite;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public float getPercentualLactose() {
		return percentualLactose;
	}

	@Override
	public String toString() {
		return "Leite [tipoLeite=" + tipoLeite + ", classificacao=" + classificacao + ", percentualLactose="
				+ percentualLactose + ", nome=" + nome + ", precoUnidade=" + precoUnidade + ", marca=" + marca + "]";
	}
    
    
	
}