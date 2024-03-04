
public abstract class PessoaIMC extends Pessoa {
	double peso;
	double altura;
	
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularIMC(double peso, double altura) {
		double imc = peso/(altura*altura);
		return imc;
	}
	
	abstract String resultIMC();
	
	public String toString() {
		return "Nome: " + nome + "\nDataNascimento: " + dataNascimento + "\nPeso: " + peso + "\nAltura: " + altura; 
	}
}
