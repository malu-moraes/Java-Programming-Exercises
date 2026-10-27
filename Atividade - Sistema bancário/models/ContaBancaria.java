package models;

public abstract class ContaBancaria implements Imposto {
	private String numeroConta;
	private String nomeTitular;
	private double saldo;

	public ContaBancaria(String numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = 0;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
		} else {
			System.out.println("Valor de depósito inválido. (＞﹏＜)");
		}
	}

	public void sacar(double valor) throws IllegalArgumentException {
		if (valor > saldo) {
			throw new IllegalArgumentException("Saldo insuficiente para saque. (￣ヘ￣)");
		}
		saldo -= valor;
	}

	public boolean transferir(ContaBancaria destino, double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor da transferência deve ser positivo. (＃`Д´)");
		}
		if (this.saldo < valor) {
			throw new IllegalArgumentException("Saldo insuficiente para transferência. (＃￣0￣)");
		}
		this.sacar(valor);
		destino.depositar(valor);
		return true;
	}

	public abstract String getTipoConta();

	public void exibirDetalhes() {
		System.out.println("Tipo de conta: " + getTipoConta());
		System.out.println("Número da conta: " + getNumeroConta());
		System.out.println("Titular da conta: " + getNomeTitular());
		System.out.println("Saldo: " + getSaldo());
	}
}