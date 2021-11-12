/**
 * Se posee una Lista con objetos de clase Alumno con los atributos:
 * apellido, nombre y fechaDeNacimiento (con tipos: String, String y LocalDate).
 * Se desea generar un Map<String, Integer> donde la clave de Map será el apellido concatenado con el nombre
 * (con separador de espacio en blanco) y el value la edad del alumno.
 */

package level3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        cargarLista(alumnos);

        System.out.println("\nLISTA ALUMNOS");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }

        Map<String, Integer> alumnosNacimiento = new HashMap<>();
        cargarMapa(alumnos, alumnosNacimiento);

        System.out.println("\nMAPA ALUMNOS: k(nombre y apellido), v(edad)");
        alumnosNacimiento.forEach((k, v) -> System.out.println(String.format("%s: %d", k, v)));

    }

    private static void cargarMapa(List<Alumno> alumnos, Map<String, Integer> alumnosNacimiento) {
        for (Alumno alumno : alumnos) {
            String apellidoYNombre = String.format("%s %s", alumno.getApellido(), alumno.getNombre());
            Integer edad = alumno.getEdad();
            alumnosNacimiento.put(apellidoYNombre, edad);
        }
    }

    private static void cargarLista(List<Alumno> alumnos) {
        alumnos.add(new Alumno("Marcos", "Gomez", LocalDate.of(2000, 1, 1)));
        alumnos.add(new Alumno("Matias", "Altamirano", LocalDate.of(2004, 2, 3)));
        alumnos.add(new Alumno("Antonella", "Pereyra", LocalDate.of(2008, 6, 5)));
        alumnos.add(new Alumno("Claudio", "Quintana", LocalDate.of(2006, 7, 20)));
    }
}
