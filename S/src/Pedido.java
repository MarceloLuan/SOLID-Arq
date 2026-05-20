package srp;

public class Pedido {
    private String id;
    private String cliente;
    private double valor;

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

    @Override
    public String toString() {
        return "Pedido{id='" + id + "', cliente='" + cliente + "', valor=" + valor + "}";
    }
}

