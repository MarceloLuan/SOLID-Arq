package isp;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPedidos {
    private final List<Pedido> armazenamento = new ArrayList<>();

    public void salvar(Pedido pedido) {
        armazenamento.add(pedido);
        System.out.println("Pedido salvo: " + pedido.getId());
    }

    public Pedido buscarPorId(String id) {
        for (Pedido p : armazenamento) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
}

