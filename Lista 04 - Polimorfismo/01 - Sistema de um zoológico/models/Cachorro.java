package models;

public class Cachorro extends Mamifero{

	public Cachorro(String nome, int idade, float peso, float velocidade) {
		super(nome, idade, peso, velocidade);
	}

	public void correr() {
	System.out.println(nome +" está correndo");
	}
	
	@Override
	public void fazerSom() {
		System.out.println(nome +": Au Au!! ૮⍝• ᴥ •⍝ა");
	}
}
