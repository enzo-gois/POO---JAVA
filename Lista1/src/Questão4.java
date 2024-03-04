import java.util.Scanner;

public class Questão4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0;
		int cont = 0;
		float result =0;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite a idade: ");
			int idade = sc.nextInt();
			if (idade != 0) {
				soma+=idade;
				cont+=1;
			} else if(idade == 0) {
				break;
			}
		result = soma/cont;
		}
		System.out.println("A média das idades digitadas é igual a " + result);
	}
}