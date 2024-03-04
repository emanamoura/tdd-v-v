package com.example.NotaFiscalTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.example.NotaFiscal.NotaFiscal;
import com.example.NotaFiscal.NotaFiscalDAO.NotaFiscalDAO;
import com.example.SAP.SAP;

public class NotaFiscalDaoTest {
    @Test
    public void instanciarNotaFiscalDAO() {
        NotaFiscalDAO notaFiscalDAO = new NotaFiscalDAO();
        assertEquals(notaFiscalDAO.getClass().getSimpleName(), "NotaFiscalDAO");
    }

    @Test
    public void testEnvia() {
        NotaFiscal notaFiscal = new NotaFiscal("Cliente Teste", 1000.0, 250.0);
        NotaFiscalDAO notaFiscalDAO = new NotaFiscalDAO();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        
        System.setOut(new PrintStream(outContent));

        notaFiscalDAO.salva(notaFiscal);

        String output = outContent.toString();
        assertTrue(output.contains("Salvando no banco"));
    }
}
