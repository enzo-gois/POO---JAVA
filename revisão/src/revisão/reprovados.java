package revisão;

import java.util.Scanner;
import java.util.ArrayList;

public class reprovados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] nomes = new String[3];
		double[] notas = new double[3];
		
		for(int i =0;i<3;i++) {
			System.out.println("Nome: ");
			nomes[i] = sc.next();
			System.out.println("Digite a nota 1: ");
			double nota = sc.nextDouble();
			System.out.println("Digite a nota 2: ");
			double nota2 = sc.nextDouble();
			notas[i] = (nota + nota2) /2;
		}
		
		System.out.println(reprovados(nomes,notas));
		
	}
	
	public static String reprovados(String[] nomes, double[] notas) {
		
		ArrayList<String> reprovado = new ArrayList<>();
		
		for(int i =0;i<3;i++) {
			if(notas[i] < 7) {
				reprovado.add(nomes[i]);
			}
		}
		return reprovado.toString();
	}

}
