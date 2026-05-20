package srp;

public class GerenciadorPedidos {
    private final PedidoRepository repositorio;

    public GerenciadorPedidos(PedidoRepository repositorio) {
        this.repositorio = repositorio;
    }

    public Pedido criarPedido(String id, String cliente, double valor) {
        return new Pedido(id, cliente, valor);
    }

    public void salvarPedido(Pedido pedido) {
        repositorio.salvar(pedido);
    }
}

