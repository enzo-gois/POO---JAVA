package Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Animal animal = null;
		
		ArrayList<Animal> lista = new ArrayList<>();
		
		
		while(true) {
			System.out.println("1. Incluir dados relevantes a um peixe ");
			System.out.println("2. Incluir dados relevantes a um mamífero ");
			System.out.println("3. Listar animais cadastrados ");
			System.out.println("4. Listar todos os peixes cadastrados ");
			int opcao = sc.nextInt();
			
			if(opcao == 1) {
				System.out.println("Digite o nome do peixe: ");
				String nome = sc.next();
				
				System.out.println("Digite o comprimento desse peixe: ");
				double comprimento = sc.nextDouble();
				
				System.out.println("Digite a velocidade desse peixe: ");
				double velocidade = sc.nextDouble();
				
				animal = new Peixe(nome,comprimento,0,"cinza","mar",velocidade,"Barbatana e cauda");
				lista.add(animal);
			} else if(opcao == 2) {
				System.out.println("Digite o nome do mamífero: ");
				String nome = sc.next();
				
				System.out.println("Digite o comprimento: ");
				double comprimento = sc.nextDouble();
				
				System.out.println("Digite o numero de patas: ");
				int numPatas = sc.nextInt();
				
				System.out.println("Digite a cor dele: ");
				String cor = sc.next();
				
				System.out.println("Digite a velocidade dele: ");
				double velocidade = sc.nextDouble();
				
				System.out.println("Digite o alimento favorito dele: ");
				String alimento = sc.next();
				
				animal = new Mamifero(nome,comprimento,numPatas,cor,"terra",velocidade,alimento);
				lista.add(animal);
			} else if(opcao == 3) {
				for (Animal i: lista) {
					if(i instanceof Peixe) {
						Peixe pe = (Peixe) i;
						System.out.println(pe.toString());
					} else if(i instanceof Mamifero) {
						Mamifero ma = (Mamifero) i;
						System.out.println(ma.toString());
					} else {
						System.out.println("A A FOLOU ");
					} 
				}
			} else if(opcao == 4) {
				for (Animal i: lista) {
					if(i instanceof Peixe) {
						Peixe pe = (Peixe) i;
						System.out.println(pe.toString());
					}	
				}
			} else {
				break;
			}
		}
	}
}
