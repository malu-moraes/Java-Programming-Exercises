package main;
import java.util.Scanner;

public class ValorPago {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--CÁLCULO DE PORCENTAGEM DO IPI ( ´ ▽ ` )/--");
		System.out.println("Insira a porcentagem do IPI: ");
		double IPI = scanner.nextDouble();
		
		System.out.print("Insira o código do primeiro produto: ");
		int codigo1 = scanner.nextInt();
		System.out.print("Insita o valor unitário do primeiro produto: ");
		double valor1 = scanner.nextDouble();
		System.out.print("Insira a quantidade do primeiro produto: ");
		int quantidade1 = scanner.nextInt();
		
		System.out.print("Insira o código do segundo produto: ");
		int codigo2 = scanner.nextInt();
		System.out.print("Insita o valor unitário do segundo produto: ");
		double valor2 = scanner.nextDouble();
		System.out.print("Insira a quantidade do segundo produto: ");
		int quantidade2 = scanner.nextInt();
		
		double total = (valor1 * quantidade1) + (valor2 * quantidade2) * (IPI/100+1);
		
		System.out.println("O valor total a ser pago pelos produtos é de: R$ " + total + " |･д･)ﾉ");
		
		scanner.close();
	}
}
