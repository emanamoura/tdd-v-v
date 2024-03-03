package com.example;

import java.util.ArrayList;
import java.util.Date;

public class ProcessadorBoletos {
    public Boleto registrarBoleto(Boleto boleto){
        return boleto;
    }

    public ArrayList<Pagamento> fazerPagamentos(ArrayList<Boleto> boletos){
        ArrayList<Pagamento> pagamentos = new ArrayList<>();
        for(int i = 0; i < boletos.size(); i++){
            pagamentos.add(new Pagamento());
            pagamentos.get(i).setValorPago(boletos.get(i).getValorPago());
            pagamentos.get(i).setTipoPagamento("BOLETO");
            pagamentos.get(i).setData(new Date());
        }
        return pagamentos;
    }

    public Fatura gerarFatura(float valorTotal, String nomeCliente){
        Fatura fatura = new Fatura(new Date(), valorTotal, nomeCliente);
        return fatura;
    }
}