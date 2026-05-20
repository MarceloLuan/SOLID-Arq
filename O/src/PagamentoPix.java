package ocp;

public class PagamentoPix implements Pagamento {
    private final String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public boolean pagar(Pedido pedido) {
        System.out.println("Processando pagamento via PIX para pedido " + pedido.getId());
        System.out.println("Chave PIX: " + chavePix);
        System.out.println(String.format("Valor: R$ %.2f", pedido.getValor()));

        System.out.println("Pagamento via PIX confirmado.");
        return true;
    }
}

