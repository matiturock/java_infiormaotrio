/**
 * Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
 * Ayuda: ArrayList implementa la interface Collection, existe algún método que me permita hacer la operación sort (mezclar) aleatoriamente? Idem para el reverso
 */

package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {
  public static void main(String[] args) {
    List<Integer> barajaCartas = new ArrayList<>();
    cargarBarjaFrancesa(barajaCartas);
    mostrarBaraja(barajaCartas);

    // imrpresión en orden inverso
    Collections.reverse(barajaCartas);
    mostrarBaraja(barajaCartas);

    // mezclar cartas
    Collections.shuffle(barajaCartas);
    mostrarBaraja(barajaCartas);

    // ordenar cartas
    Collections.sort(barajaCartas);
    mostrarBaraja(barajaCartas);
  }

  private static void mostrarBaraja(List<Integer> barajaCartas) {
    String text = "";
    for (Integer integer : barajaCartas) {
      text += String.valueOf(integer);
      text += " ";
    }

    System.out.println(text);
  }

  private static void cargarBarjaFrancesa(List<Integer> valoresBarajaFrancesa) {
    for (int i = 1; i <= 12; i++) {
      valoresBarajaFrancesa.add(i);
    }
  }

}
