
import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<PessoaIMC> pessoas = new ArrayList<>();
		
		while (true) {
			System.out.println("1. Cadastra Homem ");
			System.out.println("2. Cadastra Mulher ");
			System.out.println("3. Consultar IMC ");
			System.out.println("4. Listar Homens ");
			System.out.println("5. Listar Mulheres ");
			System.out.println("6. Listar todos IMC´s dos homens ");
			System.out.println("7. Listar todos os IMC´s ");
			System.out.println("0. Sair ");
			int opcao = sc.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite o nome: ");
				String nome = sc.next();
				System.out.println("Digite a data de nascimento: ");
				String dataN = sc.next();
				System.out.println("Digite o peso: ");
				double peso = sc.nextDouble();
				System.out.println("digite a altura: ");
				double altura = sc.nextDouble();
				
				PessoaIMC homem = new Homem(nome,dataN,peso,altura);
				pessoas.add(homem);
				
			} else if(opcao ==2) {
				System.out.println("Digite o nome: ");
				String nome = sc.next();
				System.out.println("Digite a data de nascimento: ");
				String dataN = sc.next();
				System.out.println("Digite o peso: ");
				double peso = sc.nextDouble();
				System.out.println("digite a altura: ");
				double altura = sc.nextDouble();
				
				PessoaIMC mulher = new Mulher(nome,dataN,peso,altura);
				pessoas.add(mulher);
				
			} else if(opcao ==3) {
				System.out.println("Informe o nome: ");
				String nome = sc.next();
				
				for(PessoaIMC i: pessoas) {
					if(i != null) {
						if(nome.equals(i.getNome())) {
							if(i instanceof Homem) {
								Homem h = (Homem) i;
								System.out.println(h.calcularIMC(h.getPeso(),h.getAltura()) + " " + h.resultIMC());
							} else if(i instanceof Mulher) {
								Mulher m = (Mulher) i;
								System.out.println(m.calcularIMC(m.getPeso(),m.getAltura()) + " " + m.resultIMC());
							}
						}
					}
				}
			} else if(opcao ==4) {
				for(PessoaIMC i: pessoas) {
					if(i instanceof Homem) {
						Homem h = (Homem) i;
						System.out.println(h.toString());
					}
				}
			} else if (opcao ==5) {
				for(PessoaIMC i: pessoas) {
					if(i instanceof Mulher) {
						Mulher m = (Mulher) i;
						System.out.println(m.toString());
					}
				}
			} else if(opcao == 6) {
				for(PessoaIMC i: pessoas) {
					if(i instanceof Homem) {
						Homem h = (Homem) i;
						System.out.println(h.calcularIMC(h.getPeso(),h.getAltura()) + " " + h.resultIMC());
					}
				}
			} else if(opcao ==7) {
				for(PessoaIMC i: pessoas) {
					if(i instanceof Homem) {
						Homem h = (Homem) i;
						System.out.println(h.calcularIMC(h.getPeso(),h.getAltura()) + " " + h.resultIMC());
					} else if(i instanceof Mulher) {
						Mulher m = (Mulher) i;
						System.out.println(m.calcularIMC(m.getPeso(),m.getAltura()) + " " + m.resultIMC());
					}
				}
			} else if(opcao ==0) {
				break;
			} else {
				System.out.println("Digite uma opção válida! ");
			}
		}
	}
}
