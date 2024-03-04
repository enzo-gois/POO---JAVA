import java.util.Scanner;

public class questão5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base do retangulo: ");
		float base = sc.nextFloat();
		System.out.println("Digite ");
		float altura = sc.nextFloat();
		
		System.out.println("[1] - Calcular a área");
		System.out.println("[2] - Calcular o perímetro");
		int opcao = sc.nextInt();
		
		if (opcao == 1) {
			System.out.println(areaRetangulo(base,altura));
		} else if (opcao == 2) {
			System.out.println(perimetroRetangulo(base,altura));
		}
	}
	
	public static float areaRetangulo(float base, float altura) {
		return base*altura;
	}
	public static float perimetroRetangulo(float base, float altura) {
		return (2*base) + (2*altura);
	}

}
