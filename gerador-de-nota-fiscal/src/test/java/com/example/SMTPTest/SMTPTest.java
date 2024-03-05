package com.example.SMTPTest;

import org.junit.Test;
import com.example.NotaFiscal.NotaFiscal;
import com.example.SMTP.SMTP;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class SMTPTest {
    @Test
    public void instanciarSMTP() {
        SMTP smtp = new SMTP();
        assertEquals(smtp.getClass().getSimpleName(), "SMTP");
    }

    @Test
    public void testEnvia() {
        NotaFiscal notaFiscal = new NotaFiscal("Cliente Teste", 1000.0, 250.0);
        SMTP smtp = new SMTP();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        
        System.setOut(new PrintStream(outContent));

        smtp.envia(notaFiscal);

        String output = outContent.toString();
        assertTrue(output.contains("Enviando por e-mail"));
    }
}