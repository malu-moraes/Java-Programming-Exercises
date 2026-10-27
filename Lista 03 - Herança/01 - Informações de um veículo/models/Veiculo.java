package models;

public class Veiculo {
	
	protected double peso;
	protected double velocidadeMax;
	protected double preco;
	
	public Veiculo(double peso, double velocidadeMax, double preco) {
		this.peso = peso;
		this.velocidadeMax = velocidadeMax;
		this.preco = preco;
	}
	
	public void obterInfosBasicas() {
		System.out.println("\n--INFORMAÇÕES DO SEU VEÍCULO (≧◡≦)--\n");
		System.out.println("Peso: " + peso + " | Velocidade Máxima: " + velocidadeMax + "km/h"+ " | Preço: " + preco);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVelocidadeMax() {
		return velocidadeMax;
	}

	public void setVelocidadeMax(double velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
