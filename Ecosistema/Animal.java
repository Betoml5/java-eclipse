package Ecosistema;

import java.lang.reflect.Array;

public class Animal {

    protected String tipoAnimal;
    protected boolean nuevo = false;

    public Animal() {

    }

    public Animal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getTipoAnimal() {
        return this.tipoAnimal;
    }

    public void next(Animal[] array, int index, Animal value) {
        Array.set(array, index, value);
    }

}
