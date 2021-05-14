package Animales;

import javax.swing.JOptionPane;

public class AppEcosistema {

	public static void main(String[] args) {

		// Cada animal intenta moverse a una celda adyacente del arreglo
		// El movimiento sera aleatorio

		// Si dos animales del mismo tipo chocan, se quedan donde estan
		// Pero se crea otra instancia de esa misma clase y se coloca en una celda vacia

		// SI un oso y un pez chocan, el pez muere.

		int min = 25;
		int max = 45;
		int gMin = 1;
		int gMax = 3;
		int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
		Animal[] ecosistema = new Animal[10];

		// Here here we generate the ecosistem.
		// Doing a conditional
		// 1 = Bear 2 = fish 3 = null
		for (int i = 0; i < ecosistema.length; i++) {
			int random_intg = (int) Math.floor(Math.random() * (gMax - gMin + 1) + gMin);

			if (random_intg == 1) {
				ecosistema[i] = new Oso();
			}

			if (random_intg == 2) {
				ecosistema[i] = new Pez();
			}
		}

		// Random numbers for move or not
		// If number is 1 = move
		// If number is 2 = notMove
		// When the [i] move it going to do the comprobation
		int minRandom = 1;
		int maxRandom = 2;

		String salida = "";
		for (int i = 0; i < ecosistema.length; i++) {
			if (ecosistema[i] == null) {
				salida += "\nnull";
			} else {
				salida += "\n" + ecosistema[i].getTipoAnimal() + (ecosistema[i].nuevo ? "Por reproduccion" : "");
			}
		}

		JOptionPane.showMessageDialog(null, salida, "Ecosistema antes", 1);

		System.out.println("El tamano del arreglo es: " + ecosistema.length);
		for (int i = 0; i < ecosistema.length - 1; i++) {
			System.out.println("Vuelta numero: " + i);
			int random_move = (int) Math.floor(Math.random() * (maxRandom - minRandom + 1) + minRandom);
			// If number is 1 = move
			// If number is 2 = notMove
			if (random_move == 1) {

				System.out.println("\nMoving... random number: " + random_move);
				// Check if the position is null or the next one
				// This because if we try to use the method .getTipoAnimal it throws an error.
				// Because null doesn't have that method.
				if (ecosistema[i] == null || ecosistema[i + 1] == null) {
					System.out.println("El elemento i es null o el siguiente");
				} else if (ecosistema[i].getTipoAnimal().equals(ecosistema[i + 1].getTipoAnimal())) {
					System.out.println("Son iguales");
					// Verify that both objets are OSOS.
					// And if they are, we create a new object oso.
					if (ecosistema[i].getTipoAnimal().equals("Oso")) {
						System.out.println("Los dos son osos, creando un nuevo oso...");
						Oso myNewOso = new Oso();
						myNewOso.nuevo = true;
						// Create a new object oso in an empty slot
						for (int j = 0; j < ecosistema.length; j++) {
							if (ecosistema[j] == null) {
								ecosistema[j] = myNewOso;
							} else {
								// System.out.println("There is no more space for that object");
							}
						}
						// If they are not both OSOS, they are PECES and we stay
						// But we create a new PEZ
					} else {
						System.out.println("Los dos son peces, creando un nuevo pez...");
						Pez myNewPez = new Pez();
						myNewPez.nuevo = true;
						// Create a new object PEZ in an empty slot
						for (int j = 0; j < ecosistema.length; j++) {
							if (ecosistema[j] == null) {
								ecosistema[j] = myNewPez;
							} else {
								// System.out.println("There is no more space for that object");
							}
						}

					}
					// If they are differents OSO != PEZ
					// Then PEZ die.
				} else if (ecosistema[i].getTipoAnimal() != ecosistema[i + 1].getTipoAnimal()) {
					System.out.println("Son diferentes");
					System.out.println("El 1 es: " + ecosistema[i].getTipoAnimal());
					System.out.println("El 2 es: " + ecosistema[i + 1].getTipoAnimal());

					// Check which one is the PEZ to kill it :(
					if (ecosistema[i].getTipoAnimal().equals("Pez")) {
						System.out.println("Matamos al pez en la posicion 1");
						ecosistema[i] = null;
					} else if (ecosistema[i + 1].getTipoAnimal().equals("Pez")) {
						System.out.println("Matamos a un pez en la posicion 2");
						ecosistema[i + 1] = null;
					}

				}
			} else {
				System.out.println("\nStaying... random number: " + random_move);
			}
			// If wanna do like an interval
			// Thread.sleep(2000);
		}

		salida = "";
		for (int i = 0; i < ecosistema.length; i++) {
			if (ecosistema[i] == null) {
				salida += "\nnull";
			} else {
				salida += "\n" + ecosistema[i].getTipoAnimal() + (ecosistema[i].nuevo ? "Por reproduccion" : "");
			}

		}

		JOptionPane.showMessageDialog(null, salida, "Ecosistema despues", 1);

	}

}
