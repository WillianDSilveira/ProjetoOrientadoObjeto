package Aula08.Carro;

public class Motor {
	private int cavalos;
	private float consumo;
	private int valvulas;
	
	public Motor() {}
	public Motor(int cavalos, float consumo, int valvulas) {
		this.cavalos = cavalos;
		this.consumo = consumo;
		this.valvulas = valvulas;
	}
	public int getCavalos() {
		return cavalos;
	}
	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}
	public float getConsumo() {
		return consumo;
	}
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}
	public int getValvulas() {
		return valvulas;
	}
	public void setValvulas(int valvulas) {
		this.valvulas = valvulas;
	}
	
	
	
	
}
