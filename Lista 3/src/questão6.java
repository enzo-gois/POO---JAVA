import java.util.Scanner;

public class questão6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("[1] - Transformar de Fahreinheit para Celsius");
		System.out.println("[2] - Transformar de Kelvin para Celsius");
		int opcao = sc.nextInt();
		
		if (opcao == 1) {
			System.out.println("Digite a temperatura em fahreinheit: ");
			double fah = sc.nextDouble();
			System.out.println(fahToCel(fah));
		} else if (opcao == 2) {
			System.out.println("Digite a temperatura em kelvin: ");
			double kel = sc.nextDouble();
			System.out.println(kelToCel(kel));
		}
	}
	
	public static double fahToCel(double fah) {
		double celsius = 5*(fah-32)/9;
		return celsius;
	}
	public static double kelToCel(double kel) {
		double celsius = kel -273;
		return celsius;
	}

}
