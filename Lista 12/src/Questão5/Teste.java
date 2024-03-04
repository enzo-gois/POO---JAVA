package Questão5;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Conta corrente = null;
		Conta poupanca = null;

		while(true) {
			System.out.println("1. Cadastrar conta Corrente ");
			System.out.println("2. Cadastrar Poupanca ");
			System.out.println("3 .Atualizar conta corrente");
			System.out.println("4. Atualizar poupanca");
			System.out.println("5. Saque conta corrente");
			System.out.println("6. Saque poupanca");
			System.out.println("7. Verificar saldo da conta corrente");
			System.out.println("8. Verificar saldo da poupança");
			System.out.println("0. Sair");
			int opcao = sc.nextInt();
			
			if(opcao ==1) {
				System.out.println("Digite o numero da conta: ");
				int numeroC = sc.nextInt();
				System.out.println("Digite o seu cpf: ");
				String cpf = sc.next();
				System.out.println("Informe a taxa: ");
				double taxa = sc.nextDouble();
				System.out.println("Informe a quantia que será depositada an conta: ");
				double saldo = sc.nextDouble();
				System.out.println("Digite o nome do banco: ");
				String banco = sc.next();
				
				corrente = new Corrente(numeroC,cpf,taxa,0,banco);
				corrente.depositar(saldo);
				
			} else if(opcao ==2) {
				System.out.println("Digite o numero da conta: ");
				int numeroC = sc.nextInt();
				System.out.println("Digite o seu cpf: ");
				String cpf = sc.next();
				System.out.println("Informe a taxa: ");
				double taxa = sc.nextDouble();
				System.out.println("Informe a quantia que será depositada na conta: ");
				double saldo = sc.nextDouble();
				System.out.println("Digite o nome do banco: ");
				String banco = sc.next();
				
				poupanca = new Poupanca(numeroC,cpf,taxa,0,banco); 
				poupanca.depositar(saldo);
				
			} else if(opcao ==3) {
				corrente.atualizar();
			} else if(opcao ==4) {
				poupanca.atualizar();
			} else if(opcao ==5) {
				System.out.println("Informe a quantia a ser sacada: ");
				double valor = sc.nextDouble();
				corrente.saque(valor);
			} else if(opcao ==6) {
				System.out.println("Informe a quantia a ser sacada: ");
				double valor = sc.nextDouble();
				poupanca.saque(valor);
			} else if(opcao ==7) {
				System.out.println(corrente.getSaldo());
			} else if(opcao==8) {
				System.out.println(poupanca.getSaldo());
			} else if(opcao ==0) {
				break;
			} else {
				System.out.println("Insira uma opção válida! ");
			}
			
		}
		
	}

}
