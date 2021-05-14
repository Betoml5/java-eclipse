package ejerciciosgeo;

public class Esfera extends FiguraGeometrica{

	private double r;
	
	Esfera(double r){
		this.r = r;
	}
	
	public void calcularVolumen() {
		this.volumen = 1.3333 * (Math.PI * Math.pow(r, 3));
	}

}
