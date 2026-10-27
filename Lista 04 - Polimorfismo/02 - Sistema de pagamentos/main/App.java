package main;
import models.Empregado;
import models.EmpregadoHorista;
import models.EmpregadoComissionado;
import models.EmpregadoAssalariado;


public class App {

	public static void main(String[] args) {
		Empregado[] empregados = new Empregado[6];
		
		empregados[0] = new EmpregadoHorista("Murilo", 9000, 4, 300);
		empregados[1] = new EmpregadoHorista("Maria", 5000, 6, 100);
		
		empregados[2] = new EmpregadoComissionado("Emanuelly", 5000, 2000, 0.33);
		empregados[3] = new EmpregadoComissionado("Alex", 8000, 1500, 0.6);
		
		empregados[4] = new EmpregadoAssalariado("Lucas", 1500);
		empregados[5] = new EmpregadoAssalariado("Paulão", 1345);
		
		System.out.println("--DETALHES DOS EMPREGADOS (￣▽￣)--");
		for(Empregado e : empregados) {
			e.exibirDetalhes();
		}
		
		double totalSalarios = 0;
		
		System.out.println("--PAGAMENTO DOS EMPREGADOS ＼(＾▽＾)／--");
		for(Empregado e : empregados) {
			System.out.println("Nome: " + e.getNome());
			System.out.println("Tipo: " + e.getTipo());
			double salario = e.calcularSalario();
			System.out.println("Salário: " + salario);
			System.out.println("------------------|ω･)ﾉ");
			totalSalarios += salario;
		}
		System.out.println("O total dos salários a serem pagos pela empresa: R$" + totalSalarios + " (╯✧▽✧)╯");

	}

}
