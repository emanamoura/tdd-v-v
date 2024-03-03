package com.example;

import java.util.Date;

public class Boleto {
    public Boleto(){}
    public Boleto(int codigo, Date data, float valorPago) {
        this.codigo = codigo;
        this.data = data;
        this.valorPago = valorPago;
    }
    

    private int codigo;
    private Date data;
    private float valorPago;


    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public float getValorPago() {
        return valorPago;
    }
    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    
}
