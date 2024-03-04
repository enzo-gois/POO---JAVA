import java.util.Scanner;
import java.util.ArrayList;

public class Livro {
	Autor autor;
	Editora editora;
	String ISBN;
	String titulo;
	int anoEdicao;
	
	public Livro(Autor autor, Editora editora, String iSBN, String titulo, int anoEdicao) {
		this.autor = autor;
		this.editora = editora;
		this.ISBN = iSBN;
		this.titulo = titulo;
		this.anoEdicao = anoEdicao;
	}

	public Autor getAutor() {
		return autor;
	}

	public Editora getEditora() {
		return editora;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAnoEdicao() {
		return anoEdicao;
	}
	
	public String toString() {
		return "Autor: \n" + autor.toString() + "\nEditora: \n" + editora.toString() + "\nISBN: " + ISBN + "\nTitulo: " + titulo + "\nAno: " + anoEdicao;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Livro> livros = new ArrayList<>();
		
		while(true) {
			System.out.println("1. Cadastrar Livro ");
			System.out.println("2. Buscar livro por titulo ");
			System.out.println("3. Listar livros por autor ");
			System.out.println("4. Listar todos os livros ");
			System.out.println("0. Sair ");
			int opcao = sc.nextInt();
			
			if (opcao ==1) {
				System.out.println("Digite o cpf do autor: ");
				String cpfAutor = sc.next();
				
				System.out.println("Digite o nome do autor: ");
				String nomeAutor = sc.next();
				
				System.out.println("Digite o endereco do autor: ");
				String enderecoAutor = sc.next();
				
				Autor autor = new Autor(cpfAutor,nomeAutor,enderecoAutor);
				
				System.out.println("Digite o CNPJ da editora: ");
				String cnpj = sc.next();
				
				System.out.println("DIgite o nome da editora: ");
				String nomeEditora = sc.next();
				
				System.out.println("Digite o endereco da editora: ");
				String enderecoEditora = sc.next();
				
				System.out.println("Digite o telefone da editora: ");
				String telefone = sc.next();
				
				Editora editora = new Editora(cnpj,nomeEditora,enderecoEditora,telefone);
				
				System.out.println("Digite o ISBN do livro: ");
				String isbn = sc.next();
				
				System.out.println("Digite o titulo do livro: ");
				String titulo = sc.next();
				
				System.out.println("Digite o ano de edição do livro: ");
				int anoEdicao = sc.nextInt();
				
				Livro livro = new Livro(autor,editora,isbn,titulo,anoEdicao);
				livros.add(livro);
				
			}else if(opcao ==2) {
				System.out.println("Digite o titulo do livro: ");
				String titulo = sc.next();
				
				for(Livro i: livros) {
					if(i.getTitulo().equals(titulo)) {
						System.out.println(i.toString());
					}
				}
			} else if(opcao ==3) {
				System.out.println("Digite o nome do autor: ");
				String nome = sc.next();
				
				for(Livro i: livros) {
					if((i.getAutor().getNome()).equals(nome)) {
						System.out.println(i.toString());
					}
				}
			} else if(opcao ==4) {
				for (Livro i: livros) {
					System.out.println(i.toString());
				}
			} else if(opcao ==0) {
				break;
			} else {
				System.out.println("Digite uma entrada válida! ");
			}
		}
	}
}
