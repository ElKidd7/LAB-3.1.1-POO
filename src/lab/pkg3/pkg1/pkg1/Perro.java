
package lab.pkg3.pkg1.pkg1;

public class Perro extends Animal {
     private String raza;


    public Perro(String nombre, int edad, String raza) {

        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }


    @Override
    public void mostrarInfo() {

        super.mostrarInfo();
        System.out.println("Raza: " + raza);
    }
    
    
}
