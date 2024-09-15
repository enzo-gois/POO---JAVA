
import java.util.ArrayList;

public class ProdutoGeral extends Produto {
	ArrayList<Produto> produtos = new ArrayList<>();
	
	public ProdutoGeral() {
		
	}
	
	public ProdutoGeral(String nome, double preco, String validade, int qtdProduto, String codBarra) {
		super(nome, preco, validade, qtdProduto, codBarra);
		
	}
	
	public void adicionar(Produto p) {
		produtos.add(p);
	}
	
	public void exibirInformacoes() {
		System.out.println("=== OUTROS ===");
		System.out.println("NOME: " + getNome());
		System.out.println("PREÇO: " + getPreco());
		System.out.println("VALIDADE: " + getValidade());
		System.out.println("QUANTIDADE: " + getQuantidade());
		System.out.println("CÓDIGO: " + getCodigoDeBarras());
	}
	
}
