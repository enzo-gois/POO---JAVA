import java.util.Scanner;

public class questão4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o salário: ");
		double sal = sc.nextDouble();
		System.out.println(imposto(sal));
	}
	
	public static Double imposto(Double sal) {
		if (sal <= 2000) {
			return sal - sal;
		} else if ((sal >= 2000.1) && (sal <= 3500)){
			return sal/100*15;
		} else if ((sal >= 3500.1) && (sal <= 5000)) {
			return sal/100*22;
		} else {
			return sal/100*30;
		}
	}

}
