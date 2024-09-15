
public class MedicamentoReceita extends Medicamento {
	private String receita;

	public MedicamentoReceita(String nome,double preco, String validade, int qtdProduto, String codBarra,
			String principio_ativo,String receita) {
		super(nome, preco, validade, qtdProduto, codBarra, principio_ativo);
		this.receita = receita;
	}

	public String getReceita() {
		return receita;
	}

	public void setReceita(String receita) {
		this.receita = receita;
	}
	
	
	
}
