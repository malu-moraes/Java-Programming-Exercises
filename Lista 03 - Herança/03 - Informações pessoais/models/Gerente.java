package models;

public class Gerente extends Empregado{
	private String nomeGerencia;
	
	public Gerente(String nome, int idade, char sexo, double salario, String matricula, String nomeGerencia) {
		super(nome, idade, sexo, salario, matricula);
		this.nomeGerencia = nomeGerencia;
		
	}
	
	public String getNomeGerencia() {
		return nomeGerencia;
	}

	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}

	@Override
	public void obterInformacoesBasicas() {
		super.obterInformacoesBasicas();
		obterInfosGerente();
	}
	
	public void obterInfosGerente() {
		System.out.println("Nome de gerencia: " + getNomeGerencia());
	}

}
