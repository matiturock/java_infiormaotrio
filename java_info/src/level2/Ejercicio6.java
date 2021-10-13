package level2;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio6 {
  public static void main(String[] args) {
    Set<Empleado> empleados = new HashSet<>();

    cargarEmpleados(empleados);

    System.out.println("Lista de empleados");
    for (Empleado empleado : empleados) {
      System.out.println(empleado);
    }

  }

  private static void cargarEmpleados(Set<Empleado> empleados) {
    empleados.add(new Empleado("Mati Almiron", 123, 60, 120));
    empleados.add(new Empleado("Margos Rojo", 456, 80, 140));
    empleados.add(new Empleado("Antonella Kess", 789, 90, 150));
  }
}
