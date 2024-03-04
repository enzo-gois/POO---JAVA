package Animal;

public class Mamifero extends Animal {
	String alimento;
	
	public Mamifero(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade,String alimento) {
		super(nome,comprimento,numPatas,cor,ambiente,velocidade);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public String toString() {
		return "Nome: " + nome + 
				"Comprimento: " + comprimento + 
				"Patas: " + numPatas + 
				"Cor: " + cor + 
				"Ambiente: " + ambiente + 
				"Velocidade: " + velocidade + 
				"Alimento: " + alimento;
	}
	
}
