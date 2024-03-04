import java.util.Scanner;

public class Questão6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] peso = new float[5];
		float[] altura = new float[5];
		float[] imc = new float[5];
		int cont_abaixo = 0;
		int cont_acima = 0;
		int cont_ideal = 0;
		for (int i=0;i<=4;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o peso: ");
			peso[i] = sc.nextFloat();
			System.out.println("Digite a altura: ");
			altura[i] = sc.nextFloat();
			imc[i] = peso[i]/(altura[i]*altura[i]);
		}
		for (int i=0;i<=4;i++) {
			if (imc[i] < 18.5) {
				cont_abaixo+=1;
			} else if (imc[i] > 18.5 && imc[i] < 25) {
				cont_ideal+=1;
			} else {
				cont_acima+=1;
			}
		}
		System.out.println("Pessoas abaixo do peso: " + cont_abaixo);
		System.out.println("Pessoas acima do peso: " + cont_acima);
		System.out.println("Pessoas no peso ideal: " + cont_ideal);
	}

}
