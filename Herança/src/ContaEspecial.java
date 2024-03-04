
public class ContaEspecial extends ContaBancaria {
	int limite;

	public ContaEspecial(String nome, int num_conta, double saldo, int limite) {
	super(nome,num_conta,saldo);
	this.limite = limite;
	}

	public double novoSal(double S) {
		if (saldo - S < -limite) {
			System.out.println("O valor ultrapassa o limite!");
		}else {
			this.saldo = this.saldo - S;
		}
		return saldo;
	}
}
