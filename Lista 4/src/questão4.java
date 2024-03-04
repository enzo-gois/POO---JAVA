import java.util.Scanner;
import java.util.ArrayList;

public class questão4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Double> salario = new ArrayList<Double>();
		
		
		while (true) {
			System.out.println("1. Cadastrar funcionário");
			System.out.println("2. Calcular imposto");
			System.out.println("0. Sair");
			int in = sc.nextInt();
			String funcionario;
			
			if (in == 1) {
				System.out.println("Digite o nome do funcionario: ");
				nomes.add(sc.next());
				System.out.println("Digite o salario do funcionario: ");
				salario.add(sc.nextDouble());
			} else if(in == 2) {
				System.out.println("Digite o nome do funcionario: ");
				funcionario = sc.next();
				System.out.println(imposto(nomes,salario,funcionario));
			} else if (in ==0) {
				break;
			}	
		}
	}
	
	public static Double imposto(ArrayList<String> nomes, ArrayList<Double> salario, String nome) {
		double imposto = 0;
		if (nomes.contains(nome)) {
			int indic = nomes.indexOf(nome);
			double indicsal = salario.get(indic);
			if (indicsal <= 2000) {
				imposto = indicsal - indicsal;
			} else if ((indicsal >= 2000.1) && (indicsal <= 3500)){
				imposto = indicsal/100*15;
			} else if ((indicsal >= 3500.1) && (indicsal <= 5000)) {
				imposto = indicsal/100*22;
			} else {
				imposto = indicsal/100*30;
			}
		}
		return  imposto;
	}
}
