package q1;

public class Retangulo extends Quadrilatero {
	float lado;
	float altura;
	
	public Retangulo(float lado, float altura) {
		this.lado = lado;
		this.altura = altura;
	}
	
	
	@Override
	float calcularArea() {
		float area = lado*altura;
		return area;
	}
	@Override
	float calcularPerimetro() {
		float perimetro = lado*2+altura*2;
		return perimetro;
	}
}