
package Aula16.FormaGeometrica;

public class Quadrado extends FormaGeometrica {
	private float lado;

	public Quadrado(String nome, float lado) {
		super(nome);
		this.lado = lado;
		this.area = totalArea();
	}
	
	@Override
	public float totalArea() {
		return (lado*lado);
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + ", nome=" + nome + ", area=" + area + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(lado);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quadrado other = (Quadrado) obj;
		if (Float.floatToIntBits(lado) != Float.floatToIntBits(other.lado))
			return false;
		return true;
	}
	
}
