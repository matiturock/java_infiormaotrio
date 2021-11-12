/**
 * Dada una lista que contiene números enteros,
 * se deberá generar otra lista que contendrá el resultado
 * de aplicar la operación de potencia a 2.
 */

package level3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> enteros = List.of(1, 2, 3, 4, 5);
        List<Double> enterosNew;

        enterosNew = enteros.stream().map(n -> Math.pow(n, 2)).collect(Collectors.toList());

        for (Double integer : enterosNew) {
            System.err.println(integer);
        }
    }
}
