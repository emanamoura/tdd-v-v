package com.example.NotaFiscal;

public class NotaFiscal {
    private String nomeCliente;
    private double valor;
    private double valorImposto;

    public NotaFiscal(String nomeCliente, double valor, double valorImposto) {
        this.nomeCliente = nomeCliente;
        this.valor = valor;
        this.valorImposto = valorImposto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getValor() {
        return valor;
    }

    public double getValorImposto() {
        return valorImposto;
    }
}
