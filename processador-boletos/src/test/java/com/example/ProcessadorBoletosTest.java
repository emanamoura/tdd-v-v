package com.example;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;

public class ProcessadorBoletosTest {
    @Test
    public void receberBoletos() {
        ProcessadorBoletos processadorBoletos = new ProcessadorBoletos();
        Boleto boleto1 = new Boleto();
        
        Boleto boletosRegistrados = processadorBoletos.registrarBoleto(boleto1);
        assertTrue("A saída deve ser do tipo Boleto", boletosRegistrados instanceof Boleto);
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
        ArrayList<Boleto> boletosRegistrados = new ArrayList<>();
        boletosRegistrados.add(processadorBoletos.registrarBoleto(boleto1));
        boletosRegistrados.add(processadorBoletos.registrarBoleto(boleto2));
        ArrayList<Pagamento> pagamentos = processadorBoletos.fazerPagamentos(boletosRegistrados);
        float valorTotal = 0.00f;
       
        for(int i = 0; i < pagamentos.size(); i++){
            valorTotal += pagamentos.get(i).getValorPago();
        }
       
        @SuppressWarnings("unused")
        Fatura fatura = processadorBoletos.gerarFatura(valorTotal, "João");
        @SuppressWarnings("unused")
        Fatura faturaTestandoParâmetros = new Fatura(new Date(), 0, "teste");
     }
}
