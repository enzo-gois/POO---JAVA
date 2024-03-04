import java.util.Scanner;

public class questão1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de funcionarios. ");
		int nfunc = sc.nextInt();
		String[] nomes = new String[nfunc];
		double[] salarios = new double[nfunc];
		
		System.out.println("Pessoas que ganham acima de 5000: " + metodo(nomes,salarios,nfunc));
	}
	public static String metodo(String[] nomes, double[] salarios,int nfunc) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		for (int i=0; i<nfunc;i++) {
			System.out.println("Digite o nome do funcionario: ");
			nomes[i] = sc.next();
			System.out.println("Digite o salario desse funcionario: ");
			salarios[i] = sc.nextDouble();
			if (salarios[i] >= 5000) {
				count++;
			}
		}
		
		String sal = "";
		for (int i=0;i<nfunc;i++) {
			if (salarios[i] >= 5000) {
			sal += nomes[i] + " ";
		}
		}
		return sal;
	}
}

