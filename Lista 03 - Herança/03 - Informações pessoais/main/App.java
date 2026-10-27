package main;
import models.Pessoa;
import models.Cliente;
import models.Empregado;
import models.Gerente;
import models.Vendedor;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();

		char sexo;
		while (true) {
			System.out.println("Digite seu sexo: ('m' para masculino e 'f' para feminino)");
			sexo = scanner.next().toLowerCase().charAt(0);
			if (sexo == 'm' || sexo == 'f') {
				break;
			} else {
				System.out.println("Entrada inválida! Digite apenas 'm' ou 'f'. (・`ω´・)");
			}
		}

		System.out.println("Você é cliente(1) ou empregado(2)?");
		int escolha = scanner.nextInt();
		scanner.nextLine();

		if (escolha == 1) {
			System.out.println("Digite seu ano de nascimento:");
			int anoNascimento = scanner.nextInt();
			System.out.println("Digite o valor da sua dívida:");
			double valorDivida = scanner.nextDouble();

			Cliente cliente = new Cliente(nome, idade, sexo, valorDivida, anoNascimento);
			System.out.println("--------------------------\n");
			cliente.obterInformacoesBasicas();

		} else if (escolha == 2) {
			System.out.println("Digite seu salário:");
			double salario = scanner.nextDouble();
			scanner.nextLine();

			System.out.println("Digite sua matrícula:");
			String matricula = scanner.nextLine();

			System.out.println("Você é gerente(1) ou vendedor(2)?");
			int resposta = scanner.nextInt();
			scanner.nextLine(); 

			if (resposta == 1) {
				System.out.println("Digite o nome da sua gerência:");
				String nomeGerencia = scanner.nextLine();

				Gerente gerente = new Gerente(nome, idade, sexo, salario, matricula, nomeGerencia);
				System.out.println("--------------------------\n");
				gerente.obterInformacoesBasicas();
				gerente.valorINSS();

			} else if (resposta == 2) {
				System.out.println("Digite a quantidade de vendas:");
				int qntdVenda = scanner.nextInt();

				System.out.println("Digite o valor de cada venda:");
				double valorVenda = scanner.nextDouble();

				Vendedor vendedor = new Vendedor(nome, idade, sexo, salario, matricula, qntdVenda, valorVenda);
				System.out.println("--------------------------\n");
				vendedor.obterInformacoesBasicas();
				vendedor.totalVenda();
				vendedor.valorINSS();

			} else {
				System.out.println("Erro! Digite apenas '1' para gerente ou '2' para vendedor. (ﾒ` ﾛ ´)");
			}

		} else {
			System.out.println("Opção inválida! Digite apenas 1 ou 2. (`ー´)");
		}

		scanner.close();
	}
}
