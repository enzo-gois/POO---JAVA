import java.util.Scanner;

public class questão8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String palavra = sc.nextLine().replace(" ","");
		System.out.println(palavra.length());
	}

}
