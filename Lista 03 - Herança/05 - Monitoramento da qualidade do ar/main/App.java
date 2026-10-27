package main;
import models.EstacaoMonitoramento;
import models.IndiceQualidade;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<EstacaoMonitoramento> locais = new ArrayList<>();
		
		System.out.println("--MONITORAMENTO DA QUALIDADE DO AR (b ᵔ▽ᵔ)b--\n");
		
		System.out.println("Digite o nome da cidade que você irá monitorar:");
		String cidade = scanner.nextLine();

		System.out.println("Quantas localizações deseja cadastrar?");
		int quantidade = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < quantidade; i++) {
			System.out.println("\nLocal " + (i + 1));

			System.out.print("Localização da cidade: ");
			String localizacao = scanner.nextLine();

			System.out.print("Índice de Qualidade do Ar (0 a 10): ");
			int indice = scanner.nextInt();
			scanner.nextLine(); 

			EstacaoMonitoramento local = new EstacaoMonitoramento(localizacao, indice);
			locais.add(local);
		}

		IndiceQualidade indice = new IndiceQualidade("", 0, cidade);
		System.out.println("\n--- Média da Qualidade do Ar em " + cidade + " (0 a 10) ---");
		indice.exibirMedia(locais);

		scanner.close();
	}
}
