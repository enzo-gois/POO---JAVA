import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double soma = 0;
		for (int i = 1; i<=5;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite a altura " + i + ":");
			double alt = sc.nextDouble();
			soma += alt;
		}
		System.out.println("A média de altura dessas pessoas é igual a " + soma/5);
	}
}
