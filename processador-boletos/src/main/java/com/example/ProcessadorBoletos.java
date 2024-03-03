package com.example;

import java.util.Date;

public class ProcessadorBoletos {
    public Boleto[] registrarBoletos(Boleto... boletos){
        return boletos;
    }

    public Fatura gerarFatura(String nomeCliente, Boleto... boletos){
        float pagamentos[] = new float[boletos.length];
        float valorTotal = 0.00f;

        for(int i = 0; i < boletos.length; i++){
            pagamentos[i] = boletos[i].getValorPago();
            valorTotal += pagamentos[i];
        }
        
        Fatura fatura = new Fatura(new Date(), valorTotal, nomeCliente);
        return fatura;
    }
}