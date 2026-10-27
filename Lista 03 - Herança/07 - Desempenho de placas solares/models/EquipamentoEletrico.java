package models;

public class EquipamentoEletrico {
	private double potencia;
	private String fabricante;
	
	public EquipamentoEletrico(double potencia, String fabricante) {
		this.potencia = potencia;
		this.fabricante = fabricante;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	

}
