package formas;
import javax.swing.JOptionPane;

public class AppFormas {

    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo(10, 40);
        Circulo miCirculo = new Circulo(20);

        miRectangulo.calcularArea();
        miCirculo.calcularArea();
 

        JOptionPane.showMessageDialog(null, miRectangulo.getArea(), "El area del rectangulo", 1);
        JOptionPane.showMessageDialog(null, miCirculo.getArea(), "El area del circulo", 1);

        System.out.println(miRectangulo.getArea());
        System.out.println(miCirculo.getArea());
    }
}