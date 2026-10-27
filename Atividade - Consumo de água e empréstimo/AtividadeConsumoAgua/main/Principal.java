package main;

import models.ConsumoAgua;
import services.RelatorioAgua;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--CONSULTANDO SEU CONSUMO DE ÁGUA (o´▽`o)ﾉ--");
        System.out.print("Digite seu nome de usuário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu consumo diário de água (em litros): ");
        double consumo = scanner.nextDouble();
        System.out.print("Digite seu limite diário de consumo (em litros): ");
        double limite = scanner.nextDouble();

        ConsumoAgua usuario = new ConsumoAgua(nome, limite);
        usuario.setConsumoDiario(consumo);

        RelatorioAgua.emitirRelatorio(usuario);
        scanner.close();
    }
}