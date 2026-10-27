package models;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private String cpf;
	private List<ContaBancaria> contas;

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<ContaBancaria> getContas() {
		return contas;
	}

	public void setContas(List<ContaBancaria> contas) {
		this.contas = contas;
	}

	public void adicionarConta(ContaBancaria conta) {
		contas.add(conta);
	}

	public ContaBancaria buscarPorNumero(String numeroConta) throws IllegalArgumentException {
		for (ContaBancaria conta : contas) {
			if (conta.getNumeroConta().equals(numeroConta)) {
				return conta;
			}
		}
		throw new IllegalArgumentException("Conta com número " + numeroConta + " não encontrada. Σ(￣。￣ﾉ)");
	}

	public void listarContas() {
		for (ContaBancaria conta : contas) {
			conta.exibirDetalhes();
			System.out.println("-------------(ﾉ>ω<)ﾉ :｡･:*:･ﾟ’★");
		}
	}
}