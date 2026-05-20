package lsp;

public class Hamburguer extends Produto {
    private final boolean comBacon;

    public Hamburguer(String nome, double preco, boolean comBacon) {
        super(nome, preco);
        this.comBacon = comBacon;
    }

    @Override
    public String preparar() {
        String bacon = comBacon ? "com bacon" : "sem bacon";
        return "Grelhando hamburguer " + getNome() + " (" + bacon + ")";
    }
}

