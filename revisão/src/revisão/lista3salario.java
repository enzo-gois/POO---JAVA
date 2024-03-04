package revisão;

import java.util.Scanner;

public class lista3salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		double salario = sc.nextDouble();
		System.out.println(imposto(salario));
		
	}
	
	public static double imposto(double salario) {
		if(salario <=2000) {
			return 0;
		}else if(salario > 2000 && salario <=3500) {
			return salario/100*15;
		} else if(salario >3500 && salario <=5000) {
			return salario/100*22;
		} else {
			return salario/100*30;
		}
	}

}
