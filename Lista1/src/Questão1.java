import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano do nascimento: ");
		int ano = sc.nextInt();
		System.out.println("Digite o ano em que estamos: ");
		int anoatual = sc.nextInt();
		System.out.println("Voce possui " + (anoatual - ano) + " anos de idade!");
		sc.close();
	}
}
