package q1;

public class Circulo extends Quadrilatero {
	float raio;

	public Circulo(float raio) {
		super();
		this.raio = raio;
	}
	
	@Override
	float calcularArea() {
		float area = 3*(raio*raio);
		return area;
	}

	@Override
	float calcularPerimetro() {
		float perimetro = 2*3*raio;
		return perimetro;
	}
	
	
}
