package ocp;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("100", "João", 49.90);

        CaixaPagamento caixa = new CaixaPagamento();

        Pagamento cartao = new PagamentoCartao("1234567812345678");
        caixa.processar(cartao, pedido);

        Pagamento pix = new PagamentoPix("joao@gmail.com");
        caixa.processar(pix, pedido);

        Pagamento dinheiro = new PagamentoDinheiro(20.00);
        caixa.processar(dinheiro, pedido);
    }
}

