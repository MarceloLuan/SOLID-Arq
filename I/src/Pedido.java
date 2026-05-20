package isp;

public class Pedido {
    private final String id;
    private final String cliente;
    private final double valor;

    public Pedido(String id, String cliente, double valor) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }
}

