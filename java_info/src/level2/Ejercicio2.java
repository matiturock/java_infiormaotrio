/**
 * Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio de la lista y otro al final.
 * Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma (antes y después de agregar a en la primera y última posición).
 */

package level2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
  public static void main(String[] args) {
    List<Integer> numerosEnteros = new ArrayList<>();
    numerosEnteros.add(1);
    numerosEnteros.add(2);
    numerosEnteros.add(3);
    numerosEnteros.add(4);
    numerosEnteros.add(5);

    mostrarArraySize(numerosEnteros);
    iterarArray(numerosEnteros);

    // add int al inicio del array
    numerosEnteros.add(0, 0);
    mostrarArraySize(numerosEnteros);
    iterarArray(numerosEnteros);

    // add int al final del array
    numerosEnteros.add(6);
    mostrarArraySize(numerosEnteros);
    iterarArray(numerosEnteros);
  }

  private static void iterarArray(List<Integer> numerosEnteros) {
    for (Integer integer : numerosEnteros) {
      System.out.println(String.format("%d", integer));
    }
  }

  private static void mostrarArraySize(List<Integer> numerosEnteros) {
    System.out.println("El tamaño del array es: " + numerosEnteros.size());
  }
}
