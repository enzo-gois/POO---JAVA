import java.util.ArrayList;
import java.util.Scanner;

public class Estudante {
	ArrayList<String> nomes = new ArrayList<>();
	ArrayList<Double> matricula = new ArrayList<>();
	ArrayList<Double> nota1 = new ArrayList<>();
	ArrayList<Double> nota2 = new ArrayList<>();
	double newmatricula;
	String nome;
	
	public Estudante() {
		
	}
	
	public Estudante(ArrayList<String> nomes, ArrayList<Double> matricula, ArrayList<Double> nota1, ArrayList<Double> nota2) {
		this.nomes = nomes;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public String aluno(double newmatricula) {
		String aluno="";
		for (int i=0;i<nomes.size();i++) {
			if (newmatricula == matricula.get(i)) {
				aluno = nomes.get(i);
			}
		}
		return aluno;
	}
	
	public Double media(String nome) {
		double soma =0;
		for (int i=0;i<nomes.size();i++) {
			if (nome.equals(nomes.get(i))) {
				soma+= nota1.get(i) + nota2.get(i);
			}
		}
		return soma/2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Estudante estudante = null;
		int media = 7;

		ArrayList<String> nomes = new ArrayList<>();
		ArrayList<Double> matricula = new ArrayList<>();
		ArrayList<Double> nota1 = new ArrayList<>();
		ArrayList<Double> nota2 = new ArrayList<>();
		double newmatricula;
		String nome;
		
		while (true) {
			System.out.println("1. Cadastrar um estudante");
			System.out.println("2. Obter o nome do estudante");
			System.out.println("3. Calcular média");
			System.out.println("0. Sair ");
			int opcao = sc.nextInt();
			
			if (opcao ==1) {
				System.out.println("Digite o nome do estudante: ");
				nomes.add(sc.next());
				
				System.out.println("Insira a matricula: ");
				matricula.add(sc.nextDouble());
				
				System.out.println("Digita a primeira nota: ");
				nota1.add(sc.nextDouble());
				
				System.out.println("Digite a segunda nota: ");
				nota2.add(sc.nextDouble());
				
			estudante = new Estudante(nomes,matricula,nota1,nota2);
			} else if(opcao ==2) {
				System.out.println("Insira a matrícula: ");
				newmatricula = sc.nextDouble();
			System.out.println(estudante.aluno(newmatricula));
			} else if(opcao ==3) {
				System.out.println("Digite o nome do estudante: ");
				nome = sc.next();
				if (estudante.media(nome) >= media) {
					System.out.println("Média: " + estudante.media(nome) + " APROVADO!");
				} else {
					System.out.println("Média: " + estudante.media(nome) + " REPROVADO!");
				}
			} else if(opcao == 0) {
				System.out.println("Programa encerrado!");
				break;
			} else {
				System.out.println("Insira uma opção válida");
			}
		}
		sc.close();
	}
}
