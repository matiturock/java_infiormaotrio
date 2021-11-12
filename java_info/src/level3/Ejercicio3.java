/**
 * Se dispone de una lista de Strings,
 * de la cual saber la cantidad de valores que comiencen con la letra B
 * (tanto mayúscula como minúscula, en ese caso decimos que será ignoreCase).
 */

package level3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        List<String> palabrasFiltradas;

        palabrasFiltradas = palabras.stream().filter(palabra -> palabra.charAt(0) == 'B' || palabra.charAt(0) == 'b')
                .collect(Collectors.toList());

        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        System.out.println("Cantidad de palabras que empiezan con 'b' o 'B' en la lista: " + palabrasFiltradas.size());
    }
}
