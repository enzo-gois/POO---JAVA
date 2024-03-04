package Questão1;

import java.util.Scanner;
import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Retangulo> retangulos = new ArrayList<>();
		ArrayList<Circulo> circulos = new ArrayList<>();
		
		while (true) {
			System.out.println("1. Adicionar Retangulo ");
			System.out.println("2. Adicionar Circulo ");
			System.out.println("3. Calcular média das areas ");
			System.out.println("4. Calcular médias dos perimetros ");
			System.out.println("0. Sair");
			int opcao = sc.nextInt();
			
			if(opcao ==1) {
				System.out.println("insira o valor da base: ");
				double base = sc.nextDouble();
				
				System.out.println("Insira o valor da altura: ");
				double altura = sc.nextDouble();
				
				Retangulo retangulo = new Retangulo(base,altura);
				retangulos.add(retangulo);
				
			} else if(opcao ==2) {
				System.out.println("insira o valor de pi: ");
				double pi = sc.nextDouble();
				
				System.out.println("Insira o valor do raio: ");
				double raio = sc.nextDouble();
				
				Circulo circulo = new Circulo(pi,raio);
				circulos.add(circulo);
				
			} else if(opcao ==3) {
				double soma = 0;
				for(Retangulo i: retangulos) {
					soma += i.calcularArea();
				}
				for(Circulo c: circulos) {
					soma+= c.calcularArea();
				}
				
				System.out.println("MÉDIA:" + soma/(retangulos.size()+circulos.size()));
			} else if(opcao ==4) {
				double soma =0;
				for(Retangulo i: retangulos) {
					soma += i.calcularPerimetro();
				}
				for(Circulo c: circulos) {
					soma+= c.calcularPerimetro();
				}
				
				System.out.println("MÉDIA: " + soma/(retangulos.size()+circulos.size()));
			} else if(opcao ==0) {
				break;
			} else {
				System.out.println("Insira uma opção válida!! ");
			}
		}
	}
	
}