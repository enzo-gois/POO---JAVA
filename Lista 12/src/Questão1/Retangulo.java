package Questão1;

import java.util.Scanner;

public class Retangulo implements ObjetoGeometrico {
	double base;
	double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return base*altura;
	}
	
	@Override
	public double calcularPerimetro() {
		return 2*base+2*altura;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = null;
		
		while (true) {
			System.out.println("1. Digitar o valor de base e altura ");
			System.out.println("2. Calcular Area ");
			System.out.println("3. Calcular Perimetro");
			System.out.println("0. Sair ");
			int opcao = sc.nextInt();
			
			if(opcao == 1) {
				System.out.println("Digite o valor da base: ");
				double base = sc.nextDouble();
				
				System.out.println("Digite o valor da altura: ");
				double altura = sc.nextDouble();
				
				retangulo = new Retangulo(base,altura);
				
			} else if(opcao ==2) {
				System.out.println(retangulo.calcularArea());
			}else if(opcao ==3) {
				System.out.println(retangulo.calcularPerimetro());
			} else if(opcao ==4) {
				break;
			}
		}
	}
}