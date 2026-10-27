package main;
import models.DispositivoMonitoramento;
import models.EquipamentoEletrico;
import models.PlacaSolar;
import java.util.Scanner;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<PlacaSolar> placas = new ArrayList<>(); 
		
		System.out.println("--MONITORAMENTO DE PLACAS SOLARES (o*･ω･)ﾉ--\n");
		System.out.print("Quantas placas você deseja cadastrar?: ");
		int quantidade = scanner.nextInt();
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println("\nPlaca " + (i + 1) + ":");
			
			System.out.print("Digite a potência da placa: ");
			double potencia = scanner.nextDouble();
			scanner.nextLine(); 
			
			System.out.print("Digite o fabricante da placa: ");
			String fabricante = scanner.nextLine();
			
			EquipamentoEletrico equipamento = new EquipamentoEletrico(potencia, fabricante); 
			
			System.out.print("Sua placa tem algum sensor específico? ('true' para sim e 'false' para não): ");
			boolean resposta = scanner.nextBoolean();
			scanner.nextLine(); 

			DispositivoMonitoramento dispositivo = null; 
			if (resposta) {
				System.out.print("Digite o tipo de sensor: ");
				String tipoSensor = scanner.nextLine();
				dispositivo = new DispositivoMonitoramento(potencia, fabricante, tipoSensor); 
			}
			
			PlacaSolar placaSolar = new PlacaSolar(equipamento, dispositivo);
			placas.add(placaSolar); 
		}
		
		System.out.println("\n== PLACAS COM SENSORES ESPECÍFICOS (￣▽￣)==");
		for (PlacaSolar placa : placas) {
			if (placa.getDispositivo() != null) {
				System.out.println("Potência: " + placa.getEquipamento().getPotencia() + " | Fabricante: " 
					+ placa.getEquipamento().getFabricante() + " | Tipo de sensor: " 
					+ placa.getDispositivo().getTipoSensor());
			}
		}

		scanner.close(); 
	}
}
