
public class questão6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1[] = {1,2,3,4,5};
		int v2[] = {1,2,3,4,5};
		boolean iguais = true;
		
		for (int i=0;i<=4;i++) {
			if(v1[i] != v2[i]) {
				iguais = false;
				break;
			}
		}
		if(iguais) {
			System.out.println("Os vetores são iguais! ");
		} else {
			System.out.println("Os vetores são diferentes!");
		}
	}
}
