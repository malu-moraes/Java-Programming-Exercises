package models;

public class AlimentoOrganico extends Produto {
	private boolean certificado;

	public AlimentoOrganico(String nome, double preco, boolean certificado) {
		super(nome, preco);
		this.certificado = certificado;
	}

	public boolean isCertificado() {
		return certificado;
	}

	public void setCertificado(boolean certificado) {
		this.certificado = certificado;
	}
}
