package main;
import models.Personagem;
import models.Heroi;
import models.Vilao;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;
		
		System.out.println("--ÍNDOLE DO SEU PERSONAGEM (￢‿￢ )--");
		System.out.println("1. Herói.");
		System.out.println("2. Vilão.");
		System.out.println("Digite sua opção: ");
		opcao = scanner.nextInt();
		scanner.nextLine();
	try {	
		switch(opcao) {
		case 1: System.out.println("--CRIAÇÃO DO SEU HERÓI (ノ*°▽°*)--");
			System.out.println("Digite o nome do seu herói: ");
			String nomeH = scanner.nextLine();
			System.out.println("Digite o poder do seu herói: ");
			String poderH = scanner.nextLine();
			System.out.println("Digite a motivação do seu herói: ");
			String motivacaoH = scanner.nextLine();
			System.out.println("Digite a habilidade especial do seu herói: ");
			String especialH = scanner.nextLine();
			System.out.println("Digite qual o ato de heroismo do seu herói: ");
			String ato = scanner.nextLine();
			System.out.println("Digite o número de resgates que seu herói já realizou: ");
			int resgates = scanner.nextInt();
				Heroi heroi = new Heroi(nomeH, poderH, motivacaoH, especialH, ato, resgates);
				heroi.infosPersonagem();
			break;
			
		case 2: System.out.println("--CRIAÇÃO DO SEU VILÃO ψ( ` ∇ ´ )ψ--");
			System.out.println("Digite o nome do seu vilão: ");
			String nomeV = scanner.nextLine();
			System.out.println("Digite o poder do seu vilão: ");
			String poderV = scanner.nextLine();
			System.out.println("Digite a motivação do seu vilão: ");
			String motivacaoV = scanner.nextLine();
			System.out.println("Digite a habilidade especial do seu vilão: ");
			String especialV = scanner.nextLine();
			System.out.println("Digite o crime mais conhecido do seu vilão: ");
			String crime = scanner.nextLine();
			System.out.println("Digite a quantidade de crimes que seu vilão já cometeu: ");
			int crimes = scanner.nextInt();
				Vilao vilao = new Vilao(nomeV, poderV, motivacaoV, especialV, crime, crimes);
				vilao.infosPersonagem();
		break;
		
		default: System.out.println("Por favor, escolha apenas uma opção válida. (＞ｍ＜)");
			
		} 
	} catch (IllegalArgumentException e) {
		System.out.println(e.getMessage()); }

scanner.close();

	} 
}
