import java.util.Scanner;

public class questão8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] nome = new String[3];
		int[] idade = new int[3];
		int pessoas = 3;
		
		for (int i=0; i<pessoas;i++) {
			System.out.println("Digite o nome da pessoa: ");
			nome[i] = sc.next();
			System.out.println("Digite a idade dela: ");
			idade[i] = sc.nextInt();
			
		}
		
		System.out.println("A pessoa mais velha é: " + pessoaVelha(nome,idade));
		System.out.println("A pessoa mais nova é: "  + pessoaNova(nome,idade));
		System.out.println("Número de pessoas acima de 18 anos: " + acimaDe18(idade));
	}
	
	public static String pessoaVelha(String[] nome, int[] idade) {
		int maior = idade[0];
		int quantmaior = 0;
		
		for (int i=0; i<idade.length; i++) {
			if (idade[i] > maior ) {
				maior = idade[i];
				quantmaior++;
			}
		}
		return nome[quantmaior];
	}
	
	public static String pessoaNova(String[] nome, int[] idade) {
		int menor = idade[0];
		int quantmenor = 0;
		
		for (int i=0;i<idade.length;i++) {
			if (idade[i] < menor) {
				menor = idade[i];
				quantmenor++;
			}
		}
		return nome[quantmenor];
	}
	
	public static int acimaDe18(int[] idade) {
		int count = 0;
		for (int i=0; i<idade.length;i++) {
			if (idade[i] >= 18) {
				count++;
			}
		}
		return count;
	}
	
}