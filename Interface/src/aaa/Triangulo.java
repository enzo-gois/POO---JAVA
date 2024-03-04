package aaa;

public class Triangulo implements FiguraGeometrica {
	int base;
	int altura;
	int ladoA;
	int ladoB;
	int ladoC;
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getLadoA() {
		return ladoA;
	}
	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}
	public int getLadoB() {
		return ladoB;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}
	public int getLadoC() {
		return ladoC;
	}
	public void setLadoC(int ladoC) {
		this.ladoC = ladoC;
	}
	
	@Override
	public int getArea() {
		int area = (base*altura)/2;
		return area;
	}
	
	@Override
	public int getPerimetro() {
		int perimetro = ladoA + ladoB + ladoC;
		return perimetro;
	}
	
	@Override
	public String getNomeFigura() {
		return "Triãngulo";
	}
	
}
