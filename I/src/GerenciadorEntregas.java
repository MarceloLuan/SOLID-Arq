package isp;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorEntregas {
    private final Map<String, String> entregas = new HashMap<>();

    public void agendar(String pedidoId, String endereco) {
        entregas.put(pedidoId, endereco);
        System.out.println("Entrega agendada: pedido " + pedidoId + " para " + endereco);
    }

    public String consultar(String pedidoId) {
        return entregas.get(pedidoId);
    }
}

