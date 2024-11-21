
package ejercicio3pt1;

public class Mueble implements Encendedor, Apagador {
    @Override
    public void encender(){
        System.out.println("Los muebles no se encienden.");
    }
}
