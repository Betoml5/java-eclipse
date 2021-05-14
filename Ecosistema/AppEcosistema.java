package Ecosistema;

import java.util.Random;

public class AppEcosistema {

	public static void main(String[] args) {
		Animal[] ecosistema = new Animal[10];
		Random rObj = new Random();

		// Generamos animales aleatorios en el arreglo
		// Para tener nuestro ecosistema
		// 1 = OSO 2 = PESCADO
		for (int i = 0; i < ecosistema.length; i++) {
			int randomAnimals = rObj.nextInt((3 - 1) + 1) + 1;
			if (randomAnimals == 1)
				ecosistema[i] = new Oso();
			if (randomAnimals == 2)
				ecosistema[i] = new Pez();
		}

		// Hacemos movimientos
		for (int i = 0; i < ecosistema.length; i++) {

		}

	}

}
