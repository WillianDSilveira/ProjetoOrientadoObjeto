package Aula04;

public class Calculadora {
	int valor;
	String operacao;
	
	int somar(int a, int b) {
		operacao = "soma";
		valor = a+b;
		return valor;
	}
	// A Funcao estatica nao pode depender de nenhum outro atributo da classe.
	static int somar_estatico(int a, int b) {
		return a+b;
	}
	
	int subtrair(int a, int b) {
		operacao = "subtrair";
		valor = a-b;
		return valor;
	}
	// A Funcao estatica nao pode depender de nenhum outro atributo ou metodo da classe
	// a nao ser que eles tambem sejam estatico.
	static int subtrair_estatico(int a, int b) {
		return a-b;
	}
	
	int ultimoResultado() {
		return valor;
	}
	
	String ultimaOperacao() {
		return operacao;
	}
	
}
