
package ejercicio3pt2;

public class Arbol implements Escritor, Pintor {
    @Override
    public void escribir() {
        System.out.println("Los árboles no escriben.");
    }
    
    @Override
    public void pintar() {
        System.out.println("Los árboles no pintan.");
    }
}
