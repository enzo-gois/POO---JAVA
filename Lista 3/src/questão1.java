import java.util.Scanner;

public class questão1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int digitado = sc.nextInt();
		System.out.println(parOuImpar(digitado));
	}
	public static String parOuImpar(int digitado) {
		if (digitado == 0) {
			return "O numero digitado não é PAR nem Impar!";
		} else if (digitado %2 == 0) {
			return "O numero é PAR!";
		} else {
			return "O numero é IMPAR!";
		}
	}

}
