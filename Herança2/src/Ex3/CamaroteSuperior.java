package Ex3;

public class CamaroteSuperior extends VIP {
	double valorAdicional;
	
	public CamaroteSuperior(double valor, double adicional, double valorAdicional) {
		super(valor,adicional);
		this.valorAdicional = valorAdicional;
	}
	
	public void setValor() {
		this.valor = valor + valorAdicional;
	}
	
	public double imprimir() {
		return valor;
	}

}
