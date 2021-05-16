
import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class AppEcosistema {

	// Code example
	// int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

	public static void main(String[] args) {
		Random rObj = new Random();
		int randomEco = (int) Math.floor(Math.random() * (30 - 10 + 1) + 10);

		Animal[] ecosistema = new Animal[randomEco];

		// Generamos animales aleatorios en el arreglo
		// Para tener nuestro ecosistema
		// 1 = OSO 2 = PESCADO
		for (int i = 0; i < ecosistema.length; i++) {
			int randomAnimals = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
			// System.out.println(randomAnimals);
			if (randomAnimals == 1)
				ecosistema[i] = new Oso();
			if (randomAnimals == 2)
				ecosistema[i] = new Pez();

		}

		String salida1 = "";
		for (int i = 0; i < ecosistema.length; i++) {
			if (ecosistema[i] == null) {
				salida1 += "\nNull";
			} else {
				salida1 += "\nAnimal: " + ecosistema[i].getTipoAnimal() + " " + i;
			}
		}

		// JOptionPane.showMessageDialog(null, salida1, "Ecosistema antes", 1);

		// Hacemos movimientos
		for (int i = 0; i < ecosistema.length - 1; i++) {
			if (ecosistema[i] != null) {
				if (ecosistema[i + 1] != null) {
					// Movemos el Animal a la siguiente posicion del arreglo
					if (ecosistema[i] instanceof Oso && ecosistema[i + 1] instanceof Pez) {
						ecosistema[i + 1] = null; // Matamos al pez
						ecosistema[i + 1] = ecosistema[i]; // Remplazamos al pez por el oso
					}

					if (ecosistema[i] instanceof Oso && ecosistema[i + 1] instanceof Oso) {
						// Aqui vamos a buscar una posicion aleatoria para insertar nuestro animal
						// Aqui ponemos que sea el maximo numero aleatorio el tamano del arreglo
						// principal

						int randomPosition = rObj.nextInt(ecosistema.length - 1);

						while (ecosistema[randomPosition] != null) {
							randomPosition = rObj.nextInt(ecosistema.length - 1);
							System.out.println("Saliendo del while");

						}

						System.out.println("Encontramos una posicion libre para oso, posicion: " + randomPosition);
						ecosistema[randomPosition] = new Oso();

					} else {
						// Aqui vamos a buscar una posicion aleatoria para insertar nuestro pez
						int randomPosition = rObj.nextInt(ecosistema.length - 1);

						while (ecosistema[randomPosition] != null) {
							randomPosition = rObj.nextInt(ecosistema.length - 1);
							System.out.println("Saliendo del while");
						}

						System.out.println("Encontramos una posicion libre para pez, posicion: " + randomPosition);
						ecosistema[randomPosition] = new Pez();
					}

				} else {

					ecosistema[i] = ecosistema[i + 1];
				}
			}

		}

		String salida2 = "";
		for (int i = 0; i < ecosistema.length; i++) {
			if (ecosistema[i] == null) {
				salida2 += "\nNull";
			} else {
				salida2 += "\nAnimal: " + ecosistema[i].getTipoAnimal() + " " + i;
			}
		}

		// JOptionPane.showMessageDialog(null, salida2, "Ecosistema despues", 1);

		// JOptionPane.showMessageDialog(null, salida1 + "\n ========== \n" + salida2,
		// "Dos ecosistemas", 1);

		System.out.println("Ecosistema antes: " + salida1);
		System.out.println("\n -------------------------------------------- \n");
		System.out.println("Ecosistema despues: " + salida2);

	}

}
