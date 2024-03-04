import java.util.Scanner;

public class questão9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = sc.nextLine().toLowerCase();
		int count = 0;
		
		for (int i=0;i<palavra.length();i++) {
			 char word = palavra.charAt(i);
			if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
				count ++;
			}
	}
		System.out.println("a palavra " + palavra + " possui " +count + " vogais" );
}
}
