package revisão;

import java.util.Scanner;

public class Lista1IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[] imc = new double[3];
		double[] pesos = new double[3];
		double[] alturas = new double[3];
		
		for (int i=0;i<3;i++) {
			System.out.println("Digite o peso: ");
			double peso = sc.nextDouble();
			pesos[i] = peso;
			System.out.println("Digite a altura: ");
			double altura = sc.nextDouble();
			alturas[i] = altura;
			imc[i] = pesos[i]/(alturas[i]*alturas[i]);
		}		
		
		int acima =0;
		int ideal = 0;
		int abaixo =0;
		
		for (int i=0; i<imc.length;i++) {
			if(imc[i] < 18.5) {
				abaixo++;
			} else if(imc[i]> 18.5 && imc[i]<25) {
				ideal++;
			} else {
				acima++;
			}
		}
		
		System.out.println("Pessoas abaixo do peso: " + abaixo);
		System.out.println("Pessoas no peso ideal: " + ideal);
		System.out.println("Pessoas acima do peso: " + acima);
	}

}
