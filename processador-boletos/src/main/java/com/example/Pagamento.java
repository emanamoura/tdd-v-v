package com.example;

import java.util.Date;

public class Pagamento {
    private float valorPago;
    private Date data;
    private String tipoPagamento;

    public Pagamento() {
    }
    public Pagamento(float valorPago, Date data, String tipoPagamento) {
        this.valorPago = valorPago;
        this.data = data;
        this.tipoPagamento = tipoPagamento;
    }
    
    public float getValorPago() {
        return valorPago;
    }
    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getTipoPagamento() {
        return tipoPagamento;
    }
    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
