import java.util.Scanner;

public class Retangulo {
	double base;
	double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double area() {
		double media = 0;
		media = base*altura;
		return media;
	}
	
	public double perimetro() {
		double perimetro = 0;
		perimetro = (2*base)+(2*altura);
		return perimetro;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = null;
		
		
		while (true) {
			System.out.println("1. Criar um retangulo");
			System.out.println("2. Calcular Àrea");
			System.out.println("3. Calcular Perímetro");
			System.out.println("0. Sair");
			int opcao = sc.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite o valor da base: ");
				double base = sc.nextDouble();
				
				System.out.println("Digite o valor da altura: ");
				double altura = sc.nextDouble();
				
			retangulo = new Retangulo(base,altura);
			} else if(opcao ==2) {
				System.out.println("A área desse retangulo é: " + retangulo.area());
			} else if(opcao ==3) {
				System.out.println("O perímetro desse retangulo é: " + retangulo.perimetro());
			} else if(opcao ==0) {
				break;
			} else {
				System.out.println("Digite uma opcao válida! ");
			}
			
		}
		
	}

}
