package Aula16.FormaGeometrica;

public class Triangulo extends FormaGeometrica {
	private float base, altura;
	
	public Triangulo(String nome, float base, float altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
		this.area = totalArea();
	}

	@Override
	public float totalArea() {
		return (base*altura)/2;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", nome=" + nome + ", area=" + area + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(altura);
		result = prime * result + Float.floatToIntBits(base);
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
		Triangulo other = (Triangulo) obj;
		if (Float.floatToIntBits(altura) != Float.floatToIntBits(other.altura))
			return false;
		if (Float.floatToIntBits(base) != Float.floatToIntBits(other.base))
			return false;
		return true;
	}
	
	
	
}