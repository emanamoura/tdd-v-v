package com.example.Fatura;

public class Fatura {
    private String nomeCliente;
    private String enderecoCliente;
    private String tipoServico;
    private double valor;

    public Fatura(String nomeCliente, String enderecoCliente, String tipoServico, double valor) {
        this.nomeCliente = nomeCliente;
        this.enderecoCliente = enderecoCliente;
        this.setTipoServico(tipoServico);
        this.valor = valor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getValor() {
        return valor;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    private void setTipoServico(String tipoServico) {
        String tipoServicoFormatado = tipoServico.trim();
        if(tipoServicoFormatado.trim().length() <= 0) {
            throw new IllegalArgumentException();
        }
        this.tipoServico = tipoServicoFormatado.trim();
    }   
}
