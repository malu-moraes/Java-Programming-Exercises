package models;

public class Empregado extends Pessoa{
	private double salario;
	private String matricula;

	public Empregado(String nome, int idade, char sexo, double salario, String matricula) {
		super(nome, idade, sexo);
		this.salario = salario;
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public void obterInformacoesBasicas() {
		super.obterInformacoesBasicas();
		obterInfosEmpregado();
	}
	
	public void obterInfosEmpregado() {
		System.out.println("Salário: " + getSalario() + " | Matrícula: " + getMatricula());
	}
	
	public void valorINSS() {
		double valorINSS = getSalario() * 0.11;
		double INSS = getSalario() - valorINSS;
		System.out.println("O valor do seu desconto do INSS é: " + valorINSS + " | Seu salário com o desconto do INSS é: " + INSS);
	}
}
