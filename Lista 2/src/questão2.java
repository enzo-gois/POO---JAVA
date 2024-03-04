import java.util.Scanner;

public class questão2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] lista = new float[10];
		float soma = 0;
		float maior = 0;
		float menor = 0;
		for (int i=0; i<=9;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um numero: ");
			lista[i] = sc.nextFloat();
		}
		for (int i=0;i<=9;i++) {
			soma+=lista[i];
			if (i == 0) {
				maior = menor = lista[i];
			} else {
				if (lista[i] > maior) {
					maior = lista[i];
				}if (lista[i] < menor) {
					menor = lista[i];
				}
			}
		}
		System.out.println("A média dos numeros digitados é igual a: " + soma/10);
		System.out.println("O maior numero digitado foi: " + maior);
		System.out.println("O menor numero digitado foi: " + menor);
	}

}
