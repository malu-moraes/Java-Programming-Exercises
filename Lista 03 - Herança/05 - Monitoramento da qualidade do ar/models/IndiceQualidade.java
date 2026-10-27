package models;
import java.util.ArrayList;

public class IndiceQualidade extends EstacaoMonitoramento {
	private String cidade;
	
	public IndiceQualidade(String localizacao, int indiceQualidadeAr, String cidade) {
		super(localizacao, indiceQualidadeAr);
		this.cidade = cidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void exibirMedia(ArrayList<EstacaoMonitoramento> locais) {
		if (locais == null || locais.isEmpty()) {
			System.out.println("Nenhuma localização cadastrada. ┐( ˘_˘ )┌");
			return;
		}
		int soma = 0;
		for (EstacaoMonitoramento local : locais) {
			soma += local.getIndiceQualidadeAr();
		}
		double media = soma / (double) locais.size();
		System.out.println("Média do índice de qualidade do ar da cidade: " + media);
	}
}
