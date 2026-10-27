package main;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--CALCULADORA (ノ*°▽°*)--");
		System.out.println("Digite o primeiro número: ");
		double numero1 = scanner.nextDouble();
		System.out.println("Digite o segundo número: ");
		double numero2 = scanner.nextDouble();
		
		int opcao;
		double resultado;
		do {
		System.out.println("\n--ESCOLHA A OPERAÇÃO ( ˘⌣˘)--");
		System.out.println("1. Adição.");
		System.out.println("2. Subtração.");
		System.out.println("3. Multiplicação.");
		System.out.println("4. Divisão.");
		System.out.println("Escolha uma opção:");
		opcao = scanner.nextInt();
		
		switch(opcao) {
		case 1: 
			resultado = numero1 + numero2;
			System.out.println("O resultado da sua adição é: " + resultado + " ( ᵔ ⩊ ᵔ )");
		break;
		
		case 2:
			resultado = numero1 - numero2;
			System.out.println("O resultado da sua subtração é: " + resultado + " (๑˘︶˘๑)");
		break;
		
		case 3:
			resultado = numero1 * numero2;
			System.out.println("O resultado da sua multiplicação é: " + resultado);
		break;
		
		case 4: 
			resultado = numero1 / numero2;
			System.out.println("O resultado da sua divisão é: " + resultado + " (>⩊<)");
		break;
		
		default:
			System.out.println("Número inválido! Selecione outra opção. (¯ . ¯;)");
		}
		}  
		while(opcao !=4);
		scanner.close();
} 
}
