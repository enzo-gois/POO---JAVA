import java.util.Scanner;

public class questão5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da lista: ");
		int quant = sc.nextInt();
		String[] pessoas = new String[quant];
		int count =0;
		for (int i=0;i<=quant-1;i++) {
			System.out.println("Digite o nome: ");
			pessoas[i] = sc.next();
		}
		System.out.println("Digite qual nome quer acessar: ");
		String acesso = sc.next();
		for (int i=0;i<=quant-1;i++) {
			if (acesso.equals(pessoas[i])) {
				count+=1;
			} else {
				count+=0;
			}
		}
		if (count > 0) {
			System.out.println("Esta pessoa está na lista! ");
		} else {
			System.out.println("Esta pessoa não está na lista: ");
		}
		
	}

}
