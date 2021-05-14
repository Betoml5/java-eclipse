package ejerciciosgeo;

public class Cilindro extends FiguraGeometrica{

	// h = height
	// r = ratio;
	private double h;
	private double r;
	
	Cilindro(double h, double r){
		this.h = h;
		this.r = r;
	}
	
	public void calcularVolumen() {
		this.volumen = (Math.PI * Math.pow(r, 2)) / h;
	}

}
