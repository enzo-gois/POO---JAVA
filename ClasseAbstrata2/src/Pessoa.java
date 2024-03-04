
public abstract class Pessoa {
	String nome;
	String dataNascimento;
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String toString() {
		return "Nome: " + nome + "\nData de Nascimento: " + dataNascimento; 
	}
}