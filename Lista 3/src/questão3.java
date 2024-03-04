import java.util.Scanner;

public class questão3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma string: ");
		String palavra = sc.next();
		System.out.println(vogais(palavra));
	}
	public static int vogais(String palavra) {
		int count=0;
		for (int i=0;i<palavra.length();i++) {
			char word = palavra.charAt(i);
			if (word == 'a' || word == 'e' || word == 'i' || word == 'u' || word == 'o') {
				count++;
			}
		}
		return count;
	}
}
