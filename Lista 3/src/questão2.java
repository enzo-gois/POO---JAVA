import java.util.Scanner;

public class questão2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		float n1 = sc.nextFloat();
		System.out.println("Digite outro numero: ");
		float n2 = sc.nextFloat();
		System.out.println("Digite a operação a ser realizada: ");
		String op = sc.next();
		
		if (op.equals("+")) {
			System.out.println(somando(n1,n2));
		} else if (op.equals("-")) {
			System.out.println(subtraindo(n1,n2));
		} else if (op.equals("*")) {
			System.out.println(multiplicando(n1,n2));
		} else if (op.equals("/")) {
			System.out.println(dividindo(n1,n2));
		}
	}
	public static float somando(float n1, float n2) {
		return n1+n2;
	}
	public static float subtraindo(float n1, float n2) {
		return n1-n2;
	}
	public static float multiplicando(float n1, float n2) {
		return n1*n2;
	}
	public static float dividindo(float n1, float n2) {
		return n1/n2;
	}

}
