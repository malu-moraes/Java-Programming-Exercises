package models;

public class ContaCorrente extends Conta {
	private final double taxaMovimentacao = 8.50;

	public ContaCorrente(String cliente, String dataAbertura, double saldo) {
		super(cliente, dataAbertura, saldo);
	}

	@Override
	public void verSaldo() {
		if(getSaldo() >= taxaMovimentacao) {
			setSaldo(getSaldo() - taxaMovimentacao);
			System.out.println("Taxa de movimentação de R$" + taxaMovimentacao + " aplicada.");
			System.out.println("Seu saldo atual pós taxa de movimentação é de: R$" + getSaldo());
		} else {
			System.out.println("Seu saldo é insuficiente para aplicar a taxa de movimentação. ╮(￣_￣)╭");
		}
	}

	public double getTaxaMovimentacao() {
		return taxaMovimentacao;
	}
}
