package models;

public class PlacaSolar {
	private EquipamentoEletrico equipamento;
	private DispositivoMonitoramento dispositivo;
	
	public PlacaSolar(EquipamentoEletrico equipamento, DispositivoMonitoramento dispositivo) {
		this.equipamento = equipamento;
		this.dispositivo = dispositivo;
	}

	public EquipamentoEletrico getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(EquipamentoEletrico equipamento) {
		this.equipamento = equipamento;
	}

	public DispositivoMonitoramento getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(DispositivoMonitoramento dispositivo) {
		this.dispositivo = dispositivo;
	}
	

}
