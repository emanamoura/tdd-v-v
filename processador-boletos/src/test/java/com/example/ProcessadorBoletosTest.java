package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

public class ProcessadorBoletosTest {
    @Test
    public void receberBoletos() {
        ProcessadorBoletos processadorBoletos = new ProcessadorBoletos();
        Boleto boleto1 = new Boleto();
        Boleto boleto2 = new Boleto();
        
        Boleto[] boletosRegistrados = processadorBoletos.registrarBoletos(boleto1, boleto2);
        assertTrue("A saída deve ser uma array de boletos", boletosRegistrados instanceof Boleto[]);
    }

    @Test
    public void boletosDadosValidos() {
        Date dataAtual = new Date();
        new Boleto(4, dataAtual, 500.00f);
    }

    @Test
    public void criarFatura() {
        ProcessadorBoletos processadorBoletos = new ProcessadorBoletos();
        Boleto boleto1 = new Boleto(1, new Date(), 100.00f);
        Boleto boleto2 = new Boleto(2, new Date(), 200.00f);

        Boleto[] boletosRegistrados = processadorBoletos.registrarBoletos(boleto1, boleto2);
        Pagamento[] pagamentos = processadorBoletos.fazerPagamentos(boletosRegistrados);
        float valorTotal = 0.00f;
       
        for(int i = 0; i < pagamentos.length; i++){
            valorTotal += pagamentos[i].getValorPago();
        }
       
        @SuppressWarnings("unused")
        Fatura fatura = processadorBoletos.gerarFatura(valorTotal, "João");
        @SuppressWarnings("unused")
        Fatura faturaTestandoParâmetros = new Fatura(new Date(), 0, "teste");
     }
}
