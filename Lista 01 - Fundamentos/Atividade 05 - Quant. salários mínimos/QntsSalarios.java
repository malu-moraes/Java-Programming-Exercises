package main;
import java.util.Scanner;

public class QntsSalarios {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("--QUANTOS SALÁRIOS MÍNIMOS VOCÊ GANHA? _(:3 」∠)_--");
	double salarioMinimo = 1518.00; //fonte: UOL
	
	System.out.print("Digite o valor do seu salário: ");
	double salario = scanner.nextDouble();
	
	double qntsSalarios = (salario / salarioMinimo);
	System.out.print("Você ganha um total de: " + qntsSalarios + " salários mínimos. └(＾＾)┐");
	
	scanner.close();

	}

}
