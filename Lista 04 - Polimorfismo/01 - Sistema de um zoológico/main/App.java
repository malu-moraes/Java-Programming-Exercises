package main;
import models.Animal;
import models.Mamifero;
import models.Ave;
import models.Reptil;
import models.Cachorro;
import models.Papagaio;
import models.Cobra;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Exibindo informações das classes\n");
		System.out.println("Classe Animal:");
		Animal animal = new Animal("Lucas", 100, 80);
		animal.fazerSom();
		animal.exibirInformacoes();
		
		System.out.println("\nClasse Mamífero:");
		Mamifero mamifero = new Mamifero("Leo Jardim", 34, 90, 108);
		mamifero.fazerSom();
		mamifero.exibirInformacoes();
		
		System.out.println("\nClasse Ave:");
		Ave ave = new Ave("Vegetti", 30, 3, 40);
		ave.fazerSom();
		ave.exibirInformacoes();
		
		System.out.println("\nClasse Réptil:");
		Reptil reptil = new Reptil("Lucas Piton", 33, 60, 37);
		reptil.fazerSom();
		reptil.exibirInformacoes();
		
		System.out.println("\n\nClasses derivadas:\n");
		System.out.println("Cachorro:");
		Cachorro cachorro = new Cachorro("Jungkook", 29, 78, 110);
		cachorro.fazerSom();
		cachorro.exibirInformacoes();
		cachorro.correr();
		
		System.out.println("\nPapagaio:");
		Papagaio papagaio = new Papagaio("Raimundo", 13, 4, 32);
		papagaio.fazerSom();
		papagaio.exibirInformacoes();
		papagaio.voar();
		
		System.out.println("\nCobra:");
		Cobra cobra = new Cobra("Murilo", 22, 3, 37);
		cobra.fazerSom();
		cobra.exibirInformacoes();
		cobra.rastejar();
	}

}
