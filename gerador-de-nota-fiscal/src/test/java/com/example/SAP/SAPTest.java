package com.example.SAP;

import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import com.example.NotaFiscal.NotaFiscal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Rule;

public class SAPTest {
    @Test
    public void instanciarSAP() {
        SAP sap = new SAP();
        assertEquals(sap.getClass().getSimpleName(), "SAP");
    }

    @Test
    public void testEnvia() {
        NotaFiscal notaFiscal = new NotaFiscal("Cliente Teste", 1000.0, 250.0);
        SAP sap = new SAP();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        sap.envia(notaFiscal);

        String output = outContent.toString();
        assertTrue(output.contains("Enviando pro SAP"));
    }
}