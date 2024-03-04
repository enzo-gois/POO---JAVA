import java.util.Scanner;
import java.util.ArrayList;


public class Produto {
	String nome;
	String codigo;
	double  preco;
	int quantidade;
	
	public Produto(String nome, String codigo, double preco, int quantidade) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void venda() {
		this.quantidade = quantidade - 1;
	}
	
	public String toString() {
		return "Nome: " + nome + "\nCódigo: " + codigo + "\nPreço: " + preco + "\nQuantidade: " + quantidade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<>();
		
		Produto produto = null;
		
		while (true) {
			System.out.println("1. Cadastrar produto ");
			System.out.println("2. Buscar produto ");
			System.out.println("3. Listar todos os produtos ");
			System.out.println("4. Efetuar venda de produto ");
			int opcao = sc.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite o nome do produto: ");
				String nome = sc.next();
				
				System.out.println("DIgite o código do produto: ");
				String codigo = sc.next();
				
				System.out.println("Digite o preço do produto: ");
				double preco = sc.nextDouble();
				
				System.out.println("Digite a quantidade existente deste produto: ");
				int quantidade = sc.nextInt();
				
				produto = new Produto(nome,codigo,preco,quantidade);
				produtos.add(produto);
				
			} else if(opcao == 2) {
				System.out.println("Digite o nome do produto: ");
				String nome = sc.next();
				
				for (Produto i: produtos) {
					if(i.getNome().equals(nome)) {
						System.out.println(i.toString());
					}
				}
			} else if(opcao ==3) {
				for(Produto i: produtos) {
					System.out.println(i.toString());
				}
			} else if(opcao ==4) {
				System.out.println("Digite qual o produto será vendido: ");
				String nome = sc.next();
				
				for(Produto i: produtos) {
					if(i.getNome().equals(nome)) { 
						if (i.getQuantidade() == 1) {
							produtos.remove(i);
							break;
						} else {
							i.venda();
						}
						}
				}
			} else {
				break;
			}
		}
	}
}
