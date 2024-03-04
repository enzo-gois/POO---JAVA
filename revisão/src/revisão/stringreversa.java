package revisão;

import java.util.Scanner;

public class stringreversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma string: ");
		String str = sc.next();
		
		for(int i=(str.length()-1);i>=0;i--) {
			char word = str.charAt(i);
			System.out.println(word);
		}
	}
}