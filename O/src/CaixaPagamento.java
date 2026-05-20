package ocp;

public class CaixaPagamento {
    public boolean processar(Pagamento metodo, Pedido pedido) {
        return metodo.pagar(pedido);
    }
}

