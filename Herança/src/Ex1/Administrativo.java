package Ex1;

public class Administrativo extends Assistente {
	String turno;
	
	public Administrativo(String nome,double salario,String setor,int nMatricula, String turno) {
		super(nome,salario,setor,nMatricula);
		this.turno = turno;
	}

}
