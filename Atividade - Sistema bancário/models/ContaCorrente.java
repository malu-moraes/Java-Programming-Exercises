package models;

public class ContaCorrente extends ContaBancaria {
	private final double tarifaMensal = 8;

	public ContaCorrente(String numeroConta, String nomeTitular) {
		super(numeroConta, nomeTitular);
	}
	
	@Override
	public double calcularImposto() {
		return tarifaMensal;
	}

	@Override
	public String getTipoConta() {
		return "Conta corrente";
	}
}