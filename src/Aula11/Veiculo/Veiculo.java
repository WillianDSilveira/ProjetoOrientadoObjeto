package Aula11.Veiculo;

public class Veiculo {
	protected int capacidadeTanque;
	protected String cor;
	protected String marca;
	protected String modelo;
	
	public Veiculo() {
	}
	public Veiculo(int capacidadeTanque, String cor, String marca, String modelo) {
		this.capacidadeTanque = capacidadeTanque;
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
	}
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Veiculo [capacidadeTanque=" + capacidadeTanque + ", cor=" + cor + ", marca=" + marca + ", modelo="
				+ modelo + "]";
	}	
	
}
