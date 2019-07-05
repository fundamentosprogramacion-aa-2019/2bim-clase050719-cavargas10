package paqueteDOS;

/**
 *
 * @author cavargas10
 */
public class Principal2 {

    public static void main(String[] args) {

        Persona personaUno = new Persona();

        personaUno.establecerNombre("Carlos");
        personaUno.establecerGenero("Masculino");
        personaUno.establecerEdad(22);

        System.out.printf("%s - %d - %s\n", personaUno.obtenerNombre(),
                personaUno.obtenerEdad(), personaUno.obtenerGenero());

    }
}
