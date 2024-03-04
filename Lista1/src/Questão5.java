import java.util.Scanner;

public class Questão5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		float p1 = sc.nextFloat();
		System.out.println("Digite o segundo numero: ");
		float p2 = sc.nextFloat();
		System.out.println("Digite a operação desejada: ");
		String p3 = sc.next();
		if (p3.equals("+")) {
			System.out.println("A soma dos valores é igual a: " + (p1+p2));
		} else if (p3.equals("-")) {
			System.out.println("A suubtração dos valores é igual a: " + (p1-p2));
		} else if (p3.equals("*")) {
			System.out.println("A multiplicação dos valores é igual a: " + (p1*p2));
		} else if (p3.equals("/")) {
			System.out.println("A divisão dos valores é igual a: " + (p1/p2));
		}
	}

}
