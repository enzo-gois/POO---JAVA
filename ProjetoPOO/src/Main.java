

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static int opcao;
	
	public static void main(String[] args) {
		
		while (true) {
			opcao = menu();
			
			switch(opcao) {
			case 1:
				vender();
				break;
			case 2:
				cadastrar();
				break;
			case 3:
				remover();
				break;
			case 4:
				adicionarQtd();
				break;
			case 5:
				listarTodos();
				break;
			case 6:
				faturamento();
				break;
			case 0:
				System.out.println("ENCERRANDO SISTEMA");
				System.exit(0);
			default:
				System.out.println("\nOPÇÃO NÃO ENCONTRADA! TENTE NOVAMENTE");
			}
		}
	}
	

	private static void vender(){
		// TODO Auto-generated method stub
		
	}

	private static void cadastrar(){
		System.out.println("NOME: ");
		String nome = sc.next().toUpperCase();	
		sc.nextLine();
		System.out.println("PREÇO: ");
		double preco = sc.nextDouble();
		System.out.println("DATA DE VALIDADE format:(yyyy-mm-dd): ");
		String data = sc.next();
		sc.nextLine();
		System.out.println("QUANTIDADE: ");
		int qtdProduto = sc.nextInt();
		System.out.println("CÓDIGO DE BARRA: ");
		String codBarra = sc.next().toUpperCase();
		
		while (true) {
			System.out.println("SIGA AS INSTRUÇÕES REFERENTE AO TIPO DE CADASTRO:\nDIGITE 1 - PARA PRODUTO\nDIGITE 2 - PARA MEDICAMENTO");
			String ask = sc.next();
			
			if (ask.equals('1')) {
				ProdutoGeral produto = new ProdutoGeral(nome,preco,data,qtdProduto,codBarra);
				System.out.println("PRODUTO CADASTRADO!");
				produto.adicionar(produto);
				break;
			} else  if (ask.equals('2')){
				System.out.println("INFORME O PRINCIPIO ATIVO DO MEDICAMENTO: ");
				String pAtivo = sc.next();
				System.out.println("SIGA AS INSTRUÇÕES REFERENTE AO TIPO DE MEDICAMENTO:\\nDIGITE 1 - MEDICAMENTO SEM RECEITA\\nDIGITE 2 - MEDICAMENTO COM RECEITA");
				String resposta = sc.next();
				if (resposta.equals("1")) {
					Produto remedio = new Medicamento(nome,preco,data,qtdProduto,codBarra,pAtivo);
					System.out.println("MEDICAMENTO CADASTRADO!");
					break;
				} else if (resposta.equals("2")) {
					System.out.println("DIGITE A RECEITA: ");
					String receita = sc.next().toUpperCase();				
					Produto remedio2 = new MedicamentoReceita(nome,preco,data,qtdProduto,codBarra,pAtivo,receita);
					System.out.println("MEDICAMENTO CADASTRADO!");
					break;
				} else if ((!resposta.equals("1")) && (!resposta.equals("2"))) {
					System.out.println("\nENTRADA INVÁLIDA. DIGITE APENAS 1 OU 2.");
				}
			} else if ((!ask.equals("1")) && (!ask.equals("2"))) {
				System.out.println("\nENTRADA INVÁLIDA. DIGITE APENAS 1 OU 2.");
			}
		}
			
	}

	private static void remover(){
		// TODO Auto-generated method stub
		
	}
	
	private static void adicionarQtd() {
		// TODO Auto-generated method stub
		
	}

	private static void listarTodos(){
	
		
		
	}
	

	private static void faturamento(){
		// TODO Auto-generated method stub
		
	}

	public static int menu() {
		System.out.println("=======BEM-VINDO=======");
		System.out.println("==SELECIONE UMA OPÇÃO==");
		System.out.println("1 - VENDER PRODUTO");
		System.out.println("2 - CADASTRAR PRODUTO");
		System.out.println("3 - REMOVER PRODUTO");
		System.out.println("4 - ADICIONAR QUANTIDADES");
		System.out.println("5 - LISTAR TODOS OS PRODUTOS");
		System.out.println("6 - FATURAMENTO");
		System.out.println("0 - SAIR");
		
		boolean inputValido = false;
        while (!inputValido) {
            try {
                System.out.print("DIGITE UMA OPÇÃO: : ");
                opcao = sc.nextInt();
                sc.nextLine();

                inputValido = true;
            } catch (InputMismatchException e) {
                System.out.println("\nENTRADA INVÁLIDA! TENTE NOVAMENTE!");
                sc.nextLine();
            }
        }
		return opcao;
	}
}
