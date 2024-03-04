
public class ContaBancaria {
	protected String nome;
	protected int num_conta;
	protected double saldo;


	public ContaBancaria(String nome, int num_conta, double saldo) {
	this.nome = nome;
	this.num_conta = num_conta;
	this.saldo = saldo;
	}

	public String getNome() {
	return nome;
	}

	public int getNum_conta() {
	return num_conta;
	}

	public double getSaldo() {
	return saldo;
	}

	public void depositar(double s) {
	this.saldo = saldo+s;
	}

	public void sacar(double s) {
	if (s > saldo) {
	System.out.println("A valor digitado é maior do que o saldo!");
	} else {
	this.saldo = saldo-s;
		}
	}
	
	public String toString() {
		return "Nome: " + nome +  
				" Numero: "+ num_conta + 
				" Saldo: " + saldo ;
	}
}