package models;

public class Papagaio extends Ave{

	public Papagaio(String nome, int idade, float peso, float envergaduraAsa) {
		super(nome, idade, peso, envergaduraAsa);
	}

	public void voar() {
		System.out.println(nome +" está voando.");
	}
	
	@Override
	public void fazerSom() {
		System.out.println(nome + ": Curocaco!! ⋋(•⌔•)⋌");
	}
}
