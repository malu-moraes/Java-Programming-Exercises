package main;
import java.util.Scanner;

public class AntecessorSucessor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--CALCULADORA DE ANTECESSOR E SUCESSOR DE UM NÚMERO--");
		System.out.print("Insira um número (inteiro): ");
		int numero = scanner.nextInt();
		
		int antecessor = numero - 1;
		int sucessor = numero + 1;
		System.out.print("O número antecessor de " + numero + " é: " + antecessor + ", e seu sucessor é: " + sucessor + " (⌒▽⌒)");
		
		scanner.close();

	}

}
