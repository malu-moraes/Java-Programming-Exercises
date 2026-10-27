package models;
import java.util.List;
import java.util.ArrayList;

public class Tarefa {
	private String tituloTarefa;
	private String descricao;
	private boolean concluida;
	private List<Tarefa> tarefas;
	private List<Tarefa> tarefaPendente;
	private List<Tarefa> tarefaConcluida;

	public Tarefa(String tituloTarefa, String descricao, boolean concluida) {
		this.tituloTarefa = tituloTarefa;
		this.descricao = descricao;
		this.concluida = false;
		this.tarefas = new ArrayList<>();
		this.tarefaPendente = new ArrayList<>();
		this.tarefaConcluida = new ArrayList<>();
	}

	public String getTituloTarefa() {
		return tituloTarefa;
	}

	public void setTituloTarefa(String tituloTarefa) {
		this.tituloTarefa = tituloTarefa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

	public List<Tarefa> getTarefaPendente() {
		return tarefaPendente;
	}

	public void setTarefaPendente(List<Tarefa> tarefaPendente) {
		this.tarefaPendente = tarefaPendente;
	}

	public List<Tarefa> getTarefaConcluida() {
		return tarefaConcluida;
	}

	public void setTarefaConcluida(List<Tarefa> tarefaConcluida) {
		this.tarefaConcluida = tarefaConcluida;
	}

	public void adicionarTarefa(Tarefa tarefa) {
		tarefas.add(tarefa);
		if(tarefa.isConcluida()) {
			tarefaConcluida.add(tarefa);
		} else {
			tarefaPendente.add(tarefa);
		}
	}

	public void mudarStatus(Tarefa tarefa) {
		for (Tarefa tarefa1 : tarefas) {
			if (tarefa1.getTituloTarefa().equalsIgnoreCase(tarefa.getTituloTarefa())) {
				tarefa1.setConcluida(!tarefa1.isConcluida());
				tarefaPendente.remove(tarefa1);
				tarefaConcluida.remove(tarefa1);

				if (tarefa1.isConcluida()) {
					tarefaConcluida.add(tarefa1);
				} else {
					tarefaPendente.add(tarefa1);
				}

				System.out.println("Status da tarefa: '" + tarefa1.getTituloTarefa() + "' foi alterado para '" + 
						(tarefa1.isConcluida() ? "Concluído" : "Pendente") + "'. (>ᴗ•)");
				return;
			}
		}
		System.out.println("Tarefa não encontrada. (￣ω￣;)");
    }

	public void apagarTarefa(Tarefa tarefa) {
		Tarefa tarefaParaRemover = null;
		for (Tarefa tarefa1 : tarefas) {
			if (tarefa1.getTituloTarefa().equalsIgnoreCase(tarefa.getTituloTarefa())) {
				tarefaParaRemover = tarefa1;
				break;
			}
		}
		if (tarefaParaRemover != null) {
			tarefas.remove(tarefaParaRemover);
			tarefaPendente.remove(tarefaParaRemover);
			tarefaConcluida.remove(tarefaParaRemover);
			System.out.println("Tarefa: '" + tarefa.getTituloTarefa() + "' foi removida com sucesso. ヽ(°〇°)ﾉ");
		} else {
			System.out.println("Tarefa não encontrada. (-_-;)");
		}
	}
}