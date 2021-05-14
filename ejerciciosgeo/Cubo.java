package ejerciciosgeo;

public class Cubo extends FiguraGeometrica{

	private double arista;
	
	Cubo(double arista){
		
		this.arista = arista;
	}
	
	public void calcularVolumen() {
		this.volumen = Math.pow(arista, 3);
	}

}
