package Ex1;

public class Funcionario {
	String nome;
	double salario;
	String setor;
	
	public Funcionario(String nome, double salario, String setor) {
		this.nome = nome;
		this.salario = salario;
		this.setor = setor;
	}
	
	public String exibirDados() {
		return "Nome: " + nome + "Salario: " + salario + "setor: " + setor;
	}

}
