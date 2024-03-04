package q1;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quadrilatero[] objetos = new Quadrilatero[10];
		int cont = 0;
		
		while (true) {
			System.out.println("1. Cadastrar Retângulo ");
			System.out.println("2. Cadastrar Circulo ");
			System.out.println("3. Cadastrar Quadrado ");
			System.out.println("4. Mostrar o valor de todas as áreas ");
			System.out.println("5. Mostrar o valor de todos os perímetros ");
			System.out.println("0. Sair ");
			int opcao = sc.nextInt();
			
			if(opcao ==1) {
				System.out.println("Digite o valor do lado: ");
				float lado = sc.nextFloat();
				System.out.println("Digite o valor da altura: ");
				float altura = sc.nextFloat();
				Quadrilatero objeto = new Retangulo(lado,altura);
				objetos[cont] = objeto;
				cont++;
			} else if(opcao ==2) {
				System.out.println("Digite o valor do raio: ");
				float raio = sc.nextFloat();
				Quadrilatero objeto = new Circulo(raio);
				objetos[cont] = objeto;
				cont++;
			}else if(opcao == 3) {
				System.out.println("Digite o valor do lado: ");
				float lado = sc.nextFloat();
				Quadrilatero objeto = new Quadrado(lado,lado);
				objetos[cont] = objeto;
				cont++;
			} else if(opcao ==4) {
				for(Quadrilatero i: objetos) {
					if(i != null) {
						if (i instanceof Retangulo) {
							Retangulo re = (Retangulo) i;
							System.out.println("Retangulo: " + re.calcularArea());
						} else if(i instanceof Circulo) {
							Circulo ci = (Circulo) i;
							System.out.println("Circulo: " + ci.calcularArea());
						} else {
							Quadrado qu = (Quadrado) i;
							System.out.println("Quadrado: " + qu.calcularArea());
						}
					}
				}
			} else if(opcao ==5) {
				for(Quadrilatero i: objetos) {
					if(i != null) {
						if (i instanceof Retangulo) {
							Retangulo re = (Retangulo) i;
							System.out.println("Retangulo: " + re.calcularPerimetro());
						} else if(i instanceof Circulo) {
							Circulo ci = (Circulo) i;
							System.out.println("Circulo: " + ci.calcularPerimetro());
						} else {
							Quadrado qu = (Quadrado) i;
							System.out.println("Quadrado: " + qu.calcularPerimetro());
						}
					}
				}
			}else if(opcao ==0) {
				break;
			} else {
				System.out.println("Digite uma opção válida! ");
			}
		}
	}

}
