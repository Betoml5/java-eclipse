package ejerciciosgeo;

public abstract class FiguraGeometrica {
		
	protected double volumen;
	
	public abstract void calcularVolumen();
	
	public double getVolumen() {
		return this.volumen;
	}
	
}
