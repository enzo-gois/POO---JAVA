package questão3;

import java.util.Scanner;
import java.util.ArrayList;

public class Turma {
	int codigo;
	String nome;
	ArrayList<Estudante> estudantes = new ArrayList<>();
	
	public Turma(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Estudante> getEstudante() {
		return estudantes;
	}
	
	public int quantEstudantes() {
		return estudantes.size();
	}

	public void adEstudante(Estudante estudante) {
		this.estudantes.add(estudante);
	}

	public String toString() {
		return "Código: " + codigo + "\nNome da turma: " + nome;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Turma[] turmas = new Turma[10];

		int numTurmas = 0;
		
		while (true) {
			System.out.println("1. Cadastrar turma ");
			System.out.println("2. Cadastrar estudante ");
			System.out.println("3. Listar turmas ");
			System.out.println("4. Listar estudantes ");
			System.out.println("5. Consultar média de um estudante ");
			System.out.println("6. Alterar notas de um estudante ");
			System.out.println("7. Exibir média dos estudantes de uma turma ");
			System.out.println("0. Sair ");
			int opcao = sc.nextInt();
			
			if (opcao ==1) {
				if(numTurmas>=10) {
					System.out.println("O limite de 10 turmas foi atingido! \n");
				} else {
					System.out.println("Digite o codigo da turma: ");
					int codigo = sc.nextInt();
					
					System.out.println("Digite o nome da turma: ");
					String nome = sc.next();
					
					Turma turma = new Turma(codigo,nome);
					turmas[numTurmas] = turma;
					numTurmas++;
				}
				
			} else if(opcao ==2) {				
				System.out.println("Digite o codigo da turma: ");
				int codigo = sc.nextInt();
				
				for (Turma i: turmas) {
					if(i!= null && i.getCodigo() == codigo) {
						if(i.quantEstudantes() == 10) {
							System.out.println("O limite de estudantes para essa turma foi atingido! \n");
						}else {
						System.out.println("Digite a matricula do estudante: ");
						int matricula = sc.nextInt();
						
						System.out.println("Digite o nome do estudante: ");
						String nomeE = sc.next();
						
						double notasE[] = new double[4];						
						for (int c =0 ;c<4;c++) {
							System.out.println("Digite a nota " + (c+1) + " do estudante: ");
							notasE[c] = sc.nextDouble();
						}
						
						Estudante estudante = new Estudante(matricula,nomeE,notasE);
						i.adEstudante(estudante);	
						}
					}
				}
			} else if(opcao ==3) {
				for (Turma i: turmas) {
					if(i!= null) {						
						System.out.println(i.toString());
					}
				}
			} else if(opcao ==4) {
				System.out.println("Informe o código da turma: ");
				int codigo = sc.nextInt();
				
				for(Turma i: turmas) {
					if(i!= null && i.getCodigo() == codigo) {
						for(Estudante p: i.getEstudante()) {
							if(p!= null) {
								System.out.println(p.toString());								
							}
						}
					}
				}
			} else if(opcao ==5) {
				System.out.println("Informe o codigo da turma: ");
				int codigo = sc.nextInt();
				
				System.out.println("Informe a matricula do estudante: ");
				int matricula = sc.nextInt();
				
				for(Turma i: turmas) {
					if(i!=null && i.getCodigo() == codigo) {
						for(Estudante p: i.getEstudante()) {
							if(p!= null &&p.getMatricula() == matricula) {
								System.out.println(p.media());									
							}
						}
					}
				}
			} else if(opcao ==6) {
				System.out.println("Informe o codigo da turma: ");
				int codigo = sc.nextInt();
				
				System.out.println("Informe a matricula do estudante: ");
				int matricula = sc.nextInt();
				
				
				for(Turma i: turmas) {
					if(i.getCodigo() == codigo) {
						for(Estudante p: i.getEstudante()) {
							if(p.getMatricula() == matricula) {
								double notasNovas[] = new double[4];
								for(int n=0;n<4;n++) {
									System.out.println("Digite a nova nota " + n + "do estudante: ");
									notasNovas[n] = sc.nextDouble();
								}
								p.setNotas(notasNovas);
							}
							
						}
					}
				}
			} else if(opcao ==7) {
				System.out.println("Informe o codigo da turma: ");
				int codigo = sc.nextInt();
				
				for(Turma i: turmas) {
					if(i!= null && i.getCodigo() == codigo) {
						for(Estudante p: i.getEstudante()) {
							System.out.println(p.media());
						}
					}
				}
			} else if(opcao ==0) {
				break;
			} else {
				System.out.println("Digite uma entrada válida! ");
			}
		}
	}
}