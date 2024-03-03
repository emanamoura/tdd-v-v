package com.example;

import java.util.Date;

public class Fatura {
    private Date data;
    private float valorTotal;
    private String nomeCliente;

    public Fatura(Date data, float valorTotal, String nomeCliente) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
    }
    public Fatura() {
    }

    public Date getData() {
        return this.data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public float getValorTotal() {
        return this.valorTotal;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public String getNomeCliente() {
        return this.nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
