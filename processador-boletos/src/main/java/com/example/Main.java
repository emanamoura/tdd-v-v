package com.example;

public class main {
    private Boleto[] boletos; 
    private Pagamento[] pagamentos;
    private Fatura[] faturas;
    
    public main() {
    }

    public main(Boleto[] boletos, Pagamento[] pagamentos, Fatura[] faturas) {
        this.boletos = boletos;
        this.pagamentos = pagamentos;
        this.faturas = faturas;
    }

    public static void main(String[] args) {
                
    }

    public Boleto[] getBoletos() {
        return boletos;
    }

    public void setBoletos(Boleto[] boletos) {
        this.boletos = boletos;
    }

    public Pagamento[] getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(Pagamento[] pagamentos) {
        this.pagamentos = pagamentos;
    }

    public Fatura[] getFaturas() {
        return faturas;
    }

    public void setFaturas(Fatura[] faturas) {
        this.faturas = faturas;
    }
}
