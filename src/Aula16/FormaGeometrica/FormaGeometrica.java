package Aula16.FormaGeometrica;

public abstract class FormaGeometrica {
	private String nome;
	private float area;
	
	public abstract float totalArea();

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
	
	
}
