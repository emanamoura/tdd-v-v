package com.example;

import static org.junit.Assert.assertTrue;

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
}
