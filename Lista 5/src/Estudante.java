import java.util.Scanner;

public class Estudante {
	private String nome;
	private int matricula;
	private String endereco;
	private double[] notas = new double[4];
	
	public Estudante(String nome, int matricula, String endereco, double[] notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.endereco = endereco;
		this.notas = notas;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double media() {
		double soma = 0;
		for (int i=0;i<4;i++) {
			soma+= notas[i];
		}
		return soma/4;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Estudante estudante = null;
		
		while (true) {
			System.out.println("1. Cadastrar estudante");
			System.out.println("2. Calcular média");
			System.out.println("3. Obter numero de matricula");
			System.out.println("4. Obter endereço");
			System.out.println("0. Sair");
			int opcao = sc.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite o nome do estudante: ");
				String nome = sc.next();
				
				System.out.println("Digite o numero de matricula: ");
				int matricula = sc.nextInt();
				
				System.out.println("Digite o endereço: ");
				String endereco = sc.next();
				
				double[] notas = new double[4];
				for (int i=0;i<4;i++) {
					System.out.println("Digite a nota " + (i+1) + " do aluno: ");
					notas[i] = sc.nextDouble();
				}
				estudante = new Estudante(nome,matricula,endereco,notas);
			} else if(opcao == 2) {
				System.out.println(estudante.media());
			} else if(opcao == 3) {
				System.out.println(estudante.getMatricula());
			} else if(opcao == 4) {
				System.out.println(estudante.getEndereco());
			} else{
				break;
			}
		}
	}
}
