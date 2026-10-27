package main;
import models.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
	private static Scanner scanner = new Scanner(System.in);
	private static List<Cliente> clientes = new ArrayList<>();

	public static void cadastrarCliente() {
		System.out.println("Digite o nome do cliente: ");
		String nome = scanner.nextLine();
		System.out.println("Digite o CPF do cliente: ");
		String cpf = scanner.nextLine();
		try {
			clientes.add(new Cliente(nome, cpf));
			System.out.println("Cliente cadastrado com sucesso!! ＼(≧▽≦)／");
		} catch (IllegalArgumentException e) {
			System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
		}
	}

	public static Cliente buscarPorCpf(String cpf) {
		for (Cliente cliente : clientes) {
			if (cliente.getCpf().equals(cpf)) return cliente;
		}
		return null;
	}

	public static void criarConta() {
		System.out.println("Digite o CPF do cliente: ");
		String cpf = scanner.nextLine();
		Cliente cliente = buscarPorCpf(cpf);
		if (cliente == null) {
			System.out.println("Cliente não encontrado. (-_-;)・・・");
			return;
		}

		System.out.println("Digite o número da conta: ");
		String numero = scanner.nextLine();

		int tipo = 0;
		do {
			System.out.println("Selecione o tipo da conta: \n(1)Corrente\n(2)Poupança");
			tipo = scanner.nextInt();
			scanner.nextLine();
			if (tipo != 1 && tipo != 2) {
				System.out.println("Opção inválida. Por favor, digite 1 para Conta Corrente ou 2 para Conta Poupança.");
			}
		} while (tipo != 1 && tipo != 2);

		try {
			ContaBancaria conta = (tipo == 1) ?
				new ContaCorrente(numero, cliente.getNome()) : new ContaPoupanca(numero, cliente.getNome());
			cliente.adicionarConta(conta);
			System.out.println("Conta criada com sucesso!! <(￣︶￣)>");
		} catch (IllegalArgumentException e) {
			System.out.println("Erro ao criar conta: " + e.getMessage());
		}
	}

	public static void depositar() {
		System.out.print("Digite o CPF do cliente: ");
		String cpf = scanner.nextLine();
		Cliente cliente = buscarPorCpf(cpf);
		if (cliente == null) {
			System.out.println("Cliente não encontrado. (-_-;)・・・");
			return;
		}

		System.out.print("Digite o número da conta: ");
		String numero = scanner.nextLine();
		ContaBancaria conta = null;

		try {
			conta = cliente.buscarPorNumero(numero);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return;
		}

		System.out.print("Digite o valor do depósito: R$");
		double valor = scanner.nextDouble();
		scanner.nextLine();

		try {
			conta.depositar(valor);
			System.out.println("Depósito realizado com sucesso!! ヽ(*⌒▽⌒*)ﾉ");
		} catch (IllegalArgumentException e) {
			System.out.println("Erro ao depositar: " + e.getMessage());
		}
	}

	public static void sacar() {
		System.out.print("Digite o CPF do cliente: ");
		String cpf = scanner.nextLine();
		Cliente cliente = buscarPorCpf(cpf);
		if (cliente == null) {
			System.out.println("Cliente não encontrado. (-_-;)・・・");
			return;
		}

		System.out.print("Digite o número da conta: ");
		String numero = scanner.nextLine();
		ContaBancaria conta = cliente.buscarPorNumero(numero);
		if (conta == null) {
			System.out.println("Conta não encontrada. (・_・;)");
			return;
		}

		System.out.print("Digite o valor do saque: R$");
		double valor = scanner.nextDouble();
		scanner.nextLine();
		try {
			conta.sacar(valor);
			System.out.println("Saque realizado com sucesso!! (✧ω✧)");
		} catch (IllegalArgumentException e) {
			System.out.println("Erro ao sacar: " + e.getMessage());
		}
	}

	public static void transferir() {
		System.out.print("Digite o CPF do cliente de origem: ");
		String cpfOrigem = scanner.nextLine();
		Cliente clienteOrigem = buscarPorCpf(cpfOrigem);
		if (clienteOrigem == null) {
			System.out.println("Cliente de origem não encontrado. (¯ . ¯;)");
			return;
		}

		System.out.print("Digite o CPF do cliente de destino: ");
		String cpfDestino = scanner.nextLine();
		Cliente clienteDestino = buscarPorCpf(cpfDestino);
		if (clienteDestino == null) {
			System.out.println("Cliente de destino não encontrado. (¯ . ¯;)");
			return;
		}

		System.out.print("Digite o número da conta de origem: ");
		String origem = scanner.nextLine();
		System.out.print("Digite o número da conta de destino: ");
		String destino = scanner.nextLine();

		ContaBancaria contaOrigem = clienteOrigem.buscarPorNumero(origem);
		ContaBancaria contaDestino = clienteDestino.buscarPorNumero(destino);

		if (contaOrigem == null || contaDestino == null) {
			System.out.println("Conta(s) inválida(s)!! (ᗒᗣᗕ)");
			return;
		}

		System.out.print("Digite o valor da transferência: R$");
		double valor = scanner.nextDouble();
		scanner.nextLine();

		try {
			if (contaOrigem.transferir(contaDestino, valor)) {
				System.out.println("Transferência realizada com sucesso!! ( ´ ▽ ` )");
			} else {
				System.out.println("Falha na transferência.");
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Erro na transferência: " + e.getMessage());
		}
	}

	public static void listarContas() {
		System.out.print("Digite o CPF do cliente: ");
		String cpf = scanner.nextLine();
		Cliente cliente = buscarPorCpf(cpf);
		if (cliente == null) {
			System.out.println("Cliente não encontrado. (-_-;)・・・");
			return;
		}
		if (cliente.getContas().isEmpty()) {
			System.out.println("O cliente não possui nenhuma conta cadastrada. ╮(￣_￣)╭");
			return;
		}
		cliente.listarContas();
	}

	public static void aplicarImpostoOuRendimento() {
		System.out.print("Digite o CPF do cliente: ");
		String cpf = scanner.nextLine();
		Cliente cliente = buscarPorCpf(cpf);
		if (cliente == null) {
			System.out.println("Cliente não encontrado. (-_-;)・・・");
			return;
		}
		for (ContaBancaria conta : cliente.getContas()) {
			if (conta instanceof ContaCorrente) {
				double tarifa = conta.calcularImposto();
				try {
					conta.sacar(tarifa);
					System.out.println("Tarifa mensal de R$" + tarifa + " aplicada à conta " + conta.getNumeroConta());
				} catch (IllegalArgumentException e) {
					System.out.println("Erro ao aplicar tarifa na conta " + conta.getNumeroConta() + ": " + e.getMessage());
				}
			} else if (conta instanceof ContaPoupanca) {
				((ContaPoupanca) conta).rendimentoAnual();
				System.out.println("Rendimento aplicado à conta poupança " + conta.getNumeroConta() + " (＞＜)");
			}
		}
	}
	
	public static void exibirDetalhesConta() {
		System.out.print("Digite o CPF do cliente: ");
		String cpf = scanner.nextLine();
		Cliente cliente = buscarPorCpf(cpf);
		if (cliente == null) {
			System.out.println("Cliente não encontrado. (-_-;)・・・");
			return;
		}
		System.out.print("Digite o número da conta: ");
		String numero = scanner.nextLine();
		ContaBancaria conta = cliente.buscarPorNumero(numero);
		if (conta == null) {
			System.out.println("Conta não encontrada. (・_・;)");
			return;
		}
		conta.exibirDetalhes();
	}

	public static void main(String[] args) {
		int opcao;
		do {
			System.out.println("--MENU DO BANCO (⌒‿⌒)--\n");
			System.out.println("1. Cadastrar cliente.");
			System.out.println("2. Criar nova conta.");
			System.out.println("3. Depositar");
			System.out.println("4. Sacar");
			System.out.println("5. Transferir entre contas.");
			System.out.println("6. Listar contas de um cliente.");
			System.out.println("7. Aplicar imposto ou rendimento.");
			System.out.println("8. Exibir detalhes da conta.");
			System.out.println("9. Sair.");
			System.out.println("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
				case 1:
					cadastrarCliente();
				break;
				
				case 2:
					criarConta();
				break;
				
				case 3:
					depositar();
				break;
				
				case 4:
					sacar();
				break;
				
				case 5:
					transferir();
				break;
				
				case 6:
					listarContas();
				break;
				
				case 7:
					aplicarImpostoOuRendimento();
				break;
				
				case 8:
					exibirDetalhesConta();
				break;
				
				case 9:
					System.out.println("Saindo... 	~ヾ(・ω・)");
				break;
				
				default:
					System.out.println("Opção inválida!! (`皿´＃)");
			}
		} while (opcao != 9);

		scanner.close();
	}
}
