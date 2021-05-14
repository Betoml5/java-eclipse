package formas;

public abstract class Superficie {

    // This attribute is shared with all the subclasses
    protected double area;

    // This method has to be implemented in the subclass
    // That's why it's abstract
    public abstract void calcularArea();

    // This method will be share will all the subclasses
    public double getArea() {
        return area;
    }
}
