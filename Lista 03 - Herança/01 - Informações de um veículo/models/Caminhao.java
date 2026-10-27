package models;

public class Caminhao extends Veiculo{
	protected double tonelada;
	protected double alturaMax;
	protected double comprimento;

	public Caminhao(double peso, double velocidadeMax, double preco, double tonelada, double alturaMax, double comprimento) {
		super(peso, velocidadeMax, preco);
		this.tonelada = tonelada;
		this.alturaMax = alturaMax;
		this.comprimento = comprimento;
	}
	
	@Override
	public void obterInfosBasicas() {
		super.obterInfosBasicas();
		obterInfosCaminhao();
	}
	
	public void obterInfosCaminhao() {
		System.out.println("Tonelada: " + tonelada + " | Altura Máxima: " + alturaMax +" | Comprimento: " + comprimento);
	}
	
	public double getTonelada() {
		return tonelada;
	}
	public void setTonelada(double tonelada) {
		this.tonelada = tonelada;
	}
	public double getAlturaMax() {
		return alturaMax;
	}
	public void setAlturaMax(double alturaMax) {
		this.alturaMax = alturaMax;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
}
