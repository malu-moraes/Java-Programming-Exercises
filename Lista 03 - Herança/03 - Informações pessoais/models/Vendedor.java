package models;

public class Vendedor extends Empregado{
	private int qntdVenda;
	private double valorVenda;

	public Vendedor(String nome, int idade, char sexo, double salario, String matricula, int qntdVenda, double valorVenda) {
		super(nome, idade, sexo, salario, matricula);
		this.qntdVenda = qntdVenda;
		this.valorVenda = valorVenda;
	}

	public int getQntdVenda() {
		return qntdVenda;
	}

	public void setQntdVenda(int qntdVenda) {
		this.qntdVenda = qntdVenda;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	@Override
	public void obterInformacoesBasicas() {
		super.obterInformacoesBasicas();
		obterInfosVendedor();
	}
	
	public void obterInfosVendedor() {
		System.out.println("Quantidade de vendas: " + getQntdVenda() + " | Valor das venda: " + getValorVenda());
	}
	
	public void totalVenda() {
		double total = getQntdVenda() * getValorVenda();
		System.out.println("O total das vendas é: " + total);
	}

}
