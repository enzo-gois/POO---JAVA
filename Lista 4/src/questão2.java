import java.util.ArrayList;
import java.util.Scanner;

public class questão2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<String>(); 
		ArrayList<Double> p1notas = new ArrayList<Double>();
		ArrayList<Double> p2notas = new ArrayList<Double>();
		int alunos = 10;
		
		
		for (int i=0;i<alunos;i++) {
			System.out.println("Digite o nome da estudante: ");
			nomes.add(sc.next());
			System.out.println("Digite a primeira nota: ");
			p1notas.add(sc.nextDouble());
			System.out.println("Digite a segunda nota: ");
			p2notas.add(sc.nextDouble());
			
		}
		System.out.println(reprovados(nomes,p1notas,p2notas));
	}
	
	public static String reprovados(ArrayList<String> nomes, ArrayList<Double> p1notas,ArrayList<Double> p2notas ) {
		ArrayList<String> reprovados = new ArrayList<String>();
		double media = 7;
		for (int i=0;i<nomes.size();i++) {
			if ((p1notas.get(i) + p2notas.get(i))/2 < media) {
				reprovados.add(nomes.get(i));
			}
		}
		return "Lista de alunos reporvados: " + reprovados.toString();
	}

}
