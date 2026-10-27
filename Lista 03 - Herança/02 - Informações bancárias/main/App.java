package main;
import models.ContaCorrente;
import models.Poupanca;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;
		
		System.out.println("--SELECIONE SEU TIPO DE CONTA (o^ ^o)--");
		System.out.println("1. Conta Corrente.");
		System.out.println("2. Conta Poupança.");
		System.out.print("Escolha uma opção: ");
		opcao = scanner.nextInt();
		scanner.nextLine();

		switch(opcao) {
			case 1:
				System.out.print("Digite seu nome: ");
				String nomeCorrente = scanner.nextLine();
				System.out.print("Digite a data de abertura da sua conta (dd/mm/aaaa): ");
				String dataCorrente = scanner.nextLine();
				System.out.print("Digite o valor do seu saldo (R$): ");
				double saldoCorrente = scanner.nextDouble();

				try {
					ContaCorrente contaCorrente = new ContaCorrente(nomeCorrente, dataCorrente, saldoCorrente);

					int escolha;
					do {
						System.out.println("\n----------------------\n");
						System.out.println("--SISTEMA DA SUA CONTA ( ◡‿◡ )--");
						System.out.println("1. Ver seu saldo.");
						System.out.println("2. Depositar.");
						System.out.println("3. Sacar.");
						System.out.println("4. Sair.");
						System.out.print("Digite uma opção: ");
						escolha = scanner.nextInt();

						switch (escolha) {
							case 1: 
								contaCorrente.verSaldo();
								break;

							case 2:
								System.out.print("Digite o valor do depósito: ");
								double deposito = scanner.nextDouble();
								contaCorrente.deposito(deposito);
								break;

							case 3:
								System.out.print("Digite o valor para sacar: ");
								double saque = scanner.nextDouble();
								contaCorrente.saque(saque);
								break;

							case 4: 
								System.out.println("Saindo... ( ´ ω ` )ノﾞ");
								break;

							default: 
								System.out.println("Opção inválida! (・_・;)");
						}
					} while (escolha != 4);

				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 2:
				System.out.print("Digite seu nome: ");
				String nomePoupanca = scanner.nextLine();
				System.out.print("Digite a data de abertura da sua conta (dd/mm/aaaa): ");
				String dataPoupanca = scanner.nextLine();
				System.out.print("Digite o valor do seu saldo (R$): ");
				double saldoPoupanca = scanner.nextDouble();
				System.out.print("Digite seu rendimento mensal (%): ");
				double rendimento = scanner.nextDouble();

				try {
					Poupanca contaPoupanca = new Poupanca(nomePoupanca, dataPoupanca, saldoPoupanca, rendimento);

					int selecao;
					do {
						System.out.println("\n----------------------\n");
						System.out.println("--SISTEMA DA SUA CONTA ( ◡‿◡ )--");
						System.out.println("1. Ver seu saldo.");
						System.out.println("2. Depositar.");
						System.out.println("3. Sacar.");
						System.out.println("4. Calcular rendimento mensal.");
						System.out.println("5. Sair.");
						System.out.print("Digite uma opção: ");
						selecao = scanner.nextInt();

						switch(selecao) {
							case 1: 
								contaPoupanca.verSaldo();
								break;

							case 2: 
								System.out.print("Digite o valor do depósito: ");
								double valorDeposito = scanner.nextDouble();
								contaPoupanca.deposito(valorDeposito);
								break;

							case 3: 
								System.out.print("Digite o valor para sacar: ");
								double valorSaque = scanner.nextDouble();
								contaPoupanca.saque(valorSaque);
								break;

							case 4: 
								contaPoupanca.calcularRendimentoMensal();
								break;
								
							case 5:
								System.out.println("Saindo... ( ´ ω ` )ノﾞ");
								break;

							default: 
								System.out.println("Opção inválida! (・_・;)");
						}
					} while(selecao != 5);

				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
				break;

			default: 
				System.out.println("Opção inválida! (ーー;)");
		}

		scanner.close();
	}
}