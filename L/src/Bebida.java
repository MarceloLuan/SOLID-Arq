package lsp;

public class Bebida extends Produto {
    private final boolean gelada;

    public Bebida(String nome, double preco, boolean gelada) {
        super(nome, preco);
        this.gelada = gelada;
    }

    @Override
    public String preparar() {
        String estado = gelada ? "gelada" : "à temperatura ambiente";
        return "Servindo bebida " + getNome() + " (" + estado + ")";
    }
}

