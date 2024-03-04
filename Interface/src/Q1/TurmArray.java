package Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class TurmArray implements Aluno {
	
	ArrayList<Double> notas = new ArrayList<>();
	
	public void adicionarNota(double nota) {
		notas.add(nota);
	}
	
	public void removerNota() {
		int index = notas.size() -1;
		notas.remove(index);
	}
	
	public double calcularMedia() {
		double soma =0;
			for(Double i: notas) {
				soma+=i;
			}
			return soma/notas.size();
	}
	
	public double mostrarHNota() {
		double maior =0;
		for(int i =0;i<notas.size();i++) {
			if(i==0) {
				maior = notas.get(i);
			} else if (maior < notas.get(i)) {
				maior = notas.get(i);
			}
		}
		return maior;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TurmArray aluno = new TurmArray();
		while (true) {
			System.out.println("1. Adicionar nota ");
			System.out.println("2. Remover a ultima nota ");
			System.out.println("3. Calcular a média ");
			System.out.println("4. Mostrar a maior nota tirada ");
			int opcao = sc.nextInt();
			
			if (opcao ==1) {
				System.out.println("Digite a nota: ");
				double nota = sc.nextDouble();
				aluno.adicionarNota(nota);
			} else if(opcao ==2) {
				aluno.removerNota();
			} else if(opcao ==3) {
				System.out.println(aluno.calcularMedia());
			} else if(opcao ==4) {
				System.out.println(aluno.mostrarHNota());
			} else {
				break;
			}
		}
	}
}
