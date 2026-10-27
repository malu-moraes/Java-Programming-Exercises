package models;

public class Animal {
	public String nome;
	public int idade;
	public float peso;
	
	public Animal(String nome, int idade, float peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	
	public void fazerSom() {
		System.out.println("Som de um animal");
	}
	
	public void exibirInformacoes() {
		System.out.println("| Nome: " + nome + "\n| Idade: " + idade + "\n| Peso: " + peso);
	}

}
