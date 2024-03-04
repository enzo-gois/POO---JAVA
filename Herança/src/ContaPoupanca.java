
public class ContaPoupanca extends ContaBancaria {
	int taxa;

	public ContaPoupanca(String nome, int num_conta, double saldo, int taxa) {
	super(nome, num_conta,saldo);
	this.taxa = taxa;
	}
	
	public int getNum_conta() {
		return this.num_conta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public void novoSaldo() {
	this.saldo = this.saldo + (this.saldo*this.taxa)/100;{
		}
	}
}

