
public class Editora {
	String cnpj;
	String nome;
	String endereco;
	String telefone;
	
	public Editora(String cnpj, String nome, String endereco, String telefone) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String toString() {
		return "CNPJ: " + cnpj + "\nNome: " + nome + "\nEndereco: " + endereco + "\nTelefone: " + telefone + "\n";
	}
	
}
