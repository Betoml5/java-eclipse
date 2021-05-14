package ejerciciosgeo;

public class Cono extends FiguraGeometrica{

	private double r;
	private double h;
	
	Cono(double r, double h){
		this.r = r;
		this.h = h;
	}
	
	public void calcularVolumen() {
		
		this.volumen = 0.33 * (Math.PI * Math.pow(r, 2) * h);
		
	}
	
}
