import java.util.Scanner;
import java.util.ArrayList;

public class Conta {
	int numero;
	int agencia;
	String nome;
	String cpf;
	double saldo;
	
	
	public Conta(int numero, int agencia, String nome, String cpf) {
		this.numero = numero;
		this.agencia = agencia;
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = 0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void deposito(double s) {
		this.saldo+=s;
	}
	
	public void saque(double s) {
		if (s > saldo) {
			System.out.println("O valor é maior do que o saldo: " + saldo  +  " \npresente na conta! ");
		} else {
			this.saldo-=s;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void consulta() {
		System.out.println("Nome do cliente: " +nome);
		System.out.println("CPF: " + cpf);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Conta> contas = new ArrayList<>();
		Conta conta = null;
		
		while (true) {
			System.out.println("1. Cadastrar conta ");
			System.out.println("2. Realizar depósito ");
			System.out.println("3. Realizar Saque ");
			System.out.println("4. Verificar saldo ");
			System.out.println("5. Consultar cliente ");
			System.out.println("0. Sair ");
			int opcao = sc.nextInt();
			
			if(opcao == 1) {
				System.out.println("Digite o numero da conta: ");
				int numero = sc.nextInt();
				
				System.out.println("DIgite a agencia da conta: ");
				int agencia = sc.nextInt();
				
				System.out.println("Digite o nome do titular da conta: ");
				String nome = sc.next();
				
				System.out.println("Digite o CPF: ");
				String cpf = sc.next();
				
				conta = new Conta(numero,agencia,nome,cpf);
				contas.add(conta);
				
			} else if(opcao == 2) {
				System.out.println("Digite o nome da conta: ");
				String nome = sc.next();
				
				System.out.println("Insira a quantia a ser depositada: ");
				double saldo = sc.nextDouble();
				
				for (Conta i: contas) {
					if (i.getNome().equals(nome)) {
						i.deposito(saldo);
					}
				}
			} else if(opcao == 3) {
				System.out.println("Digite o nome da conta: ");
				String nome = sc.next();
				
				System.out.println("Insira a quantia a ser sacada: ");
				double saldo = sc.nextDouble();
				
				for (Conta i: contas) {
					if (i.getNome().equals(nome)) {
						i.saque(saldo);
					}
				}
			} else if(opcao == 4) {
				System.out.println("Digite o nome do cliente: ");
				String nome = sc.next();
				
				for (Conta i: contas) {
					if(i.getNome().equals(nome)) {
						System.out.println("Saldo: " + i.getSaldo());
					}
				}
			} else if(opcao ==5) {
				System.out.println("Digite o nome da conta: ");
				String nome = sc.next();
				
				for(Conta i:contas) {
					if(i.getNome().equals(nome)) {
						i.consulta();
					}
				}
			} else if(opcao == 0) {
				break;
			} else {
				System.out.println("Digite uma entrada válida! ");
			}
		}
	}
}