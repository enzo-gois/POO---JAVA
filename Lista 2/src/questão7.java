import java.util.Scanner;

public class questão7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma string: ");
		String palavra = teclado.nextLine();
		String invertida = new StringBuilder(palavra).reverse().toString();
		System.out.println(invertida);
	}

}
