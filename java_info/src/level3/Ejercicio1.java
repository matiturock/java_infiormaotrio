/**
 * Dada una lista que contiene valores de tipo String,
 * se deberá filtrar todos los valores que NO sean null o vacío ("").
 */

package level3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        mostrarArrayList(palabras);

        List<String> palabrasFiltradas;

        palabrasFiltradas = palabras.stream().filter(palabra -> palabra != null && palabra != "")
                .collect(Collectors.toList());

        mostrarArrayList(palabrasFiltradas);
    }

    private static void mostrarArrayList(List<String> palabras) {
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
