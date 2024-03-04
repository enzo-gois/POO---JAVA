package questão3;


public class Estudante {
	int matricula;
	String nome;
	double notas[];
	
	public Estudante(int matricula, String nome,double[] notas) {
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public String toString() {
		return "Matrícula: " + matricula + "\nNome: " + nome + "\nNota1: " + notas[0] + "\nNota2: " + notas[1] + 
				"\nNota3: " + notas[2] + "\nNota4: " + notas[3];
	}
	
	public double media() {
		double soma = 0;
		for(double i: notas) {
			soma+=i;
		}
		return soma/4;
	}
	
}
