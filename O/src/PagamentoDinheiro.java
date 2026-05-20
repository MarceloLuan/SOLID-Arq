package ocp;

public class PagamentoDinheiro implements Pagamento {
    private final double troco;

    public PagamentoDinheiro(double troco) {
        this.troco = troco;
    }

    @Override
    public boolean pagar(Pedido pedido) {
        System.out.println("Processando pagamento em dinheiro para pedido " + pedido.getId());
        System.out.println(String.format("Valor: R$ %.2f", pedido.getValor()));
        System.out.println(String.format("Troco: R$ %.2f", troco));

        System.out.println("Pagamento em dinheiro recebido.");
        return true;
    }
}

