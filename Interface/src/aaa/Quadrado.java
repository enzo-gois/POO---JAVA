package aaa;

public class Quadrado implements FiguraGeometrica {
	
	int lado;
	
	public int getLado() {
		return lado;
	}
	
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public int getPerimetro() {
		int perimetro = lado*4;
		return perimetro;
	}
	
	@Override
	public int getArea() {
		int area = lado*lado;
		return area;
	}
	
	@Override
	public String getNomeFigura() {
		return "quadrado";
	}
}
