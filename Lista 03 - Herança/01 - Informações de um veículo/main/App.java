package main;
import java.util.Scanner;
import models.CarroPasseio;
import models.Caminhao;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int resposta;
		do {
	System.out.println("Seu veículo é um carro(1) ou caminhão(2)?");
	resposta = scanner.nextInt();
	
		if(resposta == 1) {
			
			CarroPasseio carro = new CarroPasseio(0, 0, 0, "marca", "cor");
			System.out.println("Digite o peso do seu carro: ");
			carro.setPeso(scanner.nextDouble());
			System.out.println("Digite a velocidade máxima do seu carro: ");
			carro.setVelocidadeMax(scanner.nextDouble());
			System.out.println("Digite o preço do seu carro: ");
			carro.setPreco(scanner.nextDouble());
			scanner.nextLine();
			System.out.println("Digite a marca do seu carro: ");
			carro.setMarca(scanner.nextLine());
			System.out.println("Digite a cor do seu carro: ");
			carro.setCor(scanner.nextLine());
			carro.obterInfosBasicas();
			
		} else if(resposta == 2) {
			
			Caminhao caminhao = new Caminhao(0, 0, 0, 0, 0, 0);
			System.out.println("Digite o peso do seu caminhão: ");
			caminhao.setPeso(scanner.nextDouble());
			System.out.println("Digite a velocidade máxima do seu caminhão: ");
			caminhao.setVelocidadeMax(scanner.nextDouble());
			System.out.println("Digite o preço do seu caminhão: ");
			caminhao.setPreco(scanner.nextDouble());
			System.out.println("Digite a(s) tonelada(s) do seu caminhão: ");
			caminhao.setTonelada(scanner.nextDouble());
			System.out.println("Digite a altura máxima do seu caminhão: ");
			caminhao.setAlturaMax(scanner.nextDouble());
			System.out.println("Digite o comprimento do seu caminhão: ");
			caminhao.setComprimento(scanner.nextDouble());
			caminhao.obterInfosBasicas();
			
		} else {
			System.out.println("Veículo inválido. Por favor, insira apenas carro ou caminhão. ヾ(`ヘ´)ﾉﾞ");
		} 
		} while(resposta !=1 && resposta !=2);
		scanner.close();
	
	}

}
