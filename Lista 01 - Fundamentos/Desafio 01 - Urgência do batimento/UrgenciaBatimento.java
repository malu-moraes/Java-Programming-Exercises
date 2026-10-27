package main;
import java.util.Scanner;

public class UrgenciaBatimento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--URGÊNCIA DO SEU BATIMENTO CARDÍACO (O.O)--");
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		System.out.print("Digite seu número de batimentos cardíacos: ");
		int batimentoCard = scanner.nextInt();
		
		if(idade > 60 && batimentoCard > 150) {
			System.out.print("SITUAÇÃO URGENTE!!! Σ(°△°|||)");
		} else if (idade > 60 && batimentoCard >= 150) {
			System.out.print("Situação com urgência moderada. ヾ(。＞＜)");
		} else if (idade <= 60 && batimentoCard > 150) {
			System.out.print("Situação com urgência moderada. ヾ(。＞＜)");
		} else { //(idade <= 60 && batimentoCard <= 150)
			System.out.print("Situação não urgente. <(￣︶￣)>");		
		}
		scanner.close();

	}

}
