package Questão5;

public class Poupanca extends Conta {
	
	public Poupanca(int numeroC, String cpf, double taxa, double saldo, String banco) {
		this.numeroC = numeroC;
		this.cpf = cpf;
		this.taxa = taxa;
		this.saldo = saldo;
		this.banco = banco;
	}
	
	@Override
	public void atualizar() {
		this.saldo = this.saldo + taxa;
	}
	
	@Override
	public void saque(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	@Override
	public double getSaldo() {
		return saldo;
	}
}
