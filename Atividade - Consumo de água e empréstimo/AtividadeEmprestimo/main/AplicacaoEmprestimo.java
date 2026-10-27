package main;

import models.Cliente;
import services.ProcessoEmprestimo;

import java.util.Scanner;

public class AplicacaoEmprestimo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("--SISTEMA DE EMPRÉSTIMO ヽ(>∀<☆)ノ--");
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		System.out.print("Digite sua renda anual (R$): ");
		double rendaAnual = scanner.nextDouble();
		System.out.print("Possui empréstimo pendente? (true ou false): ");
		String resposta = scanner.next().toLowerCase();
		while (!resposta.equals("true") && !resposta.equals("false")) { //só deixa responder true ou false
		    System.out.println("Resposta inválida!! Digite apenas 'true' ou 'false': ");
		    resposta = scanner.next().toLowerCase();
		}
		boolean emprestimoPendente = Boolean.parseBoolean(resposta); //converte boolean
		System.out.print("Digite o valor do empréstimo a ser solicitado (R$): ");
		double valorEmprestimo = scanner.nextDouble();

		Cliente cliente1 = new Cliente(nome, idade, rendaAnual, emprestimoPendente);
		//objt da claase ProcessoEmprestimo
		ProcessoEmprestimo processador = new ProcessoEmprestimo(false, "");
		//processa o empréstimo
		ProcessoEmprestimo resultado = processador.processarEmprestimo(cliente1, valorEmprestimo);

		System.out.println("\n-- RESULTADO --");
		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("Idade: " + cliente1.getIdade());
		System.out.println("Renda Anual: R$" + cliente1.getRendaAnual());
		System.out.println("Valor Solicitado: R$" + valorEmprestimo);
		System.out.println("Status: " + resultado.getMensagem());
		
		scanner.close();
	}
}
