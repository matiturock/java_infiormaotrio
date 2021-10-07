/**
 * Dado un archivo de texto (alumnos.txt), crear una función que lea todos los nombres de los alumnos y los imprima por pantalla.
 * Observación:
 * Cada línea del archivo representa un nombre de alumno.
 */

package revision1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio3 {
  public static void main(String[] args) {

    imprimirListaAlumnos();

  }

  private static void imprimirListaAlumnos() {
    Path path = Paths.get("java_info\\src\\revision1\\alumnos.txt");

    String linea = "";

    try {
      linea += Files.readString(path);
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println(linea);
  }
}
