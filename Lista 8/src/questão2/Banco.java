package questão2;

public class Banco {
	String nomeAgencia;
	int numeroAgencia;
	
	public Banco(String nomeAgencia, int numeroAgencia) {
		this.nomeAgencia = nomeAgencia;
		this.numeroAgencia = numeroAgencia;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	
}
