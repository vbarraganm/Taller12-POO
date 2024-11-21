
package ejercicio1pt2;

public class Persona implements Hablador, Trabajador {
    @Override
    public void hablar() {
        System.out.println("La persona está hablando.");
    }
    
    @Override
    public void trabajar() {
        System.out.println("La persona está trabajando.");
    }
}
