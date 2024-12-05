package Aula16.FormaGeometrica;

public class Retangulo extends FormaGeometrica implements MinhaInterface {
	
	private float lado1, lado2;

	public Retangulo(String nome, float lado1, float lado2) {
		super(nome);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.area = totalArea();		
	}
	
	public void ExemploDeMetodoViaInterface() {
		System.out.println("Exemplo de metodo via interface");
	}
	
	@Override
	public float totalArea() {
		return (lado1*lado2);
	}

	public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	@Override
	public String toString() {
		return "Retangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", nome=" + nome + ", area=" + area + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(lado1);
		result = prime * result + Float.floatToIntBits(lado2);
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
		Retangulo other = (Retangulo) obj;
		if (Float.floatToIntBits(lado1) != Float.floatToIntBits(other.lado1))
			return false;
		if (Float.floatToIntBits(lado2) != Float.floatToIntBits(other.lado2))
			return false;
		return true;
	}

}