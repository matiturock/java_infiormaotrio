/**
 * Teniendo una lista de objetos Empleado, cargar la misma en un archivo empleado.txt.
 * Observación:
 * Cada empleado se almacena en una sola líne con el formato que uds definan.
 */

package revision1;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
  public static void main(String[] args) {

    List<Empleado> empleados = new ArrayList<>();
    cargarListaEmpleados(empleados);
    String strEmpeados = leerLista(empleados);

    System.out.println(strEmpeados);
    crearArchivoEmpleados(strEmpeados);

    System.out.println("Fin");
  }

  private static void crearArchivoEmpleados(String strEmpeados) {
    String nombreArchivo = "lista_empleados.txt";
    String codificacion = "UTF-8";

    try {
      PrintWriter escribir = new PrintWriter(nombreArchivo, codificacion);
      escribir.write(strEmpeados);
      escribir.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  private static String leerLista(List<Empleado> empleados) {
    String str = "";

    for (Empleado empleado : empleados) {
      str += empleado.toString() + "\n";
    }

    return str;
  }

  private static void cargarListaEmpleados(List<Empleado> empleados) {

    empleados.add(new Empleado("Marcos", 31, true));
    empleados.add(new Empleado("Antonella", 33, true));
    empleados.add(new Empleado("Baltazar", 70, false));

  }
}
