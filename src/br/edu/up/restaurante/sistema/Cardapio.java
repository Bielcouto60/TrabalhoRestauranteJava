package br.edu.up.restaurante.sistema;

public class Cardapio {

    private Double preco;
    private String entrada;
    private String corteDeCarnes;
    private String acompanhamento;
    private String sobremesas;
    private String bebida;

    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public String getEntrada() {
        return entrada;
    }
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }
    public String getCorteDeCarnes() {
        return corteDeCarnes;
    }
    public void setCorteDeCarnes(String corteDeCarnes) {
        this.corteDeCarnes = corteDeCarnes;
    }
    public String getAcompanhamento() {
        return acompanhamento;
    }
    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }
    public String getSobremesas() {
        return sobremesas;
    }
    public void setSobremesas(String sobremesas) {
        this.sobremesas = sobremesas;
    }
    public String getBebida() {
        return bebida;
    }
    public void setBebida(String bebida) {
        this.bebida = bebida;
    }
}
