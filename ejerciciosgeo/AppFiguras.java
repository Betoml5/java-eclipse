package ejerciciosgeo;

import java.util.Scanner;

public class AppFiguras {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int opcion = 0;

		while (opcion != 5) {
			System.out.print("MENU DE OPCIONES OPRIMA EL NUMERO DESEADO \n");
			System.out.print("\n1.- Cubo");
			System.out.print("\n2.- Cilindro");
			System.out.print("\n3.- Cono");
			System.out.print("\n4.- Esfera");
			System.out.print("\n5.- Salir \n");
			opcion = entrada.nextInt();
			System.out.println();
			switch (opcion) {
			case 1:
				System.out.print("Ingresa el tamano de la artista");
				double arista = entrada.nextDouble();
				Cubo miCubo = new Cubo(arista);
				miCubo.calcularVolumen();
				System.out.println("El volumen del cubo es: " + miCubo.getVolumen());
				break;
			case 2:
				System.out.print("Ingresa la altura del cilindro");
				double hCilindro = entrada.nextDouble();
				System.out.print("Ingresa el radio del cilindro");
				double rCilindro = entrada.nextDouble();
				Cilindro miCilindro = new Cilindro(hCilindro, rCilindro);
				miCilindro.calcularVolumen();
				System.out.print("El volumen del cilindro es: " + miCilindro.getVolumen());
				break;
			case 3:
				System.out.print("Ingresa la altura del cono");
				double hCono = entrada.nextDouble();
				System.out.print("Ingresa el radio del cono");
				double rCono = entrada.nextDouble();
				Cono miCono = new Cono(hCono, rCono);
				miCono.calcularVolumen();
				System.out.print("El volumen del cono es: " + miCono.getVolumen());
				break;
			
			case 4: 
				System.out.print("Ingresa el radio de la esfera");
				double rEsfera = entrada.nextDouble();
				Esfera miEsfera = new Esfera(rEsfera);
				miEsfera.calcularVolumen();
				System.out.print("El volumen de la esfera es: " + miEsfera.getVolumen());
				break;
			case 5:
				System.out.println("Saliste del programa");
				opcion = 5;
				break;
			default:
				System.out.println("OPCION NO VALIDA");
				opcion = 5;
				break;
			}
		}

		entrada.close();

	}

}
