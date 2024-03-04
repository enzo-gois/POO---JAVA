
public class Mulher extends PessoaIMC {
	
	public Mulher(String nome,String dataNascimento,double peso, double altura) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	@Override
	public String resultIMC() {
		if(calcularIMC(peso,altura) > 25.8) {
			return "Acima do peso ideal! ";
		} else if(calcularIMC(peso,altura) < 19) {
			return "Abaixo do peso ideal! ";
		} else {
			return "Dentro do peso ideal! ";
		}
	}
}
