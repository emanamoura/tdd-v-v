package com.example;

import java.util.Date;

public class ProcessadorBoletos {
    public Boleto[] registrarBoletos(Boleto... boletos){
        return boletos;
    }

    public Pagamento[] fazerPagamentos(Boleto... boletos){
        Pagamento[] pagamentos = new Pagamento[boletos.length];
        for(int i = 0; i < boletos.length; i++){
            pagamentos[i] = new Pagamento();
            pagamentos[i].setValorPago(boletos[i].getValorPago());
            pagamentos[i].setTipoPagamento("BOLETO");
            pagamentos[i].setData(new Date());
        }
        return pagamentos;
    }

    public Fatura gerarFatura(float valorTotal, String nomeCliente){
        Fatura fatura = new Fatura(new Date(), valorTotal, nomeCliente);
        return fatura;
    }
}