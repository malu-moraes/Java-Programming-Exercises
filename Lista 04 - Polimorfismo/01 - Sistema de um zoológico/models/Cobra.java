package models;

public class Cobra extends Reptil{

	public Cobra(String nome, int idade, float peso, float temperaturaCorporal) {
		super(nome, idade, peso, temperaturaCorporal);
	}
	
	public void rastejar() {
		System.out.println(nome + " está rastejando.");
	}
	
	@Override
	public void fazerSom() {
		System.out.println(nome+ ": Ssss Ssss 𓆚");
	}
	
}
