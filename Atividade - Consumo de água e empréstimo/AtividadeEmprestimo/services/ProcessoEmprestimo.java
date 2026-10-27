package services;

import models.Cliente;
import models.Emprestimo;

public class ProcessoEmprestimo {

	private boolean aprovado;
	private String mensagem;

	public ProcessoEmprestimo(boolean aprovado, String mensagem) {
		this.aprovado = aprovado;
		this.mensagem = mensagem;
	}

	public boolean foiAprovado() {
		return aprovado;
	}

	public String getMensagem() {
		return mensagem;
	}

	public ProcessoEmprestimo verificarAprovacao(Cliente cliente, double valorEmprestimo) {
		if (cliente.getIdade() < 18) {
			return new ProcessoEmprestimo(false, "Empréstimo negado!! O cliente precisa ter 18 anos ou mais. (￢_￢;)");
		}
		if (cliente.isEmprestimoPendente()) {
			return new ProcessoEmprestimo(false, "Empréstimo negado!! " + cliente.getNome() + " já possui empréstimos pendentes. (＃￣0￣)");
		}
		if (valorEmprestimo > 50000) {
			return new ProcessoEmprestimo(false, "Empréstimo negado!! O valor do empréstimo não pode ser maior que R$50.000,00. (・_・;)");
		}
		if (cliente.getRendaAnual() < (valorEmprestimo * 3)) {
			return new ProcessoEmprestimo(false, "Empréstimo negado!! " + cliente.getNome() + " tem renda anual insuficiente. (」＞＜)」");
		}
		if (valorEmprestimo > (cliente.getRendaAnual() * 0.3)) {
			return new ProcessoEmprestimo(false, "Empréstimo negado!! Valor excede 30% da renda anual de " + cliente.getNome() + ". (`ー´)");
		}
		return new ProcessoEmprestimo(true, "Empréstimo aprovado!!! ヽ(*⌒▽⌒*)ﾉ");
	}

	public ProcessoEmprestimo processarEmprestimo(Cliente cliente, double valorEmprestimo) {
		
			ProcessoEmprestimo resultado = verificarAprovacao(cliente, valorEmprestimo);
			Emprestimo emprestimo = new Emprestimo(cliente, valorEmprestimo);

		if (resultado.foiAprovado()) {
			emprestimo.setStatus("Aprovado");
			cliente.adicionarEmprestimo(emprestimo);
		} else {
			emprestimo.setStatus("Negado");
		}

		return resultado;
	}
}
