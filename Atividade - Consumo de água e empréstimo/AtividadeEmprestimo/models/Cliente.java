package models;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nome;
	private int idade;
	private double rendaAnual;
	private boolean emprestimoPendente;
	private List<Emprestimo> emprestimosAprovados;
	
	public Cliente(String nome, int idade, double rendaAnual, boolean emprestimoPendente) {
		this.nome = nome;
		this.idade = idade;
		this.rendaAnual = rendaAnual;
		this.emprestimoPendente = emprestimoPendente;
		this.emprestimosAprovados = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}
	
	public boolean isEmprestimoPendente() {
        return emprestimoPendente;
    }

    public List<Emprestimo> getEmprestimosAprovados() {
        return emprestimosAprovados;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimosAprovados.add(emprestimo);
    }
}
