package Ex1;

public class Tecnico extends Assistente {
	double bonus;
	
	public Tecnico(String nome, double salario, String setor, int nMatricula,double bonus) {
		super(nome,salario,setor,nMatricula);
		this.bonus = bonus;
	}
}
