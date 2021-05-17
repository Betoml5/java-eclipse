import java.util.Random;

import javax.swing.JOptionPane;

public class AppPraticaRio {
    public static void main(String[] args) {
        Random randomObject = new Random();
        int randomLength = (int) Math.floor(Math.random() * (30 - 10 + 1) + 10);

        Animal[] ecosistema = new Animal[randomLength];

        // Generamos animales aleatorios
        for (int i = 0; i < ecosistema.length; i++) {
            int randomAnimals = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
            // System.out.println(randomAnimals);
            if (randomAnimals == 1)
                ecosistema[i] = new Oso();
            if (randomAnimals == 2)
                ecosistema[i] = new Pez();

        }

        String ecosistemaAntes = "";
        for (int i = 0; i < ecosistema.length; i++) {
            if (ecosistema[i] == null) {
                ecosistemaAntes += "\nnull";
            } else {
                ecosistemaAntes += "\n" + ecosistema[i].getTipoAnimal()
                        + (ecosistema[i].nuevo ? " Por reproduccion" : "");
            }
        }

        JOptionPane.showMessageDialog(null, "Ecosistema antes\n" + ecosistemaAntes, "Ecosistema antes", 1);

        // Movemos el array
        int next = 0;
        do {
            for (int i = 0; i < ecosistema.length - 2; i++) {
                int moveOrNot = randomObject.nextInt(2);

                if (ecosistema[i] != null) {
                    if (moveOrNot == 1) {
                        if (ecosistema[i + 1] != null) {
                            if (ecosistema[i] instanceof Oso && ecosistema[i + 1] instanceof Oso) {
                                boolean positionAv = false;
                                for (int j = 0; j < ecosistema.length; j++) {
                                    if (ecosistema[j] == null)
                                        positionAv = true;
                                }

                                if (positionAv) {
                                    int randomPosition = randomObject.nextInt(ecosistema.length);
                                    while (ecosistema[randomPosition] != null) {
                                        randomPosition = randomObject.nextInt(ecosistema.length);
                                        System.out.println("Saliendo del while");

                                    }

                                    System.out.println("Creando nuevo oso... posicion: " + randomPosition);
                                    ecosistema[randomPosition] = new Oso();
                                    ecosistema[randomPosition].nuevo = true;
                                }
                                System.out.println("No hay mas posiciones disponibles");

                            } else if (ecosistema[i] instanceof Pez && ecosistema[i + 1] instanceof Pez) {
                                boolean positionAv = false;
                                for (int j = 0; j < ecosistema.length; j++) {
                                    if (ecosistema[j] == null)
                                        positionAv = true;
                                }

                                if (positionAv) {
                                    int randomPosition = randomObject.nextInt(ecosistema.length);
                                    while (ecosistema[randomPosition] != null) {
                                        randomPosition = randomObject.nextInt(ecosistema.length);
                                        System.out.println("Saliendo del while");

                                    }

                                    System.out.println("Creando nuevo pez... posicion: " + randomPosition);
                                    ecosistema[randomPosition] = new Pez();
                                    ecosistema[randomPosition].nuevo = true;
                                }
                                System.out.println("No hay mas posiciones disponibles");
                            } else if (ecosistema[i] instanceof Oso && ecosistema[i + 1] instanceof Pez) {
                                ecosistema[i + 1] = ecosistema[i];
                                ecosistema[i] = null;
                            } else {
                                System.out
                                        .println("Hey pequeno: " + ecosistema[i].getTipoAnimal() + " no puedes ir ahi");
                            }

                        } else {
                            ecosistema[i + 1] = ecosistema[i];
                            ecosistema[i] = null;
                        }

                    }
                }

            }

            String ecosistemaNow = "";
            for (int j = 0; j < ecosistema.length; j++) {
                if (ecosistema[j] == null) {
                    ecosistemaNow += "\nnull";
                } else {
                    ecosistemaNow += "\n" + ecosistema[j].getTipoAnimal()
                            + (ecosistema[j].nuevo ? " Por reproduccion" : "");
                }
            }

            JOptionPane.showMessageDialog(null, "Ecosistema al momento\n" + ecosistemaNow, "Ecosistema al momento", 1);
            next = JOptionPane.showConfirmDialog(null, "Quieres seguir simulando?", "Simulacion", 1);
        } while (next == 0);

        String ecosistemaDespues = "";
        for (int i = 0; i < ecosistema.length; i++) {
            if (ecosistema[i] == null) {
                ecosistemaDespues += "\nnull";
            } else {
                ecosistemaDespues += "\n" + ecosistema[i].getTipoAnimal()
                        + (ecosistema[i].nuevo ? " Por reproduccion" : "");
            }
        }

        JOptionPane.showMessageDialog(null, ecosistemaAntes + "\n------\n" + ecosistemaDespues, "Ecosistemas", 1);

    }
}
