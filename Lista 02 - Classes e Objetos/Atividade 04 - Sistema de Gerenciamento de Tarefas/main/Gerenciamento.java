package main;
import models.Tarefa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerenciamento {

	private static List<Tarefa> tarefas = new ArrayList<>();

	public static void adicionarTarefa(Scanner scanner) {
		System.out.println("\n--ADICIONANDO UMA TAREFA--");
		System.out.print("Digite o título da tarefa: ");
		String titulo = scanner.nextLine();

		for (Tarefa t : tarefas) {
			if (t.getTituloTarefa().equalsIgnoreCase(titulo)) {
				System.out.println("Já existe uma tarefa com este título. Por favor esolha outro. (￣ヘ￣)");
				return;
			}
		}

		System.out.print("Digite a descrição da tarefa: ");
		String descricao = scanner.nextLine();

		Tarefa novaTarefa = new Tarefa(titulo, descricao, false);
		tarefas.add(novaTarefa);
		novaTarefa.adicionarTarefa(novaTarefa);
		System.out.println("Tarefa '" + titulo + "' adicionada com sucesso! ＼(￣▽￣)／");
	}

	public static void listarTodasTarefas() {
		System.out.println("\n--LISTA DE TODAS AS TAREFAS--");
		if (tarefas.isEmpty()) {
			System.out.println("Não existem tarefas cadastradas. (¯ . ¯٥)");
			return;
		}
		
		for (Tarefa tarefa : tarefas) {
			System.out.println("Título: " + tarefa.getTituloTarefa() + 
					" - " + (tarefa.isConcluida() ? "Concluída" : "Pendente"));
			System.out.println("Descrição: " + tarefa.getDescricao());
			System.out.println("----------------------------- ☆ﾐ(o*･ω･)ﾉ");
		}
	}
	
	public static void listarTarefasPendentes() {
		System.out.println("\n--LISTA DE TAREFAS PENDENTES--");
		boolean temPendentes = false;
	
		for (Tarefa tarefa : tarefas) {
			if (!tarefa.isConcluida()) {
				System.out.println("Título: " + tarefa.getTituloTarefa());
				System.out.println("Descrição: " + tarefa.getDescricao());
				System.out.println("----------------------------- |･ω･)");
				temPendentes = true;            }
		}

			if (!temPendentes) {
				System.out.println("Não existem tarefas pendentes. ⊂( ´ ▽ ` )⊃");
			}
	}
    
	public static void listarTarefasConcluidas() {
		System.out.println("\n--LISTA DE TAREFAS CONCLUÍDAS--");
		boolean temConcluidas = false;

		for (Tarefa tarefa : tarefas) {
			if (tarefa.isConcluida()) {
				System.out.println("Título: " + tarefa.getTituloTarefa());
				System.out.println("Descrição: " + tarefa.getDescricao());
				System.out.println("----------------------------- (ノ= ⩊ = )ノ");
				temConcluidas = true;
			}
		}

		if (!temConcluidas) {
			System.out.println("Não existem tarefas concluídas. ﾍ(･_|");
		}
	}

	public static void mudarStatusTarefa(Scanner scanner) {
		System.out.println("\n--MUDANDO STATUS DE TAREFA--");
		if (tarefas.isEmpty()) {
			System.out.println("Não existem tarefas cadastradas. (-_-)");
			return;
		}

		listarTodasTarefas();
		System.out.print("Digite o título da tarefa para mudar o status: ");
		String titulo = scanner.nextLine();

		Tarefa tarefaEncontrada = null;
		for (Tarefa t : tarefas) {
			if (t.getTituloTarefa().equalsIgnoreCase(titulo)) {
				tarefaEncontrada = t;
				break;
			}
		}

		if (tarefaEncontrada != null) {
			tarefaEncontrada.mudarStatus(tarefaEncontrada);
		} else {
			System.out.println("Tarefa com título '" + titulo + "' não foi encontrada. ヾ(`ヘ´)ﾉﾞ");
		}
	}

	public static void apagarTarefa(Scanner scanner) {
		System.out.println("\n--APAGANDO TAREFA--");
		if (tarefas.isEmpty()) {
			System.out.println("Não existem tarefas cadastradas. (ᗒᗣᗕ)");
			return;
		}

		listarTodasTarefas();
		System.out.print("Digite o título da tarefa para apagar: ");
		String titulo = scanner.nextLine();

		Tarefa tarefaEncontrada = null;
		for (Tarefa t : tarefas) {
			if (t.getTituloTarefa().equalsIgnoreCase(titulo)) {
				tarefaEncontrada = t;
				break;
			}
		}

		if (tarefaEncontrada != null) {
			tarefaEncontrada.apagarTarefa(tarefaEncontrada);
			tarefas.remove(tarefaEncontrada);
		} else {
			System.out.println("Tarefa com título '" + titulo + "' não encontrada. (」°ロ°)」");
		}
	}

	public static void apagarTodasTarefas(Scanner scanner) {
		System.out.println("\n--APAGANDO TODAS AS TAREFAS--");
		if (tarefas.isEmpty()) {
			System.out.println("Não existem tarefas cadastradas. (￣ ￣|||)");
			return;
		}

		System.out.print("Tem certeza que deseja apagar todas as tarefas? ('true' para sim e 'false' para não): ");
		boolean confirmacao = scanner.nextBoolean();

		if (confirmacao) {
			tarefas.clear();
			System.out.println("Todas as tarefas foram apagadas.〜(＞＜)〜");
		} else {
			System.out.println("Operação cancelada. (¬‿¬ )");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\n--GERENCIADOR DE TAREFAS (o˘◡˘o)--");
			System.out.println("1. Adicionar tarefa.");
			System.out.println("2. Listar todas as tarefas.");
			System.out.println("3. Listar tarefas pendentes.");
			System.out.println("4. Listar tarefas concluídas.");
			System.out.println("5. Mudar status de tarefa.");
			System.out.println("6. Apagar tarefa.");
			System.out.println("7. Apagar todas as tarefas.");
			System.out.println("8. Sair.");
			System.out.print("Digite uma opção: ");

			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				adicionarTarefa(scanner);
			break;

			case 2:
				listarTodasTarefas();
			break;
			
			case 3:
				listarTarefasPendentes();
			break;
			
			case 4:
				listarTarefasConcluidas();
			break;
				
			case 5:
				mudarStatusTarefa(scanner);
			break;
				
			case 6:
				apagarTarefa(scanner);
			break;
				
			case 7:
				apagarTodasTarefas(scanner);
			break;
			
			case 8:
				System.out.println("Saindo do programa... ~ヾ(・ω・)");
			break;
			
			default:
				System.out.println("Opção inválida. Tente novamente. (`皿´＃)");
			}
		} while (opcao != 8);

		scanner.close();
	}
}