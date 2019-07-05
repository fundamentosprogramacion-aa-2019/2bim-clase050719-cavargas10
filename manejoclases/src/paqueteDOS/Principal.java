package paqueteDOS;

/**
 *
 * @author cavargas10
 */
public class Principal {

    public static void main(String[] args) {

        //Persona p; 
        //p = new Persona();
        /**
         * Persona p = new Persona();
         *
         * System.out.printf("Nombre: %s - Edad: %d - Genero: %s\n", p.nombre,
         * p.edad, p.genero);
         *
         * System.out.println("-----------------------------------------");
         *
         *
         * p.nombre = "Miguel"; p.genero = "Masculino"; p.edad = 20;
         *
         * System.out.printf("Nombre: %s - Edad: %d - Genero: %s\n", p.nombre,
         * p.edad, p.genero);
         */
        Persona p = new Persona();

        p.establecerNombre("Miguel");
        p.establecerGenero("Masculino");
        p.establecerEdad(20);

        System.out.printf("Nombre: %s - Edad: %d - Genero: %s\n",
                p.obtenerNombre(), p.obtenerEdad(), p.obtenerGenero());

    }
}
