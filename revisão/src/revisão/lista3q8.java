package revisão;

import java.util.Scanner;

public class lista3q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] nomes = new String[3];
		int[] idades = new int[3];
		
		for(int i=0;i<3;i++) {
			System.out.println("Digite o nome: ");
			nomes[i] = sc.next();
			System.out.println("Digite a idade: ");
			idades[i] = sc.nextInt();
		}
		
		System.out.println(nova(idades,nomes));
		System.out.println(velha(idades,nomes));
		System.out.println(acima(idades));
	}
	
	public static int acima(int[] idades) {
		int count =0;
		
		for(int i: idades) {
			if(i > 18) {
				count++;
			}
		}
		return count;
	}
	
	public static String nova(int[] idades, String[] nomes) {
		int menor = 0;
		int num = 0;
		
		for(int i=0;i<idades.length;i++) {
			if(i == 0) {
				menor = idades[i];
			} else if(idades[i] < menor) {
				menor = idades[i];
				num = i;
			}
		}
		return nomes[num];
	}
	
	public static String velha(int[] idades, String[] nomes) {
		int maior = 0;
		int num = 0;
		
		for(int i=0;i<idades.length;i++) {
			if(i == 0) {
				maior = 0;
			} else if(idades[i] > maior) {
				maior = idades[i];
				num = i;
			}
		}
		return nomes[num];
	}
}
