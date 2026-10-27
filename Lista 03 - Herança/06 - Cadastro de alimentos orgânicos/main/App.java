package main;
import models.Produto;
import models.AlimentoOrganico;
import java.util.Scanner;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<>();
		
		System.out.println("--CADASTRO DE PRODUTOS (＞＜)--");
		System.out.println("Você vai inserir 5 produtos.\n");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Produto " + (i+1));
			
			System.out.println("Nome do produto: ");
			String nome = scanner.nextLine();
			
			System.out.println("Preço do produto: ");
			double preco = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.println("É um alimento orgânico: ('true' para sim e 'false' para não)");
			boolean certificado = scanner.nextBoolean();
			scanner.nextLine();
			
			if (certificado) {
				produtos.add(new AlimentoOrganico(nome, preco, true));
			} else {
				produtos.add(new Produto(nome, preco));
			}
		}
		
		System.out.println("\n=== ALIMENTOS ORGÂNICOS CERTIFICADOS (｡•̀ᴗ-)✧===");
		for (Produto p : produtos) {
			if (p.getClass() == AlimentoOrganico.class) {
				AlimentoOrganico ao = (AlimentoOrganico) p;
				if (ao.isCertificado()) {
					System.out.println("Nome: " + ao.getNome() + " | Preço: R$ " + ao.getPreco());
				}
			}
		}
		scanner.close();
	}
}
