package org.example;

public class Paypal implements Pagamento {
    public String realizarPagamento(double valor) {
        return "Pagamento realizado via PayPal no valor de R$" + valor;
    }
}
