package br.com.rendimento;

public class Rendimento {
    private double investimentoInicial, taxaInvestimentos;
    private int numeroDemeses;

    public Rendimento(double investimentoInicial, double taxaInvestimentos, int numeroDemeses) {
        this.investimentoInicial = investimentoInicial;
        this.taxaInvestimentos = taxaInvestimentos;
        this.numeroDemeses = numeroDemeses;
    }
}
