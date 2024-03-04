import java.util.Scanner;
import java.util.ArrayList;

public class Funcionario2 {
	String nome;
	double salario;
	
	
	
	public Funcionario2(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public double imposto(double salario) {
		if (salario <= 2000) {
			return salario - salario;
		} else if(salario > 2000.01 && salario <= 3500) {
			return salario/100*15;
		} else if(salario >3500.01 && salario <= 5000) {
			return salario/100*22;
		} else {
			return salario/100*33;
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<>();
		ArrayList<Double> sal = new ArrayList<>();
		
		Funcionario2 funcionario = null;
		
		while(true) {
			System.out.println("1. Cadastrar funcionario ");
			System.out.println("2. Calcular imposto ");
			System.out.println("0. Sair ");
			int opcao = sc.nextInt();
			
			if(opcao == 1) {
				System.out.println("Digite o nome do funcionario: ");
				String nome = sc.next();
				nomes.add(nome);
				
				System.out.println("Insira o salario desse funcionario: ");
				double salario = sc.nextDouble();
				sal.add(salario);
				
				funcionario = new Funcionario2(nome,salario);
			} else if(opcao == 2) {
				System.out.println("Digite o nome do funcionario: ");
				String nome = sc.next();
				
				for (int i=0;i<nomes.size();i++) {
					if(nome.equals(nomes.get(i))) {
						System.out.println(funcionario.imposto(sal.get(i)));
					}
				}
			}
		}
	}
}