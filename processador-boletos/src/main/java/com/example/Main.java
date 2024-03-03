package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Boleto> boletos = new ArrayList<>(); 
    static ArrayList<Pagamento> pagamentos = new ArrayList<>();
    static Fatura fatura;
    static ProcessadorBoletos proBole = new ProcessadorBoletos();

    public static void main(String[] args) {
 
        fatura = registrarFatura();

        System.out.print("Deseja registrar um boleto?(sim/nao): ");
        String resposta = scanner.next();
        while(resposta.equals("sim") || resposta.equals("nao")){
            if(resposta.equals("nao")){
                break;
            }
            else if(resposta.equals("sim")){
            boletos.add(criarBoleto());
            System.out.print("Deseja registrar outro boleto?(sim/nao): ");
            resposta = scanner.next();
            }
            else{
                System.out.print("Resposta Inválida, deseja registrar um boleto?(sim/nao): ");
                resposta = scanner.next();
            }
        }

        for (Pagamento pagamento : proBole.fazerPagamentos((boletos))){
            pagamentos.add(pagamento);
        }

        float totalPagamentos = 0.00f;
        for(Pagamento pagamento: pagamentos){
            totalPagamentos += pagamento.getValorPago();
        }

        if(totalPagamentos >= fatura.getValorTotal()){
            System.out.println("Fatura paga com sucesso!");
        } else{
            System.out.println("A fatura não está totalmente paga");
        }
    }

    public static Fatura registrarFatura(){
        System.out.println("Registre a fatura");
        System.out.print("Valor Total: ");
        Float valorTotal = scanner.nextFloat();
        System.out.print("Seu nome: ");
        String nome = scanner.next();

        return proBole.gerarFatura(valorTotal, nome);
    }

    public static Boleto criarBoleto(){
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        
        Date data = new Date();

        System.out.print("ValorPago: ");
        float valorPago = scanner.nextFloat();

        return proBole.registrarBoleto(new Boleto(codigo, data, valorPago));
    }
}
