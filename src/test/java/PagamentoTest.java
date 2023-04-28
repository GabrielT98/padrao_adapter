import org.example.AdaptadorPagSeguro;
import org.example.PagSeguro;
import org.example.Pagamento;
import org.example.Paypal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PagamentoTest {
        @Test
        void deveRealizarPagamentoPayPal() {
            Pagamento pagamento = new Paypal();
            assertEquals("Pagamento realizado via PayPal no valor de R$100.0", pagamento.realizarPagamento(100.0));
        }
        @Test
        void deveRealizarPagamentoPagSeguro(){
            PagSeguro pagSeguro = new PagSeguro();
            AdaptadorPagSeguro adaptadorPagSeguro = new AdaptadorPagSeguro(pagSeguro);
            assertEquals("Pagamento processado via PagSeguro no valor de R$150.0",  adaptadorPagSeguro.realizarPagamento(150.0));

        }

    }

