import java.util.ArrayList;
import java.util.Scanner;

public class questão3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<String>(); 
		ArrayList<Double> peso = new ArrayList<Double>();
		ArrayList<Double> altura = new ArrayList<Double>();
		int alunos = 0 ;
		System.out.println("Digite quantas pessoas quer cadastrar: ");
		alunos = sc.nextInt();
		
		for (int i=0;i<alunos;i++) {
			System.out.println("Digite o nome da pessoa: ");
			nomes.add(sc.next());
			System.out.println("Informe o peso de " + nomes.get(i) );
			peso.add(sc.nextDouble());
			System.out.println("Informe a altura de " + nomes.get(i));
			altura.add(sc.nextDouble());
			
		}
		System.out.println(nomes.toString());
		System.out.println(acimaDaMedia(nomes,peso,altura));
	}
	
	public static String acimaDaMedia(ArrayList<String> nomes, ArrayList<Double> peso,ArrayList<Double> altura ) {
		ArrayList<String> acimaDaMedia = new ArrayList<String>();
		double acima = 25;
		for (int i=0;i<nomes.size();i++) {
			if ((peso.get(i) / (altura.get(i)*2)) > acima) {
				acimaDaMedia.add(nomes.get(i));
			}
		}
		return "Pessoas com o IMC acima da média: " + acimaDaMedia.toString();
	}
}


