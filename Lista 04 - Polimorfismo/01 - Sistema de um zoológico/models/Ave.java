package models;

public class Ave extends Animal{
	public float envergaduraAsa;

	public Ave(String nome, int idade, float peso, float envergaduraAsa) {
		super(nome, idade, peso);
		this.envergaduraAsa = envergaduraAsa;
	}
	
	@Override
	public void fazerSom() {
		System.out.println("Som de uma ave");
	}
	
	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		infoAve();
	}
	
	public void infoAve() {
		System.out.println("| Envergadura da asa: " + envergaduraAsa);
	}

}
