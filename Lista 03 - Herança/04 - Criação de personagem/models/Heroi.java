package models;

public class Heroi extends Personagem {
	private String atoHeroismo;
	private int numeroResgates;
	
	public Heroi(String nome, String poder, String motivacao, String habilidadeEspecial, String atoHeroismo, int numeroResgates) {
		super(nome, poder, motivacao, habilidadeEspecial);
		if (numeroResgates < 0) {
			throw new IllegalArgumentException("Erro: o número de resgates não pode ser menor que 0.");
		}
		this.atoHeroismo = atoHeroismo;
		this.numeroResgates = numeroResgates;
	}
	
	public String getAtoHeroismo() {
		return atoHeroismo;
	}

	public void setAtoHeroismo(String atoHeroismo) {
		this.atoHeroismo = atoHeroismo;
	}

	public int getNumeroResgates() {
		return numeroResgates;
	}

	public void setNumeroResgates(int numeroResgates) {
		this.numeroResgates = numeroResgates;
	}

	@Override 
	public void infosPersonagem() {
		super.infosPersonagem();
		infosHeroi();
	}
	
	public void infosHeroi() {
		System.out.println("|Ato de heroísmo: " + getAtoHeroismo() + "\n|Número de Resgates: " + getNumeroResgates());
	}
	


}
