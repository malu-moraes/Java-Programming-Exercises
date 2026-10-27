package main;
import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--CALCULADORA DE DIAS VIVIDOS ( ◕▿◕ )--");
		System.out.print("Insira sua idade em anos: ");
		int anos = scanner.nextInt();
		System.out.print("Agora, digite os meses da sua idade: ");
		int meses = scanner.nextInt();
		System.out.print("Por fim, digite os dias da sua idade: ");
		int dias = scanner.nextInt();
		
		int diasTotal = (anos * 365) + (meses * 30) + (dias);
		
		//System.out.println("Sua idade em dias é: " + diasTotal + " dias ＼(＾▽＾)／");
		System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias. Ou seja, sua idade em dias é: " + diasTotal + " ＼(＾▽＾)／");
		scanner.close();

	}

}
