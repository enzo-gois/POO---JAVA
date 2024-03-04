package revisão;

import java.util.Scanner;

public class numerosinverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[] numeros = new double[5];
		
		
		for(int i=0;i<5;i++) {
			System.out.println("Digite um nuemro: ");
			numeros[i] = sc.nextDouble();
		}
		
		for(int i=4;i>=0;i--) {
			System.out.println(numeros[i]);
		}
		
		
	}

}
