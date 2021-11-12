/**
 * Se dispone de una lista de Integer,
 * de la cual queremos obtener otra lista
 * aplicando la operación de factorial
 * pero no se desean valores repetidos.
 */

package level3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4, 5, 5, 6, 6);
        List<Integer> numerosRespaldo = new ArrayList<>();
        List<Integer> numerosNew;

        for (Integer n : numeros) {
            if (!numerosRespaldo.contains(n))
                numerosRespaldo.add(n);
        }

        numerosNew = numerosRespaldo.stream().map(n -> factorial(n)).collect(Collectors.toList());

        mostrarNumeros(numeros);
        mostrarNumeros(numerosRespaldo);
        mostrarNumeros(numerosNew);
    }

    private static void mostrarNumeros(List<Integer> numeros) {
        for (Integer integer : numeros) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    private static Integer factorial(Integer n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
