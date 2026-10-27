package models;

public class CarroPasseio extends Veiculo {
	protected String marca;
	protected String cor;
	
	public CarroPasseio(double peso, double velocidadeMax, double preco, String marca, String cor) {
		super(peso, velocidadeMax, preco);
		this.marca = marca;
		this.cor = cor;
		
	}
	@Override
	public void obterInfosBasicas() {
		super.obterInfosBasicas();
		obterInfosCarro();
	}
	
	public void obterInfosCarro() {
		System.out.println("Marca: " + marca + " | Cor: " + cor);
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
