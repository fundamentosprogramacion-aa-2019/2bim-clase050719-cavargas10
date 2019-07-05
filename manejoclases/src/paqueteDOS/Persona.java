package paqueteDOS;

/**
 *
 * @author cavargas10
 */
public class Persona {

    private String genero;
    private int edad;
    private String nombre;

    // set = establecer
    // get = obtener
    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public int obtenerEdad() {
        return edad;
    }

    public void establecerEdad(int e) {
        edad = e;
    }

    public String obtenerGenero() {
        return genero;
    }

    public void establecerGenero(String g) {
        genero = g;
    }

}
