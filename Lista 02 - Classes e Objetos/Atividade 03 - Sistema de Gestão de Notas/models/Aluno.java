package models;

public class Aluno {
	private String nome;
	private String curso;
	private String matricula;
	private double nota1;
	private double nota2;

	public Aluno(String nome, String curso, String matricula, double nota1, double nota2) {
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double mediaAluno() {
		return (nota1 + nota2) / 2;
	}

	public String toString() {
		return "Aluno: " + nome + " | Curso: " + curso + " | Matrícula: " + matricula +
		       " | Nota1: " + nota1 + " | Nota2: " + nota2 + " | Média: " + mediaAluno();
	}
}
