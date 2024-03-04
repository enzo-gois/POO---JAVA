import java.util.ArrayList;
import java.util.Scanner;

public class Livro {
	String autor;
	String editora;
	String iSBN;
	String titulo;
	int ano_edicao;
	
	
	public Livro(String autor, String editora, String iSBN, String titulo, int ano_edicao) {
		this.autor = autor;
		this.editora = editora;
		this.iSBN = iSBN;
		this.titulo = titulo;
		this.ano_edicao = ano_edicao;
	}
	
	
	public String getAutor() {
		return autor;
	}


	public String getEditora() {
		return editora;
	}


	public String getiSBN() {
		return iSBN;
	}


	public String getTitulo() {
		return titulo;
	}


	public int getAno_edicao() {
		return ano_edicao;
	}
	
	public String toString() {
		return "Título: " + titulo + "\nAutor: " + autor + "\nEditora: " + editora + "\nISBN: " + iSBN + "\nAno: " + ano_edicao;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Livro livro = null;
		
		ArrayList<Livro> livros = new ArrayList<>();
		
		while (true) {
			System.out.println("1. Cadastrar Livro ");
			System.out.println("2. Buscar livro por título ");
			System.out.println("3. Listar livros por autor ");
			System.out.println("4. Listar todos os livros ");
			System.out.println("0. Sair");
			int opcao = sc.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite o título do livro: ");
				String titulo = sc.next();
				
				System.out.println("Digite o nome do autor: ");
				String autor = sc.next();
				
				System.out.println("Digite o nome da editora: ");
				String editora = sc.next();
				
				System.out.println("Digite o ISBN do livro: ");
				String iSBN = sc.next();
				
				System.out.println("Digite o ano de edição do livro: ");
				int ano_edicao = sc.nextInt();
				
				livro = new Livro(autor,editora,iSBN,titulo,ano_edicao);
				livros.add(livro);
			} else if (opcao == 2) {
				System.out.println("Digite o titulo do livro: ");
				String titulo = sc.next();
				
				for (Livro i: livros) {
					if (i.getTitulo().equals(titulo)) {
						System.out.println(i.toString());
					}
				}
			} else if( opcao ==3) {
				System.out.println("Digite o nome do autor: ");
				String autor = sc.next();
				
				for(Livro i: livros) {
					if(i.getAutor().equals(autor)) {
						System.out.println(i.toString());
					}
				}
			} else if(opcao ==4) {
				for(Livro i: livros) {
					System.out.println(i.toString());
				}
			} else if(opcao ==0) {
				break;
			} else {
				System.out.println("DIgite um entrada válida! ");
			}
		}
	}
}
