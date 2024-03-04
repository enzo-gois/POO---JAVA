import java.util.Scanner;


public class Carro {
	double eficiencia;
	double combustivel;
	
	
	public Carro(double eficiencia, double combustivel) {
		super();
		this.eficiencia = eficiencia;
		this.combustivel = combustivel;
	}

	public void setReabastecer(double combustivel) {
		this.combustivel+=combustivel;
	}

	public double getCombustivel() {
		return combustivel;
	}
	
	public void andar(double quilometragem) {
		double limite = quilometragem/eficiencia;
		if (quilometragem > eficiencia*combustivel) {
			System.out.println("Para percorrer este trajeto é necessário reabastecer o carro! ");
		} else {
			System.out.println("Sobrou " + (combustivel - limite) + " de combustivel ");
			this.combustivel = combustivel - limite;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Carro carro = null;
		
		System.out.println("Digite a eficiencia do carro: ");
		double efic = sc.nextDouble();
		
		System.out.println("Insira a quantidade de combustivel presente no carro: ");
		double comb = sc.nextDouble();
		
		carro = new Carro(efic,comb);
		
		while (true) {
			System.out.println("1. Andar ");
			System.out.println("2. Reabastecer ");
			System.out.println("3. Verificar combustivel ");
			System.out.println("4. Encerrar viagem ");
			int opcao  = sc.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite a quilometragem a ser percorrida: ");
				carro.andar(sc.nextDouble());
			} else if(opcao == 2) {
				System.out.println("Digite quanto de combustivel sera reabastecido no carro: ");
				carro.setReabastecer(sc.nextDouble());
			} else if(opcao == 3) {
				System.out.println(carro.getCombustivel());
			} else if (opcao == 4){
				break;
			} else {
				System.out.println("Insira uma opcao válida! ");
			}
		}
		sc.close();
	}

}
