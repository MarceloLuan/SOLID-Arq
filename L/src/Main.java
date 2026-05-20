package lsp;

public class Main {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[] {
            new Pizza("Calabresa", 32.50, "Grande"),
            new Hamburguer("Clássico", 24.00, true),
            new Bebida("Refrigerante", 6.50, true)
        };

        for (Produto p : produtos) {
            System.out.println(p.getNome() + " - R$ " + String.format("%.2f", p.getPreco()) + " -> " + p.preparar());
        }
    }
}

