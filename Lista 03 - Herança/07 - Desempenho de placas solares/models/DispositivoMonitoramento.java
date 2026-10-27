package models;

public class DispositivoMonitoramento extends EquipamentoEletrico {
	private String tipoSensor;

	public DispositivoMonitoramento(double potencia, String fabricante, String tipoSensor) {
		super(potencia, fabricante);
		this.tipoSensor = tipoSensor;	
	}

	public String getTipoSensor() {
		return tipoSensor;
	}

	public void setTipoSensor(String tipoSensor) {
		this.tipoSensor = tipoSensor;
	}
	
}
