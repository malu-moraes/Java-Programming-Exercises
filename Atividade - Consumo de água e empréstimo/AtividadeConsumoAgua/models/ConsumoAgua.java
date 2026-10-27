package models;

public class ConsumoAgua {
	
	
    private String nome;
    private double consumoDiario;
    private double limiteDiario;

    public ConsumoAgua(String nome, double limiteDiario) {
        this.nome = nome;
        this.limiteDiario = limiteDiario;
        this.consumoDiario = 0; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getConsumoDiario() {
        return consumoDiario;
    }

    public void setConsumoDiario(double consumo) {
        if (consumo < 0) {
            System.out.println("Valor inválido!");
        } 
        
        else {
            this.consumoDiario = consumo;
        }
    }

    public double getLimiteDiario() {
        return limiteDiario;
    }

    public void setLimiteDiario(double limiteDiario) {
        if (limiteDiario >= 10) { 
            this.limiteDiario = limiteDiario;
        } else {
            System.out.println("Valor inválido! O limite mínimo de consumo é de 10 litros.");
        }
        }
}