package com.example.GeradorNotaFiscalTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.Fatura.Fatura;
import com.example.NotaFiscal.NotaFiscal;
import com.example.NotaFiscal.NotaFiscalDAO.NotaFiscalDAO;
import com.example.SAP.SAP;
import com.example.SMTP.SMTP;

public class GeradorNotaFiscalTest {
    @Test
    public void testGerarNotaFiscalConsultoria() {
        Fatura fatura = new Fatura("Cliente Teste", "Endereço Teste", "CONSULTORIA", 1000.0);
        GeradorNotaFiscal geradorNf = new GeradorNotaFiscal(new NotaFiscalDAO(), new SAP(), new SMTP());

        NotaFiscal notaFiscal = geradorNf.gerarNotaFiscal(fatura);

        assertEquals("Cliente Teste", notaFiscal.getNomeCliente());
        assertEquals(1000.0, notaFiscal.getValor(), 0.01);
        assertEquals(250.0, notaFiscal.getValorImposto(), 0.01);
    }

    @Test
    public void testGerarNotaFiscalTreinamento() {
        Fatura fatura = new Fatura("Cliente Teste", "Endereço Teste", "TREINAMENTO", 1500.0);
        GeradorNotaFiscal geradorNf = new GeradorNotaFiscal(new NotaFiscalDAO(), new SAP(), new SMTP());

        NotaFiscal notaFiscal = geradorNf.gerarNotaFiscal(fatura);

        assertEquals("Cliente Teste", notaFiscal.getNomeCliente());
        assertEquals(1500.0, notaFiscal.getValor(), 0.01);
        assertEquals(225.0, notaFiscal.getValorImposto(), 0.01);
    }

    @Test
    public void testGerarNotaFiscalOutros() {
        Fatura fatura = new Fatura("Cliente Teste", "Endereço Teste", "OUTROS", 2000.0);
        GeradorNotaFiscal geradorNf = new GeradorNotaFiscal(new NotaFiscalDAO(), new SAP(), new SMTP());

        NotaFiscal notaFiscal = geradorNf.gerarNotaFiscal(fatura);

        assertEquals("Cliente Teste", notaFiscal.getNomeCliente());
        assertEquals(2000.0, notaFiscal.getValor(), 0.01);
        assertEquals(120.0, notaFiscal.getValorImposto(), 0.01);
    }
}
