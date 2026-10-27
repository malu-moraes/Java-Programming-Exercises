package models;

public class Vilao extends Personagem {
	private String crimeMaisConhecido;
	private int numeroCrimes;

	public Vilao(String nome, String poder, String motivacao, String habilidadeEspecial, String crimeMaisConhecido, int numeroCrimes) {
		super(nome, poder, motivacao, habilidadeEspecial);
		if (numeroCrimes < 0) {
			throw new IllegalArgumentException("Erro: o número de crimes não pode ser menor que 0.");
		}
		this.crimeMaisConhecido = crimeMaisConhecido;
		this.numeroCrimes = numeroCrimes;
	}
	
	public String getCrimeMaisConhecido() {
		return crimeMaisConhecido;
	}

	public void setCrimeMaisConhecido(String crimeMaisConhecido) {
		this.crimeMaisConhecido = crimeMaisConhecido;
	}

	public int getNumeroCrimes() {
		return numeroCrimes;
	}

	public void setNumeroCrimes(int numeroCrimes) {
		this.numeroCrimes = numeroCrimes;
	}

	@Override
	public void infosPersonagem() {
		super.infosPersonagem();
		infosVilao();
	}
	
	public void infosVilao() {
		System.out.println("|Crime mais conhecido: " + getCrimeMaisConhecido() + "\n|Número de Crimes: " + getNumeroCrimes());
	}

}
