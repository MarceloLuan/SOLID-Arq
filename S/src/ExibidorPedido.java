package srp;

public class ExibidorPedido {
    public void exibir(Pedido pedido) {
        if (pedido == null) {
            System.out.println("Pedido não encontrado.");
            return;
        }

        System.out.println("--- Detalhes do Pedido ---");
        System.out.println("ID: " + pedido.getId());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println(String.format("Valor: R$ %.2f", pedido.getValor()));
    }
}

