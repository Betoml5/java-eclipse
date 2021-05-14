
import java.util.Arrays;
import java.util.Random;

public class AppEcosistema {

	// Code example
	// int randomNum = minimum + rObj.nextInt((maximum - minimum) + 1);

	public static void main(String[] args) {
		Random rObj = new Random();
		int randomEco = 10 + rObj.nextInt((30 - 10) + 1);

		Animal[] ecosistema = new Animal[randomEco];

		// Generamos animales aleatorios en el arreglo
		// Para tener nuestro ecosistema
		// 1 = OSO 2 = PESCADO
		for (int i = 0; i < ecosistema.length; i++) {
			int randomAnimals = rObj.nextInt((2 - 1) + 1) + 1;
			// System.out.println(randomAnimals);
			if (randomAnimals == 1)
				ecosistema[i] = new Oso();
			if (randomAnimals == 2)
				ecosistema[i] = new Pez();
		}

		salida = "";
		for (int i = 0; i < ecosistema.length; i++) {
			
		}

		// Hacemos movimientos
		for (int i = 0; i < ecosistema.length - 1; i++) {
			if (ecosistema[i] != null) {
				if (ecosistema[i + 1] != null) {
					// Movemos el Animal a la siguiente posicion del arreglo
					if (ecosistema[i] instanceof Oso && ecosistema[i + 1] instanceof Pez) {
						ecosistema[i + 1] = null;
						ecosistema[i + 1] = ecosistema[i];
					}

					if (ecosistema[i] instanceof Pez && ecosistema[i + 1] instanceof Pez) {
						// Aqui vamos a buscar una posicion aleatoria para insertar nuestro pez
						int randomPos = 10 + rObj.nextInt((30 - 10) + 1);
						while (ecosistema[randomPos] != null) {
							randomPos = 10 + rObj.nextInt((30 - 10) + 1);
						}
						ecosistema[randomPos] = new Pez();
					}

				}
			}

			System.out.println("Posicion null");
		}

	}

}
