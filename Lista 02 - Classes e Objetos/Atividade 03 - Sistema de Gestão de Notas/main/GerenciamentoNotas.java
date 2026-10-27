package main;
import models.Aluno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciamentoNotas {
    private static List<Aluno> alunos = new ArrayList<>();

    public static void adicionarAluno(Scanner scanner) {
    	System.out.println("\n--ADICIONANDO ALUNO--");
    	System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o curso do aluno: ");
        String curso = scanner.nextLine();
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        alunos.add(new Aluno(nome, curso, matricula, 0, 0));
        System.out.println("Aluno cadastrado com sucesso! o(>ω<)o");
    }

    public static void adicionarNota(Scanner scanner) {
    	System.out.println("\n--ADICIONANDO NOTAS--");
    	System.out.print("Adicionar nota por (1) Nome ou (2) Matrícula? ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        Aluno alunoEncontrado = null;

        switch (escolha) {
            case 1:
                System.out.print("Digite o nome do aluno: ");
                String nome = scanner.nextLine();
                for (Aluno aluno : alunos) {
                    if (aluno.getNome().equalsIgnoreCase(nome)) {
                        alunoEncontrado = aluno;
                        break;
                    }
                }
                break;
            case 2:
                System.out.print("Digite a matrícula do aluno: ");
                String matricula = scanner.nextLine();
                for (Aluno aluno : alunos) {
                    if (aluno.getMatricula().equalsIgnoreCase(matricula)) {
                        alunoEncontrado = aluno;
                        break;
                    }
                }
                break;
            default:
                System.out.println("Opção inválida! (￢_￢;)");
                return;
        }

        if (alunoEncontrado == null) {
            System.out.println("Aluno não encontrado. (￣ヘ￣)");
            return;
        }

        System.out.print("Digite a nota do primeiro bimestre: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota do segundo bimestre: ");
        double nota2 = scanner.nextDouble();

        alunoEncontrado.setNota1(nota1);
        alunoEncontrado.setNota2(nota2);

        System.out.println("Notas atualizadas com sucesso! ٩(ˊ〇ˋ*)و");
    }

    public static void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado. (¬ ¬ )");
        } else {
        	System.out.println("\n--LISTA DE ALUNOS--");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
                System.out.println("----------------------------- 	( ᵔ ⩊ ᵔ )");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--SISTEMA DE GERENCIAMENTO DE NOTAS ╰(*´︶`*)╯--");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Adicionar/alterar nota para um aluno");
            System.out.println("3. Listar alunos");
            System.out.println("4. Sair");
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarAluno(scanner);
                    break;
                case 2:
                    adicionarNota(scanner);
                    break;
                case 3:
                    listarAlunos();
                    break;
                case 4:
                    System.out.println("Saindo do programa (≧▽≦)/...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente. (o_O)");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}