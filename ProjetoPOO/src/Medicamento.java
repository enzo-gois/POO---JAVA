
import java.util.ArrayList;

public class Medicamento extends Produto {
	private String principio_ativo;
	private ArrayList<Medicamento> medicamentos = new ArrayList<>();
	
	public Medicamento() {
		super();
	}

	public Medicamento(String nome, double preco, String validade, int qtdProduto, String codBarra,String principio_ativo) {
		super(nome, preco, validade, qtdProduto, codBarra);
		this.principio_ativo = principio_ativo;
	}

	public String getPrincipio_ativo() {
		return principio_ativo;
	}

	public void setPrincipio_ativo(String principio_ativo) {
		this.principio_ativo = principio_ativo;
	}
	
	public void adicionar(Medicamento m) {
		medicamentos.add(m);
	}
	
	public void exibirInformacoes() {
		System.out.println("=== MEDICAMENTO ===");
		System.out.println("NOME: " + getNome());
		System.out.println("PREÇO: R$  " + getPreco());
		System.out.println("VALIDADE: " + getValidade());
		System.out.println("PRINCIPIO ATIVO: " + getPrincipio_ativo());
		System.out.println("QUANTIDADE: " + getQuantidade());
		System.out.println("CÓDIGO: " + getCodigoDeBarras());
	}
	
}
