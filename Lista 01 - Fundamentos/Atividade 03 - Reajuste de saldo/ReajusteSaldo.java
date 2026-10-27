package main;
import java.util.Scanner;

public class ReajusteSaldo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--REAJUSTANDO 1% DO SEU SALDO ☆(>ᴗ•)--");
		System.out.println("Digite seu saldo: ");
		double saldo = scanner.nextDouble();
		
		double saldoReajustadoMais = saldo + (saldo * 0.01);
		double saldoReajustadoMenos = saldo - (saldo * 0.01);
		
		System.out.println("O valor do seu saldo reajustado para 1% a mais é de: " + saldoReajustadoMais);
		System.out.println("E o valor reajustado para 1% a menos é de: " + saldoReajustadoMenos);
		scanner.close();
	}
}
