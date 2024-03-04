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
}
