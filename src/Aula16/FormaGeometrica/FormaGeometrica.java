package Aula16.FormaGeometrica;

public abstract class FormaGeometrica {
	protected String nome;
	protected float area;
	
	public abstract float totalArea();

	public FormaGeometrica(String nome, float area) {
		this.nome = nome;
		this.area = area;
	}
	public FormaGeometrica(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "FormaGeometrica [nome=" + nome + ", area=" + area + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(area);
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FormaGeometrica other = (FormaGeometrica) obj;
		if (Float.floatToIntBits(area) != Float.floatToIntBits(other.area))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}