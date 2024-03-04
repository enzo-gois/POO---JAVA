
public class Autor {
	String cpf;
	String nome;
	String endereco;
	
	public Autor(String cpf, String nome, String endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String toString() {
		return "CPF: " + cpf + "\nNome: " + nome + "\nEndereco: " + endereco + "\n";
	}
	
}
