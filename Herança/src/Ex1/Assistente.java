package Ex1;

public class Assistente extends Funcionario {
	int nMatricula;
	
	public Assistente(String nome, double salario, String setor, int nMatricula ) {
		super(nome,salario,setor);
		this.nMatricula = nMatricula;
	}
	
	public String getNamtricula() {
		return "aaaa";
	}
	
}
