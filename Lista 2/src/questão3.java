import java.util.Scanner;

public class questão3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] lista = new float[10];
		float media = 7;
		int acima_da_media = 0;
		for (int i=0;i<=9;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite a nota do aluno: ");
			lista[i] = sc.nextFloat();
		}
		for (int i=0;i<=9;i++) {
			if (lista[i] >= 7) {
				acima_da_media+=1;
			}
		}
		System.out.println("Quantidade de alunos acima da média: " + acima_da_media);
	}

}
