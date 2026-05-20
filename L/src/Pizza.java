package lsp;

public class Pizza extends Produto {
	private final String tamanho;

	public Pizza(String nome, double preco, String tamanho) {
		super(nome, preco);
		this.tamanho = tamanho;
	}

	@Override
	public String preparar() {
		return "Assando pizza " + getNome() + " (" + tamanho + ")";
	}
}


