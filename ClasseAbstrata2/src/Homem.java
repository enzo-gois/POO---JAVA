
public class Homem extends PessoaIMC {
	
	public Homem(String nome,String dataNascimento,double peso, double altura) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.peso = peso;
		this.altura = altura;
	}
	

	@Override
	public String resultIMC() {
		if(calcularIMC(peso,altura) > 26.4) {
			return "Acima do peso ideal! ";
		} else if(calcularIMC(peso,altura) < 20.7) {
			return "Abaixo do peso ideal! ";
		} else {
			return "Dentro do peso ideal! ";
		}
		
	}
}
