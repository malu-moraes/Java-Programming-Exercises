package main;
import service.Musica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Playlist {
	private String nomePlaylist;
	private List<Musica> musicas;

	public Playlist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
		this.musicas = new ArrayList<>();
	}

	public String getNomePlaylist() {
		return nomePlaylist;
	}

	public void setNomePlaylist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}

	public List<Musica> getMusicas() {
		return musicas;
	}

	public void adicionarMusica(Musica musica) {
		musicas.add(musica);
	}

	public void removerMusica(String nomeMusica) {
		for (int i = 0; i < musicas.size(); i++) {
			if (musicas.get(i).getNomeMusica().equalsIgnoreCase(nomeMusica)) {
				musicas.remove(i);
				return; 
			}
		}
		System.out.println("Música não encontrada na playlist. (｡•́︿•̀｡)・・・");
	}

	public void exibirPlaylist() {
		System.out.println("Playlist: " + nomePlaylist + " | Quantidade de músicas: " + musicas.size());
		System.out.println("----------------------------- (´｡• ω •｡`)");
		if (musicas.isEmpty()) {
			System.out.println("A playlist está vazia. (・・ )");
		} else {
			for (Musica musica : musicas) {
				System.out.println(musica);
				System.out.println("----------------------------- ヽ(>∀<☆)ノ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome da sua playlist:");
		String nomePlaylist = scanner.nextLine();
		Playlist playlist = new Playlist(nomePlaylist);

		int opcao;
		do {
			System.out.println("\n--GERENCIAMENTO DA PLAYLIST ( ´ ▽ ` )--");
			System.out.println("1. Adicionar música.");
			System.out.println("2. Ver playlist.");
			System.out.println("3. Remover música.");
			System.out.println("4. Sair.");
			System.out.print("Selecione uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
				case 1:
					System.out.print("Nome da música: ");
					String nomeMusica = scanner.nextLine();
					System.out.print("Artista: ");
					String artista = scanner.nextLine();
					System.out.print("Duração: ");
					String duracao = scanner.nextLine();
					playlist.adicionarMusica(new Musica(nomeMusica, artista, duracao));
					System.out.println(nomeMusica + " foi adicionada na playlist! ☆ ～('▽^人)");
					break;
				
				case 2:
					playlist.exibirPlaylist();
					break;
				
				case 3:
					System.out.print("Digite o nome da música para remover: ");
					String nomeRemover = scanner.nextLine();
					playlist.removerMusica(nomeRemover);
					System.out.println("Música removida se existia na playlist.");
					break;
				
				case 4:
					System.out.println("Saindo do programa... (⌒ω⌒)ﾉ");
					break;
				
				default:
					System.out.println("Opção inválida, tente novamente. (*_ _)");
			}
		} while (opcao != 4);

		scanner.close();
	}
}
