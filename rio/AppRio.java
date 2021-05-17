import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class AppRio {
    public static void main(String[] args) {
        Random randomObject = new Random();
        int randomLength = (int) Math.floor(Math.random() * (30 - 10 + 1) + 10);

        Animal[] ecosistema = new Animal[10];

        for (int i = 0; i < ecosistema.length; i++) {
            int randomAnimals = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
            // System.out.println(randomAnimals);
            if (randomAnimals == 1)
                ecosistema[i] = new Oso();
            if (randomAnimals == 2)
                ecosistema[i] = new Pez();

        }

        System.out.println("Ecosistema al momento: " + Arrays.toString(ecosistema));

        int next = 0;
        do {

            for (int i = 0; i < ecosistema.length - 2; i++) {

                int moveOrNot = randomObject.nextInt(2);

                if (moveOrNot == 1) {
                    System.out.println("Nos movemos");
                    if (ecosistema[i] != null) {
                        
                    }
                } else {
                    System.out.println("Nos quedamos");
                }

            }

            next = JOptionPane.showConfirmDialog(null, "Quieres seguir simulando?", "Seguir simulando", 1);
        } while (next == 0);
    }
}
