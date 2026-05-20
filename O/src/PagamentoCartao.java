package ocp;

public class PagamentoCartao implements Pagamento {
    private final String numeroCartao;

    public PagamentoCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public boolean pagar(Pedido pedido) {
        System.out.println("Processando pagamento por cartão para pedido " + pedido.getId());
        System.out.println("Cartão: **** **** **** " + (numeroCartao.length() >= 4 ? numeroCartao.substring(numeroCartao.length()-4) : numeroCartao));
        System.out.println(String.format("Valor: R$ %.2f", pedido.getValor()));
        
        System.out.println("Pagamento por cartão aprovado.");
        return true;
    }
}

