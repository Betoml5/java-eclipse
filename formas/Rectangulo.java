package formas;

public class Rectangulo extends Superficie {
	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	// We must implement this method
	public void calcularArea() {
		// The formula
		this.area = (base * altura);
	}

}
