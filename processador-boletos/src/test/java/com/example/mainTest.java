package com.example;

import org.junit.Test;

public class mainTest {
    @Test
    public void testandoVariaveis(){
        main testeMain = new main();
        testeMain.getBoletos();
        testeMain.getPagamentos();
        testeMain.getFaturas();
    }

}
