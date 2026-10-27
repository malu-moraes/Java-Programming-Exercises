package models;

public class Reptil extends Animal{
	public float temperaturaCorporal;

	public Reptil(String nome, int idade, float peso, float temperaturaCorporal) {
		super(nome, idade, peso);
		this.temperaturaCorporal = temperaturaCorporal;
	}
	
	@Override
	public void fazerSom() {
		System.out.println("Som de um réptil");
	}
	
	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		infoReptil();
	}
	
	public void infoReptil() {
		System.out.println("| Temperatura corporal: " + temperaturaCorporal);
	}

}
