package com.example;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;

public class FaturaTest {
    @Test
    public void instanciarFatura() {
        Fatura fatura = new Fatura("Cliente Teste", "Endereço Teste", "CONSULTORIA", 1000.0);
    }

   
}
