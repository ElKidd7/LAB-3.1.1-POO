
package lab.pkg3.pkg1.pkg1;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal Generico", 5);
        animal.hacerSonido();
        animal.mostrarInfo();

        System.out.println();


        Perro perro = new Perro("Leia", 3, "Chihuahua");
        perro.hacerSonido();
        perro.mostrarInfo();
    }
    }

