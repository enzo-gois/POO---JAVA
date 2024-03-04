package Questão1;

import java.util.Scanner;

public class Circulo implements ObjetoGeometrico {
	double pi;
	double raio;
	
	public Circulo(double pi, double raio) {
		this.pi = pi;
		this.raio = raio;
	}
	
	public double calcularArea() {
		return pi*(raio*raio);
	}
	
	public double calcularPerimetro() {
		return 2*pi*raio;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circulo circulo = null;
		
		while (true) {
			System.out.println("1. Digite os valores de pi e raio ");
			System.out.println("2. Caclular Area ");
			System.out.println("3. Calcular Periemtro ");
			System.out.println("0. Sair");
			int opcao = sc.nextInt();
			
			if(opcao ==1) {
				System.out.println("insira o valor de pi: ");
				double pi = sc.nextDouble();
				
				System.out.println("Insira o valor do raio: ");
				double raio = sc.nextDouble();
				
				circulo = new Circulo(pi,raio);
				
			} else if(opcao ==2) {
				System.out.println(circulo.calcularArea());
			} else if(opcao ==3) {
				System.out.println(circulo.calcularPerimetro());
			} else if(opcao ==0) {
				break;
			}
		}
	}
}