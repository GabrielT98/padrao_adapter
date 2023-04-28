package org.example;

public class AdaptadorPagSeguro implements Pagamento {
    private PagSeguro pagSeguro;

    public AdaptadorPagSeguro(PagSeguro pagSeguro) {
        this.pagSeguro = pagSeguro;
    }

    public String realizarPagamento(double valor) {
        return this.pagSeguro.processarPagamento(valor);
    }
}