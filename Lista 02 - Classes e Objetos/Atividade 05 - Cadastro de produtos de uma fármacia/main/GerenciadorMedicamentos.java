package main;

import models.Medicamento;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GerenciadorMedicamentos {
    private static List<Medicamento> medicamentos = new ArrayList<>();
    
    public static void adicionarMedicamento(Scanner scanner) {
        System.out.println("\n--CADASTRANDO MEDICAMENTO (⌒ω⌒)--");
        System.out.print("Digite o código de barras: ");
        String codigo = scanner.nextLine();
        
        for (Medicamento m : medicamentos) {
            if (m.getCodBarras().equalsIgnoreCase(codigo)) {
                System.out.println("Já existe um medicamento com esse código de barras. (--_--)");
                return;
            }
        }
        
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Digite o laboratório: ");
        String laboratorio = scanner.nextLine();
        
        double precoCusto;
        do {
            System.out.print("Digite o preço de custo: ");
            precoCusto = scanner.nextDouble();
            if (precoCusto < 0) System.out.println("Preço inválido! Insira um valor positivo. (︶︹︺)");
        } while (precoCusto < 0);
        
        boolean controlado;
        while (true) {
            System.out.print("É um medicamento controlado? (true para sim, false para não): ");
            if (scanner.hasNextBoolean()) {
                controlado = scanner.nextBoolean();
                break;
            } else {
                System.out.println("Entrada inválida! Digite apenas true ou false. (＃＞＜)");
                scanner.next();
            }
        }
        
        int estoque;
        do {
            System.out.print("Digite a quantidade no estoque: ");
            estoque = scanner.nextInt();
            if (estoque < 0) System.out.println("Quantidade inválida! Insira um valor positivo. (」＞＜)」");
        } while (estoque < 0);
        scanner.nextLine(); 
        
        Medicamento novoMedicamento = new Medicamento(codigo, nome, descricao, laboratorio, precoCusto, controlado, estoque);
        medicamentos.add(novoMedicamento);
        System.out.println("Medicamento cadastrado com sucesso!	⸜( *ˊᵕˋ* )⸝");
    }
    
    public static void atualizarEstoque(Scanner scanner) {
        if (medicamentos.isEmpty()) {
            System.out.println("Nenhum medicamento cadastrado. 	┐( ˘_˘ )┌");
            return;
        }
        System.out.println("\n--ATUALIZANDO ESTOQUE DE MEDICAMENTO--");
        System.out.print("Digite o código de barras do medicamento: ");
        String codigo = scanner.nextLine();
        
        for (Medicamento m : medicamentos) {
            if (m.getCodBarras().equalsIgnoreCase(codigo)) {
                int novaQuantidade;
                do {
                    System.out.print("Digite a nova quantidade no estoque: ");
                    novaQuantidade = scanner.nextInt();
                    if (novaQuantidade < 0) System.out.println("Erro! Estoque não pode ser negativo. (・_・ヾ");
                } while (novaQuantidade < 0);
                scanner.nextLine();
                
                m.setQuantEstoque(novaQuantidade);
                System.out.println("Estoque atualizado com sucesso! (ᵔ.ᵔ)");
                return;
            }
        }
        System.out.println("Medicamento não encontrado. (⇀‸↼‶)");
    }
    
    public static void listarMedicamentos() {
        if (medicamentos.isEmpty()) {
            System.out.println("Nenhum medicamento cadastrado.  (￣□￣」)");
            return;
        }
        
        System.out.println("\n--LISTA DE MEDICAMENTOS--");
        for (Medicamento medicamento : medicamentos) {
            System.out.println(medicamento.exibirInformacoes());
            System.out.println("----------------------------- (*˘︶˘*)");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n--GERENCIAMENTO DE FARMÁCIA--");
            System.out.println("1. Adicionar medicamento");
            System.out.println("2. Alterar estoque");
            System.out.println("3. Listar medicamentos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
        
            switch (opcao) {
                case 1:
                	adicionarMedicamento(scanner);
                break;
                
                case 2: 
                	atualizarEstoque(scanner);
                break;
                
                case 3:
                	listarMedicamentos();
                break;
                
                case 4:
                	System.out.println("Saindo... (⌒ω⌒)ﾉ");
                break;
                default: 
                	System.out.println("Opção inválida! (;;;*_*)");
            }
        } while (opcao != 4);
        
        scanner.close();
    }
}
