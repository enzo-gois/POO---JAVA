package Questão5;

public abstract class Conta {
	int numeroC;
	String cpf;
	double taxa;
	double saldo;
	String banco;
	
	public abstract void saque(double valor);
	public abstract void depositar(double valor);
	public abstract void atualizar();
	
	
	public abstract double getSaldo();
}
