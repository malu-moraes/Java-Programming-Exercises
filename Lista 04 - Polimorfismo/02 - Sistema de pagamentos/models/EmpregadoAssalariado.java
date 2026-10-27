package models;

public class EmpregadoAssalariado extends Empregado{

	public EmpregadoAssalariado(String nome, double salarioBase) {
		super(nome, salarioBase);
	}

	@Override
	public double calcularSalario() {
		return getSalarioBase();
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		salarioAssalariado();
	}
	
	public void salarioAssalariado() {
		System.out.println("Salário: " + calcularSalario());
	}
	
	@Override
	public String getTipo() {
		return "Empregado assalariado";
	}

}
