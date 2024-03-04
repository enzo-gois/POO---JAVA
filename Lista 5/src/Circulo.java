import java.util.Scanner;

public class Circulo {
	double raio;
	double pi = 3.14;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double area() {
		double area = 0;
		area = pi*(raio*raio);
		return area;
	}
	
	public double perimetro() {
		double perimetro =0;
		perimetro = 2*pi*raio;
		return perimetro;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Circulo circulo = null;
		
		while (true) {
			System.out.println("1. Criar circulo");
			System.out.println("2. Calcular Área");
			System.out.println("3. Calcular Perímetro");
			System.out.println("0. Sair");
			int opcao = sc.nextInt();
			
			if (opcao ==1) {
				System.out.println("Digite o valor do raio: ");
				double raio = sc.nextDouble();
				
			circulo = new Circulo(raio);
			} else if(opcao ==2) {
				System.out.println(circulo.area());
			} else if(opcao ==3) {
				System.out.println(circulo.perimetro());
			} else if (opcao ==0) {
				break;
			} else {
				System.out.println("Digite uma opcao válida! ");
			}
		}
		
	}

}
