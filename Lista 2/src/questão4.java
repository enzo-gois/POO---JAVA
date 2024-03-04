import java.util.Scanner;

public class questão4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] lista = new float[10];
		for (int i=0;i<=9;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um numero: ");
			lista[i] = sc.nextFloat();
		}
		for (int i=9;i>=0;i--) {
			System.out.println(lista[i]);
		}
	
	}

}
