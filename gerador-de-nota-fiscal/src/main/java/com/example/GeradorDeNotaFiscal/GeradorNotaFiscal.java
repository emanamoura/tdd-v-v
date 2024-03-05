package com.example.GeradorDeNotaFiscal;

import com.example.Fatura.Fatura;
import com.example.NotaFiscal.NotaFiscal;
import com.example.NotaFiscal.NotaFiscalDAO.NotaFiscalDAO;
import com.example.SAP.SAP;
import com.example.SMTP.SMTP;

public class GeradorNotaFiscal {
    private NotaFiscalDAO notaFiscalDAO;
    private SAP sap;
    private SMTP smtp;

    public GeradorNotaFiscal(NotaFiscalDAO notaFiscalDAO, SAP sap, SMTP smtp) {
        this.notaFiscalDAO = notaFiscalDAO;
        this.sap = sap;
        this.smtp = smtp;
    }

    public NotaFiscal gerarNotaFiscal(Fatura fatura) {
        double valorImposto;
        switch (fatura.getTipoServico()) {
            case "CONSULTORIA":
                valorImposto = fatura.getValor() * 0.25;
                break;
            case "TREINAMENTO":
                valorImposto = fatura.getValor() * 0.15;
                break;
            default:
                valorImposto = fatura.getValor() * 0.06;
                break;
        }

        NotaFiscal notaFiscal = new NotaFiscal(fatura.getNomeCliente(), fatura.getValor(), valorImposto);

        notaFiscalDAO.salva(notaFiscal);
        sap.envia(notaFiscal);
        smtp.envia(notaFiscal);

        return notaFiscal;
    }
}
