package models;

public class EmpregadoComissionado extends Empregado{
	private double vendas;
	private double percentualComissao;

	public EmpregadoComissionado(String nome, double salarioBase, double vendas, double percentualComissao) {
		super(nome, salarioBase);
		this.vendas = vendas;
		this.percentualComissao = percentualComissao;
	}

	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}

	public double getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

	@Override
	public double calcularSalario() {
		double comissao = vendas * percentualComissao;
		double salario = getSalarioBase() + comissao;
		return salario;
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		salarioComissionado();
	}
	
	public void salarioComissionado() {
		System.out.println("Salário: " + calcularSalario());
	}
	
	@Override
	public String getTipo() {
		return "Empregado comissionado";
	}

}
