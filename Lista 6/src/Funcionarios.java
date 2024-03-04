import java.util.Scanner;
import java.util.ArrayList;

public class Funcionarios {
	ArrayList<String> nomes = new ArrayList<>();
	ArrayList<Double> salarios = new ArrayList<>();
	
	public Funcionarios(ArrayList<String> nomes, ArrayList<Double> salarios) {
		this.nomes = nomes;
		this.salarios = salarios;
	}
	
	public String altaRenda() {
		ArrayList<String> pessoas = new ArrayList<>();
		for (int i=0;i<nomes.size();i++) {
			if (salarios.get(i) >= 5000) {
				pessoas.add(nomes.get(i));
			}
		}
		return pessoas.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Funcionarios funcionarios = null;
		ArrayList<String> nomes = new ArrayList<>();
		ArrayList<Double> salarios = new ArrayList<>();
		
		while (true) {
			System.out.println("1. Cadastrar funcionário");
			System.out.println("2. Exibir os funcionários de alta renda");
			System.out.println("0. Sair");
			int opcao = sc.nextInt();
			
			if (opcao ==1) {
				System.out.println("Insira o nome do funcionario: ");
				nomes.add(sc.next());
				
				System.out.println("Insira o salário desse funcionário: ");
				salarios.add(sc.nextDouble());
				
			funcionarios = new Funcionarios(nomes,salarios);
			} else if(opcao ==2) {
				System.out.println(funcionarios.altaRenda());
			} else if(opcao ==0) {
				break;
			} else {
				System.out.println("Digite uma opção válida! ");
			}
		}
		sc.close();
	}
}
