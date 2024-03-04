package Ex3;

public class VIP extends Ingresso {
	private double adicional;
	
	public VIP(double valor,double adicional) {
		super(valor);
		this.adicional = 10;
	}
	
	public void setValor() {
		this.valor = valor + adicional;
	}
	
	public double valorFinal() {
		return valor;
	}
	
}
