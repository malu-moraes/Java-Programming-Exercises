package models;

public class EmpregadoHorista extends Empregado{
	private int horasTrabalhadas;
	private double valorHora;

	public EmpregadoHorista(String nome, double salarioBase, int horasTrabalhadas, double valorHora) {
		super(nome, salarioBase);
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public double calcularSalario() {
		double salario = horasTrabalhadas * valorHora;
		return salario;
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		salarioHorista();
	}
	
	public void salarioHorista() {
		System.out.println("Salário: " + calcularSalario());
	}
	
	@Override
	public String getTipo() {
		return "Empregado horista";
	}

}
