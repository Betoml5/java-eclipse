package Ecosistema;

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

}
