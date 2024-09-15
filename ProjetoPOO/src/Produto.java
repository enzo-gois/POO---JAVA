
public abstract class Produto {
	private String nome;
    private String codBarra;
    private double preco;
    private String validade;
    private int qtdProduto;

    public abstract void exibirInformacoes();
    
    public Produto() {
    	
    }
    
    public Produto(String nome, double preco, String validade, int qtdProduto, String codBarra) {
        this.nome = nome;
        this.codBarra = codBarra;
        this.preco = preco;
        this.validade = validade;
        this.qtdProduto = qtdProduto;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoDeBarras() {
        return codBarra;
    }

    public void setCodigoDeBarras(String codBarra) {
        this.codBarra = codBarra;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getQuantidade() {
        return qtdProduto;
    }

    public void setQuantidade(int quantidade) {
        this.qtdProduto = quantidade;
    }
    
    
}
