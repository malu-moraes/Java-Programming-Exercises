package models;

public class Mamifero extends Animal {
	public float velocidade; 

	public Mamifero(String nome, int idade, float peso, float velocidade) {
		super(nome, idade, peso);
		this.velocidade = velocidade;
	}
	
	@Override
	public void fazerSom() {
		System.out.println("Som de um mamífero");
	}
	
	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		infoMamifero();
	}
	
	public void infoMamifero() {
		System.out.println("| Velocidade: " + velocidade);
	}

}
