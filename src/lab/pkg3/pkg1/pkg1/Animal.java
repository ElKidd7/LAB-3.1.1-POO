
package lab.pkg3.pkg1.pkg1;

public class Animal {
     private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
}
