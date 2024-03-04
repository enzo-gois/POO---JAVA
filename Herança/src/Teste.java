
import java.util.Scanner;
import java.util.ArrayList;
public class Teste {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ContaBancaria conta = null;	
	
	ArrayList<ContaBancaria> lista = new ArrayList<>(2);

	while(true) {
	System.out.println("1) Incluir dados relativos a conta de um cliente");
	System.out.println("2) Sacar um determinado valor de uma conta");
	System.out.println("3) Depositar um determinado valor na sua conta");
	System.out.println("4) Mostrar o novo saldo do cliente");
	System.out.println("5) Mostrar os dados de todas as contas cadastradas.");
	int opcao = sc.nextInt();

	if (opcao == 1) {
	System.out.println("Digita o nome da pessoa: ");
	String nome = sc.next();

	System.out.println("Insira o numero da conta: ");
	int num_conta = sc.nextInt();

	System.out.println("Insira o saldo disponível na conta: ");
	double saldo = sc.nextDouble();

		System.out.println("Essac onta é:");
		System.out.println("1. Bancaria ");
		System.out.println("2. Poupanca ");
		System.out.println("3. Especial");
		int op = sc.nextInt();
	
		if (op == 1) {
		conta = new ContaBancaria(nome, num_conta,saldo);
		lista.add(conta);
		} else if(op == 2) {
		System.out.println("Insira a taxa: ");
		int taxa = sc.nextInt();
		conta = new ContaPoupanca(nome, num_conta,saldo,taxa);
		lista.add(conta);
		} else if(op == 3) {
		System.out.println("Qual o limite nessa conta: ");
		int limite = sc.nextInt();
		conta = new ContaEspecial(nome, num_conta,saldo,limite);
		lista.add(conta);
			}
		
	} else if(opcao == 2) {
	System.out.println("Insira o numero da conta: ");
	int num_conta = sc.nextInt();
		
	System.out.println("Insira o valor a ser sacado: ");
	double s = sc.nextDouble();
	
	for (ContaBancaria i: lista) {
		if(num_conta == i.getNum_conta()) {
			if (i instanceof ContaEspecial) {
				ContaEspecial es = (ContaEspecial) i;
				es.novoSal(s);
			}else {
				i.sacar(s);
			}
		}
	}

	} else if(opcao == 3) {
		System.out.println("Insira o numero da conta: ");
		int num_conta = sc.nextInt();
			
		System.out.println("Insira o valor a ser depositado: ");
		double s = sc.nextDouble();
		
		for (ContaBancaria i: lista) {
			if(num_conta == i.getNum_conta()) {
				i.depositar(s);
			}
		}
	} else if(opcao == 4) {
		for (ContaBancaria i: lista) {
			if (i instanceof ContaPoupanca) {
				ContaPoupanca po = (ContaPoupanca) i;
				po.novoSaldo();
				System.out.println("Conta: " + po.getNum_conta() + "     Novo Saldo: " + po.getSaldo());
			}
		}
	} else if(opcao == 5) {
		for(ContaBancaria i: lista) {
			System.out.println(i.toString());
		}
	} else {
		break;
	}
		}
	}
}