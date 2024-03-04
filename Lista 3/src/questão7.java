import java.util.Scanner;

public class questão7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int vetor[] = {1,2,3,4,5};
		System.out.println("informe o tamanho do vetor: ");
		int tamanho = sc.nextInt();
		System.out.println(mediaDeValores(vetor,tamanho));
	}
	
	public static double mediaDeValores(int[] vetor, int tamanho) {
		double soma =0;
		for (int i=0;i<tamanho;i++) {
			soma+= vetor[i];
		}
		return soma;
	}

}
