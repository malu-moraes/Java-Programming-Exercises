package models;

public class Poupanca extends Conta {
	private double rendimentoMensal;

	public Poupanca(String cliente, String dataAbertura, double saldo, double rendimentoMensal) {
		super(cliente, dataAbertura, saldo);
		this.rendimentoMensal = rendimentoMensal;
	}

	public void calcularRendimentoMensal() {
		double rendimento = getSaldo() * (rendimentoMensal / 100);
		setSaldo(getSaldo() + rendimento);
		System.out.println("Seu rendimento mensal é de: R$" + rendimento);
		System.out.println("Seu saldo após o rendimento é de: R$" + getSaldo());
	}

	public double getRendimentoMensal() {
		return rendimentoMensal;
	}

	public void setRendimentoMensal(double rendimentoMensal) {
		this.rendimentoMensal = rendimentoMensal;
	}
}
