package main;
import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--CALCULADORA DE PESO IDEAL (o^ ^o)--");
		System.out.print("Digite seu gênero (M para masculino ou F para feminino): ");
		char genero = scanner.next().toLowerCase().charAt(0);
		System.out.print("Digite sua altura em metros: ");
		double altura = scanner.nextDouble();
		
		double pesoIdeal = 0;
		
		if(genero == 'm') { 
			pesoIdeal = ((72.7 * altura) - 58);
			System.out.print("Seu peso ideal é: " + pesoIdeal + " ╰(▔∀▔)╯");
		} else if(genero == 'f') {
			pesoIdeal = ((62.1 * altura) - 44.7);
			System.out.print("Seu peso ideal é: " + pesoIdeal + " ╰(▔∀▔)╯");
		} else{
			System.out.print("Gênero não reconhecido. Peso ideal: " + pesoIdeal + "kg. ┐(￣ヘ￣;)┌");
		}
		scanner.close();
	}

}
