package service;

public class Musica {
	private String nomeMusica;
	private String artista;
	private String duracao;

	public Musica(String nomeMusica, String artista, String duracao) {
		this.nomeMusica = nomeMusica;
		this.artista = artista;
		this.duracao = duracao;
	}

	public String getNomeMusica() {
		return nomeMusica;
	}

	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String toString() {
		return "Música: " + nomeMusica + " | Artista: " + artista + " | Duração: " + duracao;
	}
}
