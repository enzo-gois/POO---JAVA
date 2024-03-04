package questão2;

import java.util.ArrayList;
import java.util.Scanner;

public class Conta {
	int numero;
	Banco banco;
	Cliente cliente;
	double saldo;
	
	public Conta(int numero, Banco banco, Cliente cliente) {
		this.numero = numero;
		this.banco = banco;
		this.cliente = cliente;
		this.saldo = 0;
	}
	
	public Banco getBanco() {
		return banco;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void deposito(double s) {
		this.saldo += s;
	}
	
	public void saque(double s) {
		this.saldo -= s;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Conta> contas = new ArrayList<>();
		
		while (true) {
			System.out.println("1. Cadastrar conta ");
			System.out.println("2. Realizar depósito ");
			System.out.println("3. Realizar saque ");
			System.out.println("4. Verificar saldo ");
			System.out.println("5. COnsultar numero e nome de agência ");
			System.out.println("6. Alterar o numero e nome da agência ");
			System.out.println("0. Sair ");
			int opcao = sc.nextInt();
			
			if(opcao ==1) {
				System.out.println("Insira o numero da conta: ");
				int numero = sc.nextInt();
				
				System.out.println("Digite o nome da agencia: ");
				String nomeA = sc.next();
				
				System.out.println("Digite o numero da agência: ");
				int numeroA = sc.nextInt();
				
				Banco banco = new Banco(nomeA,numeroA);
				
				System.out.println("Insira o nome do cliente: ");
				String nome = sc.next();
				
				System.out.println("Insira o cpf do cliente: ");
				String cpf = sc.next();
				
				Cliente cliente = new Cliente(nome,cpf);
				Conta conta = new Conta(numero,banco,cliente);
				contas.add(conta);
				
			} else if(opcao ==2) {
				System.out.println("Digite o cpf do cliente: ");
				String cpf = sc.next();
				
				System.out.println("Digite o valor do deposito: ");
				double s = sc.nextDouble();
				
				for(Conta i: contas) {
					if(i.getCliente().getCpf().equals(cpf)) {
						i.deposito(s);
					}
				}
			} else if(opcao ==3) {
				System.out.println("Digite o cpf do cliente: ");
				String cpf = sc.next();
				
				System.out.println("Digite o valor do saque: ");
				double s = sc.nextDouble();
				
				for(Conta i: contas) {
					if(i.getCliente().getCpf().equals(cpf)) {
						i.saque(s);
					}
				}
			} else if(opcao ==4) {
				System.out.println("Informe o CPF do cliente: ");
				String cpf = sc.next();
				
				for(Conta i: contas) {
					if(i.getCliente().getCpf().equals(cpf)) {
						System.out.println(i.getSaldo());
					}
				}
			} else if(opcao ==5) {
				System.out.println("Digite o numero da conta: ");
				int numero = sc.nextInt();
				
				for (Conta i: contas) {
					if (i.getNumero() == numero) {
						System.out.println("Nome do cliente: " + i.getCliente().getNome());
						System.out.println("CPF do cliente: " + i.getCliente().getCpf());
						System.out.println("Nome da agência: " + i.getBanco().getNomeAgencia());
						System.out.println("Numero da agência: " + i.getBanco().getNumeroAgencia());
					}
				}
			} else if(opcao ==6) {
				System.out.println("Digite o nome do cliente: ");
				String nome = sc.next();
				
				for (Conta i: contas) {
					if (i.getCliente().getNome().equals(nome)) {
						System.out.println("Digite o novo nome da agencia: ");
						String nomeAgencia = sc.next();
						i.getBanco().setNomeAgencia(nomeAgencia);
						
						System.out.println("Digite o novo numero da agencia: ");
						int numeroAgencia = sc.nextInt();
						i.getBanco().setNumeroAgencia(numeroAgencia);
					}
				}
			} else if (opcao ==0) {
				break;
			} else {
				System.out.println("Insira uma entrada válida!! ");
			}
		}
		
	}

}
