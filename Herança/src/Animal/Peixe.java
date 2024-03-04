package Animal;

public class Peixe extends Animal {
	String caracteristica;
	
	public Peixe(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade,String caracteristica) {
		super(nome,comprimento,numPatas,cor,ambiente,velocidade);
		this.caracteristica = caracteristica;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public String toString() {
		return "Nome: " + nome + 
				"Comprimento: " + comprimento + 
				"Patas: " + numPatas + 
				"Cor: " + cor + 
				"Ambiente: " + ambiente + 
				"Velocidade: " + velocidade + 
				"Caracteristica: " + caracteristica;
	}

}
