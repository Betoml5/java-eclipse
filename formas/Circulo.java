package formas;

public class Circulo extends Superficie {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    // We must implement this method
    public void calcularArea() {
        // This could be rounded
        this.area = (Math.PI * Math.pow(radio, 2));
    }
}
