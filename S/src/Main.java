package srp;

public class Main {
    public static void main(String[] args) {
        PedidoRepository repositorio = new PedidoRepository();
        GerenciadorPedidos gerenciador = new GerenciadorPedidos(repositorio);
        ExibidorPedido exibidor = new ExibidorPedido();

        Pedido pedido = gerenciador.criarPedido("1", "Maria", 40.00);
        gerenciador.salvarPedido(pedido);

        Pedido encontrado = repositorio.buscarPorId("1");
        exibidor.exibir(encontrado);
    }
}

