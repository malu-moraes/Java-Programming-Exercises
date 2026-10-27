package models;

public class Emprestimo {

	private double valorEmprestimo;
	private String status;
	private Cliente cliente;
	
	public Emprestimo(Cliente cliente, double valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
		this.status = "Em análise";
		this.cliente = cliente;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getValorEmprestimo() {
		return valorEmprestimo;
	}

	public Cliente getCliente() {
		return cliente;
	}
}
