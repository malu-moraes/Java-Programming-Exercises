package models;

public class ContaPoupanca extends ContaBancaria {
	private final double taxaRendimento = 0.03;

	public ContaPoupanca(String numeroConta, String nomeTitular) {
		super(numeroConta, nomeTitular);
	}

	@Override
	public double calcularImposto() {
		return getSaldo() * taxaRendimento;
	}
	
	public void rendimentoAnual() {
		setSaldo(getSaldo() + getSaldo() * taxaRendimento);
	}

	@Override
	public String getTipoConta() {
		return "Conta poupança";
	}
}