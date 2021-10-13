/**
 * Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga de horas semanal de un empleado.
 * Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.
 */

package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio5 {
  public static void main(String[] args) {
    // Los arrays son iguales y corresponden a los días trabajados de una semana
    // Lun-Vie.

    List<Integer> horasTrabajadas = new ArrayList<>(Arrays.asList(6, 7, 8, 4, 5));
    List<Integer> valorPorHora = new ArrayList<>(Arrays.asList(350, 345, 550, 600, 320));

    List<Integer> totalACobrar = new ArrayList<>();

    for (int i = 0; i < horasTrabajadas.size(); i++) {
      int res = horasTrabajadas.get(i) * valorPorHora.get(i);
      totalACobrar.add(res);
    }

    System.out.println("TABLA DE TOTALES A COBRAR");
    int acumulador = 0;
    for (int i = 0; i < totalACobrar.size(); i++) {
      System.out.println(String.format("Horas: %d\t$ por hora: $%d\tTotal: $%d", horasTrabajadas.get(i),
          valorPorHora.get(i), totalACobrar.get(i)));
      acumulador += totalACobrar.get(i);
    }
    System.out.println(String.format("TOTAL: $%d", acumulador));

  }
}
