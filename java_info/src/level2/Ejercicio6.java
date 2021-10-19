/**
 * Se dispone de una colección de Empleados, de cada empleado se conoce:
 * - Nombre y Apellido
 * - DNI
 * - horasTrabajadas
 * - valorPorHora
 * Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado.
 */

package level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Ejercicio6 {
  public static void main(String[] args) {
    Set<Empleado> empleados = new HashSet<>();
    cargarEmpleados(empleados);
    mostrarEmpleados(empleados);

    Map<String, Integer> dniSueldo = new HashMap<>();
    cargarMapaDniSueldo(empleados, dniSueldo);
    mostrarMapaDniSueldo(dniSueldo);
  }

  private static void mostrarMapaDniSueldo(Map<String, Integer> dniSueldo) {
    System.out.println("MAP: DNI -> SUELDO");
    for (Entry<String, Integer> empleado : dniSueldo.entrySet()) {
      String key = empleado.getKey();
      Integer value = empleado.getValue();
      System.out.println("DNI: " + key + " -> Sueldo: $" + value);
    }
  }

  private static void cargarMapaDniSueldo(Set<Empleado> empleados, Map<String, Integer> dniSueldo) {
    for (Empleado empleado : empleados) {
      dniSueldo.put(empleado.getDni(), (empleado.getHorasTrabajadas() * empleado.getValorPorHora()));
    }
  }

  private static void mostrarEmpleados(Set<Empleado> empleados) {
    System.out.println("SET EMPLEADOS");
    for (Empleado empleado : empleados) {
      System.out.println("-> " + empleado);
    }
  }

  private static void cargarEmpleados(Set<Empleado> empleados) {
    Empleado emp1 = new Empleado("Matias", "123", 10, 100);
    Empleado emp2 = new Empleado("Luciano", "456", 15, 120);
    Empleado emp3 = new Empleado("Claudio", "789", 20, 80);
    Empleado emp4 = new Empleado("Cintia", "012", 16, 50);

    empleados.add(emp1);
    empleados.add(emp2);
    empleados.add(emp3);
    empleados.add(emp4);
  }
}
