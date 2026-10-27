package models;

public class Conta {
	protected String cliente;
	protected String dataAbertura;
	protected double saldo;

	public Conta(String cliente, String dataAbertura, double saldo) {
		if(saldo < 0) {
			throw new IllegalArgumentException("Erro: O seu saldo não pode ser negativo para usar essa aplicação!!");
		}
		this.cliente = cliente;
		this.dataAbertura = dataAbertura;
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void saque(double valor) {
		if(valor <= 0) {
			System.out.println("O valor do saldo não pode ser menor que 0. ＼(º □ º )/");
		} else if(valor > saldo) {
			System.out.println("Erro: seu saldo é R$" + getSaldo() + " . Ou seja, é menor que o valor solicitado. (-_-)");
		} else {
			setSaldo(getSaldo() - valor);
			System.out.println("Seu saque no valor de R$" + valor + " foi realizado com sucesso! (>ᴗ•) Seu saldo atual é de: " + getSaldo());
		}
	}

	public void verSaldo() {
		System.out.println("Seu saldo é de: R$" + getSaldo());
	}

	public void deposito(double valor) {
		if(valor <= 0) {
			System.out.println("Erro: não é possível depositar menos que 0 reais. ＼(º □ º )/");
		} else {
			setSaldo(getSaldo() + valor);
			System.out.println("Seu depósito de R$" + valor + " foi realizado com sucesso! (>ᴗ•) Seu saldo atual é de: " + getSaldo());
		}
	}
}
