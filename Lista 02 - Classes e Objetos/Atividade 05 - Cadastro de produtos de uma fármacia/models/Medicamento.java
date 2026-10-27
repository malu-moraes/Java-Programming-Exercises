package models;

public class Medicamento {
    private String codBarras;
    private String nome;
    private String descricao;
    private String laboratorio;
    private double precoCusto;
    private double precoVenda;
    private boolean medControlado;
    private int quantEstoque;
    
    public Medicamento(String codBarras, String nome, String descricao, String laboratorio, double precoCusto, 
                       boolean medControlado, int quantEstoque) {
        this.codBarras = codBarras;
        this.nome = nome;
        this.descricao = descricao;
        this.laboratorio = laboratorio;
        this.precoCusto = Math.max(precoCusto, 0);
        this.medControlado = medControlado;
        this.quantEstoque = Math.max(quantEstoque, 0);
        this.precoVenda = (precoCusto + (precoCusto * 0.33));
    }

    public String getCodBarras() { 
    	return codBarras; 
    }
    
    public String getNome() { 
    	return nome; 
    }
    
    public String getDescricao() { 
    	return descricao; 
    }
    
    public String getLaboratorio() { 
    	return laboratorio; 
    }
    
    public double getPrecoCusto() { 
    	return precoCusto; 
    }
    
    public boolean isMedControlado() { 
    	return medControlado; 
    }
    
    public int getQuantEstoque() { 
    	return quantEstoque; 
    }
    public double getPrecoVenda() { 
    	return precoVenda; 
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
    
    public String exibirInformacoes() {
        return "Código de Barras: " + codBarras +
               "\nNome: " + nome +
               "\nDescrição: " + descricao +
               "\nLaboratório: " + laboratorio +
               "\nPreço de Custo: R$ " + precoCusto +
               "\nPreço de Venda: R$ " + precoVenda +
               "\nControlado: " + (medControlado ? "Sim" : "Não") +
               "\nEstoque: " + quantEstoque;
    }
}