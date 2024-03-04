package revisão;

import java.util.Scanner;

public class maioremenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[3];
		
		for(int i=0;i<3;i++) {
			System.out.println("Digite o numero: ");
			numeros[i] = sc.nextInt();
		}
		
		int maior = 0;
		int menor = 0;
		
		for(int i=0;i<3;i++) {
			if(i == 0) {
				maior = menor = numeros[0];
			} else if(numeros[i]> maior) {
				maior = numeros[i];
			} else if(numeros[i] < menor) {
				menor = numeros[i];
			} 
		}
		
		System.out.println(maior);
		System.out.println(menor);
		
	}
}