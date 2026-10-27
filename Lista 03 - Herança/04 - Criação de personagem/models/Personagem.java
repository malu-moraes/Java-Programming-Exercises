package models;

public class Personagem {
	private String nome;
	private String poder;
	private String motivacao;
	private String habilidadeEspecial;
	
	public Personagem(String nome, String poder, String motivacao, String habilidadeEspecial) {
		this.nome = nome;
		this.poder = poder;
		this.motivacao = motivacao;
		this.habilidadeEspecial = habilidadeEspecial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	public String getMotivacao() {
		return motivacao;
	}

	public void setMotivacao(String motivacao) {
		this.motivacao = motivacao;
	}
	
	public String getHabilidadeEspecial() {
		return habilidadeEspecial;
	}

	public void setHabilidadeEspecial(String habilidadeEspecial) {
		this.habilidadeEspecial = habilidadeEspecial;
	}

	public void infosPersonagem() {
		System.out.println("|Nome: " + getNome() + "\n|Poder: " + getPoder() + "\n|Qual a motivação?: " + getMotivacao() +
				"\n|Habilidade Especial: " + getHabilidadeEspecial());
		}
	

}
